/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import erros.CampoBrancoException;
import funcoes.Util;
import javax.swing.JOptionPane;

import persistencia.Fornecedor;
import persistencia.FornecedorDAO;

/**
 *
 * @author Admin
 */
public class JDlgFornecedor extends javax.swing.JDialog {
       Fornecedor fornecedor;
   
    boolean inclusao;
    FornecedorDAO fornecedorDAO;

    /**
     * Creates new form JDlgFornecedor
     */
    public JDlgFornecedor(java.awt.Frame parent, boolean modal) {
      super(parent, modal);
            initComponents();
             fornecedorDAO = new FornecedorDAO();
       
      
      
        setLocationRelativeTo(null);
         Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir);
        Util.habilitar(false,  jBtnCancelar, jBtnConfirmar, jTxtCodigo, jTxtNome, jTxtRg, jTxtCpf, jTxtTelefone, jTxtTelefone2, jTxtEmail, jTxtCidade, jTxtBairro, jTxtRua, jTxtNumero, jTxtCep,  jTxtSite,  jCboEstado );
        Util.limpar(jTxtCodigo, jTxtNome, jTxtRg, jTxtCpf, jTxtTelefone, jTxtTelefone2, jTxtEmail, jTxtCidade, jTxtBairro, jTxtRua, jTxtNumero, jTxtCep,  jTxtSite,  jCboEstado);
        jCboEstado.removeAllItems();
        jCboEstado.addItem("");
        jCboEstado.addItem("Acre");
        jCboEstado.addItem("Alagoas");
        jCboEstado.addItem("Amapá");
        jCboEstado.addItem("Amazonas");
        jCboEstado.addItem("Bahia");
        jCboEstado.addItem("Ceará");
        jCboEstado.addItem("Distrito Federal");
        jCboEstado.addItem("Espírito Santo");
        jCboEstado.addItem("Goiás");
        jCboEstado.addItem("Maranhão");
        jCboEstado.addItem("Mato Grosso");
        jCboEstado.addItem("Mato Grosso do Sul");
        jCboEstado.addItem("Minas Gerais");
        jCboEstado.addItem("Pará");
        jCboEstado.addItem("Paraíba");
        jCboEstado.addItem("Paraná");
        jCboEstado.addItem("Pernambuco");
        jCboEstado.addItem("Piauí");
        jCboEstado.addItem("Rio de Janeiro");
        jCboEstado.addItem("Rio Grande do Norte");
        jCboEstado.addItem("Rio Grande do Sul");
        jCboEstado.addItem("Rondônia");
        jCboEstado.addItem("Roraima");
        jCboEstado.addItem("Santa Catarina");
        jCboEstado.addItem("São Paulo");
        jCboEstado.addItem("Sergipe");
        jCboEstado.addItem("Tocantins");
        
        setTitle("Cadastro de Fornecedores");
        //centraliza o frame
        setLocationRelativeTo(null);
        //muda a opção de fechar o formulário com a 
        //aplicação
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //jTxtCodigo.setEnabled(false);
        //jTxtNome.setEnabled(false);
        //jTxtRg.setEnabled(false);
//        jTxtCpf.setEnabled(false);
//       
//        jTxtTelefone.setEnabled(false);
//        jTxtTelefone2.setEnabled(false);
//        jTxtEmail.setEnabled(false);
//       
//        jTxtCidade.setEnabled(false);
//        jTxtBairro.setEnabled(false);
//        jTxtRua.setEnabled(false);
//        jTxtNumero.setEnabled(false);
//        jTxtCep.setEnabled(false);
//        jTxtSite.setEnabled(false);
//        jCboEstado.setEnabled(false);
//    
        
    }
