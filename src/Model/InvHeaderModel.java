package Model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Model.InvoiceHeader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class InvHeaderModel extends DefaultTableModel {

    String[] cols = {"No.", "Invoice Date", "Customer Name", "Total"};
    ArrayList<InvoiceHeader> data;
        private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");


    public InvHeaderModel(ArrayList<InvoiceHeader> data) {
        this.cols = cols;
        this.data = data;
    }

    @Override
    public int getRowCount() {
        if (this.data == null) {
            data = new ArrayList<>();
        }
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceHeader row = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
            return row.getInvNum();
            case 1:
            return row.getCusName();
            case 2:
            return df.format(row.getInvDate());
            case 3:
                return row.getInvTotal();
        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        return cols[column];
    }

    public ArrayList<InvoiceHeader> getData() {
        return data;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    @Override
    public void removeRow(int row) {
        data.remove(row);
    }

}
