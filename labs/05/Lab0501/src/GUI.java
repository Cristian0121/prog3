import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTable;





public class GUI extends javax.swing.JFrame {
DefaultTableModel modelo= new DefaultTableModel();
    
    public GUI() {
        initComponents();
    }
        public  void importacion(){
            //importacion
    String linea;    //Variable para guardar los datos de la linea
    String [] valores; //Vector para guardar las palabras de la linea
    File archivo = new File("a.csv");
           try {    
            Scanner entrada= new Scanner(archivo);
            int i=0;
            while(entrada.hasNext()){
            linea=entrada.nextLine();
            valores= linea.split(";");
                modelo.setColumnCount(4);
                modelo.setRowCount(67);
                modelo.setValueAt(valores[0], i, 0);
                modelo.setValueAt(valores[1], i, 1);
                modelo.setValueAt(valores[2], i, 2);
                modelo.setValueAt(valores[3], i, 3);
      
        String dato=(String) modelo.getValueAt(0, 0);
        jLabel1.setText(dato);
        i++;
            }
        }
        catch (FileNotFoundException ex) {
           System.out.println("no encontre el archivo");
        } 
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Grafica = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "año", "2020", "2021", "2022" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Grafica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("top3");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Predio", "Vereda", "Cantidad"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jButton2.setText("descargar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        jButton3.setText("importar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(317, 317, 317)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Grafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(421, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addComponent(Grafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      String [] vector={"Fecha","Predio","Vereda","Cantidad"};
      modelo.setColumnIdentifiers(vector);
        importacion();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
     int selectedYear = Integer.parseInt(jComboBox1.getSelectedItem().toString());
    DefaultTableModel modeloTabla3 = (DefaultTableModel) jTable3.getModel();
    modeloTabla3.setRowCount(0); // Limpia la tabla 3 para mostrar los nuevos datos

    for (int i = 0; i < modelo.getRowCount(); i++) {
        String fecha = (String) modelo.getValueAt(i, 0);
        int year = Integer.parseInt(fecha.trim()); // Asumiendo que el año está en la primera columna

        if (year == selectedYear) {
            Object[] rowData = new Object[4];
            rowData[0] = fecha;
            rowData[1] = modelo.getValueAt(i, 1);
            rowData[2] = modelo.getValueAt(i, 2);
            rowData[3] = modelo.getValueAt(i, 3);
            modeloTabla3.addRow(rowData);
        }
    }

    }//GEN-LAST:event_jComboBox1ActionPerformed
private void mostrarTop3() {
    DefaultTableModel top3Model = new DefaultTableModel();
    String[] columnNames = {"Fecha", "Predio", "Vereda", "Cantidad"};
    top3Model.setColumnIdentifiers(columnNames);

    // Crear una lista para almacenar los datos y sus cantidades
    ArrayList<Object[]> dataAndQuantities = new ArrayList<>();

    // Iterar a través de los datos de jtable3 y guardarlos con sus cantidades
    for (int i = 0; i < jTable3.getRowCount(); i++) {
        String fecha = (String) jTable3.getValueAt(i, 0);
        String predio = (String) jTable3.getValueAt(i, 1);
        String vereda = (String) jTable3.getValueAt(i, 2);
        int cantidad = Integer.parseInt((String) jTable3.getValueAt(i, 3));

        dataAndQuantities.add(new Object[]{fecha, predio, vereda, cantidad});
    }

    // Ordenar la lista en función de la cantidad (de mayor a menor)
    dataAndQuantities.sort((a, b) -> Integer.compare((int) b[3], (int) a[3]));

    // Agregar los primeros 3 elementos al modelo "top3Model"
    for (int i = 0; i < 3 && i < dataAndQuantities.size(); i++) {
        top3Model.addRow(dataAndQuantities.get(i));
    }

    // Asignar el nuevo modelo a la tabla "jTable4" para mostrar el "top 3"
    jTable4.setModel(top3Model);
}
private void importarDatosDesdeCSV(JTable table, String nombreArchivo) {
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.setRowCount(0); // Limpiar la tabla antes de importar datos

    try {
        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
        String linea;

        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(";");
            model.addRow(datos);
        }

        br.close();
    } catch (IOException ex) {
        // Manejo de errores (puedes agregar un mensaje de error aquí si lo deseas)
    }



}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 mostrarTop3();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Llamar a esta función para importar datos a jTable3
importarDatosDesdeCSV(jTable3, "reporte de resultados año.csv");

// Llamar a esta función para importar datos a jTable4
importarDatosDesdeCSV(jTable4, "reporte de resultados top 3.csv");

    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Grafica;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
}
