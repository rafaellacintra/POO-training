
package view;

/**
 *
 * @author Rafaella
 */
public class CP extends javax.swing.JFrame {

    public class contaPoupanca extends C{
           
    }
    public CP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        hello = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        contaC = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Sp = new javax.swing.JLabel();
        saldocp = new javax.swing.JLabel();
        sp60 = new javax.swing.JButton();
        sp40 = new javax.swing.JButton();
        sp50 = new javax.swing.JButton();
        dp20 = new javax.swing.JButton();
        sp20 = new javax.swing.JButton();
        dp40 = new javax.swing.JButton();
        dp50 = new javax.swing.JButton();
        dp60 = new javax.swing.JButton();
        SCF = new javax.swing.JLabel();
        SFCI1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        saldopoupancafinal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hello.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        hello.setText("Olá usuario,");

        logo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        logo.setText("TestBank");

        welcome.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        welcome.setText("Seja bem vindo a sua CONTA POUPANÇA. ");

        contaC.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        contaC.setText("Deposito");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Saque");

        Sp.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Sp.setText("Saldo:");

        saldocp.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        saldocp.setText("100,00");

        sp60.setBackground(new java.awt.Color(255, 0, 0));
        sp60.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        sp60.setText("R$ 60,00");
        sp60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp60ActionPerformed(evt);
            }
        });

        sp40.setBackground(new java.awt.Color(255, 0, 0));
        sp40.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        sp40.setText("R$ 40,00");
        sp40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp40ActionPerformed(evt);
            }
        });

        sp50.setBackground(new java.awt.Color(255, 0, 0));
        sp50.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        sp50.setText("R$ 50,00");
        sp50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp50ActionPerformed(evt);
            }
        });

        dp20.setBackground(new java.awt.Color(0, 204, 0));
        dp20.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        dp20.setText("R$ 20,00");
        dp20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dp20MouseClicked(evt);
            }
        });
        dp20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp20ActionPerformed(evt);
            }
        });

        sp20.setBackground(new java.awt.Color(255, 0, 0));
        sp20.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        sp20.setText("R$ 20,00");
        sp20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp20ActionPerformed(evt);
            }
        });

        dp40.setBackground(new java.awt.Color(102, 204, 0));
        dp40.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        dp40.setText("R$ 40,00");
        dp40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp40ActionPerformed(evt);
            }
        });

        dp50.setBackground(new java.awt.Color(0, 204, 0));
        dp50.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        dp50.setText("R$ 50,00");
        dp50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp50ActionPerformed(evt);
            }
        });

        dp60.setBackground(new java.awt.Color(0, 204, 0));
        dp60.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        dp60.setText("R$ 60,00");
        dp60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp60ActionPerformed(evt);
            }
        });

        SCF.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        SFCI1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SFCI1.setText("SALDO FINAL:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        saldopoupancafinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saldopoupancafinal.setText("R$ 100,00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(welcome)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(hello)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logo)
                        .addGap(23, 23, 23))))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(saldopoupancafinal))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(contaC)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dp50, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dp20, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dp60, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dp40, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(SCF, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sp50, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sp20, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(SFCI1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sp60, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp40, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Sp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saldocp)))))
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logo)
                    .addComponent(hello))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcome)
                .addGap(44, 44, 44)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(contaC))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Sp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saldocp)
                            .addComponent(jLabel1))))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dp20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dp40, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp40, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dp60, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dp50, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp50, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp60, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SCF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SFCI1)
                    .addComponent(saldopoupancafinal))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sp40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp40ActionPerformed
        saldopoupancafinal.setText("R$ 60.00");     
    }//GEN-LAST:event_sp40ActionPerformed

    private void dp20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dp20MouseClicked
            
    }//GEN-LAST:event_dp20MouseClicked
    private void dp20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp20ActionPerformed
        saldopoupancafinal.setText("R$ 120.00");     
    }//GEN-LAST:event_dp20ActionPerformed

    private void dp40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp40ActionPerformed
        saldopoupancafinal.setText("R$ 140.00");     
    }//GEN-LAST:event_dp40ActionPerformed

    private void dp60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp60ActionPerformed
        saldopoupancafinal.setText("R$ 160.00");     
    }//GEN-LAST:event_dp60ActionPerformed

    private void sp50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp50ActionPerformed
        saldopoupancafinal.setText("R$ 50.00");     
    }//GEN-LAST:event_sp50ActionPerformed

    private void sp20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp20ActionPerformed
        saldopoupancafinal.setText("R$ 80.00");     
    }//GEN-LAST:event_sp20ActionPerformed

    private void dp50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp50ActionPerformed
        saldopoupancafinal.setText("R$ 150.00");
    }//GEN-LAST:event_dp50ActionPerformed

    private void sp60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp60ActionPerformed
        saldopoupancafinal.setText("R$ 80.00");
    }//GEN-LAST:event_sp60ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

               java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SCF;
    private javax.swing.JLabel SFCI1;
    private javax.swing.JLabel Sp;
    private javax.swing.JLabel contaC;
    private javax.swing.JButton dp20;
    private javax.swing.JButton dp40;
    private javax.swing.JButton dp50;
    private javax.swing.JButton dp60;
    private javax.swing.JLabel hello;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel saldocp;
    private javax.swing.JLabel saldopoupancafinal;
    private javax.swing.JButton sp20;
    private javax.swing.JButton sp40;
    private javax.swing.JButton sp50;
    private javax.swing.JButton sp60;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
