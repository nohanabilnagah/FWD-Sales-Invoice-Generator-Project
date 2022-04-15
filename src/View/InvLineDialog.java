
package View;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Noha_Nabil_Nagah
 */
public class InvLineDialog extends JDialog {

    private JLabel itemNameLabel;
    private JLabel itemCountLabel;
    private JLabel itemPriceLabel;

    private JTextField itemNameField;
    private JTextField itemCountField;
    private JTextField itemPriceField;
    
    private JButton insertBtn;
    private JButton cancelBtn;

    public InvLineDialog(ProjectFrame pf) {
        super.setTitle("Insert New Item");
        
        itemNameLabel = new JLabel("Item Name: ");
        itemNameField = new JTextField();

        itemCountLabel = new JLabel("Item Count: ");
        itemCountField = new JTextField();
        
        itemPriceLabel = new JLabel("Item Price: ");
        itemPriceField = new JTextField();

        insertBtn = new JButton("OK");
        cancelBtn = new JButton ("Cancel");
     
        insertBtn.setActionCommand("creatLineOK");
        cancelBtn.setActionCommand("creatLineCancel");

        insertBtn.addActionListener(pf.getMyController());
        cancelBtn.addActionListener(pf.getMyController());

        setLayout(new GridLayout(4, 2));
        
        add(itemNameLabel);
        add(itemNameField);
        add(itemCountLabel);
        add(itemCountField);
        add(itemPriceLabel);
        add(itemPriceField);
        add(insertBtn);
        add(cancelBtn);
 
        setSize(500,200);
        setLocation(300,300);
        setVisible(true);
    }

    public JTextField getItemNameField() {
        return itemNameField;
    }

    public JTextField getItemCountField() {
        return itemCountField;
    }

    public JTextField getItemPriceField() {
        return itemPriceField;
    }
    
}
