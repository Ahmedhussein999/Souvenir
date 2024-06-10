//this is akll of my imports for this

public class App {  
    public static void main(String[] s) {  
        JFrame frame = new JFrame("Souvnir");  
        JPanel panel = new JPanel();  
        panel.setLayout(new BorderLayout());  
        
        JLabel label = new JLabel("write your things here :");
        JTextArea noteInput = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(noteInput);
        
        // buttons
    JButton addButton = new JButton("add da Note");  
      

        // IDK even know what this does, but this is what he put down
        DefaultListModel<String> noteListModel = new DefaultListModel<>();
        JList<String> noteList = new JList<>(noteListModel);
        JScrollPane listScrollPane = new JScrollPane(noteList);
        
        // border for the  buttons to work and stuff
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addButton);
   

