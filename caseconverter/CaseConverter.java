import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Class CaseConverter - A simple applet that takes input from a text field 
 * and converts to upper or lower case in response to user button selection. 
 * Works well with a width of 300 and height of 120.
 *  
 * Aug 2004: Updated from Applet to JApplet (mik)
 *
 * @author Bruce Quig 
 * @author Michael Kolling
 * 
 * @version 2004-08-04
 * 
 * March 2017: Updated to run as standalone Swing app.
 *
 * @version 2017-03-18
 */
public class CaseConverter extends JFrame implements ActionListener
{
    private JTextField inputField;
    private final String UPPERCASE = "UPPERCASE";
    private final String LOWERCASE = "lowercase";
    private final String CLEAR = "Clear";
    
    public static void main(String[] args)
    {
        CaseConverter frame = new CaseConverter();
        frame.init();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void init()
    {
        // GUI elements are added to the applet's content pane, so get it for us.
        Container contentPane = getContentPane();
        
        // set a layout with some spacing
        contentPane.setLayout(new BorderLayout(12,12));
        
        // add the title label
        JLabel title = new JLabel("Case Converter - A BlueJ demo app");
        contentPane.add(title, BorderLayout.NORTH);
       
        // create the center part with prompt and text field and add it
        JPanel centerPanel = new JPanel();
        JLabel prompt = new JLabel("Enter a string:");
        centerPanel.add(prompt);
        inputField = new JTextField(16);
        centerPanel.add(inputField);
        
        contentPane.add(centerPanel, BorderLayout.CENTER);

        // make a panel for the buttons
        JPanel buttonPanel = new JPanel();
        
        // add the buttons to the button panel
        JButton uppercase = new JButton(UPPERCASE);
        uppercase.addActionListener(this);
        buttonPanel.add(uppercase);
        
        JButton lowercase = new JButton(LOWERCASE);
        lowercase.addActionListener(this); 
        buttonPanel.add(lowercase);
        
        JButton clear = new JButton(CLEAR);
        clear.addActionListener(this);
        buttonPanel.add(clear);
        
        // add the buttons panel to the content pane
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
    }

    /**
     * ActionListener Interface method.
     * Called when action events occur with registered components that
     * can fire action events.
     * @param  ae   the ActionEvent object created by the event
     */
    public void actionPerformed(ActionEvent evt)
    {
        String command = evt.getActionCommand();
        // if clear button pressed
        if(CLEAR.equals(command))
            inputField.setText("");
        // uppercase button pressed
        else if(UPPERCASE.equals(command))
            inputField.setText(inputField.getText().toUpperCase());
        // lowercase button pressed
        else if(LOWERCASE.equals(command)) {
            inputField.setText(inputField.getText().toLowerCase());
        }
    }
    
}
