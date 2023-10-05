
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

class Temporizador extends TimerTask {

    String mensaje;

    public Temporizador(String mensaje) {
        this.mensaje = mensaje;
    }

    public void run() {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

public class Temporizadores extends javax.swing.JFrame {

    private Timer timer;
    private int contador;
    private List<Temporizador> temporizadores;

    public Temporizadores() {
        initComponents();
        this.setLocationRelativeTo(null);
         timer = new Timer();
        contador = 0;
        temporizadores = new ArrayList<>();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mensajet = new javax.swing.JTextField();
        tiempo = new javax.swing.JTextField();
        crear = new javax.swing.JButton();
        detener = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        crear.setText("CREAR");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        detener.setText("DETENER");
        detener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detenerActionPerformed(evt);
            }
        });

        reiniciar.setText("REINICIAR");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });

        jLabel1.setText("Tiempo Temporizador (ms)");

        jLabel2.setText("Mensaje del temporizador");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel3.setText("TEMPORIZADORES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(crear)
                        .addGap(31, 31, 31)
                        .addComponent(detener)
                        .addGap(36, 36, 36)
                        .addComponent(reiniciar)))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mensajet, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jLabel2)
                    .addContainerGap(263, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mensajet, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crear)
                    .addComponent(detener)
                    .addComponent(reiniciar))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jLabel2)
                    .addContainerGap(205, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        // TODO add your handling code here:
        contador++;
        String mensaje = mensajet.getText();
        long tiempoEspera = Long.parseLong(tiempo.getText());
        Temporizador tarea = new Temporizador(mensaje);
        temporizadores.add(tarea);
        timer.schedule(tarea, tiempoEspera);
        mensajet.setText("");
        tiempo.setText("");
        JOptionPane.showMessageDialog(null, "Se ha creado el temporizador " + contador + " con éxito.");
    }//GEN-LAST:event_crearActionPerformed

    private void detenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detenerActionPerformed
        // TODO add your handling code here:
         String mensajeDetener = JOptionPane.showInputDialog("Ingrese el mensaje del temporizador que desea detener:");
                for (Temporizador tarea : temporizadores) {
                    if (tarea.mensaje.equals(mensajeDetener)) {
                        tarea.cancel();
                        temporizadores.remove(tarea);
                        JOptionPane.showMessageDialog(null, "Se ha detenido el temporizador.");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Temporizador no encontrado.");
            
    }//GEN-LAST:event_detenerActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        // TODO add your handling code here:
        String mensajeReiniciar = JOptionPane.showInputDialog("Ingrese el mensaje del temporizador que desea reiniciar:");
                for (Temporizador tarea : temporizadores) {
                    if (tarea.mensaje.equals(mensajeReiniciar)) {
                        tarea.cancel();
                        temporizadores.remove(tarea);
                        String mensaje = mensajet.getText();
                        long tiempoEspera = Long.parseLong(tiempo.getText());
                        Temporizador nuevaTarea = new Temporizador(mensaje);
                        temporizadores.add(nuevaTarea);
                        timer.schedule(nuevaTarea, tiempoEspera);
                        mensajet.setText("");
                        tiempo.setText("");
                        JOptionPane.showMessageDialog(null, "Se ha reiniciado el temporizador.");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Temporizador no encontrado.");
            
    }//GEN-LAST:event_reiniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Temporizadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Temporizadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Temporizadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Temporizadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Temporizadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crear;
    private javax.swing.JButton detener;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField mensajet;
    private javax.swing.JButton reiniciar;
    private javax.swing.JTextField tiempo;
    // End of variables declaration//GEN-END:variables
}
