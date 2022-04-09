/*
 * To change this license header, choose License Headers in Project Properties.
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
        JFileChooser fc = new JFileChooser();
        int option = fc.showOpenDialog(frame);
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
                frame.getFilesData().add(header);
                
            }
            br.close();
            fr.close();
            System.out.println("check");
            JOptionPane.showMessageDialog(frame, "Please select Invoice lines file", "Invoice Lines", JOptionPane.WARNING_MESSAGE);
            option = fc.showOpenDialog(frame);
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
                }
                br.close();
                fr.close();
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
                                frame.getFilesData().get(i).getLines().get(j).getCount());
                    }
                    System.out.println("}");
                } 
    }
    
    private InvoiceHeader findByNum(int num) {
        for (InvoiceHeader header : frame.getFilesData()) {
            if (header.getInvNum() == num) {
                return header;
            }
        }
        return null;
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
                                frame.getFilesData().get(i).getLines().get(j).getCount());
                    }
                    System.out.println("}");
                } 
    }
}
