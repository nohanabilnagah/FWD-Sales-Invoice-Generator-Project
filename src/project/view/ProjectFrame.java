
package project.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import Project_Controller.InvHeaderController;
import Project_Controller.InvLineController;
import project.model.InvoiceHeader;
import project.model.InvoiceLine;

/**
 *
 * @author Noha_Nabil_Nagah
 */
public class ProjectFrame extends javax.swing.JFrame implements ActionListener, ListSelectionListener {

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
        headerTable.getSelectionModel().addListSelectionListener(this);
        newInv = new javax.swing.JButton();
        newInv.addActionListener(this);
        deleteInv = new javax.swing.JButton();
        deleteInv.addActionListener(this);
        invNum = new javax.swing.JLabel();
        invDate = new javax.swing.JLabel();
        cusName = new javax.swing.JLabel();
        invTotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lineTable = new javax.swing.JTable();
        lineTable.getSelectionModel().addListSelectionListener(this);
        invNumLbl = new javax.swing.JLabel();
        custNameTF = new javax.swing.JTextField();
        invDateTF = new javax.swing.JTextField();
        invTotalLbl = new javax.swing.JLabel();
        insertItemBtn = new javax.swing.JButton();
        insertItemBtn.addActionListener(this);
        cancelChanges = new javax.swing.JButton();
        cancelChanges.addActionListener(this);
        invItem = new javax.swing.JLabel();
        invTable = new javax.swing.JLabel();
        invNum1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadFileMenuItem = new javax.swing.JMenuItem();
        loadFileMenuItem.addActionListener(this);
        saveFileMenuItem = new javax.swing.JMenuItem();
        saveFileMenuItem.addActionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        headerTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(headerTable);

