package view;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class loginScreen extends JFrame {
//atributos -------------------------------------------------------

    public JPanel mainPanel;
    public JTextField usernameTextField;
    public JButton loginButton;
    public JLabel userNameLabel;
    public JLabel passWordLabel;
    public JLabel forgotLabel;
    private JPasswordField passwordField;
    public JTextField ForgottextField;

//construtores ------------------------------------------------------------------

    public loginScreen() {

        setContentPane(mainPanel);
        setTitle("Login");
        setVisible(true);
        setSize(260, 170);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        loginButton.addActionListener(this::loginMessage);
    }

//metodos --------------------------------------------------------------------

    public boolean loginProcess (String login, char[] password) {
        String passText = String.valueOf(password);
        return login.equals("Admin") && passText.equals("admin");
    }

    public void loginMessage (ActionEvent actionEvent) {
        if (loginProcess(usernameTextField.getText(), passwordField.getPassword())) {
            JOptionPane.showMessageDialog(loginButton, "Bem vindo, " + usernameTextField.getText());
        } else {
            JOptionPane.showMessageDialog(loginButton, "Acesso negado!");
        }
    }

}
