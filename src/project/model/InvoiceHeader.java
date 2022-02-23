package project.model;

import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {

    private int invNum;
    private Date invDate;
    private String cusName;
    private double invTotal;
    private ArrayList<InvoiceLine> lines;

    public InvoiceHeader(int invNum, Date invDate, String cusName) {
        this.invNum = invNum;
        this.invDate = invDate;
        this.cusName = cusName;
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

    public double getInvTotal() {
        return invTotal;
    }

    public void setInvTotal(double invTotal) {
        this.invTotal = invTotal;
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
    
    public void addLine(InvoiceLine line) {
        getLines().add(line);
        setInvTotal(getInvTotal() + line.getItemTotal());
    }

    
}