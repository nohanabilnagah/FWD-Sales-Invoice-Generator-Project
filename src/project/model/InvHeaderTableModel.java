package project.model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class InvHeaderTableModel extends DefaultTableModel {

    String[] cols = {"No.", "Invoice Date", "Customer Name", "Total"};
    ArrayList<InvoiceHeader> data;

    public InvHeaderTableModel(ArrayList<InvoiceHeader> data) {
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
                return row.getInvDate();
            case 2:
                return row.getCusName();
            case 3:
                return row.getInvTotal();
        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        System.out.println("col name called");
        return cols[column];
    }

    public ArrayList<InvoiceHeader> getData() {
        return data;
    }

    @Override
    public void removeRow(int row) {
        data.remove(row);
    }

}
