/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import persistencia.Cliente;
import persistencia.ClienteDAO;
import funcoes.Util;
import javax.swing.JOptionPane;
import erros.CampoBrancoException;



/**
 *
 * @author Admin
 */
public class JDlgCliente extends javax.swing.JDialog {
    Cliente cliente;
    boolean inclusao;
    ClienteDAO clienteDAO;


    /**
     * Creates new form JDlgCliente
     */
    public JDlgCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        clienteDAO = new ClienteDAO();
        
        setTitle("Cadastro de Clientes");
        //centraliza o frame
        setLocationRelativeTo(null);
        //muda a opção de fechar o formulário com a 
        //aplicação
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir);
        Util.habilitar(false,jCbosexo , jCboEstado, jCboEstadocivil, jBtnCancelar, jBtnConfirmar, jTxtCodigo, jTxtNome, jTxtRg, jTxtCpf, jTxtApelido, jTxtTelefone, jTxtTelefone2, jTxtEmail, jTxtBairro, jTxtRua, jTxtNumero, jTxtCep, jTxtComplemento, jTxtProfissao, jTxtNomemae, jTxtNomepai, jTxtAlergias, jTxtCidade );
        Util.limpar(jCbosexo , jCboEstado, jCboEstadocivil,jTxtCodigo, jTxtNome,jTxtRg, jTxtCpf, jTxtApelido, jTxtTelefone, jTxtTelefone2, jTxtEmail, jTxtBairro, jTxtRua, jTxtNumero, jTxtCep, jTxtComplemento, jTxtProfissao, jTxtNomemae, jTxtNomepai, jTxtAlergias, jTxtCidade);
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
        
        jCboEstadocivil.removeAllItems();
        jCboEstadocivil.addItem("");
        jCboEstadocivil.addItem("Solteiro (a)");
        jCboEstadocivil.addItem("Casado (a)");
        jCboEstadocivil.addItem("Divorciado (a)");
        
        
        jCbosexo.removeAllItems();
        jCbosexo.addItem("");
        jCbosexo.addItem("Feminino");
        jCbosexo.addItem("Masculino");
        
//        jTxtCodigo.setEnabled(false);
//        jTxtNome.setEnabled(false);
//        jTxtRg.setEnabled(false);
//        jTxtCpf.setEnabled(false);
//        jTxtApelido.setEnabled(false);
//        jTxtTelefone.setEnabled(false);
//        jTxtTelefone2.setEnabled(false);
//        jTxtEmail.setEnabled(false);
//        jTxtBairro.setEnabled(false);
//        jTxtRua.setEnabled(false);
//        jTxtNumero.setEnabled(false);
//        jTxtCep.setEnabled(false);
//        jTxtComplemento.setEnabled(false);
//        jTxtProfissao.setEnabled(false);
//        jTxtNomemae.setEnabled(false);
//        jTxtNomepai.setEnabled(false);
//        jTxtAlergias.setEnabled(false);
//        jTxtCidade.setEnabled(false);
//        jRbtFeminino.setEnabled(false);
//        jRbtMasculino.setEnabled(false);
//        jCboEstado.setEnabled(false);
//      jCboEstadocivil.setEnabled(false);
    }

