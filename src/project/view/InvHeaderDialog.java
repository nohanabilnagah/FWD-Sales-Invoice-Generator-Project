
package project.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Noha_Nabil_Nagah
 */
public class InvHeaderDialog extends JDialog {

    private JLabel custNameLabel;
    private JLabel invDataLabel;
    private JTextField custNameField;
    private JTextField invDateField;
    
    private JButton insertBtn;
    private JButton cancelBtn;

    public InvHeaderDialog(ProjectFrame pf) {
        super.setTitle("Create New Invoice");
        
        custNameLabel = new JLabel("Customer Name: ");
        invDataLabel = new JLabel("Invoice Date: ");
        custNameField = new JTextField (15);
        invDateField = new JTextField (15);
        
        insertBtn = new JButton("OK");
        cancelBtn = new JButton ("Cancel");
     
        insertBtn.setActionCommand("creatInvOK");
        cancelBtn.setActionCommand("creatInvCancel");

        insertBtn.addActionListener(pf);
        cancelBtn.addActionListener(pf);

        setLayout(new GridLayout(3, 2));
        
        add(custNameLabel);
        add(invDataLabel);
        add(custNameField);
        add(invDateField);
        add(insertBtn);
        add(cancelBtn);
        
        setLocation(200,200);
        pack();
        setVisible(true);
    }
    

    public JTextField getCusNameField() {
        return custNameField;
    }

    public JTextField getInvDateField() {
        return invDateField;
    }
    
}
