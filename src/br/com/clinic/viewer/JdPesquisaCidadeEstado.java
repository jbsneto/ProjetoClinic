/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.viewer;

import br.com.clinic.facade.Facade;
import br.com.clinic.model.CidadeEstado;
import br.com.clinic.util.LerXlsx;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GENPAC
 */
public class JdPesquisaCidadeEstado extends javax.swing.JDialog {

    private Facade facade;
    private List<CidadeEstado> list;
    private CidadeEstado cidadeEstado;

    public JdPesquisaCidadeEstado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);

        facade = new Facade();
        jtPesquisa.setEditable(false);
        
        try {
            list = LerXlsx.getXlsx();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("error: " + ex.getMessage());
        }

        this.setTitle("IBGE - Tabela");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jcbFiltro = new javax.swing.JComboBox();
        jtPesquisa = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodUF", "UF", "CodCidade", "Cidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setMinWidth(80);
            jTable.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable.getColumnModel().getColumn(0).setMaxWidth(80);
            jTable.getColumnModel().getColumn(1).setMinWidth(80);
            jTable.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable.getColumnModel().getColumn(1).setMaxWidth(80);
            jTable.getColumnModel().getColumn(2).setMinWidth(80);
            jTable.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable.getColumnModel().getColumn(2).setMaxWidth(80);
            jTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setText("Filtro:");

        jcbFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Cidade", "Estado" }));
        jcbFiltro.setToolTipText("");
        jcbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFiltroActionPerformed(evt);
            }
        });

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jLabel2.setText("Pesquisa:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jcbFiltro.getAccessibleContext().setAccessibleName("");

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

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
       try {

            int result = JOptionPane.showConfirmDialog(null, "Deseja pegar esse cliente?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                int index = this.jTable.getSelectedRow();
                String cod = this.jTable.getValueAt(index, 2).toString();
                if (facade.getCidadeEstado(cod) != null) {
                    cidadeEstado = facade.getCidadeEstado(cod);
                } else {
                    cidadeEstado = new CidadeEstado();
                    cidadeEstado.setCodCidade(this.jTable.getValueAt(index, 2).toString());
                    cidadeEstado.setCodEstado(this.jTable.getValueAt(index, 0).toString());
                    cidadeEstado.setNomeCidade(this.jTable.getValueAt(index, 3).toString());
                    cidadeEstado.setNomeEstado(this.jTable.getValueAt(index, 1).toString());
                    facade.cidadeEstadoCadastrar(cidadeEstado);
                }
            } else {
                this.cidadeEstado = null;
            }
            dispose();
            //dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Deu Páia!");
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void jcbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFiltroActionPerformed
        if (this.jcbFiltro.getSelectedIndex() == 0) {
            jtPesquisa.setText(null);
            jtPesquisa.setEditable(false);
        }
        if (this.jcbFiltro.getSelectedIndex() == 1) {
            jtPesquisa.setText(null);
            jtPesquisa.setEditable(true);
        }
        if (this.jcbFiltro.getSelectedIndex() == 2) {
            jtPesquisa.setText(null);
            jtPesquisa.setEditable(true);
        }
        this.jcbFiltro.getComponentCount();
    }//GEN-LAST:event_jcbFiltroActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        try {
            if (this.jcbFiltro.getSelectedIndex() == 0) 
                preencherListaTodos(list);
            if (this.jcbFiltro.getSelectedIndex() == 1) 
                preencherListaCidade(jtPesquisa.getText(), list);
            if (this.jcbFiltro.getSelectedIndex() == 2) 
                preencherListaUf(jtPesquisa.getText(), list);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(JdPesquisaCidadeEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JdPesquisaCidadeEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JdPesquisaCidadeEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JdPesquisaCidadeEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JdPesquisaCidadeEstado dialog = new JdPesquisaCidadeEstado(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JComboBox jcbFiltro;
    private javax.swing.JTextField jtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void preencherListaTodos(List<CidadeEstado> lista) throws Exception {
        DefaultTableModel dm = (DefaultTableModel) jTable.getModel();
        dm.getDataVector().removeAllElements();
        if (lista != null) {
            for (CidadeEstado ce : lista) {
                dm.addRow(new String[]{ce.getCodEstado(), ce.getNomeEstado(), ce.getCodCidade(), ce.getNomeCidade()});
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista Null");
        }
    }

    private void preencherListaUf(String uf, List<CidadeEstado> lista) throws Exception {
        DefaultTableModel dm = (DefaultTableModel) jTable.getModel();
        dm.getDataVector().removeAllElements();
        if (lista != null) {
            for (CidadeEstado c : lista) {
                if (c.getNomeEstado().equals(uf)) {
                    dm.addRow(new String[]{c.getCodEstado(), c.getNomeEstado(), c.getCodCidade(), c.getNomeCidade()});
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista Null");
        }
    }

    private void preencherListaCidade(String cidade, List<CidadeEstado> lista) throws Exception {
        DefaultTableModel dm = (DefaultTableModel) jTable.getModel();
        dm.getDataVector().removeAllElements();
        if (lista != null) {
            for (CidadeEstado c : lista) {
                if (c.getNomeCidade().equals(cidade)) {
                    dm.addRow(new String[]{c.getCodEstado(), c.getNomeEstado(), c.getCodCidade(), c.getNomeCidade()});
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista Null");
        }
    }

    public void limparTabela() {
        DefaultTableModel dm = (DefaultTableModel) jTable.getModel();
        dm.getDataVector().removeAllElements();
    }

    public CidadeEstado getCidadeEstado() {
        return this.cidadeEstado;
    }
}
