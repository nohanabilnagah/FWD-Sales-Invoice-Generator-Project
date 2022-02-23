package project.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Noha_Nabil_Nagah
 */
public class InvLineTableModel extends DefaultTableModel {

    String[] cols = {"Item Name", "Item Price", "Count", "Line Total"};
    ArrayList<InvoiceLine> data;

    public InvLineTableModel(ArrayList<InvoiceLine> data) {
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
        InvoiceLine row = data.get(rowIndex);
        switch (columnIndex) {
          case 0: return row.getItemName();
          case 1: return row.getItemPrice();
          case 2: return row.getCount();
          case 3: return row.getItemTotal();
        }
        return "";
    }

    @Override
        public String getColumnName(int column) {
        System.out.println("col name called");
        return cols[column];
    }

    public ArrayList<InvoiceLine> getData() {
        return data;
    }

    @Override
        public void removeRow(int row) {
        data.remove(row);
    }
    
}
