//this is akll of my imports for this
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//___________________________________________________________
public class App {  
    public static void main(String[] s) {  
        JFrame frame = new JFrame("Souvnir");  
        frame.getContentPane().setBackground(Color.BLUE);
        JPanel panel = new JPanel();  
        panel.setLayout(new BorderLayout());  
        
        JLabel label = new JLabel("Write down your best thoughts :");
        JTextArea noteInput = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(noteInput);
        
        // buttons
    JButton addButton = new JButton("Add");  
      

        // *
        DefaultListModel<String> noteListModel = new DefaultListModel<>();
        JList<String> noteList = new JList<>(noteListModel);
        JScrollPane listScrollPane = new JScrollPane(noteList);
        
        // border for the  buttons to work and stuff
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addButton);
   

        // making every visuable seeable 
        panel.add(label, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);
        panel.add(listScrollPane, BorderLayout.EAST);
        
        // adding the buttons  to the program
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String noteText = noteInput.getText().trim();
                if (!noteText.isEmpty()) {
                    noteListModel.addElement(noteText);
                    noteInput.setText("");
                } else {
                    JOptionPane.showMessageDialog(frame, "Add a note", "Try again", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

 
//program startup (aka window size/height)_________________________________________________________
        frame.add(panel);  
        frame.setSize(400, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}
