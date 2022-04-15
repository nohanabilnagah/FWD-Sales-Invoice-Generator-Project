package Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {

    private int invNum;
    private String cusName;
    private Date invDate;
  //  private double invTotal;
    private ArrayList<InvoiceLine> lines;

    public InvoiceHeader(int invNum, String cusName, Date invDate) {
        this.invNum = invNum;
        this.cusName = cusName;
        this.invDate = invDate;
    }

    public int getInvNum() {
        return invNum;
    }

    public void setInvNum(int invNum) {
        this.invNum = invNum;
    }

    public Date getInvDate() {
        return invDate;
    }

    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

 /*   public double getInvTotal() {
        return invTotal;
    }

    public void setInvTotal(double invTotal) {
        this.invTotal = invTotal;
    }*/
    
  
    @Override
    public String toString() {
        String str = "InvoiceHeader{" + "invNum=" + invNum + ", customerName=" + cusName + ", invDate=" + invDate + '}';
        for (InvoiceLine line : getLines()) {
            str += "\n\t" + line;
        }
        return str;
    }
    

    public ArrayList<InvoiceLine> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }
    
        public double getInvTotal() {
        double total = 0.0;
        for (InvoiceLine line : getLines()) {
            total += line.getLineTotal();
        }
        return total;
    }
    
    public void addLine(InvoiceLine line) {
        getLines().add(line);
   //     setInvTotal(getInvTotal() + line.getItemTotal());
    }
    
        public String getDataAsCSV() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return "" + getInvNum() + "," + df.format(getInvDate()) + "," + getCusName();
    }
}