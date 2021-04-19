/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ClientesDao;
import dao.FornecedoresDao;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Clientes;
import model.Fornecedores;
import model.Utilitarios;

/**
 *
 * @author ANDRADE
 */
public class Frmfornecedor extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form Frmcliente
	 */
	public Frmfornecedor() {
		initComponents();
	}

	// Metodo Listar na tabela
	public void listaFornecedor() {

		FornecedoresDao dao = new FornecedoresDao();
		List<Fornecedores> lista = dao.listaFornecedor();
		DefaultTableModel dados = (DefaultTableModel) tabelaFornecedor.getModel();
		dados.setNumRows(0);

		for (Fornecedores c : lista) {
			dados.addRow(new Object[] { c.getId(), c.getNome(), c.getCnpj(), c.getEmail(), c.getTelefone(),
					c.getCelular(), c.getCep(), c.getEndereco(), c.getNumero(), c.getComplemento(), c.getBairro(),
					c.getCidade(), c.getUf() });

		}

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		painel_cadastro_fornecedor = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		txtcodigo = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		txtnome = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		txtemail = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		txtcnpj = new javax.swing.JFormattedTextField();
		jLabel6 = new javax.swing.JLabel();
		txttelefone = new javax.swing.JFormattedTextField();
		txtcep = new javax.swing.JFormattedTextField();
		jLabel7 = new javax.swing.JLabel();
		txtendereco = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		txtnumero = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		txtbairro = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		txtcidade = new javax.swing.JTextField();
		jLabel12 = new javax.swing.JLabel();
		txtcomplemento = new javax.swing.JTextField();
		jLabel13 = new javax.swing.JLabel();
		cbuf = new javax.swing.JComboBox<>();
		jLabel14 = new javax.swing.JLabel();
		txtcelular = new javax.swing.JFormattedTextField();
		jPanel2 = new javax.swing.JPanel();
		jLabel20 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jLabel16 = new javax.swing.JLabel();
		txtpesquisa = new javax.swing.JTextField();
		btnpesquisar = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		tabelaFornecedor = new javax.swing.JTable();
		btexcluir = new javax.swing.JButton();
		bteditar = new javax.swing.JButton();
		btsalvar = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowActivated(java.awt.event.WindowEvent evt) {
				formWindowActivated(evt);
			}
		});

		jPanel1.setBackground(new java.awt.Color(0, 153, 51));

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel1.setText("Cadastro de Forncedor");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(43, 43, 43).addComponent(jLabel1)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(29, 29, 29).addComponent(jLabel1)
						.addContainerGap(31, Short.MAX_VALUE)));

		painel_cadastro_fornecedor.setBackground(new java.awt.Color(255, 255, 255));

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel2.setText("Código:");

		txtcodigo.setEditable(false);
		txtcodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		txtcodigo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtcodigoActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel3.setText("Nome:");

		txtnome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		txtnome.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtnomeActionPerformed(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel4.setText("Email:");

		txtemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		txtemail.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtemailActionPerformed(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel5.setText("Celular:");

		try {
			txtcnpj.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		txtcnpj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

		jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel6.setText("Telefone:");

		try {
			txttelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
					new javax.swing.text.MaskFormatter("(##) #### - ####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		txttelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

		try {
			txtcep.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##### - ###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		txtcep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		txtcep.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				txtcepKeyPressed(evt);
			}
		});

		jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel7.setText("CEP:");

		txtendereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		txtendereco.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtenderecoActionPerformed(evt);
			}
		});

		jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel8.setText("Endereço:");

		jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel9.setText("Nº:");

		txtnumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		txtnumero.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtnumeroActionPerformed(evt);
			}
		});

		jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel10.setText("Bairro:");

		txtbairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		txtbairro.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtbairroActionPerformed(evt);
			}
		});

		jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel11.setText("Cidade:");

		txtcidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		txtcidade.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtcidadeActionPerformed(evt);
			}
		});

		jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel12.setText("Complemento:");

		txtcomplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		txtcomplemento.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtcomplementoActionPerformed(evt);
			}
		});

		jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel13.setText("UF:");

		cbuf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		cbuf.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB",
						"PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

		jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel14.setText("CNPJ:");

		try {
			txtcelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
					new javax.swing.text.MaskFormatter("(##) # #### - ####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		txtcelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

		jPanel2.setBackground(new java.awt.Color(153, 255, 153));

		jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel20.setText(
				"Digite o CEP e aperte Enter para buscar o Enderço, caso não possua Internet informe todos os dados.");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel2Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel20).addGap(137, 137, 137)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE));

		javax.swing.GroupLayout painel_cadastro_fornecedorLayout = new javax.swing.GroupLayout(
				painel_cadastro_fornecedor);
		painel_cadastro_fornecedor.setLayout(painel_cadastro_fornecedorLayout);
		painel_cadastro_fornecedorLayout.setHorizontalGroup(painel_cadastro_fornecedorLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(painel_cadastro_fornecedorLayout.createSequentialGroup()
						.addGroup(painel_cadastro_fornecedorLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(painel_cadastro_fornecedorLayout.createSequentialGroup().addContainerGap()
										.addGroup(painel_cadastro_fornecedorLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel3).addComponent(jLabel4).addComponent(jLabel2))
										.addGroup(painel_cadastro_fornecedorLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(painel_cadastro_fornecedorLayout.createSequentialGroup()
														.addGap(4, 4, 4)
														.addGroup(painel_cadastro_fornecedorLayout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING, false)
																.addComponent(txtemail).addComponent(txtnome,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 240,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGap(18, 18, 18).addComponent(jLabel5)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(txtcelular,
																javax.swing.GroupLayout.PREFERRED_SIZE, 147,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(16, 16, 16)
														.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE,
																59, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(txttelefone,
																javax.swing.GroupLayout.PREFERRED_SIZE, 147,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(painel_cadastro_fornecedorLayout.createSequentialGroup()
														.addGap(7, 7, 7).addComponent(txtcodigo,
																javax.swing.GroupLayout.PREFERRED_SIZE, 80,
																javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGroup(painel_cadastro_fornecedorLayout.createSequentialGroup().addGap(18, 18, 18)
										.addGroup(painel_cadastro_fornecedorLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(painel_cadastro_fornecedorLayout.createSequentialGroup()
														.addGroup(painel_cadastro_fornecedorLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jLabel7).addComponent(jLabel10))
														.addGap(3, 3, 3))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
														painel_cadastro_fornecedorLayout.createSequentialGroup()
																.addComponent(jLabel14).addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
										.addGroup(painel_cadastro_fornecedorLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 147,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(painel_cadastro_fornecedorLayout.createSequentialGroup()
														.addGap(1, 1, 1)
														.addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE,
																147, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addGroup(painel_cadastro_fornecedorLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(painel_cadastro_fornecedorLayout
																		.createSequentialGroup().addComponent(jLabel8)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(txtendereco,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				387,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGroup(painel_cadastro_fornecedorLayout
																		.createSequentialGroup().addComponent(jLabel11)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(txtcidade,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				147,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(jLabel12)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(txtcomplemento,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				147,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGap(18, 18, 18)
														.addGroup(painel_cadastro_fornecedorLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																.addGroup(painel_cadastro_fornecedorLayout
																		.createSequentialGroup().addComponent(jLabel9)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(txtnumero,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				64,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGroup(painel_cadastro_fornecedorLayout
																		.createSequentialGroup().addComponent(jLabel13)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(cbuf,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				64,
																				javax.swing.GroupLayout.PREFERRED_SIZE))))
												.addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 147,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGap(0, 90, Short.MAX_VALUE))
				.addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		painel_cadastro_fornecedorLayout.setVerticalGroup(painel_cadastro_fornecedorLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(painel_cadastro_fornecedorLayout.createSequentialGroup().addContainerGap()
						.addGroup(painel_cadastro_fornecedorLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2)
								.addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(13, 13, 13)
						.addGroup(painel_cadastro_fornecedorLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel3)
								.addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(painel_cadastro_fornecedorLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4)
								.addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel5).addComponent(jLabel6)
								.addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(painel_cadastro_fornecedorLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel7).addComponent(jLabel8)
								.addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel9).addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(painel_cadastro_fornecedorLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel10)
								.addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel11)
								.addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel12)
								.addComponent(txtcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel13).addComponent(cbuf, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(painel_cadastro_fornecedorLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel14)
								.addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(46, 46, 46)));

		jTabbedPane1.addTab("Dados pessoais", painel_cadastro_fornecedor);

		jPanel3.setBackground(new java.awt.Color(255, 255, 255));

		jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel16.setText("Nome:");

		txtpesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		txtpesquisa.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtpesquisaActionPerformed(evt);
			}
		});
		txtpesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				txtpesquisaKeyPressed(evt);
			}
		});

		btnpesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		btnpesquisar.setText("Pesquisar");
		btnpesquisar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnpesquisarActionPerformed(evt);
			}
		});

		tabelaFornecedor.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Código", "Nome", "CNPJ", "E-mail", "Telefone", "Celular", "Cep", "Endereço", "Nº", "Comp",
				"Bairro", "Cidade", "UF" }));
		tabelaFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tabelaFornecedorMouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(tabelaFornecedor);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel16).addGap(4, 4, 4)
										.addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 240,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(btnpesquisar))
								.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE))
						.addContainerGap()));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGap(20, 20, 20).addGroup(jPanel3Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel16)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnpesquisar)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(55, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Consulta de Fornecedor", jPanel3);

		btexcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		btexcluir.setText("Excluir");
		btexcluir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btexcluirActionPerformed(evt);
			}
		});

		bteditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		bteditar.setText("Editar");
		bteditar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bteditarActionPerformed(evt);
			}
		});

		btsalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		btsalvar.setText("Salvar");
		btsalvar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btsalvarActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(325, 325, 325)
						.addComponent(btsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(bteditar)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(btexcluir)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jTabbedPane1));

		layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] { bteditar, btexcluir });

		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER).addComponent(btexcluir)
						.addComponent(bteditar).addComponent(btsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(0, 126, Short.MAX_VALUE)));

		layout.linkSize(javax.swing.SwingConstants.VERTICAL,
				new java.awt.Component[] { bteditar, btexcluir, btsalvar });

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void txtpesquisaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtpesquisaActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtpesquisaActionPerformed

	private void txtcomplementoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtcomplementoActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtcomplementoActionPerformed

	private void txtcidadeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtcidadeActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtcidadeActionPerformed

	private void txtbairroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtbairroActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtbairroActionPerformed

	private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtnumeroActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtnumeroActionPerformed

	private void txtenderecoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtenderecoActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtenderecoActionPerformed

	private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtemailActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtemailActionPerformed

	private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtnomeActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtnomeActionPerformed

	private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtcodigoActionPerformed

	}// GEN-LAST:event_txtcodigoActionPerformed

	private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btsalvarActionPerformed
		// botão salvar
		Fornecedores obj = new Fornecedores();
		obj.setNome(txtnome.getText());
		obj.setCnpj(txtcnpj.getText());
		obj.setEmail(txtemail.getText());
		obj.setTelefone(txttelefone.getText());
		obj.setCelular(txtcelular.getText());
		obj.setCep(txtcep.getText());
		obj.setEndereco(txtendereco.getText());
		obj.setNumero(Integer.parseInt(txtnumero.getText()));
		obj.setComplemento(txtcomplemento.getText());
		obj.setBairro(txtbairro.getText());
		obj.setCidade(txtcidade.getText());
		obj.setUf(cbuf.getSelectedItem().toString());

		FornecedoresDao dao = new FornecedoresDao();
		dao.cadastrarFornecedores(obj);

		// Inicia o Metodo do Utilitario limpar tela
		new Utilitarios().LimpaTela(painel_cadastro_fornecedor);
	}// GEN-LAST:event_btsalvarActionPerformed

	private void formWindowActivated(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowActivated
		// Carrega a lista de clientes
		listaFornecedor();
	}// GEN-LAST:event_formWindowActivated

	private void tabelaFornecedorMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tabelaFornecedorMouseClicked
		// Pega os valores e passa para a tela de cadastro
		// Pega os dados
		jTabbedPane1.setSelectedIndex(0);

		txtcodigo.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 0).toString());
		txtnome.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 1).toString());
		txtcnpj.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 2).toString());
		txtemail.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 3).toString());
		txttelefone.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 4).toString());
		txtcelular.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 5).toString());
		txtcep.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 6).toString());
		txtendereco.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 7).toString());
		txtnumero.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 8).toString());
		txtcomplemento.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 9).toString());
		txtbairro.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 10).toString());
		txtcidade.setText(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 11).toString());
		cbuf.setSelectedItem(tabelaFornecedor.getValueAt(tabelaFornecedor.getSelectedRow(), 12).toString());
	}// GEN-LAST:event_tabelaFornecedorMouseClicked

	private void bteditarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bteditarActionPerformed
		// botao editar
		// Instancia o objeto
		Fornecedores obj = new Fornecedores();

		obj.setNome(txtnome.getText());
		obj.setCnpj(txtcnpj.getText());
		obj.setEmail(txtemail.getText());
		obj.setTelefone(txttelefone.getText());
		obj.setCelular(txtcelular.getText());
		obj.setCep(txtcep.getText());
		obj.setEndereco(txtendereco.getText());
		obj.setNumero(Integer.parseInt(txtnumero.getText()));
		obj.setComplemento(txtcomplemento.getText());
		obj.setBairro(txtbairro.getText());
		obj.setCidade(txtcidade.getText());
		obj.setUf(cbuf.getSelectedItem().toString());
		// recebe o id do cliente
		obj.setId(Integer.parseInt(txtcodigo.getText()));
		// chama o ClientesDao
		ClientesDao dao = new ClientesDao();
		// passa os valores ao metodo alterarCliente da classe dao
		dao.alterarCliente(obj);

		// Inicia o Metodo do Utilitario limpar tela
		new Utilitarios().LimpaTela(painel_cadastro_fornecedor);
	}// GEN-LAST:event_bteditarActionPerformed

	private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btexcluirActionPerformed
		// Botao excluir
		// Instancia o objeto
		Fornecedores obj = new Fornecedores();
		// recebe o id do fornecedor
		obj.setId(Integer.parseInt(txtcodigo.getText()));
		// chama o FornecedorDao
		FornecedoresDao dao = new FornecedoresDao();
		// passa o id ao metodo excluirFornecedor da classe dao
		dao.excluirFornecedor(obj);

		// Inicia o Metodo do Utilitario limpar tela
		new Utilitarios().LimpaTela(painel_cadastro_fornecedor);

	}// GEN-LAST:event_btexcluirActionPerformed

	private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnpesquisarActionPerformed
		// Botão pesqusiar cliente
		// variavel nome recebe o valor digitado, que esteja no %meio% de qualque
		// palavra
		String nome = "%" + txtpesquisa.getText() + "%";

		FornecedoresDao dao = new FornecedoresDao();
		List<Fornecedores> lista = dao.buscaFornecedorPorNome(nome);

		DefaultTableModel dados = (DefaultTableModel) tabelaFornecedor.getModel();
		dados.setNumRows(0);

		for (Fornecedores c : lista) {
			dados.addRow(new Object[] { c.getId(), c.getNome(), c.getCnpj(), c.getEmail(), c.getTelefone(),
					c.getCelular(), c.getCep(), c.getEndereco(), c.getNumero(), c.getComplemento(), c.getBairro(),
					c.getCidade(), c.getUf() });

		}

	}// GEN-LAST:event_btnpesquisarActionPerformed

	private void txtpesquisaKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtpesquisaKeyPressed
		// Evento de digitar
		// Ao digtar efetua a busca
		// variavel nome recebe o valor digitado, que esteja no %meio% de qualque
		// palavra
		String nome = "%" + txtpesquisa.getText() + "%";

		FornecedoresDao dao = new FornecedoresDao();
		List<Fornecedores> lista = dao.buscaFornecedorPorNome(nome);

		DefaultTableModel dados = (DefaultTableModel) tabelaFornecedor.getModel();
		dados.setNumRows(0);

		for (Fornecedores c : lista) {
			dados.addRow(new Object[] { c.getId(), c.getNome(), c.getCnpj(), c.getEmail(), c.getTelefone(),
					c.getCelular(), c.getCep(), c.getEndereco(), c.getNumero(), c.getComplemento(), c.getBairro(),
					c.getCidade(), c.getUf() });

		}
	}// GEN-LAST:event_txtpesquisaKeyPressed

	private void txtcepKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtcepKeyPressed
		// Buscar endereço pelo CEP ao pressionar Enter
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			Clientes obj = new Clientes();
			ClientesDao dao = new ClientesDao();
			obj = dao.buscaCep(txtcep.getText());

			txtendereco.setText(obj.getEndereco());
			txtbairro.setText(obj.getBairro());
			txtcidade.setText(obj.getCidade());
			cbuf.setSelectedItem(obj.getUf());

		}

	}// GEN-LAST:event_txtcepKeyPressed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Frmfornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Frmfornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Frmfornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Frmfornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Frmfornecedor().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton bteditar;
	private javax.swing.JButton btexcluir;
	private javax.swing.JButton btnpesquisar;
	private javax.swing.JButton btsalvar;
	private javax.swing.JComboBox<String> cbuf;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JPanel painel_cadastro_fornecedor;
	private javax.swing.JTable tabelaFornecedor;
	private javax.swing.JTextField txtbairro;
	private javax.swing.JFormattedTextField txtcelular;
	private javax.swing.JFormattedTextField txtcep;
	private javax.swing.JTextField txtcidade;
	private javax.swing.JFormattedTextField txtcnpj;
	private javax.swing.JTextField txtcodigo;
	private javax.swing.JTextField txtcomplemento;
	private javax.swing.JTextField txtemail;
	private javax.swing.JTextField txtendereco;
	private javax.swing.JTextField txtnome;
	private javax.swing.JTextField txtnumero;
	private javax.swing.JTextField txtpesquisa;
	private javax.swing.JFormattedTextField txttelefone;
	// End of variables declaration//GEN-END:variables
}