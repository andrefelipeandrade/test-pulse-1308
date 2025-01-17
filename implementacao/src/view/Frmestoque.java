/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ProdutosDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produtos;

/**
 *
 * @author ANDRADE
 */
public class Frmestoque extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form Frmestoque
	 */
	public Frmestoque() {
		initComponents();
	}

	int idproduto, qtd_nova;

	// Metodo Listar na tabela
	public void listarProdutos() {

		ProdutosDao dao = new ProdutosDao();
		List<Produtos> lista = dao.listarProdutos();
		DefaultTableModel dados = (DefaultTableModel) tabelaestoque.getModel();
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
		jPanel2 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		txtnomeproduto = new javax.swing.JTextField();
		btnpesquisar = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		txtestoque = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		txtquantidade = new javax.swing.JTextField();
		btnadicionar = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		tabelaestoque = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowActivated(java.awt.event.WindowEvent evt) {
				formWindowActivated(evt);
			}
		});

		jPanel1.setBackground(new java.awt.Color(0, 153, 51));

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel1.setText("Controle de Estoque de Produtos");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(154, 154, 154).addComponent(jLabel1)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(25, Short.MAX_VALUE).addComponent(jLabel1).addGap(21, 21, 21)));

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar Produto",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 0, 14))); // NOI18N

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel3.setText("Descrição:");

		txtnomeproduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		txtnomeproduto.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtnomeprodutoActionPerformed(evt);
			}
		});
		txtnomeproduto.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				txtnomeprodutoKeyPressed(evt);
			}
		});

		btnpesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		btnpesquisar.setText("Pesquisar");
		btnpesquisar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnpesquisarActionPerformed(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel4.setText("Estoque Atual:");

		txtestoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		txtestoque.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtestoqueActionPerformed(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel5.setText("Quantidade:");

		txtquantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		txtquantidade.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtquantidadeActionPerformed(evt);
			}
		});

		btnadicionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		btnadicionar.setText("Adicionar");
		btnadicionar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnadicionarActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel4)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(txtestoque, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(jLabel5)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(txtquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel3)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(txtnomeproduto)))
						.addGap(28, 28, 28)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(btnpesquisar).addComponent(btnadicionar))
						.addContainerGap(200, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(21, 21, 21)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3)
								.addComponent(txtnomeproduto, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnpesquisar))
						.addGap(23, 23, 23)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnadicionar)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel4)
										.addComponent(txtestoque, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel5).addComponent(txtquantidade,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(40, Short.MAX_VALUE)));

		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Produtos",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 0, 14))); // NOI18N

		tabelaestoque.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Código", "Descrição", "Preço", "Qtd. Estoque", "Fornecedor" }));
		tabelaestoque.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tabelaestoqueMouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(tabelaestoque);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout
						.createSequentialGroup().addContainerGap().addComponent(jScrollPane1).addContainerGap()));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
						.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel3,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void txtnomeprodutoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtnomeprodutoActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtnomeprodutoActionPerformed

	private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnpesquisarActionPerformed
		// Botão pesqusiar Produtos
		// variavel nome recebe o valor digitado, que esteja no %meio% de qualque
		// palavra
		String nome = "%" + txtnomeproduto.getText() + "%";

		ProdutosDao dao = new ProdutosDao();
		List<Produtos> lista = dao.listarProdutosPorNome(nome);

		DefaultTableModel dados = (DefaultTableModel) tabelaestoque.getModel();
		dados.setNumRows(0);

		for (Produtos c : lista) {
			dados.addRow(new Object[] { c.getId(), c.getDescricao(), c.getPreco(), c.getQtd_estoque(),
					c.getFornecedor().getNome()

			});

		}
	}// GEN-LAST:event_btnpesquisarActionPerformed

	private void txtestoqueActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtestoqueActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtestoqueActionPerformed

	private void txtquantidadeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtquantidadeActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtquantidadeActionPerformed

	private void btnadicionarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnadicionarActionPerformed
		try {
			int qtd_estoque, qtd;

			qtd_estoque = Integer.parseInt(txtestoque.getText());

			qtd = Integer.parseInt(txtquantidade.getText());

			qtd_nova = qtd_estoque + qtd;

			ProdutosDao dao = new ProdutosDao();

			dao.adicionarEstoque(idproduto, qtd_nova);

			JOptionPane.showMessageDialog(null, "Estoque do Produto Atualizado");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Selecione o produto ou informe a nova quantidade." + e);

		}

	}// GEN-LAST:event_btnadicionarActionPerformed

	private void formWindowActivated(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowActivated
		// Metodo listar produtos estoque
		listarProdutos();
	}// GEN-LAST:event_formWindowActivated

	private void txtnomeprodutoKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtnomeprodutoKeyPressed
		// Evento de digitar
		// Ao digtar efetua a busca
		// variavel nome recebe o valor digitado, que esteja no %meio% de qualque
		// palavra
		String nome = "%" + txtnomeproduto.getText() + "%";

		ProdutosDao dao = new ProdutosDao();
		List<Produtos> lista = dao.listarProdutosPorNome(nome);

		DefaultTableModel dados = (DefaultTableModel) tabelaestoque.getModel();
		dados.setNumRows(0);

		for (Produtos c : lista) {
			dados.addRow(new Object[] { c.getId(), c.getDescricao(), c.getPreco(), c.getFornecedor() });

		}
	}// GEN-LAST:event_txtnomeprodutoKeyPressed

	private void tabelaestoqueMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tabelaestoqueMouseClicked
		// Pega o id
		idproduto = Integer.parseInt(tabelaestoque.getValueAt(tabelaestoque.getSelectedRow(), 0).toString());
		txtnomeproduto.setText(tabelaestoque.getValueAt(tabelaestoque.getSelectedRow(), 1).toString());
		// mostra dos dados
		txtestoque.setText(tabelaestoque.getValueAt(tabelaestoque.getSelectedRow(), 3).toString());

	}// GEN-LAST:event_tabelaestoqueMouseClicked

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
			java.util.logging.Logger.getLogger(Frmestoque.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Frmestoque.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Frmestoque.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Frmestoque.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Frmestoque().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnadicionar;
	private javax.swing.JButton btnpesquisar;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable tabelaestoque;
	private javax.swing.JTextField txtestoque;
	private javax.swing.JTextField txtnomeproduto;
	private javax.swing.JTextField txtquantidade;
	// End of variables declaration//GEN-END:variables
}
