package view;

import controller.UserController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Calin on 08.04.2017.
 */
public class LoginView  implements ActionListener{
    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    JButton btnNewButton;

    public LoginView()
    {
        frame = new JFrame();
        frame.setBounds(100, 100, 278, 170);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 11, 207, 239);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        textField = new JTextField();
        textField.setBounds(10, 11, 86, 20);
        panel.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(10, 42, 86, 20);
        panel.add(textField_1);
        textField_1.setColumns(10);

        btnNewButton = new JButton("Login");
        btnNewButton.setBounds(10, 73, 89, 23);
        panel.add(btnNewButton);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(122, 14, 73, 14);
        panel.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(122, 45, 73, 14);
        panel.add(lblPassword);
        btnNewButton.addActionListener(this);
        btnNewButton.setActionCommand("Open");
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String cmd = e.getActionCommand();

        if (textField.getText().equals("")){
            btnNewButton.setEnabled(false);
        }
        else {
            btnNewButton.setEnabled(true);
        }
        String username=textField.getText();
        String password=textField_1.getText();
        if (username.equals("") || username.equals(""))
        {
            JOptionPane.showMessageDialog(frame,
                    "Completati campurile corespunzator!","Eroare",
                    JOptionPane.WARNING_MESSAGE);
        }
        else {
            String type = UserController.getLoginUser(username, password);
            if (cmd.equals("Open") && btnNewButton.isEnabled())
                if (type.equals("admin")) {
                    frame.dispose();
                    new AdminView();
                } else if (type.equals("user")) {
                    frame.dispose();
                    new UserView();
                } else if (type.equals(""))
                {
                    JOptionPane.showMessageDialog(frame,
                            "User neexistent!","Eroare",
                            JOptionPane.WARNING_MESSAGE);
                }
        }
        btnNewButton.setEnabled(true);
    }
    public static void main(String[] args)
    {
        LoginView login= new LoginView();
    }
}