//public void habilitar(boolean valor) {
//        jTxtCodigo.setEnabled(valor);  
//        jTxtNome.setEnabled(valor);
//        jTxtRg.setEnabled(valor);
//        jTxtCpf.setEnabled(valor);
//       
//        jTxtTelefone.setEnabled(valor);
//        jTxtTelefone2.setEnabled(valor);
//        jTxtEmail.setEnabled(valor);
//        
//        jTxtCidade.setEnabled(valor);
//        jTxtBairro.setEnabled(valor);
//        jTxtRua.setEnabled(valor);
//        jTxtNumero.setEnabled(valor);
//        jTxtCep.setEnabled(valor);
//        jTxtSite.setEnabled(valor);
//        
//        jBtnIncluir.setEnabled(!valor);
//        jBtnAlterar.setEnabled(!valor);
//        jBtnExcluir.setEnabled(!valor);
//        jBtnConfirmar.setEnabled(valor);
//        jBtnCancelar.setEnabled(valor);
//        
//        jCboEstado.setEnabled(valor);
//          }
//
//     public void limpar() {
//         jTxtCodigo.setText("");
//        jTxtNome.setText("");
//        jTxtRg.setText("");
//        jTxtCpf.setText("");
//        jTxtTelefone.setText("");
//        jTxtTelefone2.setText("");
//        jTxtEmail.setText("");
//       
//        jTxtCidade.setText("");
//        jTxtBairro.setText("");
//        jTxtRua.setText("");
//        jTxtNumero.setText("");
//        jTxtCep.setText("");
//        jTxtSite.setText("");
//        jCboEstado.setSelectedItem("");
//      
//    }
     public void fornecedorTela(Fornecedor fornecedor) {
        
        jTxtCodigo.setText(String.valueOf(fornecedor.getCodigo()));
        jTxtNome.setText(fornecedor.getNome());
       jTxtRg.setText(String.valueOf(fornecedor.getRg()));
       jTxtCpf.setText(String.valueOf(fornecedor.getCpf()));
      jTxtBairro.setText(fornecedor.getBairro());
      jTxtRua.setText(fornecedor.getRua());
       jTxtNumero.setText(String.valueOf(fornecedor.getNumero()));
       jTxtSite.setText(fornecedor.getSite());
       jTxtCep.setText(String.valueOf(fornecedor.getCep()));
       jTxtCidade.setText(fornecedor.getCidade());
       jTxtTelefone.setText(String.valueOf(fornecedor.getTelefone()));
        jTxtTelefone2.setText(String.valueOf(fornecedor.getTelefone2()));
        jTxtEmail.setText(fornecedor.getEmail());
        jCboEstado.setSelectedItem(fornecedor.getEstado());
      
        
    }

    public Fornecedor telaFornecedor() throws CampoBrancoException {
        Fornecedor fornecedor = new Fornecedor();
        if (jTxtCodigo.getText().equals("")) {
            throw new CampoBrancoException("Código está em branco.");
        } else {
            fornecedor.setCodigo(Integer.parseInt(jTxtCodigo.getText()));
        }
        
        fornecedor.setNome(jTxtNome.getText());
        fornecedor.setRg(Integer.parseInt(jTxtRg.getText()));
        fornecedor.setCpf(Integer.parseInt(jTxtCpf.getText()));
        fornecedor.setBairro(jTxtBairro.getText());
        fornecedor.setRua(jTxtRua.getText());
        fornecedor.setNumero(Integer.parseInt(jTxtNumero.getText()));
        fornecedor.setSite(jTxtSite.getText());
        fornecedor.setCep(Integer.parseInt(jTxtCep.getText()));
        fornecedor.setCidade(jTxtCidade.getText());
        fornecedor.setTelefone(Integer.parseInt(jTxtTelefone.getText()));
        fornecedor.setTelefone2(Integer.parseInt(jTxtTelefone2.getText()));
        fornecedor.setEmail(jTxtEmail.getText());
        fornecedor.setEstado((String)jCboEstado.getSelectedItem());
     
        return fornecedor;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtNumero = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTxtCep = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtCidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTxtTelefone2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBtnPesqCod = new javax.swing.JButton();
        jTxtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtRg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtCpf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTxtBairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTxtRua = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtSite = new javax.swing.JTextField();
        jBtnIncluir = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jCboEstado = new javax.swing.JComboBox<>();
        jBtnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTxtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 404, 83, -1));

        jLabel14.setText("Cep");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 81, -1, -1));
        getContentPane().add(jTxtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 105, 106, -1));

        jLabel10.setText("Cidade");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 136, -1, -1));
        getContentPane().add(jTxtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 156, 222, -1));

        jLabel9.setText("Estado");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 188, -1, -1));

        jLabel5.setText("Telefone");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 242, -1, -1));
        getContentPane().add(jTxtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 265, 120, -1));

        jLabel7.setText("Telefone 2");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 299, -1, -1));
        getContentPane().add(jTxtTelefone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 339, 121, -1));

        jLabel6.setText("Codigo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 19, -1, -1));
        getContentPane().add(jTxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 39, 104, -1));

        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 77, -1, 22));

        jBtnPesqCod.setText("...");
        jBtnPesqCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesqCodActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnPesqCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 63, 40));

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 105, 230, -1));

        jLabel2.setText("Rg");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 156, -1, -1));

        jTxtRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtRgActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 182, 121, -1));

        jLabel3.setText("Cpf/ Cnpj");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 211, -1, -1));

        jTxtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCpfActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 239, 121, -1));

        jLabel11.setText("Bairro");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 268, -1, -1));
        getContentPane().add(jTxtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 296, 141, -1));

        jLabel12.setText("Rua");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 322, -1, -1));
        getContentPane().add(jTxtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 339, 184, -1));

        jLabel13.setText("Numero");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 377, -1, -1));

        jLabel8.setText("Email");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 377, -1, -1));
        getContentPane().add(jTxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 404, 222, -1));

        jLabel4.setText("Site");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 19, -1, -1));
        getContentPane().add(jTxtSite, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 39, 230, -1));

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeincluir.gif"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnIncluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 442, 97, -1));

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeexcluir.gif"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 442, -1, -1));

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconalterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 442, -1, -1));

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconecancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 442, -1, -1));

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeconfirmar.jpg"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 442, -1, -1));

        jCboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jCboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 208, 164, -1));

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconepesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNumeroActionPerformed

    private void jBtnPesqCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesqCodActionPerformed
        // TODO add your handling code here:
        String codigo = JOptionPane.showInputDialog(null, "Entre com o código");
        fornecedor = (Fornecedor) fornecedorDAO.list(Integer.parseInt(codigo));
        if (fornecedor == null) {
            JOptionPane.showMessageDialog(null, "código não encontrado.");
        } else {
            fornecedorTela(fornecedor);
        }
    }//GEN-LAST:event_jBtnPesqCodActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jTxtRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtRgActionPerformed

    private void jTxtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCpfActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        inclusao = true;
        Util.habilitar(true, jBtnConfirmar, jBtnCancelar, jTxtCodigo, jTxtNome, jTxtRg, jTxtCpf, jTxtTelefone, jTxtTelefone2, jTxtEmail, jTxtCidade, jTxtBairro, jTxtRua, jTxtNumero, jTxtCep,  jTxtSite,  jCboEstado);
        Util.habilitar(false,jBtnIncluir, jBtnAlterar, jBtnExcluir);
        Util.limpar(jTxtCodigo, jTxtNome, jTxtRg, jTxtCpf, jTxtTelefone, jTxtTelefone2, jTxtEmail, jTxtCidade, jTxtBairro, jTxtRua, jTxtNumero, jTxtCep,  jTxtSite,  jCboEstado);
