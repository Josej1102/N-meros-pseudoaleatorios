
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Jose
 */
public class Frecuencia extends javax.swing.JFrame {

    /**
     * Creates new form Frecuencia
     */
    
    public static String tipo;
    public static DefaultTableModel tabla;
    public Frecuencia() {
        initComponents();
        this.setLocationRelativeTo(null);   
        tabla = new DefaultTableModel();
        tabla.addColumn("Intervalos");
        tabla.addColumn("FO");
        tabla.addColumn("FE");
        tabla.addColumn("(FO-FE)2/FE");
        tabla.addColumn("Sumatoria");
        tabla.addColumn("chi");
        this.Resultadosvvv.setModel(tabla);   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Resultadosvvv = new javax.swing.JTable();
        Calcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        Salida = new javax.swing.JTextField();
        Exportarvvv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Resultadosvvv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Resultadosvvv.setEnabled(false);
        jScrollPane1.setViewportView(Resultadosvvv);

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        jLabel1.setText("PRUEBA DE FRECUENCIA");

        jLabel2.setText("Intervalos");

        n.setMinimumSize(new java.awt.Dimension(70, 22));
        n.setPreferredSize(new java.awt.Dimension(70, 22));

        Salida.setPreferredSize(new java.awt.Dimension(70, 22));
        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });

        Exportarvvv.setText("Exportar a Excel");
        Exportarvvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarvvvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jLabel2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(Calcular)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exportarvvv))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Exportarvvv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Calcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        // TODO add your handling code here:
        while(tabla.getRowCount()>0){
            tabla.removeRow(0);
        }
    int Intervalos = Integer.parseInt(n.getText());

        ArrayList<Double> datos = new ArrayList<>();
    double chi[] = {0.0000, 3.8415, 5.9915, 7.8147, 9.4877, 11.0705, 12.5916, 14.0671, 15.5073, 16.9190, 18.3070, 19.6751, 21.0261, 22.3620, 23.6848, 24.9958, 26.2962, 27.5871, 28.8693, 30.1435, 31.4104, 32.6706, 33.9244, 35.1725, 36.4150, 37.6525, 38.8851, 40.1133, 41.3371, 42.5569, 43.7734, 44.9863, 46.1953, 47.4003, 48.6024, 49.8015, 50.9979, 52.1912, 53.3817, 54.5694, 55.7544, 56.9365, 58.1158, 59.2923, 60.4660, 61.6370, 62.8052, 63.9707, 65.1333, 66.2932, 67.4504, 68.6048, 69.7564, 70.9052, 72.0513, 73.1946, 74.3352, 75.4730, 76.6081, 77.7405, 78.8701, 79.9970, 81.1211, 82.2425, 83.3612, 84.4771, 85.5904, 86.7009, 87.8086, 88.9136, 90.0159, 91.1154, 92.2122, 93.3063, 94.3976, 95.4862, 96.5721, 97.6553, 98.7357, 99.8135, 100.8886, 101.9610, 103.0306, 104.0976, 105.1620, 106.2237, 107.2827, 108.3390, 109.3927, 110.4437, 111.4921, 112.5378, 113.5809, 114.6213, 115.6591, 116.6943, 117.7270, 118.7570, 119.7844, 120.8092, 121.8314
        };        
        if(tipo == "Mixto"){
        int contador = Mixto.tabla.getRowCount();            
        double[] arr = new double[Intervalos + 1];
        double[] F = new double[Intervalos];
        double FE =  contador / Intervalos, intervalo = 0, sumatoria = 0, sumatoria2 = 0;
        double[] arreglo_intervalos = new double[Intervalos + 1];
        int cont = 0;
        int[] contar = new int[Intervalos];
        
        for(int i=0; i<contador; i++){
                Object valores = Mixto.tabla.getValueAt(i, 1);
                double convertir = Double.parseDouble(valores.toString());
                datos.add(convertir);
            }

        for (int i = 0; i <= Intervalos; i++) {
            arreglo_intervalos[i] += intervalo;
            sumatoria += arreglo_intervalos[i];
            arr[i] = sumatoria;
            intervalo = (float) 1 / Intervalos;
        }

        int x = 0;
        for (int i = 0; i < contador; i++) {
            if (i == contador - 1) {
                x = i;
            }
        }
        System.out.println(chi[x]);

        for (int j = 0; j <= Intervalos; j++) {

            for (int s = 0; s < contador; s++) {

                if (datos.get(s) >= arr[j] && datos.get(s) < arr[j + 1]) {
                    cont++;
                }
                contar[j] = cont;
            }
            cont = 0;
            F[j] = (float) (Math.pow((contar[j] - FE), 2) / FE);
            sumatoria2 += F[j];
           tabla.addRow(new Object[]{arr[j]+"-"+arr[j+1],contar[j],FE, F[j],sumatoria2, chi[x]});
           if(sumatoria2 <= chi[x]){
               Salida.setText("Correcto");
           }else{
               Salida.setText("Incorrecto");
           }

        }
            }
        if(tipo == "Multiplicativo"){
        int contador = Multiplicativo.tabla.getRowCount();            
        double[] arr = new double[Intervalos + 1];
        double[] F = new double[Intervalos];
        double FE =  contador / Intervalos, intervalo = 0, sumatoria = 0, sumatoria2 = 0;
        double[] arreglo_intervalos = new double[Intervalos + 1];
        int cont = 0;
        int[] contar = new int[Intervalos];
        
        for(int i=0; i<contador; i++){
                Object valores = Multiplicativo.tabla.getValueAt(i, 1);
                double convertir = Double.parseDouble(valores.toString());
                datos.add(convertir);
            }

        for (int i = 0; i <= Intervalos; i++) {
            arreglo_intervalos[i] += intervalo;
            sumatoria += arreglo_intervalos[i];
            arr[i] = sumatoria;
            intervalo = (float) 1 / Intervalos;
        }

        int x = 0;
        for (int i = 0; i < contador; i++) {
            if (i == contador - 1) {
                x = i;
            }
        }
        System.out.println(chi[x]);

        for (int j = 0; j <= Intervalos; j++) {

            for (int s = 0; s < contador; s++) {

                if (datos.get(s) >= arr[j] && datos.get(s) < arr[j + 1]) {
                    cont++;
                }
                contar[j] = cont;
            }
            cont = 0;
            F[j] = (float) (Math.pow((contar[j] - FE), 2) / FE);
            sumatoria2 += F[j];
           tabla.addRow(new Object[]{arr[j]+"-"+arr[j+1],contar[j],FE, F[j],sumatoria2, chi[x]});
           if(sumatoria2 <= chi[x]){
               Salida.setText("Correcto");
           }else{
               Salida.setText("Incorrecto");
           }

        }
            }
        if(tipo == "Fibonacci"){
        int contador = Fibonacci.tabla.getRowCount();            
        double[] arr = new double[Intervalos + 1];
        double[] F = new double[Intervalos];
        double FE =  contador / Intervalos, intervalo = 0, sumatoria = 0, sumatoria2 = 0;
        double[] arreglo_intervalos = new double[Intervalos + 1];
        int cont = 0;
        int[] contar = new int[Intervalos];
        
        for(int i=0; i<contador; i++){
                Object valores = Fibonacci.tabla.getValueAt(i, 1);
                double convertir = Double.parseDouble(valores.toString());
                datos.add(convertir);
            }

        for (int i = 0; i <= Intervalos; i++) {
            arreglo_intervalos[i] += intervalo;
            sumatoria += arreglo_intervalos[i];
            arr[i] = sumatoria;
            intervalo = (float) 1 / Intervalos;
        }

        int x = 0;
        for (int i = 0; i < contador; i++) {
            if (i == contador - 1) {
                x = i;
            }
        }
        System.out.println(chi[x]);

        for (int j = 0; j <= Intervalos; j++) {
            for (int s = 0; s < contador; s++) {

                if (datos.get(s) >= arr[j] && datos.get(s) < arr[j + 1]) {
                    cont++;
                }
                contar[j] = cont;
            }
            cont = 0;
            F[j] = (float) (Math.pow((contar[j] - FE), 2) / FE);
            sumatoria2 += F[j];
           tabla.addRow(new Object[]{arr[j]+"-"+arr[j+1],contar[j],FE, F[j],sumatoria2, chi[x]});
           if(sumatoria2 <= chi[x]){
               Salida.setText("Correcto");
           }else{
               Salida.setText("Incorrecto");
           }

        }
            }        
        if(tipo == "Cuadratico"){
        int contador = Cuadrático.tabla.getRowCount();            
        double[] arr = new double[Intervalos + 1];
        double[] F = new double[Intervalos];
        double FE =  contador / Intervalos, intervalo = 0, sumatoria = 0, sumatoria2 = 0;
        double[] arreglo_intervalos = new double[Intervalos + 1];
        int cont = 0;
        int[] contar = new int[Intervalos];
        
        for(int i=0; i<contador; i++){
                Object valores = Cuadrático.tabla.getValueAt(i, 1);
                double convertir = Double.parseDouble(valores.toString());
                datos.add(convertir);
            }

        for (int i = 0; i <= Intervalos; i++) {
            arreglo_intervalos[i] += intervalo;
            sumatoria += arreglo_intervalos[i];
            arr[i] = sumatoria;
            intervalo = (float) 1 / Intervalos;
        }

        int x = 0;
        for (int i = 0; i < contador; i++) {
            if (i == contador - 1) {
                x = i;
            }
        }
        System.out.println(chi[x]);

        for (int j = 0; j <= Intervalos; j++) {

            for (int s = 0; s < contador; s++) {

                if (datos.get(s) >= arr[j] && datos.get(s) < arr[j + 1]) {
                    cont++;
                }
                contar[j] = cont;
            }
            cont = 0;
            F[j] = (float) (Math.pow((contar[j] - FE), 2) / FE);
            sumatoria2 += F[j];
           tabla.addRow(new Object[]{arr[j]+"-"+arr[j+1],contar[j],FE, F[j],sumatoria2, chi[x]});
           if(sumatoria2 <= chi[x]){
               Salida.setText("Correcto");
           }else{
               Salida.setText("Incorrecto");
           }

        }
            }
        if(tipo == "Aditivo"){
        int contador = Aditivo.tabla.getRowCount();            
        double[] arr = new double[Intervalos + 1];
        double[] F = new double[Intervalos];
        double FE =  contador / Intervalos, intervalo = 0, sumatoria = 0, sumatoria2 = 0;
        double[] arreglo_intervalos = new double[Intervalos + 1];
        int cont = 0;
        int[] contar = new int[Intervalos];
        
        for(int i=0; i<contador; i++){
                Object valores = Aditivo.tabla.getValueAt(i, 1);
                double convertir = Double.parseDouble(valores.toString());
                datos.add(convertir);
            }

        for (int i = 0; i <= Intervalos; i++) {
            arreglo_intervalos[i] += intervalo;
            sumatoria += arreglo_intervalos[i];
            arr[i] = sumatoria;
            intervalo = (float) 1 / Intervalos;
        }

        int x = 0;
        for (int i = 0; i < contador; i++) {
            if (i == contador - 1) {
                x = i;
            }
        }
        System.out.println(chi[x]);

        for (int j = 0; j <= Intervalos; j++) {

            for (int s = 0; s < contador; s++) {

                if (datos.get(s) >= arr[j] && datos.get(s) < arr[j + 1]) {
                    cont++;
                }
                contar[j] = cont;
            }
            cont = 0;
            F[j] = (float) (Math.pow((contar[j] - FE), 2) / FE);
            sumatoria2 += F[j];
           tabla.addRow(new Object[]{arr[j]+"-"+arr[j+1],contar[j],FE, F[j],sumatoria2, chi[x]});
           if(sumatoria2 <= chi[x]){
               Salida.setText("Correcto");
           }else{
               Salida.setText("Incorrecto");
           }

        }
            }
    }//GEN-LAST:event_CalcularActionPerformed

    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalidaActionPerformed

    private void ExportarvvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarvvvActionPerformed
        // TODO add your handling code here:
        ExportarExcel obj;
        try {
            obj = new ExportarExcel();
            obj.exportarExcel(Resultadosvvv);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al exportar"+ex);
        }
    }//GEN-LAST:event_ExportarvvvActionPerformed

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
            java.util.logging.Logger.getLogger(Frecuencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frecuencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frecuencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frecuencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frecuencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton Exportarvvv;
    private javax.swing.JTable Resultadosvvv;
    private javax.swing.JTextField Salida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField n;
    // End of variables declaration//GEN-END:variables
}
