/*
 * @author Felipe 
 * @author Guilherme Mandeli Fernandes Camacho  3210023
 * @author Rafaella Sapucaia Cintra             3759649
 * @author Wilson Delphino 
 */

package view;

import java.util.Date;
import javax.swing.JFrame;

public class C extends javax.swing.JFrame {

public class Conta {
    //
    public String nome;
    public String cpf;
    public Date data_nascimento;
 
    public Conta(String _nome, String _cpf, Date _data) {
        this.nome = _nome;
        this.cpf = _cpf;
        this.data_nascimento = _data;
    }
}
    public C() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hello = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        buttontelaInicial = new javax.swing.JMenu();
        buttoncontaCorrente = new javax.swing.JMenu();
        buttoncontaPoupanca = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        hello.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        hello.setText("Olá ");

        welcome.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        welcome.setText("Seja bem vindo a sua conta TestBank. ");

        logo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        logo.setText("TestBank");

        nome.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        nome.setText("usuario,");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hello)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(welcome)
                        .addGap(0, 576, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hello)
                    .addComponent(logo)
                    .addComponent(nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcome)
                .addContainerGap(439, Short.MAX_VALUE))
        );

        buttontelaInicial.setText("Inicio");
        jMenuBar1.add(buttontelaInicial);

        buttoncontaCorrente.setText("Conta corrente");
        buttoncontaCorrente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttoncontaCorrenteMouseClicked(evt);
            }
        });
        jMenuBar1.add(buttoncontaCorrente);

        buttoncontaPoupanca.setText("Conta Poupança");
        buttoncontaPoupanca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttoncontaPoupancaMouseClicked(evt);
            }
        });
        jMenuBar1.add(buttoncontaPoupanca);

        jMenu4.setText("SAIR");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttoncontaCorrenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttoncontaCorrenteMouseClicked
       JFrame ContaCorrente = new JFrame();
       new CC().setVisible(true);
    }//GEN-LAST:event_buttoncontaCorrenteMouseClicked

    private void buttoncontaPoupancaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttoncontaPoupancaMouseClicked
        JFrame ContaPoupanca = new JFrame();
        new CP().setVisible(true);
    }//GEN-LAST:event_buttoncontaPoupancaMouseClicked


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu buttoncontaCorrente;
    private javax.swing.JMenu buttoncontaPoupanca;
    private javax.swing.JMenu buttontelaInicial;
    private javax.swing.JLabel hello;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
