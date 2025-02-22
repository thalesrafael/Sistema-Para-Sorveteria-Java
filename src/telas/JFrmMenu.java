/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import telas.JDlgCliente;
import telas.JDlgCliente;
import telas.JDlgCliente;
import telas.JDlgFornecedor;
import telas.JDlgFornecedor;
import telas.JDlgFornecedor;
import telas.JDlgMovimento;
import telas.JDlgMovimento;
import telas.JDlgMovimento;
import telas.JDlgProduto;
import telas.JDlgProduto;
import telas.JDlgProduto;



/**
 *
 * @author Admin
 */
public class JFrmMenu extends javax.swing.JFrame {
 
    /**
     * Creates new form JFrmMenu
     */
    public JFrmMenu() {
        initComponents();
        setTitle("Sistema de Sorveteria");
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jBtnClientes = new javax.swing.JButton();
        jBtnFornecedor = new javax.swing.JButton();
        jBtnProduto = new javax.swing.JButton();
        jBtnVenda = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        JMnuCadastroCliente = new javax.swing.JMenuItem();
        JMnuCadastroFornecedor = new javax.swing.JMenuItem();
        JMnuCadastroProduto = new javax.swing.JMenuItem();
        JMnuVenda = new javax.swing.JMenuItem();
        JMnuSair = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Sistema de Sorveteria ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jToolBar1.setRollover(true);

        jBtnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconcadastros.jpg"))); // NOI18N
        jBtnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClientesActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnClientes);

        jBtnFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconfornecedor.png"))); // NOI18N
        jBtnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFornecedorActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnFornecedor);

        jBtnProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconproduto.png"))); // NOI18N
        jBtnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnProdutoActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnProduto);

        jBtnVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone-cards.png"))); // NOI18N
        jBtnVenda.setFocusable(false);
        jBtnVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVendaActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnVenda);

        jBtnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnSair);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 294, 48));

        jMenu3.setText("Cadastros");

        JMnuCadastroCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        JMnuCadastroCliente.setMnemonic('C');
        JMnuCadastroCliente.setText("Cadastro de Clientes");
        JMnuCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMnuCadastroClienteActionPerformed(evt);
            }
        });
        jMenu3.add(JMnuCadastroCliente);
        JMnuCadastroCliente.getAccessibleContext().setAccessibleDescription("");

        JMnuCadastroFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        JMnuCadastroFornecedor.setMnemonic('C');
        JMnuCadastroFornecedor.setText("Cadastro do Fornecedor");
        JMnuCadastroFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMnuCadastroFornecedorActionPerformed(evt);
            }
        });
        jMenu3.add(JMnuCadastroFornecedor);

        JMnuCadastroProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        JMnuCadastroProduto.setMnemonic('C');
        JMnuCadastroProduto.setText("Cadastro de Produtos");
        JMnuCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMnuCadastroProdutoActionPerformed(evt);
            }
        });
        jMenu3.add(JMnuCadastroProduto);

        JMnuVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        JMnuVenda.setText("Tela de Venda");
        JMnuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMnuVendaActionPerformed(evt);
            }
        });
        jMenu3.add(JMnuVenda);

        JMnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        JMnuSair.setMnemonic('S');
        JMnuSair.setText("Sair");
        JMnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMnuSairActionPerformed(evt);
            }
        });
        jMenu3.add(JMnuSair);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMnuCadastroFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMnuCadastroFornecedorActionPerformed
        // TODO add your handling code here:
        JDlgFornecedor jDlgFornecedor = new JDlgFornecedor(null, true);
        jDlgFornecedor.setVisible(true);
    }//GEN-LAST:event_JMnuCadastroFornecedorActionPerformed

    private void JMnuCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMnuCadastroClienteActionPerformed
        // TODO add your handling code here:
         JDlgCliente jDlgCliente = new JDlgCliente(null, true);
        jDlgCliente.setVisible(true);
    }//GEN-LAST:event_JMnuCadastroClienteActionPerformed

    private void JMnuCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMnuCadastroProdutoActionPerformed
        // TODO add your handling code here:
        JDlgProduto jDlgProduto = new JDlgProduto(null, true);
        jDlgProduto.setVisible(true);
    }//GEN-LAST:event_JMnuCadastroProdutoActionPerformed

    private void JMnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMnuSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_JMnuSairActionPerformed

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jBtnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClientesActionPerformed
        // TODO add your handling code here:
         JDlgCliente jDlgCliente = new JDlgCliente(null, true);
        jDlgCliente.setVisible(true);
    }//GEN-LAST:event_jBtnClientesActionPerformed

    private void jBtnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFornecedorActionPerformed
        // TODO add your handling code here:
         JDlgFornecedor jDlgFornecedor = new JDlgFornecedor(null, true);
        jDlgFornecedor.setVisible(true);
    }//GEN-LAST:event_jBtnFornecedorActionPerformed

    private void jBtnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProdutoActionPerformed
        // TODO add your handling code here:
         JDlgProduto jDlgProduto = new JDlgProduto(null, true);
        jDlgProduto.setVisible(true);
    }//GEN-LAST:event_jBtnProdutoActionPerformed

    private void JMnuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMnuVendaActionPerformed
        // TODO add your handling code here:
          JDlgVenda jDlgVenda = new JDlgVenda(null, true);
        jDlgVenda.setVisible(true);
    }//GEN-LAST:event_JMnuVendaActionPerformed

    private void jBtnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVendaActionPerformed
        // TODO add your handling code here:
           JDlgVenda jDlgVenda = new JDlgVenda(null, true);
        jDlgVenda.setVisible(true);
    }//GEN-LAST:event_jBtnVendaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMnuCadastroCliente;
    private javax.swing.JMenuItem JMnuCadastroFornecedor;
    private javax.swing.JMenuItem JMnuCadastroProduto;
    private javax.swing.JMenuItem JMnuSair;
    private javax.swing.JMenuItem JMnuVenda;
    private javax.swing.JButton jBtnClientes;
    private javax.swing.JButton jBtnFornecedor;
    private javax.swing.JButton jBtnProduto;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JButton jBtnVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
