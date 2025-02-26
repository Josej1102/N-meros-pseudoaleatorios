
import java.io.IOException;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose
 */
public class Mixto extends javax.swing.JFrame {

    double x;
    double a;
    double c;
    double m;
    double x1;
    double a1;
    double c1;
    double m1;
    boolean mayor;
    HashSet<Double> repetido = new HashSet<>();
    public static DefaultTableModel tabla;
    public Mixto() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        tabla = new DefaultTableModel();
        tabla.addColumn("X");
        tabla.addColumn("X/m");
        this.Resultadosvvv.setModel(tabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Xvvv = new javax.swing.JTextField();
        Avvv = new javax.swing.JTextField();
        Cvvv = new javax.swing.JTextField();
        Mvvv = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultadosvvv = new javax.swing.JTable();
        corrervvv = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Exportarvvv = new javax.swing.JButton();
        Pruebasvvv = new javax.swing.JButton();
        Lista = new javax.swing.JComboBox<>();
        Validas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("X");

        jLabel2.setText("A");

        jLabel3.setText("C");

        jLabel4.setText("m");

        Xvvv.setPreferredSize(new java.awt.Dimension(70, 22));
        Xvvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XvvvActionPerformed(evt);
            }
        });

        Avvv.setPreferredSize(new java.awt.Dimension(70, 22));
        Avvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvvvActionPerformed(evt);
            }
        });

        Cvvv.setPreferredSize(new java.awt.Dimension(70, 22));
        Cvvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CvvvActionPerformed(evt);
            }
        });

        Mvvv.setPreferredSize(new java.awt.Dimension(70, 22));

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

        corrervvv.setText("correr");
        corrervvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corrervvvActionPerformed(evt);
            }
        });

        jLabel5.setText("GENERADOR CONGRUENCIAL MIXTO");

        Exportarvvv.setText("Exportar a Excel");
        Exportarvvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarvvvActionPerformed(evt);
            }
        });

        Pruebasvvv.setText("Realizar pruebas");
        Pruebasvvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PruebasvvvActionPerformed(evt);
            }
        });

        Lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Promedio", "Frecuencia", "Kolmogorov-smirnov", "Corridas", "Serie" }));

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGap(45, 45, 45)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Xvvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Avvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Cvvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Mvvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(corrervvv))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(Validas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 92, Short.MAX_VALUE)
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
                            .addComponent(Avvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Cvvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
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
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AvvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvvvActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_AvvvActionPerformed

    private void CvvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CvvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CvvvActionPerformed

    private void corrervvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corrervvvActionPerformed
        // TODO add your handling code here:
        while(tabla.getRowCount()>0){
            tabla.removeRow(0);
        }
        
        x = Double.parseDouble( Xvvv.getText());
        a = Double.parseDouble( Avvv.getText());
        m = Double.parseDouble( Mvvv.getText());
        c = Double.parseDouble( Cvvv.getText());
        
        double xn; 
        int contador = 0, i = 0;
 /*       double primer_numero = 0;
        double[] N_aleatorios_m = new double[m];
        double[] N = new double[m];*/
 
        
        do {
            x = ((a * x) + c) % m;
            xn = x/m;
            
            if(repetido.contains(x)){
                System.out.println("PERIODO COMPLETO");
                break;
            }
            repetido.add(x);
            contador++;
            i++;
            tabla.addRow(new Object[]{(int)x,xn});
            x = x;
            System.out.println(xn);
        } while (i < m);
        
    }//GEN-LAST:event_corrervvvActionPerformed

    private void XvvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XvvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_XvvvActionPerformed

    private void PruebasvvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PruebasvvvActionPerformed
        // TODO add your handling code here:
        int index = Lista.getSelectedIndex();
        if(index == 0){
            Promedio newframe = new Promedio();
            newframe.setVisible(true);
            Promedio.tipo = "Mixto";
        }
        if(index == 1){
            Frecuencia newframe = new Frecuencia();
            newframe.setVisible(true);
            Frecuencia.tipo = "Mixto";
        }
        if(index == 2){
            Smirnov newframe = new Smirnov();
            newframe.setVisible(true);
            Smirnov.tipo = "Mixto";
            Smirnov.m = m;
        }
        if(index == 3){
            Corridas newframe = new Corridas();
            newframe.setVisible(true);
            Corridas.tipo = "Mixto";
        }
        if(index == 4){
            Serie newframe = new Serie();
            newframe.setVisible(true);
            Serie.tipo = "Mixto";
        }
    }//GEN-LAST:event_PruebasvvvActionPerformed

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
    public static boolean esPrimo(int m) {
        int cont = 0;
        for (int i = 1; i <= m; i++) {
            if (m % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            return true;
        }
        return false;
    }

    public static boolean mImpar(int m) {

        int residuo;

        residuo = m % 2;

        if (residuo == 1) {
            return true;
        }
        return false;
    }
    private void ValidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidasActionPerformed
        // TODO add your handling code here:
        
        x1 = Double.parseDouble( Xvvv.getText());
        a1 = Double.parseDouble( Avvv.getText());
        m1 = Double.parseDouble( Mvvv.getText());
        c1 = Double.parseDouble( Cvvv.getText());
        if (m1 > a && m1 > x && m1 > c) {
                    mayor = true;
                }
                if (m1 < a || m1 < x || m1 < c) {
                    mayor = false;
                }
        
        if ((a1 % 3 == 0 || a1 % 5 == 0) && a1 > m1) {
                        JOptionPane.showMessageDialog(null, "°a NO puede ser divisible por 3 o 5"
                                + "\n°a no puede ser mayor a m");
                    }
                    if (a1 > m1) {
                        JOptionPane.showMessageDialog(null, "a no puede ser mayor que m");
                    }
                    if ((a1 % 3 == 0 || a1 % 5 == 0)) {
                        JOptionPane.showMessageDialog(null, "a no puede ser divisible por 3 o 5");
                    }
                    if (a1 % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "a no puede ser par");
                    }
                    if (a1 % 2 != 0 && (a1 % 3 != 0 || a1 % 5 != 0) && a1 < m1) {
                        JOptionPane.showMessageDialog(null, "a cumple todas las condiciones");
                    }
                    if (x1 > m1) {
                        JOptionPane.showMessageDialog(null, "X no puede ser mayor que m");
                    }
                    if (c1 % 8 == 5 && c1 < m1) {
                        JOptionPane.showMessageDialog(null, "C cumple con todas las condiciones");
                    }
                    if (c1 % 8 == 5 && c1 > m1) {
                        JOptionPane.showMessageDialog(null, "C no puede ser mayor a m");
                    }
                    if (c1 % 8 != 5 && c1 < m1) {
                        JOptionPane.showMessageDialog(null, "C no cumple la ecuación 'c mod 8 = 5'");
                    }
                    if (c1 % 8 != 5 && c1 > m1) {
                        JOptionPane.showMessageDialog(null, "C no cumple las condiciones:"
                                + "\n° Ser mayor a m"
                                + "\n° c mod 8 = 5");
                    }
                    if (esPrimo((int) m1) && mImpar((int) m1) && !mayor) {
                        JOptionPane.showMessageDialog(null, "m No es:"
                                + "\n° El numero mayor");
                    }
                    if (esPrimo((int) m1) && !mImpar((int) m1) && mayor) {
                        JOptionPane.showMessageDialog(null, "m No es:"
                                + "\n° Numero impar");
                    }
                    if (esPrimo((int) m1) && !mImpar((int) m1) && !mayor) {
                        JOptionPane.showMessageDialog(null, "m No es:"
                                + "\n° Numero impar"
                                + "\n° El numero mayor");
                    }
                    if (!esPrimo((int) m1) && mImpar((int) m1) && mayor) {
                        JOptionPane.showMessageDialog(null, "m No es:"
                                + "\n° Numero primo");
                    }
                    if (!esPrimo((int) m1) && mImpar((int) m1) && !mayor) {
                        JOptionPane.showMessageDialog(null, "m No es:"
                                + "\n° Numero primo"
                                + "\n° El numero mayor");
                    }
                    if (!esPrimo((int) m1) && !mImpar((int) m1) && mayor) {

                        JOptionPane.showMessageDialog(null, "m No es:"
                                + "\n° Numero primo"
                                + "\n° Numero impar");
                    }
                    if (!esPrimo((int) m1) && !mImpar((int) m1) && !mayor) {
                        JOptionPane.showMessageDialog(null, "m No es:"
                                + "\n° Numero primo"
                                + "\n° Numero impar"
                                + "\n° El numero mayor");
                    }
                    if (esPrimo((int) m1) && mImpar((int) m1) && mayor) {
                        JOptionPane.showMessageDialog(null, "m Cumple todas las condiciones");
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
            java.util.logging.Logger.getLogger(Mixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mixto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Avvv;
    private javax.swing.JTextField Cvvv;
    private javax.swing.JButton Exportarvvv;
    private javax.swing.JComboBox<String> Lista;
    private javax.swing.JTextField Mvvv;
    private javax.swing.JButton Pruebasvvv;
    private javax.swing.JTable Resultadosvvv;
    private javax.swing.JButton Validas;
    private javax.swing.JTextField Xvvv;
    private javax.swing.JButton corrervvv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
