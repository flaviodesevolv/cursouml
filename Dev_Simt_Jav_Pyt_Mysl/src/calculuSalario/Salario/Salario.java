package calculuSalario;

import java.text.DecimalFormat;

public class Salario extends javax.swing.JFrame {

    public Salario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelFerias = new javax.swing.JLabel();
        jLabelDesimoSalario = new javax.swing.JLabel();
        jLabelAnual = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelLiquido = new javax.swing.JLabel();
        jTextDesconto = new javax.swing.JTextField();
        jTextSalario = new javax.swing.JTextField();
        jButtoCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel1.setText("persentual desconto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 240, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel2.setText("treinamento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel3.setText("desenvolvimento");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 250, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel4.setText("salario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 250, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel6.setText("resultado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 250, -1));

        jLabelFerias.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        getContentPane().add(jLabelFerias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 880, 60));

        jLabelDesimoSalario.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        getContentPane().add(jLabelDesimoSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 250, -1));

        jLabelAnual.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        getContentPane().add(jLabelAnual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 250, -1));

        jLabel10.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Desenvolvido por flavio");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 640, 340, -1));

        jLabelLiquido.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        getContentPane().add(jLabelLiquido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 240, -1));
        getContentPane().add(jTextDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 150, 60));

        jTextSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSalarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 330, 60));

        jButtoCalcular.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        jButtoCalcular.setText("Calcular");
        jButtoCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(jButtoCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 140, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSalarioActionPerformed

    private void jButtoCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoCalcularActionPerformed
        double salario
                = Double.parseDouble(jTextSalario.getText());
        double desconto = Double.parseDouble(jTextDesconto.getText());
        double resultado = salario - (salario / 100) * desconto;
        double anual = resultado * 12;
        double decimo = resultado;
        double ferias = (salario / 3) + resultado;
        /////////////////////////////////////////////////////////////

        DecimalFormat formatado = new DecimalFormat("#.00");
        String resutadoFormatado = formatado.format(resultado);
        String anualFormatado = formatado.format(anual);
        String decimoFormatado = formatado.format(decimo);
        String feriasFormatado = formatado.format(resultado);

        jLabelLiquido.setText("valor Mensal " + resutadoFormatado);
        jLabelAnual.setText("valor anual " + anualFormatado);
        jLabelDesimoSalario.setText("valor do decimom e " + decimoFormatado);
        jLabelFerias.setText("valor  da ferias " + feriasFormatado);


    }//GEN-LAST:event_jButtoCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Salario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAnual;
    private javax.swing.JLabel jLabelDesimoSalario;
    private javax.swing.JLabel jLabelFerias;
    private javax.swing.JLabel jLabelLiquido;
    private javax.swing.JTextField jTextDesconto;
    private javax.swing.JTextField jTextSalario;
    // End of variables declaration//GEN-END:variables
}