//Transferir o foco para o objeto na tela
        jTxtCodigo.grabFocus();

    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
        if (fornecedor != null) {
            int resp = JOptionPane.showConfirmDialog(null, "Confirma Exclusão?", "Excluir", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION){
                fornecedorDAO.delete(fornecedor);
                Util.limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Exclusão cancelada.");
            }

        } else {
            JOptionPane.showMessageDialog(null," Nenhum fornecedor está disponivel para alteração");
        }

    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:

        if (fornecedor != null) {
            inclusao = false;
            Util.habilitar(true, jBtnConfirmar, jBtnCancelar, jTxtCodigo, jTxtNome, jTxtRg, jTxtCpf, jTxtTelefone, jTxtTelefone2, jTxtEmail, jTxtCidade, jTxtBairro, jTxtRua, jTxtNumero, jTxtCep,  jTxtSite,  jCboEstado);
        Util.habilitar(false,jBtnIncluir, jBtnAlterar, jBtnExcluir);
            jTxtCodigo.grabFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum fornecedor está disponível para alteração");
        }
        //        habilitar(true);
        //        jTxtCodigo.grabFocus();
        //
        //        jTxtCodigo.setText(String.valueOf(fornecedor.getCodigo()));
        //        jTxtNome.setText(fornecedor.getNome());
        //        jTxtRg.setText(String.valueOf(fornecedor.getRg()));
        //        jTxtCpf.setText(String.valueOf(fornecedor.getCpf()));
        //        jTxtTelefone.setText(String.valueOf(fornecedor.getTelefone()));
        //        jTxtTelefone2.setText(String.valueOf(fornecedor.getTelefone2()));
        //        jTxtEmail.setText(fornecedor.getEmail());
        //
        //        jTxtCidade.setText(fornecedor.getCidade());
        //        jTxtBairro.setText(fornecedor.getBairro());
        //        jTxtRua.setText(fornecedor.getRua());
        //        jTxtNumero.setText(String.valueOf(fornecedor.getNumero()));
        //        jTxtCep.setText(String.valueOf(fornecedor.getCep()));
        //        jTxtSite.setText(fornecedor.getSite());

    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(false, jBtnConfirmar, jBtnCancelar, jTxtCodigo, jTxtNome, jTxtRg, jTxtCpf, jTxtTelefone, jTxtTelefone2, jTxtEmail, jTxtCidade, jTxtBairro, jTxtRua, jTxtNumero, jTxtCep,  jTxtSite,  jCboEstado);
        Util.habilitar(true,jBtnIncluir, jBtnAlterar, jBtnExcluir);
        Util.limpar(jTxtCodigo, jTxtNome, jTxtRg, jTxtCpf, jTxtTelefone, jTxtTelefone2, jTxtEmail, jTxtCidade, jTxtBairro, jTxtRua, jTxtNumero, jTxtCep,  jTxtSite,  jCboEstado);
        fornecedor = null;
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        try {
        fornecedor = telaFornecedor();
        } catch (CampoBrancoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return;
        }
        System.out.println("Inclusão com sucesso.");
        if (inclusao) {
            fornecedorDAO.insert(fornecedor);
            //inclusao = false;
        } else {
            fornecedorDAO.update(fornecedor);
        }

        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.habilitar(false, jTxtCodigo, jTxtNome, jTxtRg, jTxtCpf, jTxtTelefone, jTxtTelefone2, jTxtEmail, jTxtCidade, jTxtBairro, jTxtRua, jTxtNumero, jTxtCep,  jTxtSite,  jCboEstado);
        Util.limpar(jTxtCodigo, jTxtNome, jTxtRg, jTxtCpf, jTxtTelefone, jTxtTelefone2, jTxtEmail, jTxtCidade, jTxtBairro, jTxtRua, jTxtNumero, jTxtCep,  jTxtSite,  jCboEstado);
        fornecedor = null;
        //Pegar valores da tela
        //String nome = jTxtNome.getText();

        //int codigo = Integer.parseInt(jTxtCodigo.getText());
        //int rg = Integer.parseInt(jTxtRg.getText());
        //int cpf = Integer.parseInt(jTxtCpf.getText());
        //int telefone = Integer.parseInt(jTxtTelefone.getText());
        //int telefone2 = Integer.parseInt(jTxtTelefone.getText());
        //String email = jTxtEmail.getText();

        //String cidade = jTxtCidade.getText();
        //String bairro = jTxtBairro.getText();
        // String rua = jTxtRua.getText();
        // int numero = Integer.parseInt(jTxtNumero.getText());
        //int cep = Integer.parseInt(jTxtCep.getText());
        //String site = jTxtSite.getText();

        //Gravar valores da tela no objeto usuario
        // fornecedor = new Fornecedor();
        // fornecedor.setCodigo(codigo);
        // fornecedor.setNome(nome);
        // fornecedor.setRg(rg);
        // fornecedor.setCpf(cpf);
        //fornecedor.setTelefone(telefone);
        //fornecedor.setTelefone(telefone2);
        //fornecedor.setEmail(email);

        //fornecedor.setCidade(cidade);
        //fornecedor.setBairro(bairro);
        // fornecedor.setRua(rua);
        //fornecedor.setNumero(numero);
        //fornecedor.setCep(cep);
        //fornecedor.setSite(site);

    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jCboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboEstadoActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        fornecedor = new Fornecedor();
        JDlgPesquisarFornecedor jDlgPesquisarFornecedor = new JDlgPesquisarFornecedor(null, true);
        jDlgPesquisarFornecedor.setTelaPai(this);
        jDlgPesquisarFornecedor.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgFornecedor dialog = new JDlgFornecedor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesqCod;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<String> jCboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtBairro;
    private javax.swing.JTextField jTxtCep;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtCpf;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtNumero;
    private javax.swing.JTextField jTxtRg;
    private javax.swing.JTextField jTxtRua;
    private javax.swing.JTextField jTxtSite;
    private javax.swing.JTextField jTxtTelefone;
    private javax.swing.JTextField jTxtTelefone2;
    // End of variables declaration//GEN-END:variables

    void fornecedor(Fornecedor fornecedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
