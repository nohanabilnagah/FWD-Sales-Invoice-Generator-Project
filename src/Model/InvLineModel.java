package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import Model.InvoiceLine;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author Noha_Nabil_Nagah
 */
public class InvLineModel extends DefaultTableModel {

    private ArrayList<InvoiceLine> invoiceLines;
    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    String[] cols = {"Item Name", "Item Price", "Count", "Line Total"};
    

    public InvLineModel(ArrayList<InvoiceLine> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }

        public ArrayList<InvoiceLine> getInvoiceLines() {
        return invoiceLines;
    }
    
    @Override
    public int getRowCount() {
        if (this.invoiceLines == null) {
            invoiceLines = new ArrayList<>();
        }
        return invoiceLines.size();
    }

        @Override
        public int getColumnCount() {
        return cols.length;
    }

        
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
        
        
    @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceLine row = invoiceLines.get(rowIndex);
        
        switch (columnIndex) {
          case 0: return row.getItemName();
          case 1: return row.getItemPrice();
          case 2: return row.getItemCount();
          case 3: return row.getItemTotal();
        default:
                return "";
        } 
    }

    @Override
        public String getColumnName(int column) {
       // System.out.println("col name called");
        return cols[column];
    }


    @Override
        public void removeRow(int row) {
        invoiceLines.remove(row);
    }
    
}
