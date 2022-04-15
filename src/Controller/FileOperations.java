/*
 * To change this license inv, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.InvHeaderModel;
import Model.InvoiceHeader;
import Model.InvoiceLine;
import View.ProjectFrame;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Noha_Nabil_Nagah
 */
public class FileOperations {
    
    private ProjectFrame frame;
    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    
    public FileOperations(ProjectFrame frame) {
        this.frame = frame;
    }
    
    public void loadFiles() throws Exception {
        frame.getFilesData().clear();
        JOptionPane.showMessageDialog(frame, "Please select Invoice header file", "Invoice Header", JOptionPane.WARNING_MESSAGE);
        JFileChooser openFile = new JFileChooser();
        int result = openFile.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            File headerFile = openFile.getSelectedFile();
          //  try {
            FileReader headerFr = new FileReader(headerFile);
            BufferedReader headerBr = new BufferedReader(headerFr);
            String headerLine = null;
           
            while ((headerLine = headerBr.readLine()) != null) {
                String[] headerSegments = headerLine.split(",");
                String invNumStr = headerSegments[0];
                String invDateStr = headerSegments[1]; // "22-11-2020"
                String custName = headerSegments[2];
               
                int invNum = Integer.parseInt(invNumStr);
                Date invDate = df.parse(invDateStr);
               
                InvoiceHeader inv = new InvoiceHeader(invNum, custName, invDate);
                frame.getFilesData().add(inv); 
            }
            headerBr.close();
            headerFr.close();
            System.out.println("check");
            JOptionPane.showMessageDialog(frame, "Please select Invoice lines file", "Invoice Lines", JOptionPane.WARNING_MESSAGE);
            result = openFile.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File linesFile = openFile.getSelectedFile();
                BufferedReader linesBr = new BufferedReader(new FileReader(linesFile));
                /*headerFr = new FileReader(linesFile);
                headerBr = new BufferedReader(headerFr);*/
                String linesLine = null;
                while ((linesLine = linesBr.readLine()) != null) {
                    String[] lineSegments = linesLine.split(",");
                    String invNumStr = lineSegments[0];
                    String item = lineSegments[1];
                    String priceStr = lineSegments[2];
                    String countStr = lineSegments[3];
                    
                    int invNum = Integer.parseInt(invNumStr);
                    double price = Double.parseDouble(priceStr);
                    int count = Integer.parseInt(countStr);
                    InvoiceHeader header = findByNum(invNum);
                    InvoiceLine invLine = new InvoiceLine(item, price, count, header);
                    header.addLine(invLine);
                }
                headerBr.close();
                headerFr.close();
                frame.setHeaderTableModel(new InvHeaderModel(frame.getFilesData()));
                frame.getHeaderTable().setModel(frame.getHeaderTableModel());
                frame.getHeaderTable().validate();
                
            }
        }
        
        for(int i=0;i<frame.getFilesData().size();i++)
                {
                    System.out.println("Invoice Number "+frame.getFilesData().get(i).getInvNum());
                    System.out.println("{");
                    System.out.println(frame.getFilesData().get(i).getInvDate()+", "+frame.getFilesData().get(i).getCusName());
                    for(int j=0;j<frame.getFilesData().get(i).getLines().size();j++)
                    {
                        System.out.println(frame.getFilesData().get(i).getLines().get(j).getItemName()+", "+
                                frame.getFilesData().get(i).getLines().get(j).getItemPrice()+", "+
                                frame.getFilesData().get(i).getLines().get(j).getItemCount());
                    }
                    System.out.println("}");
                } 
    }
    
   
 
    public void saveData()  {
        JFileChooser chooser = new JFileChooser();
        int state = chooser.showSaveDialog(null);
        File file = chooser.getSelectedFile();
        if (file != null && state == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
                PrintWriter fileWriter = new PrintWriter(bufferedWriter);

                for (int i = 0; i < frame.getHeaderTable().getRowCount(); ++i) {
                    for (int j = 0; j < frame.getHeaderTable().getColumnCount(); ++j) {
                        String s = frame.getHeaderTable().getValueAt(i, j).toString();
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

                for (int i = 0; i < frame.getLineTable().getRowCount(); ++i) {
                    for (int j = 0; j < frame.getLineTable().getColumnCount(); ++j) {
                        String s = frame.getLineTable().getValueAt(i, j).toString();
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
        
        for(int i=0;i<frame.getFilesData().size();i++)
                {
                    System.out.println("Invoice Number "+frame.getFilesData().get(i).getInvNum());
                    System.out.println("{");
                    System.out.println(frame.getFilesData().get(i).getInvDate()+", "+frame.getFilesData().get(i).getCusName());
                    for(int j=0;j<frame.getFilesData().get(i).getLines().size();j++)
                    {
                        System.out.println(frame.getFilesData().get(i).getLines().get(j).getItemName()+", "+
                                frame.getFilesData().get(i).getLines().get(j).getItemPrice()+", "+
                                frame.getFilesData().get(i).getLines().get(j).getItemCount());
                    }
                    System.out.println("}");
                } 
    }
    
        private InvoiceHeader findByNum(int num) {
        InvoiceHeader header = null;
        for (InvoiceHeader inv : frame.getFilesData()) {
            if (num == inv.getInvNum()) {
                header = inv;
                break;
            }
        }
        return header;
    }
    
    
}
