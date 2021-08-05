
package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * @author Rafaella
 */
public class CC extends javax.swing.JFrame {
    
    public class contaCorrente extends C{
        double limite;
        int gerente;
        double taxaMensal; 
    }

    public CC() {      
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        hello = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        contaC = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Sp = new javax.swing.JLabel();
        saldocp = new javax.swing.JLabel();
        saquec60 = new javax.swing.JButton();
        saquec40 = new javax.swing.JButton();
        saquec50 = new javax.swing.JButton();
        depc20 = new javax.swing.JButton();
        saquec20 = new javax.swing.JButton();
        depc40 = new javax.swing.JButton();
        depc50 = new javax.swing.JButton();
        depc60 = new javax.swing.JButton();
        SFCI1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        saldocorrentefinal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONTA CORRENTE");

        hello.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        hello.setText("Olá usuario,");

        logo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        logo.setText("TestBank");

        welcome.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        welcome.setText("Seja bem vindo a sua CONTA CORRENTE. ");

        contaC.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        contaC.setText("Deposito");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Saque");

        Sp.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Sp.setText("Saldo:");

        saldocp.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        saldocp.setText("100,00");

        saquec60.setBackground(new java.awt.Color(255, 0, 0));
        saquec60.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        saquec60.setText("R$ 60,00");
        saquec60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saquec60ActionPerformed(evt);
            }
        });

        saquec40.setBackground(new java.awt.Color(255, 0, 0));
        saquec40.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        saquec40.setText("R$ 40,00");
        saquec40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saquec40ActionPerformed(evt);
            }
        });

        saquec50.setBackground(new java.awt.Color(255, 0, 0));
        saquec50.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        saquec50.setText("R$ 50,00");
        saquec50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saquec50ActionPerformed(evt);
            }
        });

        depc20.setBackground(new java.awt.Color(0, 204, 0));
        depc20.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        depc20.setText("R$ 20,00");
        depc20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depc20MouseClicked(evt);
            }
        });
        depc20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depc20ActionPerformed(evt);
            }
        });

        saquec20.setBackground(new java.awt.Color(255, 0, 0));
        saquec20.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        saquec20.setText("R$ 20,00");
        saquec20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saquec20ActionPerformed(evt);
            }
        });

        depc40.setBackground(new java.awt.Color(102, 204, 0));
        depc40.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        depc40.setText("R$ 40,00");
        depc40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depc40ActionPerformed(evt);
            }
        });

        depc50.setBackground(new java.awt.Color(0, 204, 0));
        depc50.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        depc50.setText("R$ 50,00");
        depc50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depc50ActionPerformed(evt);
            }
        });

        depc60.setBackground(new java.awt.Color(0, 204, 0));
        depc60.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        depc60.setText("R$ 60,00");
        depc60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depc60ActionPerformed(evt);
            }
        });

        SFCI1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SFCI1.setText("SALDO FINAL:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        saldocorrentefinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saldocorrentefinal.setText("R$ 100,00");

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
                        .addComponent(saldocorrentefinal))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(contaC)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(depc50, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(depc20, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(124, 124, 124)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(depc60, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(depc40, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(saquec50, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(saquec20, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(SFCI1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saquec60, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saquec40, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(depc20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depc40, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saquec20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saquec40, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depc60, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depc50, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saquec50, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saquec60, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SFCI1)
                    .addComponent(saldocorrentefinal))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saquec40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saquec40ActionPerformed
        saldocorrentefinal.setText("60.00");
    }//GEN-LAST:event_saquec40ActionPerformed

    private void depc40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depc40ActionPerformed
        saldocorrentefinal.setText("140.00");
    }//GEN-LAST:event_depc40ActionPerformed

    private void depc20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depc20MouseClicked
        saldocorrentefinal.setText("120.00");
    }//GEN-LAST:event_depc20MouseClicked

    private void depc20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depc20ActionPerformed
        saldocorrentefinal.setText("120.00");
    }//GEN-LAST:event_depc20ActionPerformed

    private void depc50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depc50ActionPerformed
        saldocorrentefinal.setText("150.00");
    }//GEN-LAST:event_depc50ActionPerformed

    private void depc60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depc60ActionPerformed
        saldocorrentefinal.setText("160.00");
    }//GEN-LAST:event_depc60ActionPerformed

    private void saquec20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saquec20ActionPerformed
        saldocorrentefinal.setText("80.00");
    }//GEN-LAST:event_saquec20ActionPerformed

    private void saquec50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saquec50ActionPerformed
        saldocorrentefinal.setText("50.00");
    }//GEN-LAST:event_saquec50ActionPerformed

    private void saquec60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saquec60ActionPerformed
        saldocorrentefinal.setText("40.00");
    }//GEN-LAST:event_saquec60ActionPerformed

    public static void main(String args[]) {
      
                try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new CC().setVisible(true);
                });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SFCI1;
    private javax.swing.JLabel Sp;
    private javax.swing.JLabel contaC;
    private javax.swing.JButton depc20;
    private javax.swing.JButton depc40;
    private javax.swing.JButton depc50;
    private javax.swing.JButton depc60;
    private javax.swing.JLabel hello;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel saldocorrentefinal;
    private javax.swing.JLabel saldocp;
    private javax.swing.JButton saquec20;
    private javax.swing.JButton saquec40;
    private javax.swing.JButton saquec50;
    private javax.swing.JButton saquec60;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