//    //public void habilitar(boolean valor) {
//        jTxtCodigo.setEnabled(valor);
//        jTxtNome.setEnabled(valor);
//        jTxtRg.setEnabled(valor);
//        jTxtCpf.setEnabled(valor);
//        jTxtApelido.setEnabled(valor);
//        jTxtTelefone.setEnabled(valor);
//        jTxtTelefone2.setEnabled(valor);
//        jTxtEmail.setEnabled(valor);
//        jTxtBairro.setEnabled(valor);
//        jTxtRua.setEnabled(valor);
//        jTxtNumero.setEnabled(valor);
//        jTxtCep.setEnabled(valor);
//        jTxtComplemento.setEnabled(valor);
//        jTxtProfissao.setEnabled(valor);
//        jTxtNomemae.setEnabled(valor);
//        jTxtNomepai.setEnabled(valor);
//        jTxtAlergias.setEnabled(valor);
//        
//        jBtnIncluir.setEnabled(!valor);
//        jBtnAlterar.setEnabled(!valor);
//        jBtnExcluir.setEnabled(!valor);
//        jBtnConfirmar.setEnabled(valor);
//        jBtnCancelar.setEnabled(valor);
//        
//        
//        jTxtCidade.setEnabled(valor);
//         jRbtFeminino.setEnabled(valor);
//        jRbtMasculino.setEnabled(valor);
//        jCboEstado.setEnabled(valor);
//        jCboEstadocivil.setEnabled(valor);
//         
//    
//    }
//    public void limpar() {
//        jTxtCodigo.setText("");
//        jTxtNome.setText("");
//        jTxtRg.setText("");
//        jTxtCpf.setText("");
//        jTxtApelido.setText("");
//        jTxtTelefone.setText("");
//        jTxtTelefone2.setText("");
//        jTxtEmail.setText("");
//        jTxtBairro.setText("");
//        jTxtRua.setText("");
//        jTxtNumero.setText("");
//        jTxtCep.setText("");
//        jTxtComplemento.setText("");
//        jTxtProfissao.setText("");
//        jTxtNomemae.setText("");
//        jTxtNomepai.setText("");
//        jTxtAlergias.setText("");
//        jTxtCidade.setText("");
//        jCboEstado.setSelectedItem("");
//        jCboEstadocivil.setSelectedItem("");
//         jRbtMasculino.setSelected(false);
//         jRbtFeminino.setSelected(false);
//
//       
//        
//
//    }
    public void clienteTela(Cliente cliente) {
       
        
        jTxtCodigo.setText(String.valueOf(cliente.getCodigo()));
        jTxtNome.setText(cliente.getNome());
       jTxtRg.setText(String.valueOf(cliente.getRg()));
       jTxtCpf.setText(String.valueOf(cliente.getCpf()));
       jTxtApelido.setText(cliente.getApelido());
       jTxtTelefone.setText(String.valueOf(cliente.getTelefone()));
        jTxtTelefone2.setText(String.valueOf(cliente.getTelefone2()));
        jTxtEmail.setText(cliente.getEmail());
       jTxtBairro.setText(cliente.getBairro());
       jTxtRua.setText(cliente.getRua());
       jTxtNumero.setText(String.valueOf(cliente.getNumero()));
       jTxtCep.setText(String.valueOf(cliente.getCep()));
        jTxtComplemento.setText(cliente.getComplemento());
        jTxtProfissao.setText(cliente.getProfissao());
       jTxtNomemae.setText(cliente.getNomemae());
        jTxtNomepai.setText(cliente.getNomepai());
        jTxtAlergias.setText(cliente.getAlergias());
        jTxtCidade.setText(cliente.getCidade());
         
        jCboEstado.setSelectedItem(cliente.getEstado());
        jCboEstadocivil.setSelectedItem(cliente.getEstadocivil());
        jCbosexo.setSelectedItem(cliente.getSexo());
        
    }

    public Cliente telaCliente() throws CampoBrancoException {
        Cliente cliente = new Cliente();
        
        if (jTxtCodigo.getText().equals("")) {
            throw new CampoBrancoException("Código está em branco.");
        } else {
            cliente.setCodigo(Integer.parseInt(jTxtCodigo.getText()));
        }
        
        cliente.setNome(jTxtNome.getText());
        cliente.setRg(Integer.parseInt(jTxtRg.getText()));
        cliente.setCpf(Integer.parseInt(jTxtCpf.getText()));
        cliente.setApelido(jTxtApelido.getText());
        cliente.setTelefone(Integer.parseInt(jTxtTelefone.getText()));
        cliente.setTelefone2(Integer.parseInt(jTxtTelefone2.getText()));
        cliente.setEmail(jTxtEmail.getText());
        cliente.setBairro(jTxtBairro.getText());
        cliente.setRua(jTxtRua.getText());
        cliente.setNumero(Integer.parseInt(jTxtNumero.getText()));
        cliente.setCep(Integer.parseInt(jTxtCep.getText()));
        cliente.setComplemento(jTxtComplemento.getText());
        cliente.setProfissao(jTxtProfissao.getText());
        cliente.setNomemae(jTxtNomemae.getText());
        cliente.setNomepai(jTxtNomepai.getText());
        cliente.setAlergias(jTxtAlergias.getText());
        cliente.setCidade(jTxtCidade.getText());
        cliente.setEstado((String)jCboEstado.getSelectedItem());
        cliente.setEstadocivil((String)jCboEstadocivil.getSelectedItem());
        cliente.setSexo((String)jCbosexo.getSelectedItem());
        
        return cliente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTxtNomemae = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTxtNomepai = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTxtAlergias = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtRg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtApelido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTxtTelefone2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTxtRua = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jCboEstado = new javax.swing.JComboBox<>();
        jTxtCidade = new javax.swing.JTextField();
        jCboEstadocivil = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jTxtNumero = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTxtCep = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTxtComplemento = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTxtProfissao = new javax.swing.JTextField();
        jBtnIncluir = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTxtBairro = new javax.swing.JTextField();
        jBtnPesqCod = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jCbosexo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setText("Estado Civil");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 295, -1, -1));

        jLabel19.setText("Nome da Mãe");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 344, -1, -1));

        jTxtNomemae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomemaeActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtNomemae, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 364, 306, -1));

        jLabel20.setText("Nome do Pai");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));
        getContentPane().add(jTxtNomepai, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 415, 306, -1));

        jLabel21.setText("Alergias");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 446, -1, -1));
        getContentPane().add(jTxtAlergias, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 466, 306, -1));

        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, -1, 22));

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, 240, -1));

        jLabel2.setText("Rg");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 111, -1, -1));

        jTxtRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtRgActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 131, 121, -1));

        jLabel3.setText("Cpf/ Cnpj");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 157, -1, -1));

        jTxtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCpfActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 177, 121, -1));

        jLabel4.setText("Apelido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 203, -1, -1));
        getContentPane().add(jTxtApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 223, 164, -1));

        jLabel5.setText("Telefone");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 249, -1, -1));
        getContentPane().add(jTxtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 269, 188, -1));

        jLabel7.setText("Telefone 2");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, -1, -1));
        getContentPane().add(jTxtTelefone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 313, 204, -1));

        jLabel8.setText("Email");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 502, -1, -1));

        jTxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 527, 182, -1));

        jLabel9.setText("Estado");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 342, -1, -1));

        jLabel10.setText("Cidade");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 393, -1, -1));

        jLabel12.setText("Rua");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 11, -1, -1));
        getContentPane().add(jTxtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 31, 306, -1));

        jLabel13.setText("Numero");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 61, -1, -1));

        jCboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jCboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 362, 164, -1));
        getContentPane().add(jTxtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 413, 218, -1));

        jCboEstadocivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboEstadocivilActionPerformed(evt);
            }
        });
        getContentPane().add(jCboEstadocivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 313, 112, -1));

        jLabel6.setText("Codigo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));
        getContentPane().add(jTxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 104, -1));
        getContentPane().add(jTxtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 85, 83, -1));

        jLabel14.setText("Cep");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 111, -1, -1));
        getContentPane().add(jTxtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 131, 106, -1));

        jLabel15.setText("Complemento");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 157, -1, -1));

        jTxtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtComplementoActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 177, 306, -1));

        jLabel16.setText("Sexo");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 203, -1, -1));

        jLabel17.setText("Profissão");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 249, -1, -1));
        getContentPane().add(jTxtProfissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 269, 152, -1));

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeincluir.gif"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnIncluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeexcluir.gif"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, -1, -1));

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconalterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, -1, -1));

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconecancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, -1, -1));

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeconfirmar.jpg"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, -1, -1));

        jLabel11.setText("Bairro");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 451, -1, -1));
        getContentPane().add(jTxtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 471, 206, -1));

        jBtnPesqCod.setText("...");
        jBtnPesqCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesqCodActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnPesqCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 60, 40));

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconepesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 120, 40));

        getContentPane().add(jCbosexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNomemaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomemaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomemaeActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jTxtRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtRgActionPerformed

    private void jTxtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCpfActionPerformed

    private void jCboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboEstadoActionPerformed

    private void jCboEstadocivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboEstadocivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboEstadocivilActionPerformed

    private void jTxtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtComplementoActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:

        inclusao = true;
        Util.habilitar(true, jBtnConfirmar, jBtnCancelar, jTxtCodigo,jTxtNome, jTxtRg, jTxtCpf, jTxtApelido,  jTxtTelefone, jTxtTelefone2, jTxtEmail, jTxtBairro, jTxtRua, jTxtNumero, jTxtCep, jTxtComplemento, jTxtProfissao, jTxtNomemae,jTxtNomepai, jTxtAlergias, jTxtCidade, jCbosexo,jCboEstado,jCboEstadocivil);
        Util.habilitar(false,jBtnIncluir, jBtnAlterar, jBtnExcluir);
        Util.limpar(jCboEstado, jCboEstadocivil, jCbosexo, jTxtCodigo, jTxtNome, jTxtRg, jTxtCpf, jTxtApelido, jTxtTelefone, jTxtTelefone2, jTxtEmail, jTxtBairro, jTxtRua, jTxtNumero, jTxtCep, jTxtComplemento, jTxtProfissao, jTxtNomemae, jTxtNomepai, jTxtAlergias, jTxtCidade);
      
        //Transferir o foco para o objeto na tela
        jTxtCodigo.grabFocus();

    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
        if (cliente != null) {
            int resp = JOptionPane.showConfirmDialog(null, "Confirmar a exclusão?", "Excluir", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION){
                clienteDAO.delete(cliente);
                Util.limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Exclusão cancelada.");
            }

        } else {
            JOptionPane.showMessageDialog(null," Nenhum cliente está disponivel para alteração");
        }

    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        if (cliente != null) {
            inclusao = false;
            Util.habilitar(true, jBtnConfirmar, jBtnCancelar, jTxtCodigo, jTxtNome, jTxtRg, jTxtCpf, jTxtApelido,  jTxtTelefone, jTxtTelefone2, jTxtEmail, jTxtBairro, jTxtRua, jTxtNumero, jTxtCep, jTxtComplemento, jTxtProfissao, jTxtNomemae,jTxtNomepai, jTxtAlergias, jTxtCidade, jCbosexo,jCboEstado,jCboEstadocivil);
        Util.habilitar(false,jBtnIncluir, jBtnAlterar, jBtnExcluir);
            jTxtCodigo.grabFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum cliente está disponível para alteração");
        }

        //        habilitar(true);
        //        jTxtCodigo.grabFocus();
        //
        //        jTxtCodigo.setText(String.valueOf(cliente.getCodigo()));
        //        jTxtNome.setText(cliente.getNome());
        //        jTxtRg.setText(String.valueOf(cliente.getRg()));
        //        jTxtCpf.setText(String.valueOf(cliente.getCpf()));
        //        jTxtApelido.setText(cliente.getApelido());
        //        jTxtTelefone.setText(String.valueOf(cliente.getTelefone()));
        //        jTxtTelefone2.setText(String.valueOf(cliente.getTelefone2()));
        //        jTxtEmail.setText(cliente.getEmail());
        //        jTxtBairro.setText(cliente.getBairro());
        //        jTxtRua.setText(cliente.getRua());
        //        jTxtNumero.setText(String.valueOf(cliente.getNumero()));
        //        jTxtCep.setText(String.valueOf(cliente.getCep()));
        //        jTxtComplemento.setText(cliente.getComplemento());
        //        jTxtProfissao.setText(cliente.getProfissao());
        //        jTxtNomemae.setText(cliente.getNomemae());
        //        jTxtNomepai.setText(cliente.getNomepai());
        //        jTxtAlergias.setText(cliente.getAlergias());
        //        jTxtCidade.setText(cliente.getCidade());

    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
       Util.habilitar(false, jBtnConfirmar, jBtnCancelar, jTxtCodigo, jTxtNome, jTxtRg, jTxtCpf, jTxtApelido,  jTxtTelefone, jTxtTelefone2, jTxtEmail, jTxtBairro, jTxtRua, jTxtNumero, jTxtCep, jTxtComplemento, jTxtProfissao, jTxtNomemae,jTxtNomepai, jTxtAlergias, jTxtCidade, jCbosexo,jCboEstado,jCboEstadocivil);
        Util.habilitar(true,jBtnIncluir, jBtnAlterar, jBtnExcluir);
        Util.limpar(jCboEstado, jCboEstadocivil, jCbosexo, jTxtCodigo, jTxtNome, jTxtRg, jTxtCpf, jTxtApelido, jTxtTelefone, jTxtTelefone2, jTxtEmail, jTxtBairro, jTxtRua, jTxtNumero, jTxtCep, jTxtComplemento, jTxtProfissao, jTxtNomemae, jTxtNomepai, jTxtAlergias, jTxtCidade);
      
        cliente = null;
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        
         try {
            cliente = telaCliente();
        } catch (CampoBrancoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return;
        }
        System.out.println("Inclusão com sucesso.");
        if (inclusao) {
            clienteDAO.insert(cliente);
            //inclusao = false;
        } else {
            clienteDAO.update(cliente);
        }

       Util.habilitar(false, jCboEstado, jCboEstadocivil, jCbosexo, jTxtCodigo, jTxtNome, jTxtRg, jTxtCpf, jTxtApelido, jTxtTelefone, jTxtTelefone2, jTxtEmail, jTxtBairro, jTxtRua, jTxtNumero, jTxtCep, jTxtComplemento, jTxtProfissao, jTxtNomemae, jTxtNomepai, jTxtAlergias, jTxtCidade);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
      
        Util.limpar(jCboEstado, jCboEstadocivil, jCbosexo, jTxtCodigo, jTxtNome, jTxtRg, jTxtCpf, jTxtApelido, jTxtTelefone, jTxtTelefone2, jTxtEmail, jTxtBairro, jTxtRua, jTxtNumero, jTxtCep, jTxtComplemento, jTxtProfissao, jTxtNomemae, jTxtNomepai, jTxtAlergias, jTxtCidade);
        cliente = null;
       

        //String estado = (String) jCboEstado.getSelectedItem();
        //String estadoCivil = (String) jCboEstadocivil.getSelectedItem();

        //Pegar valores da tela
        //String nome = jTxtNome.getText();
        //int codigo = Integer.parseInt(jTxtCodigo.getText());
        //int rg = Integer.parseInt(jTxtRg.getText());
        //int cpf = Integer.parseInt(jTxtCpf.getText());
        //String apelido = jTxtApelido.getText();
        //int telefone = Integer.parseInt(jTxtTelefone.getText());
        //int telefone2 = Integer.parseInt(jTxtTelefone.getText());
        //String email = jTxtEmail.getText();
        //String bairro = jTxtBairro.getText();
        //String rua = jTxtRua.getText();
        //int numero = Integer.parseInt(jTxtNumero.getText());
        //int cep = Integer.parseInt(jTxtCep.getText());
        //String complemento = jTxtComplemento.getText();
        //String profissao = jTxtProfissao.getText();
        //String nomemae = jTxtNomemae.getText();
        //String nomepai = jTxtNomepai.getText();
        //String alergias = jTxtAlergias.getText();
        //String cidade = jTxtCidade.getText();

        //Gravar valores da tela no objeto usuario
        // cliente = new Cliente();
        //cliente.setCodigo(codigo);
        //cliente.setNome(nome);
        // cliente.setRg(rg);
        //cliente.setCpf(cpf);
        //cliente.setApelido(apelido);
        //cliente.setTelefone(telefone);
        //cliente.setTelefone(telefone2);
        //cliente.setEmail(email);
        //cliente.setBairro(bairro);
        //cliente.setRua(rua);
        //cliente.setNumero(numero);
        //cliente.setCep(cep);
        //cliente.setComplemento(complemento);
        //cliente.setProfissao(profissao);
        //cliente.setNomemae(nomemae);
        //cliente.setNomepai(nomepai);
        //cliente.setAlergias(alergias);
        //cliente.setCidade(cidade);

    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnPesqCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesqCodActionPerformed
        // TODO add your handling code here:
       String codigo = JOptionPane.showInputDialog(null, "Entre com o código");
        cliente = (Cliente) clienteDAO.list(Integer.parseInt(codigo));
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "código não encontrado.");
        } else {
            clienteTela(cliente);
        }
    }//GEN-LAST:event_jBtnPesqCodActionPerformed

    private void jTxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEmailActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
     cliente = new Cliente();
        JDlgPesquisarCliente jDlgPesquisarCliente = new JDlgPesquisarCliente(null, true);
        jDlgPesquisarCliente.setTelaPai(this);
        jDlgPesquisarCliente.setVisible(true);
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
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgCliente dialog = new JDlgCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jCboEstadocivil;
    private javax.swing.JComboBox<String> jCbosexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtAlergias;
    private javax.swing.JTextField jTxtApelido;
    private javax.swing.JTextField jTxtBairro;
    private javax.swing.JTextField jTxtCep;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtComplemento;
    private javax.swing.JTextField jTxtCpf;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtNomemae;
    private javax.swing.JTextField jTxtNomepai;
    private javax.swing.JTextField jTxtNumero;
    private javax.swing.JTextField jTxtProfissao;
    private javax.swing.JTextField jTxtRg;
    private javax.swing.JTextField jTxtRua;
    private javax.swing.JTextField jTxtTelefone;
    private javax.swing.JTextField jTxtTelefone2;
    // End of variables declaration//GEN-END:variables

    void cliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