        newInv.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        newInv.setText("Create New Invoice");
        newInv.setActionCommand("CreateInv");
        newInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newInvActionPerformed(evt);
            }
        });

        deleteInv.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        deleteInv.setText("Delete Invoice");
        deleteInv.setActionCommand("DeleteInv");
        deleteInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteInvMouseClicked(evt);
            }
        });
        deleteInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInvActionPerformed(evt);
            }
        });

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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        lineTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
        insertItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertItemBtnActionPerformed(evt);
            }
        });

        cancelChanges.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cancelChanges.setText("Delete Changes");
        cancelChanges.setActionCommand("DeleteItem");
        cancelChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelChangesActionPerformed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
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
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invItem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(newInv)
                        .addGap(77, 77, 77)
                        .addComponent(deleteInv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                        .addComponent(insertItemBtn)
                        .addGap(109, 109, 109)
                        .addComponent(cancelChanges)
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
                    .addComponent(cancelChanges))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void invDateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invDateTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invDateTFActionPerformed

    private void cancelChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelChangesActionPerformed
    cancelChanges();
    }//GEN-LAST:event_cancelChangesActionPerformed

    private void custNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custNameTFActionPerformed

    private void insertItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertItemBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertItemBtnActionPerformed

    private void saveFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileMenuItemActionPerformed


    }//GEN-LAST:event_saveFileMenuItemActionPerformed

    private void newInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newInvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newInvActionPerformed

    private void deleteInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInvActionPerformed
        deleteInv();
        
            
        
    }//GEN-LAST:event_deleteInvActionPerformed

    private void deleteInvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteInvMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteInvMouseClicked

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
    private javax.swing.JButton cancelChanges;
    private javax.swing.JLabel cusName;
    private javax.swing.JTextField custNameTF;
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
    private InvHeaderController headerTableModel;
    private InvLineController lineTableModel;
    private SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy");
    private InvHeaderDialog headerDialog;
    private InvLineDialog lineDialog;
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getActionCommand().equals("L")) {
           try {
               loadFiles();
           } catch (Exception ex) {
               ex.printStackTrace();
           }
       } else if (e.getActionCommand().equals("S")) {
           saveData();
       } else if (e.getActionCommand().equals("CreateInv")) {
           newInv();
       } else if (e.getActionCommand().equals("deleteInv")) {
           deleteInv();
       } else if (e.getActionCommand().equals("InsertItem")) {
           insertItemBtn();
       } else if (e.getActionCommand().equals("cancelChanges")) {
           cancelChanges();
       } else if (e.getActionCommand().equals("creatInvOK")) {
           creatInvOK();
       } else if (e.getActionCommand().equals("creatInvCancel")) {
           creatInvCancel();
       }else if (e.getActionCommand().equals("creatLineOK")) {
           creatLineOK();
       } else if (e.getActionCommand().equals("creatLineCancel")) {
           creatLineCancel();
    }
       
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
        headerTableRowSelected(); 
    }
    
   
    private void loadFiles() throws Exception {
        filesData.clear();
        JOptionPane.showMessageDialog(this, "Please select Invoice header file", "Invoice Header", JOptionPane.WARNING_MESSAGE);
        JFileChooser fc = new JFileChooser();
        int option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc.getSelectedFile();
            FileReader fr = new FileReader(selectedFile);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] headerSegments = line.split(",");
                String invNumStr = headerSegments[0];
                String invDateStr = headerSegments[1]; // "22-11-2020"
                String custName = headerSegments[2];
                int invNum = Integer.parseInt(invNumStr);
                Date invDate = df.parse(invDateStr);
                InvoiceHeader header = new InvoiceHeader(invNum, invDate, custName);
                filesData.add(header);
                System.out.print(invNum);
                System.out.print(invDate);
                System.out.println(custName);
                
            }
            br.close();
            fr.close();
            System.out.println("check");
            JOptionPane.showMessageDialog(this, "Please select Invoice lines file", "Invoice Lines", JOptionPane.WARNING_MESSAGE);
            option = fc.showOpenDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                selectedFile = fc.getSelectedFile();
                fr = new FileReader(selectedFile);
                br = new BufferedReader(fr);
                line = null;
                while ((line = br.readLine()) != null) {
                    String[] lineSegments = line.split(",");
                    String invNumStr = lineSegments[0];
                    String item = lineSegments[1]; // "22-11-2020"
                    
                    String priceStr = lineSegments[2];
                    String countStr = lineSegments[3];
                    int invNum = Integer.parseInt(invNumStr);
                    double price = Double.parseDouble(priceStr);
                    int count = Integer.parseInt(countStr);
                    InvoiceHeader header = findByNum(invNum);
                    InvoiceLine invLine = new InvoiceLine(item, price, count, header);
                    header.addLine(invLine);
                    System.out.print(invNum);
                    System.out.print(item);
                    System.out.print(price);
                    System.out.println(count);
                }
                br.close();
                fr.close();
                headerTableModel = new InvHeaderController(filesData);
                headerTable.setModel(headerTableModel);
                headerTable.validate();
                
            }
        }
    }
    
    private InvoiceHeader findByNum(int num) {
        for (InvoiceHeader header : filesData) {
            if (header.getInvNum() == num) {
                return header;
            }
        }
        return null;
    }
    
 
    private void saveData()  {
        JFileChooser chooser = new JFileChooser();
        int state = chooser.showSaveDialog(null);
        File file = chooser.getSelectedFile();
        if (file != null && state == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
                PrintWriter fileWriter = new PrintWriter(bufferedWriter);

                for (int i = 0; i < headerTable.getRowCount(); ++i) {
                    for (int j = 0; j < headerTable.getColumnCount(); ++j) {
                        String s = headerTable.getValueAt(i, j).toString();
                        System.out.println(s);
                        fileWriter.print(s);
                        fileWriter.print(",");
                    }
                    fileWriter.println("");
                }
                fileWriter.close();
                JOptionPane.showMessageDialog(null, "Successfully Saved");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Failure");
            }
        }
        chooser = new JFileChooser();
        state = chooser.showSaveDialog(null);
        file = chooser.getSelectedFile();
        if (file != null && state == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
                PrintWriter fileWriter = new PrintWriter(bufferedWriter);

                for (int i = 0; i < lineTable.getRowCount(); ++i) {
                    for (int j = 0; j < lineTable.getColumnCount(); ++j) {
                        String s = lineTable.getValueAt(i, j).toString();
                        System.out.println(s);
                        fileWriter.print(s);
                        fileWriter.print(",");
                    }
                    fileWriter.println("");
                }
                fileWriter.close();
                JOptionPane.showMessageDialog(null, "Successfully Saved");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Failure");
            }
        }
     
    }
  
    
    private void newInv() {
        headerDialog = new InvHeaderDialog(this);
        headerDialog.setVisible(true);
    
    }
    
    private void deleteInv() {
       int indexrow = headerTable.getSelectedRow();
       headerTableModel.removeRow(indexrow);
       headerTableModel.fireTableDataChanged();
    }
    
    private void insertItemBtn() {
        lineDialog = new InvLineDialog(this);
        lineDialog.setVisible(true);
    }
    
    private void cancelChanges() {
        int indexrow = lineTable.getSelectedRow();
       lineTableModel.removeRow(indexrow);
       lineTableModel.fireTableDataChanged();
        
    }

    private void headerTableRowSelected() {
       int selectedRowIndex = headerTable.getSelectedRow();
       //filesData.get(selectedRowIndex); 
       if(selectedRowIndex >= 0 ){
           
       InvoiceHeader row = headerTableModel.getData().get(selectedRowIndex);
       custNameTF.setText(row.getCusName());
       invDateTF.setText(row.getInvDate().toString());
       invNumLbl.setText(""+row.getInvNum());
       invTotalLbl.setText(""+row.getInvTotal());
       ArrayList<InvoiceLine> lines = row.getLines();
       lineTableModel = new InvLineController(lines);
       lineTable.setModel(lineTableModel);
       lineTableModel.fireTableDataChanged();
        }
    }

    private void creatInvOK() {
      String cusName = headerDialog.getCusNameField().getText();
        String invDateStr = headerDialog.getInvDateField().getText();
        Date invDate = new Date();
        try {invDate = df.parse(invDateStr);
        } catch (ParseException ex) {

        }
        headerDialog.setVisible(false);
        int num = getMaxInvNum() + 1;        
        InvoiceHeader newInvHeader = new InvoiceHeader(num, invDate, cusName);
        filesData.add(newInvHeader);  
        headerTableModel.fireTableDataChanged();
        System.out.println("check");
    }
    
    private int getMaxInvNum(){
            int num = 0;
            for (InvoiceHeader header : filesData){
                if (header.getInvNum() > num){
                num = header.getInvNum();
            }
        }
        return num; 
    }


    private void creatInvCancel() {
        headerDialog.setVisible(false);
    }

    private void creatLineOK() {
        String itemName = lineDialog.getItemNameField().getText();
        String itemCountStr = lineDialog.getItemCountField().getText();
        String itemPriceStr = lineDialog.getItemPriceField().getText();
        
        int itemCount = Integer.parseInt(itemCountStr);
        double itemPrice = Double.parseDouble(itemPriceStr);
        lineDialog.setVisible(false);
        InvoiceHeader header = filesData.get(headerTable.getSelectedRow());
        InvoiceLine line = new InvoiceLine(itemName, itemPrice, itemCount, header);
        header.addLine(line);
        
        lineTableModel.fireTableDataChanged();
        
    }

    private void creatLineCancel() {
        lineDialog.setVisible(false);
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
