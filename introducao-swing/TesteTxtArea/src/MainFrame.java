import javax.swing.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JPanel insertsPanel;
    private JPanel textPanel;
    private JTextArea adicionarTextoTextArea;
    private JTextField textField1;
    private JButton adicionarButton;
    private JButton clearButton;

    MainFrame(){
        setContentPane(mainPanel);
        setTitle("Text");
        setVisible(true);
        setSize(800,600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        adicionarButton.addActionListener(this::adicionar);
        clearButton.addActionListener(this::clear);
    }

    private void clear(ActionEvent actionEvent) {
        textField1.setText("");
        adicionarTextoTextArea.setText("");
    }

    private void adicionar(ActionEvent actionEvent) {
        adicionarTextoTextArea.append(textField1.getText() + "\n");
        textField1.setText("");
    }

}
