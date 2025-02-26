
import java.io.IOException;
import java.util.HashSet;
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
public class Fibonacci extends javax.swing.JFrame {

    /**
     * Creates new form Fibonacci
     */
    double x;
    double x2;
    double m;
    double x1;
    double x3;
    double m1;
    public static DefaultTableModel tabla;
    HashSet<Double> repetido = new HashSet<>();

    public Fibonacci() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        tabla = new DefaultTableModel();
        tabla.addColumn("X");
        tabla.addColumn("X/m");
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

        Exportarvvv = new javax.swing.JButton();
        Lista = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Mvvv = new javax.swing.JTextField();
        Pruebasvvv = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultadosvvv = new javax.swing.JTable();
        Xvvv = new javax.swing.JTextField();
        X2vvv = new javax.swing.JTextField();
        corrervvv = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Validas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Exportarvvv.setText("Exportar a Excel");
        Exportarvvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarvvvActionPerformed(evt);
            }
        });

        Lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Promedio", "Frecuencia", "Kolmogorov-smirnov", "Corridas", "Serie" }));

        jLabel4.setText("m");

        Mvvv.setPreferredSize(new java.awt.Dimension(70, 22));

        Pruebasvvv.setText("Realizar pruebas");
        Pruebasvvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PruebasvvvActionPerformed(evt);
            }
        });

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

        Xvvv.setPreferredSize(new java.awt.Dimension(70, 22));
        Xvvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XvvvActionPerformed(evt);
            }
        });

        X2vvv.setPreferredSize(new java.awt.Dimension(70, 22));
        X2vvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X2vvvActionPerformed(evt);
            }
        });

        corrervvv.setText("correr");
        corrervvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corrervvvActionPerformed(evt);
            }
        });

        jLabel1.setText("x1");

        jLabel5.setText("GENERADOR CONGRUENCIAL MIXTO");

        jLabel2.setText("X2");

        Validas.setText("Validar");
        Validas.setPreferredSize(new java.awt.Dimension(70, 22));
        Validas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Xvvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(X2vvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Mvvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Validas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(corrervvv)))
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pruebasvvv)
                .addGap(51, 51, 51)
                .addComponent(Exportarvvv)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Xvvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(X2vvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(Mvvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(Validas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(corrervvv))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Exportarvvv)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Pruebasvvv)
                        .addComponent(Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PruebasvvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PruebasvvvActionPerformed
        // TODO add your handling code here:
        int index = Lista.getSelectedIndex();
        if(index == 0){
            Promedio newframe = new Promedio();
            newframe.setVisible(true);
            Promedio.tipo = "Fibonacci";
        }
        if(index == 1){
            Frecuencia newframe = new Frecuencia();
            newframe.setVisible(true);
            Frecuencia.tipo = "Fibonacci";
        }
        if(index == 2){
            Smirnov newframe = new Smirnov();
            newframe.setVisible(true);
            Smirnov.tipo = "Fibonacci";
            Smirnov.m = m;
        }
        if(index == 3){
            Corridas newframe = new Corridas();
            newframe.setVisible(true);
            Corridas.tipo = "Fibonacci";
        }
        if(index == 4){
            Serie newframe = new Serie();
            newframe.setVisible(true);
            Serie.tipo = "Fibonacci";
        }
    }//GEN-LAST:event_PruebasvvvActionPerformed

    private void XvvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XvvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_XvvvActionPerformed

    private void X2vvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X2vvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X2vvvActionPerformed

    private void corrervvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corrervvvActionPerformed
        // TODO add your handling code here:
        while(tabla.getRowCount()>0){
            tabla.removeRow(0);
        }

        x = Double.parseDouble( Xvvv.getText());
        x2 = Double.parseDouble( X2vvv.getText());
        m = Double.parseDouble( Mvvv.getText());

        double xn = 0;
        int contador = 0, i = 0, numero =0;
        /*       double primer_numero = 0;
        double[] N_aleatorios_m = new double[m];
        double[] N = new double[m];*/
        do {
            numero = (int) ((x + x2) % m);

            x = x2;
            x2 = numero;
            
            contador++;
            i++;
            tabla.addRow(new Object[]{numero,numero/m});
            System.out.println(xn);
        } while (i < m);
    }//GEN-LAST:event_corrervvvActionPerformed

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

    private void ValidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidasActionPerformed
        // TODO add your handling code here:

        x1 = Double.parseDouble( Xvvv.getText());
        x3 = Double.parseDouble( X2vvv.getText());
        m1 = Double.parseDouble( Mvvv.getText());
        
        
                    if (x1 > x3) {
                        JOptionPane.showMessageDialog(null, "X1 no puede ser mayor a X2");

                    } else {
                        JOptionPane.showMessageDialog(null, "Todo correcto");
                    }

    }//GEN-LAST:event_ValidasActionPerformed

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
            java.util.logging.Logger.getLogger(Fibonacci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fibonacci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fibonacci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fibonacci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fibonacci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exportarvvv;
    private javax.swing.JComboBox<String> Lista;
    private javax.swing.JTextField Mvvv;
    private javax.swing.JButton Pruebasvvv;
    private javax.swing.JTable Resultadosvvv;
    private javax.swing.JButton Validas;
    private javax.swing.JTextField X2vvv;
    private javax.swing.JTextField Xvvv;
    private javax.swing.JButton corrervvv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
