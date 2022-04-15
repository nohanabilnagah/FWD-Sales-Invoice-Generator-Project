
package View;

import Controller.MyController;
import java.util.ArrayList;
import javax.swing.JTable;
import Model.InvHeaderModel;
import Model.InvLineModel;
import Model.InvoiceHeader;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author Noha_Nabil_Nagah
 */
public class ProjectFrame extends javax.swing.JFrame {

    private InvoiceHeader invoiceHeader;

    /**
     * Creates new form ProjectFrame
     */
    public ProjectFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        headerTable = new javax.swing.JTable();
        headerTable.getSelectionModel().addListSelectionListener(controller);
        newInv = new javax.swing.JButton();
        newInv.addActionListener(controller);
        deleteInv = new javax.swing.JButton();
        deleteInv.addActionListener(controller);
        invNum = new javax.swing.JLabel();
        invDate = new javax.swing.JLabel();
        cusName = new javax.swing.JLabel();
        invTotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lineTable = new javax.swing.JTable();
        invNumLbl = new javax.swing.JLabel();
        custNameTF = new javax.swing.JTextField();
        invDateTF = new javax.swing.JTextField();
        invTotalLbl = new javax.swing.JLabel();
        insertItemBtn = new javax.swing.JButton();
        insertItemBtn.addActionListener(controller);
        deleteChanges = new javax.swing.JButton();
        deleteChanges.addActionListener(controller);
        invItem = new javax.swing.JLabel();
        invTable = new javax.swing.JLabel();
        invNum1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadFileMenuItem = new javax.swing.JMenuItem();
        loadFileMenuItem.addActionListener(controller);
        saveFileMenuItem = new javax.swing.JMenuItem();
        saveFileMenuItem.addActionListener(controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(headerTable);

        newInv.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        newInv.setText("Create New Invoice");
        newInv.setActionCommand("CreateInv");

        deleteInv.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        deleteInv.setText("Delete Invoice");
        deleteInv.setActionCommand("DeleteInv");

        invNum.setFont(new java.awt.Font("Arial", 3, 13)); // NOI18N
        invNum.setText("Invoice Number");

        invDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        invDate.setText("Invoice Date");

        cusName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusName.setText("Customer Name");

        invTotal.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        invTotal.setText("Invoice Total");

        lineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(lineTable);

        custNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custNameTFActionPerformed(evt);
            }
        });

        invDateTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invDateTFActionPerformed(evt);
            }
        });

        insertItemBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        insertItemBtn.setText("Insert New Item ");
        insertItemBtn.setActionCommand("InsertItem");

        deleteChanges.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        deleteChanges.setText("Delete Changes");
        deleteChanges.setActionCommand("DeleteChanges");

        invItem.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        invItem.setForeground(new java.awt.Color(0, 0, 153));
        invItem.setText("Invoice Items");

        invTable.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        invTable.setForeground(new java.awt.Color(0, 0, 102));
        invTable.setText("Invoices Table");

        invNum1.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        invNum1.setForeground(new java.awt.Color(153, 0, 0));
        invNum1.setText("Sales Invoice Generator");

        jMenu1.setText("File");

        loadFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        loadFileMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        loadFileMenuItem.setText("Load File");
        loadFileMenuItem.setActionCommand("L");
        loadFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loadFileMenuItem);

        saveFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveFileMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        saveFileMenuItem.setText("Save");
        saveFileMenuItem.setActionCommand("S");
        saveFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveFileMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invTable, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(invNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cusName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(invDate)
                                    .addComponent(invTotal)
                                    .addComponent(invNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invDateTF)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(invTotalLbl)
                                            .addComponent(invNumLbl))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(custNameTF)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(invItem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(newInv)
                        .addGap(77, 77, 77)
                        .addComponent(deleteInv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                        .addComponent(insertItemBtn)
                        .addGap(109, 109, 109)
                        .addComponent(deleteChanges)
                        .addGap(92, 92, 92)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invNum)
                            .addComponent(invNumLbl))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invDate)
                            .addComponent(invDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cusName)
                            .addComponent(custNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invTotal)
                            .addComponent(invTotalLbl))
                        .addGap(29, 29, 29)
                        .addComponent(invItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invTable)
                            .addComponent(invNum1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newInv)
                    .addComponent(deleteInv)
                    .addComponent(insertItemBtn)
                    .addComponent(deleteChanges))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void invDateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invDateTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invDateTFActionPerformed

    private void custNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custNameTFActionPerformed

    private void saveFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileMenuItemActionPerformed


    }//GEN-LAST:event_saveFileMenuItemActionPerformed

    private void loadFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadFileMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(ProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cusName;
    private javax.swing.JTextField custNameTF;
    private javax.swing.JButton deleteChanges;
    private javax.swing.JButton deleteInv;
    private javax.swing.JTable headerTable;
    private javax.swing.JButton insertItemBtn;
    private javax.swing.JLabel invDate;
    private javax.swing.JTextField invDateTF;
    private javax.swing.JLabel invItem;
    private javax.swing.JLabel invNum;
    private javax.swing.JLabel invNum1;
    private javax.swing.JLabel invNumLbl;
    private javax.swing.JLabel invTable;
    private javax.swing.JLabel invTotal;
    private javax.swing.JLabel invTotalLbl;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lineTable;
    private javax.swing.JMenuItem loadFileMenuItem;
    private javax.swing.JButton newInv;
    private javax.swing.JMenuItem saveFileMenuItem;
    // End of variables declaration//GEN-END:variables

    public  ArrayList<InvoiceHeader> filesData = new ArrayList<>();
    private InvHeaderModel headerTableModel;
    private InvLineModel lineTableModel;
    private InvHeaderDialog headerDialog;
    private InvLineDialog lineDialog;
    private MyController controller = new MyController(this);
    

    public void setHeaderDialog(InvHeaderDialog headerDialog) {
        this.headerDialog = headerDialog;
    }

    public void setLineDialog(InvLineDialog lineDialog) {
        this.lineDialog = lineDialog;
    }
    
    

    public void setHeaderTableModel(InvHeaderModel headerTableModel) {
        this.headerTableModel = headerTableModel;
    }

    public void setInvLineModel(InvLineModel lineTableModel) {
        this.lineTableModel = lineTableModel;
    }
    
    

    public InvoiceHeader getInvoiceHeader() {
        return invoiceHeader;
    }

    public JButton getDeleteChanges() {
        return deleteChanges;
    }

    public JLabel getCusName() {
        return cusName;
    }

    public JTextField getCustNameTF() {
        return custNameTF;
    }

    public JButton getDeleteInv() {
        return deleteInv;
    }

    public JTable getHeaderTable() {
        return headerTable;
    }

    public JButton getInsertItemBtn() {
        return insertItemBtn;
    }

    public JLabel getInvDate() {
        return invDate;
    }

    public JTextField getInvDateTF() {
        return invDateTF;
    }

    public JLabel getInvItem() {
        return invItem;
    }

    public JLabel getInvNum() {
        return invNum;
    }

    public JLabel getInvNum1() {
        return invNum1;
    }

    public JLabel getInvNumLbl() {
        return invNumLbl;
    }

    public JLabel getInvTable() {
        return invTable;
    }

    public JLabel getInvTotal() {
        return invTotal;
    }

    public JLabel getInvTotalLbl() {
        return invTotalLbl;
    }

    public JTable getLineTable() {
        return lineTable;
    }

    public JMenuItem getLoadFileMenuItem() {
        return loadFileMenuItem;
    }

    public JButton getNewInv() {
        return newInv;
    }

    public JMenuItem getSaveFileMenuItem() {
        return saveFileMenuItem;
    }

    public ArrayList<InvoiceHeader> getFilesData() {
        return filesData;
    }

    public InvHeaderModel getHeaderTableModel() {
        return headerTableModel;
    }

    public InvLineModel getLineTableModel() {
        return lineTableModel;
    }

    //public SimpleDateFormat getDf() {
     //   return df;
    //}

    public InvHeaderDialog getHeaderDialog() {
        return headerDialog;
    }

    public InvLineDialog getLineDialog() {
        return lineDialog;
    }

    public MyController getMyController() {
        return controller;
    }
    
    
     private static class DeafultTableModel {

        public DeafultTableModel() {
        }
    }

    private static class jTable1 {

        public jTable1() {
        }
    }
       
    
  
 }
