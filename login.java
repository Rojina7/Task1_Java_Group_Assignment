import javax.swing.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener {

    JLabel usernameLabel, passwordLabel;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;

    public login() {
        setTitle("Hospital Management System Login Page");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 30, 100, 30);
        panel.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(150, 30, 150, 30);
        panel.add(usernameField);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 80, 100, 30);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 80, 150, 30);
        panel.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(150, 140, 100, 30);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Add login validation here, e.g. check username and password against database

        if (username.equals("rojina") && password.equals("smriti")) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            dispose();
            // Open main hospital management system window here
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.");
        }
    }

    public static void main(String[] args) {
        new login();
    }
}
