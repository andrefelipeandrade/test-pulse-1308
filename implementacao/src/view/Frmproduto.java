/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.FornecedoresDao;
import dao.ProdutosDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Fornecedores;
import model.Produtos;
import model.Utilitarios;

/**
 *
 * @author ANDRADE
 */
public class Frmproduto extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form Frmcliente
	 */
	public Frmproduto() {
		initComponents();
	}

	// Metodo Listar na tabela
	public void listarProdutos() {

		ProdutosDao dao = new ProdutosDao();
		List<Produtos> lista = dao.listarProdutos();
		DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
		dados.setNumRows(0);

		for (Produtos c : lista) {
			dados.addRow(
					new Object[] { c.getId(), c.getDescricao(), c.getPreco(), c.getQtd_estoque(), c.getFornecedor() });

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
		painel_cadastro_produto = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		txtcodigo = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		txtdescricao = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		cbfornecedor = new javax.swing.JComboBox<Fornecedores>();
		txtqtdestoque = new javax.swing.JTextField();
		txtpreco = new javax.swing.JTextField();
		jPanel3 = new javax.swing.JPanel();
		jLabel16 = new javax.swing.JLabel();
		txtpesquisa = new javax.swing.JTextField();
		btnpesquisar = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		tabelaProdutos = new javax.swing.JTable();
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
		jLabel1.setText("Cadastro de Produtos");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(43, 43, 43).addComponent(jLabel1)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(29, 29, 29).addComponent(jLabel1)
						.addContainerGap(31, Short.MAX_VALUE)));

		painel_cadastro_produto.setBackground(new java.awt.Color(255, 255, 255));

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
		jLabel3.setText("Descrição:");

		txtdescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		txtdescricao.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtdescricaoActionPerformed(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel4.setText("Preço:");

		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel5.setText("Qtd. Estoque:");

		jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel6.setText("Fornecedor:");

		cbfornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		cbfornecedor.addAncestorListener(new javax.swing.event.AncestorListener() {
			public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
				cbfornecedorAncestorAdded(evt);
			}

			public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
			}

			public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
			}
		});
		cbfornecedor.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cbfornecedorActionPerformed(evt);
			}
		});

		txtqtdestoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		txtqtdestoque.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtqtdestoqueActionPerformed(evt);
			}
		});

		txtpreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		txtpreco.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtprecoActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout painel_cadastro_produtoLayout = new javax.swing.GroupLayout(painel_cadastro_produto);
		painel_cadastro_produto.setLayout(painel_cadastro_produtoLayout);
		painel_cadastro_produtoLayout.setHorizontalGroup(painel_cadastro_produtoLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(painel_cadastro_produtoLayout.createSequentialGroup().addContainerGap()
						.addGroup(painel_cadastro_produtoLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(painel_cadastro_produtoLayout.createSequentialGroup().addComponent(jLabel6)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cbfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 366,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))
								.addGroup(painel_cadastro_produtoLayout.createSequentialGroup()
										.addGroup(painel_cadastro_produtoLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel3).addComponent(jLabel2).addComponent(jLabel4))
										.addGap(4, 4, 4)
										.addGroup(painel_cadastro_produtoLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(painel_cadastro_produtoLayout.createSequentialGroup()
														.addComponent(txtdescricao,
																javax.swing.GroupLayout.PREFERRED_SIZE, 240,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, Short.MAX_VALUE))
												.addGroup(painel_cadastro_produtoLayout.createSequentialGroup()
														.addGroup(painel_cadastro_produtoLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(txtcodigo,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 80,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGroup(painel_cadastro_produtoLayout
																		.createSequentialGroup()
																		.addComponent(txtpreco,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				129,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(18, 18, 18).addComponent(jLabel5)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(txtqtdestoque,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				140,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addContainerGap(440, Short.MAX_VALUE)))))));
		painel_cadastro_produtoLayout.setVerticalGroup(painel_cadastro_produtoLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(painel_cadastro_produtoLayout.createSequentialGroup().addGap(24, 24, 24)
						.addGroup(painel_cadastro_produtoLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2))
						.addGap(18, 18, 18)
						.addGroup(painel_cadastro_produtoLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel3)
								.addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(painel_cadastro_produtoLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4)
								.addComponent(jLabel5)
								.addComponent(txtqtdestoque, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(painel_cadastro_produtoLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel6)
								.addComponent(cbfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		jTabbedPane1.addTab("Dados do Produto", painel_cadastro_produto);

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

		tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Código", "Descrição", "Preço", "Qtd. Estoque", "Fornecedor" }));
		tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tabelaProdutosMouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(tabelaProdutos);

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

		jTabbedPane1.addTab("Consulta de Produtos", jPanel3);

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
				.addGroup(layout.createSequentialGroup().addGap(295, 295, 295)
						.addComponent(btsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(bteditar)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(btexcluir)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addComponent(jTabbedPane1).addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

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
				.addGap(0, 63, Short.MAX_VALUE)));

		layout.linkSize(javax.swing.SwingConstants.VERTICAL,
				new java.awt.Component[] { bteditar, btexcluir, btsalvar });

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void txtpesquisaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtpesquisaActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtpesquisaActionPerformed

	private void txtdescricaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtdescricaoActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtdescricaoActionPerformed

	private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtcodigoActionPerformed

	}// GEN-LAST:event_txtcodigoActionPerformed

	private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btsalvarActionPerformed
		// botão salvar
		Produtos obj = new Produtos();
		obj.setDescricao(txtdescricao.getText());
		obj.setPreco(Double.parseDouble(txtpreco.getText()));
		obj.setQtd_estoque(Integer.parseInt(txtqtdestoque.getText()));

		// Criar um objeto de Fornecedor
		Fornecedores f = new Fornecedores();
		f = (Fornecedores) cbfornecedor.getSelectedItem();
		obj.setFornecedor(f);

		ProdutosDao dao = new ProdutosDao();
		dao.cadastrar(obj);

		new Utilitarios().LimpaTela(painel_cadastro_produto);
		// Inicia o Metodo do Utilitario limpar tela
		new Utilitarios().LimpaTela(painel_cadastro_produto);
	}// GEN-LAST:event_btsalvarActionPerformed

	private void formWindowActivated(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowActivated
		// Carrega a lista de clientes
		listarProdutos();
	}// GEN-LAST:event_formWindowActivated

	private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tabelaProdutosMouseClicked
		// Pega os dados
		jTabbedPane1.setSelectedIndex(0);

		txtcodigo.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0).toString());
		txtdescricao.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 1).toString());
		txtpreco.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 2).toString());
		txtqtdestoque.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 3).toString());

		Fornecedores f = new Fornecedores();

		// f =
		// dao.buscaFornecedorPorNome(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),
		// 4).toString());

		cbfornecedor.removeAllItems();
		cbfornecedor.getModel().setSelectedItem(f);
	}// GEN-LAST:event_tabelaProdutosMouseClicked

	private void bteditarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bteditarActionPerformed
		// botao editar
		Produtos obj = new Produtos();
		obj.setId(Integer.parseInt(txtcodigo.getText()));
		obj.setDescricao(txtdescricao.getText());
		obj.setPreco(Double.parseDouble(txtpreco.getText()));
		obj.setQtd_estoque(Integer.parseInt(txtqtdestoque.getText()));

		// Criar um objeto de Fornecedor
		Fornecedores f = new Fornecedores();
		f = (Fornecedores) cbfornecedor.getSelectedItem();

		obj.setFornecedor(f);

		ProdutosDao dao = new ProdutosDao();
		dao.alterar(obj);

		// Inicia o Metodo do Utilitario limpar tela
		new Utilitarios().LimpaTela(painel_cadastro_produto);
	}// GEN-LAST:event_bteditarActionPerformed

	private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btexcluirActionPerformed
		// Botao excluir
		// Instancia o objeto
		Produtos obj = new Produtos();
		// recebe o id do Produto
		obj.setId(Integer.parseInt(txtcodigo.getText()));
		// chama o Produto
		ProdutosDao dao = new ProdutosDao();
		// passa o id ao metodo excluir da classe dao
		dao.excluir(obj);

		// Inicia o Metodo do Utilitario limpar tela
		new Utilitarios().LimpaTela(painel_cadastro_produto);

	}// GEN-LAST:event_btexcluirActionPerformed

	private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnpesquisarActionPerformed
		// Botão pesqusiar Produtos
		// variavel nome recebe o valor digitado, que esteja no %meio% de qualque
		// palavra
		String nome = "%" + txtpesquisa.getText() + "%";

		ProdutosDao dao = new ProdutosDao();
		List<Produtos> lista = dao.listarProdutosPorNome(nome);

		DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
		dados.setNumRows(0);

		for (Produtos c : lista) {
			dados.addRow(new Object[] { c.getId(), c.getDescricao(), c.getPreco(), c.getFornecedor() });

		}

	}// GEN-LAST:event_btnpesquisarActionPerformed

	private void txtpesquisaKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtpesquisaKeyPressed
		// Evento de digitar
		// Ao digtar efetua a busca
		// variavel nome recebe o valor digitado, que esteja no %meio% de qualque
		// palavra
		String nome = "%" + txtpesquisa.getText() + "%";

		ProdutosDao dao = new ProdutosDao();
		List<Produtos> lista = dao.listarProdutosPorNome(nome);

		DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
		dados.setNumRows(0);

		for (Produtos c : lista) {
			dados.addRow(new Object[] { c.getId(), c.getDescricao(), c.getPreco(), c.getFornecedor() });

		}
	}// GEN-LAST:event_txtpesquisaKeyPressed

	private void cbfornecedorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbfornecedorActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_cbfornecedorActionPerformed

	private void cbfornecedorAncestorAdded(javax.swing.event.AncestorEvent evt) {// GEN-FIRST:event_cbfornecedorAncestorAdded
		// Carregando combobox fornecedores
		FornecedoresDao dao = new FornecedoresDao();
		List<Fornecedores> listadefornecedores = dao.listaFornecedor();
		cbfornecedor.removeAll();

		for (Fornecedores f : listadefornecedores) {
			cbfornecedor.addItem(f);
		}
	}// GEN-LAST:event_cbfornecedorAncestorAdded

	private void txtqtdestoqueActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtqtdestoqueActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtqtdestoqueActionPerformed

	private void txtprecoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtprecoActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtprecoActionPerformed

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
			java.util.logging.Logger.getLogger(Frmproduto.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Frmproduto.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Frmproduto.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Frmproduto.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Frmproduto().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton bteditar;
	private javax.swing.JButton btexcluir;
	private javax.swing.JButton btnpesquisar;
	private javax.swing.JButton btsalvar;
	private javax.swing.JComboBox<Fornecedores> cbfornecedor;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	public javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JPanel painel_cadastro_produto;
	private javax.swing.JTable tabelaProdutos;
	private javax.swing.JTextField txtcodigo;
	private javax.swing.JTextField txtdescricao;
	private javax.swing.JTextField txtpesquisa;
	private javax.swing.JTextField txtpreco;
	private javax.swing.JTextField txtqtdestoque;
	// End of variables declaration//GEN-END:variables
}
