package Model;

public class InvoiceLine  {
    private String itemName;
    private double itemPrice;
    private int itemCount;
    private double itemTotal;
    private InvoiceHeader invoiceHeader;

    public InvoiceLine(String itemName, double itemPrice, int count, InvoiceHeader invoiceHeader) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCount = count;
        this.invoiceHeader = invoiceHeader;
        this.setItemTotal(this.itemCount * this.itemPrice); 
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(double itemTotal) {
        this.itemTotal = itemTotal;
    }

    public InvoiceHeader getInvoiceHeader() {
        return invoiceHeader;
    }

    public void setInvoiceHeader(InvoiceHeader invoiceHeader) {
        this.invoiceHeader = invoiceHeader;
    }

    
    @Override
    public String toString() {
        return "InvoiceLine{" + "itemName=" + itemName + ", itemprice=" + itemPrice + ", itemCount=" + itemCount + '}';
    }
    
    public double getLineTotal() {
        return itemCount * itemPrice;
    }
    
    public String getDataAsCSV() {
        return "" + getInvoiceHeader().getInvNum() + "," + getItemName() + "," + getItemPrice() + "," + getItemCount();
    }
}

