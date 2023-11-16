import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

public class SimuladorBicicleta extends JFrame {

    private JButton pedal1Button;
    private JButton pedal2Button;
    private JButton startAutoButton; // Nuevo botón para iniciar automáticamente
    private JLabel speedLabel;
    private JLabel caloriesLabel;

    private int speed = 0;
    private int calories = 0;
    private int pedalPressCount = 0;
    private boolean pedal1Active = true;
    private long startTimeMillis;

    public SimuladorBicicleta() {
        setTitle("Simulador de Bicicleta");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        // Inicializar componentes
        pedal1Button = new JButton("Pedal 1");
        pedal2Button = new JButton("Pedal 2");
        startAutoButton = new JButton("Iniciar Automático"); // Nuevo botón
        speedLabel = new JLabel("Velocidad: 0 km/h");
        caloriesLabel = new JLabel("Calorías: 0 kcal");

        // Configurar layout
        setLayout(new BorderLayout());
        JPanel pedalPanel = new JPanel();
        pedalPanel.add(pedal1Button);
        pedalPanel.add(pedal2Button);

        add(pedalPanel, BorderLayout.CENTER);
        add(speedLabel, BorderLayout.NORTH);
        add(caloriesLabel, BorderLayout.SOUTH);

        // Configurar eventos de botones
        pedal1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pedalPressed();
            }
        });

        pedal2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pedalPressed();
            }
        });

        startAutoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Iniciar proceso automático con un Timer
                startTimeMillis = System.currentTimeMillis();
                Timer autoTimer = new Timer(1000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pedalPressed();
                    }
                });
                autoTimer.start();
            }
        });

        // Configurar Timer para actualizar indicadores cada segundo
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateIndicators();
            }
        });
        timer.start();
    }

    private void pedalPressed() {
        // Incrementar el contador de veces que se oprimen los pedales
        pedalPressCount++;

        // Obtener el tiempo transcurrido desde el inicio
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedTimeSeconds = (currentTimeMillis - startTimeMillis) / 1000;

        // Calcular la velocidad promedio
        int averageSpeed = (int) (pedalPressCount / elapsedTimeSeconds);

        // Simular actividad
        speed += 5 ;
        calories += 2;

        // Actualizar texto de botones
        if (pedal1Active) {
            pedal1Button.setText("Pedal 1");
            pedal2Button.setText("");
        } else {
            pedal1Button.setText("");
            pedal2Button.setText("Pedal 2");
        }
    }

    private void updateIndicators() {
        // Actualizar etiquetas de velocidad y calorías
        speedLabel.setText("Velocidad: " + speed + " km/h");
        caloriesLabel.setText("Calorías: " + calories + " kcal");

        // Imprimir el número de veces que se oprimen los pedales
        System.out.println("Número de veces que se oprimen los pedales: " + pedalPressCount);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimuladorBicicleta simulador = new SimuladorBicicleta();
                simulador.setVisible(true);
            }
        });
    }
}

