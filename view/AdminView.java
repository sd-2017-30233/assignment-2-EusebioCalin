package view;

import controller.BookController;
import controller.UserController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Calin on 08.04.2017.
 */
public class AdminView {
    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_12;
    private JTextField textField_13;
    private JTextField textField_14;
    private JTextField textField_15;
    public AdminView()
    {
        frame = new JFrame();
        frame.setBounds(100, 100, 900, 277);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JLabel lblBook = new JLabel("Book");
        lblBook.setBounds(10, 11, 46, 14);
        panel.add(lblBook);

        JLabel lblTitle = new JLabel("Title");
        lblTitle.setBounds(10, 36, 46, 14);
        panel.add(lblTitle);

        JLabel lblAuthor = new JLabel("Author");
        lblAuthor.setBounds(10, 61, 46, 14);
        panel.add(lblAuthor);

        JLabel lblGenre = new JLabel("Genre");
        lblGenre.setBounds(10, 86, 46, 14);
        panel.add(lblGenre);

        JLabel lblQuantity = new JLabel("Quantity");
        lblQuantity.setBounds(10, 111, 73, 14);
        panel.add(lblQuantity);

        JLabel lblPrice = new JLabel("Price");
        lblPrice.setBounds(10, 136, 46, 14);
        panel.add(lblPrice);

        textField = new JTextField();
        textField.setBounds(82, 33, 86, 20);
        panel.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(82, 58, 86, 20);
        panel.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(82, 83, 86, 20);
        panel.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(82, 108, 86, 20);
        panel.add(textField_3);
        textField_3.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setBounds(82, 133, 86, 20);
        panel.add(textField_4);
        textField_4.setColumns(10);

        JButton btnNewBook = new JButton("New Book");
        btnNewBook.setBounds(79, 164, 115, 23);
        panel.add(btnNewBook);
        btnNewBook.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
            System.out.println("Update Title");
            String title=textField.getText();
            String author=textField_1.getText();
            String genre=textField_2.getText();
            String quantity=textField_3.getText();
            String price=textField_4.getText();

            if (!title.equals("") && !author.equals("") && !genre.equals("") && !quantity.equals("") && !price.equals("")) {
                BookController.addBook(title,author,genre,quantity,price);
                JOptionPane.showMessageDialog(frame,
                        "Carte adaugata!");
            }
            else
            {
                JOptionPane.showMessageDialog(frame,
                        "Completati campurile corespunzator!","Eroare",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    });

        JLabel lblNewTitle = new JLabel("New Title");
        lblNewTitle.setBounds(178, 36, 73, 14);
        panel.add(lblNewTitle);

        JLabel lblNewAuthor = new JLabel("New Author");
        lblNewAuthor.setBounds(178, 61, 73, 14);
        panel.add(lblNewAuthor);

        JLabel lblNewGenre = new JLabel("New Genre");
        lblNewGenre.setBounds(178, 86, 73, 14);
        panel.add(lblNewGenre);

        JLabel lblNewQuantity = new JLabel("New Quant.");
        lblNewQuantity.setBounds(178, 111, 73, 14);
        panel.add(lblNewQuantity);

        JLabel lblNewPrice = new JLabel("New Price");
        lblNewPrice.setBounds(178, 136, 73, 14);
        panel.add(lblNewPrice);

        textField_5 = new JTextField();
        textField_5.setBounds(261, 33, 86, 20);
        panel.add(textField_5);
        textField_5.setColumns(10);

        textField_6 = new JTextField();
        textField_6.setBounds(261, 58, 86, 20);
        panel.add(textField_6);
        textField_6.setColumns(10);

        textField_7 = new JTextField();
        textField_7.setBounds(261, 83, 86, 20);
        panel.add(textField_7);
        textField_7.setColumns(10);

        textField_8 = new JTextField();
        textField_8.setBounds(261, 108, 86, 20);
        panel.add(textField_8);
        textField_8.setColumns(10);

        textField_9 = new JTextField();
        textField_9.setBounds(261, 133, 86, 20);
        panel.add(textField_9);
        textField_9.setColumns(10);

        JButton btnUpdateTitle = new JButton("Update Title");
        btnUpdateTitle.setBounds(357, 32, 122, 23);
        panel.add(btnUpdateTitle);
        btnUpdateTitle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Update Title");
                String oldTitle=textField.getText();
                String newTitle=textField_5.getText();
                //String r=role.getText();
                if (!oldTitle.equals("") && !newTitle.equals("")) {
                    BookController.updateBook("","title",oldTitle,newTitle);
                    JOptionPane.showMessageDialog(frame,
                            "Titlu actualizat!");
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,
                            "Completati campurile corespunzator!","Eroare",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        JButton btnUpdateAuthor = new JButton("Update Author");
        btnUpdateAuthor.setBounds(357, 57, 122, 23);
        panel.add(btnUpdateAuthor);
        btnUpdateAuthor.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
            System.out.println("Update Author");
            String newAuthor=textField_6.getText();
            String oldTitle=textField.getText();
            //String r=role.getText();
            if (!newAuthor.equals("") && !oldTitle.equals("")) {
                BookController.updateBook(oldTitle,"author",null,newAuthor);
                JOptionPane.showMessageDialog(frame,
                        "Autor actualizat!");
            }
            else
            {
                JOptionPane.showMessageDialog(frame,
                        "Completati campurile corespunzator!","Eroare",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    });

        JButton btnUpdateGenre = new JButton("Update Genre");
        btnUpdateGenre.setBounds(357, 82, 122, 23);
        panel.add(btnUpdateGenre);
        btnUpdateGenre.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
            System.out.println("Update Genre");
            //String oldGenre=textField_2.getText();
            String newGenre=textField_7.getText();
            String title=textField.getText();
            //String r=role.getText();
            if (!newGenre.equals("") && !title.equals("")) {
                BookController.updateBook(title,"genre",null,newGenre);
                JOptionPane.showMessageDialog(frame,
                        "Gen actualizat!");
            }
            else
            {
                JOptionPane.showMessageDialog(frame,
                        "Completati campurile corespunzator!","Eroare",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    });

        JButton btnUpdateQuantity = new JButton("Update Quant.");
        btnUpdateQuantity.setBounds(357, 107, 122, 23);
        panel.add(btnUpdateQuantity);
        btnUpdateQuantity.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Update Quantity");
               // String oldQ=textField_3.getText();
                String newQ=textField_8.getText();
                String title=textField.getText();
                //String r=role.getText();
                if ( !newQ.equals("") && !title.equals("")) {
                    BookController.updateBook(title,"quantity",null,newQ);
                    JOptionPane.showMessageDialog(frame,
                            "Cantitate actualizata!");
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,
                            "Completati campurile corespunzator!","Eroare",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        JButton btnUpdatePrice = new JButton("Update Price");
        btnUpdatePrice.setBounds(357, 132, 122, 23);
        panel.add(btnUpdatePrice);
        btnUpdatePrice.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
            System.out.println("Update Author");
            //String oldPrice=textField_1.getText();
            String newPrice=textField_6.getText();
            String title=textField.getText();
            //String r=role.getText();
            if (!newPrice.equals("") && !title.equals("")) {
                BookController.updateBook(title,"price",null,newPrice);
                JOptionPane.showMessageDialog(frame,
                        "Pret actualizat!");
            }
            else
            {
                JOptionPane.showMessageDialog(frame,
                        "Completati campurile corespunzator!","Eroare",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    });

        JButton btnDeleteBook = new JButton("Delete Book");
        btnDeleteBook.setBounds(79, 189, 115, 23);
        panel.add(btnDeleteBook);
        btnDeleteBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //System.out.println("View Client");
                String title=textField.getText();
                //String r=role.getText();
                if (!title.equals("")) {
                    BookController.deleteBook(title);
                    JOptionPane.showMessageDialog(frame,
                            "Carte stearsa!");
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,
                            "Completati campurile corespunzator!","Eroare",
                            JOptionPane.WARNING_MESSAGE);
                }

            }
        });

        JButton btnListBooks = new JButton("List Books");
        btnListBooks.setBounds(357, 164, 122, 23);
        panel.add(btnListBooks);
        btnListBooks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //System.out.println("View Client");
                JTable table =new JTable(BookController.listAllBooks());
                JOptionPane.showMessageDialog(null, new JScrollPane(table));
            }
        });

        JLabel lblUser = new JLabel("User");
        lblUser.setBounds(514, 11, 46, 14);
        panel.add(lblUser);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(514, 36, 66, 14);
        panel.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(514, 61, 66, 14);
        panel.add(lblPassword);

        JLabel lblType = new JLabel("Type");
        lblType.setBounds(514, 86, 46, 14);
        panel.add(lblType);

        textField_10 = new JTextField();
        textField_10.setBounds(603, 33, 86, 20);
        panel.add(textField_10);
        textField_10.setColumns(10);

        textField_11 = new JTextField();
        textField_11.setBounds(603, 58, 86, 20);
        panel.add(textField_11);
        textField_11.setColumns(10);

        textField_12 = new JTextField();
        textField_12.setBounds(603, 83, 86, 20);
        panel.add(textField_12);
        textField_12.setColumns(10);

        JLabel lblNewUsername = new JLabel("New Username");
        lblNewUsername.setBounds(514, 111, 96, 14);
        panel.add(lblNewUsername);

        textField_13 = new JTextField();
        textField_13.setBounds(603, 108, 86, 20);
        panel.add(textField_13);
        textField_13.setColumns(10);

        JLabel lblNewPassword = new JLabel("New Password");
        lblNewPassword.setBounds(514, 136, 86, 14);
        panel.add(lblNewPassword);

        textField_14 = new JTextField();
        textField_14.setBounds(603, 133, 86, 20);
        panel.add(textField_14);
        textField_14.setColumns(10);

        JLabel lblNewType = new JLabel("New Type");
        lblNewType.setBounds(514, 161, 66, 14);
        panel.add(lblNewType);

        textField_15 = new JTextField();
        textField_15.setBounds(603, 158, 86, 20);
        panel.add(textField_15);
        textField_15.setColumns(10);

        JButton btnNewUser = new JButton("New User");
        btnNewUser.setBounds(699, 32, 106, 23);
        panel.add(btnNewUser);
        btnNewUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                //10 11 12
                String username = textField_10.getText();
                String password = textField_11.getText();
                String type = textField_12.getText();
                if (!username.equals("") && !password.equals("") && !type.equals("")) {
                    UserController.addUser(username,password,type);
                    JOptionPane.showMessageDialog(frame,
                            "User nou adaugat cu succes!");
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,
                            "Completati campurile corespunzator!","Eroare",
                            JOptionPane.WARNING_MESSAGE);
                }
                //JTable table =new JTable(UserController.listAllUsers());
                System.out.println("New User");
               // JOptionPane.showMessageDialog(null, new JScrollPane(table));
            }
        });

        JButton btnUpdateUser = new JButton("Update User");
        btnUpdateUser.setBounds(699, 57, 106, 23);
        panel.add(btnUpdateUser);
        btnUpdateUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String username = textField_10.getText();
                String newUser = textField_13.getText();
                String newPass=  textField_14.getText();
                String newType = textField_15.getText();
                if (!username.equals("") && !newUser.equals("") && !newPass.equals("") && !newType.equals("")) {
                    UserController.updateUser(username,newUser,newPass,newType);
                    JOptionPane.showMessageDialog(frame,
                            "User actualizat!");
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,
                            "Completati campurile corespunzator!","Eroare",
                            JOptionPane.WARNING_MESSAGE);
                }
                //JTable table =new JTable(UserController.listAllUsers());
                System.out.println("New User");
                // JOptionPane.showMessageDialog(null, new JScrollPane(table));
            }
        });

        JButton btnDeleteUser = new JButton("Delete User");
        btnDeleteUser.setBounds(699, 82, 106, 23);
        panel.add(btnDeleteUser);
        btnDeleteUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Delete User");
                String username = textField_10.getText();

                if (!username.equals("")) {
                    UserController.deleteUser(username);
                    JOptionPane.showMessageDialog(frame,
                            "User sters!");
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,
                            "Completati campurile corespunzator!","Eroare",
                            JOptionPane.WARNING_MESSAGE);
                }
                //JTable table =new JTable(UserController.listAllUsers());
                System.out.println("New User");
                // JOptionPane.showMessageDialog(null, new JScrollPane(table));
            }
        });

        JButton btnListUsers = new JButton("List Users");
        btnListUsers.setBounds(699, 107, 106, 23);
        panel.add(btnListUsers);

        JButton btnPDF = new JButton("PDF");
        btnPDF.setBounds(699, 132, 106, 23);
        panel.add(btnPDF);
        btnPDF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //System.out.println("View Client");
                BookController.generateReport("PDF");
                JOptionPane.showMessageDialog(frame,
                        "Raport Creat!");
            }
        });

        JButton btnCSV = new JButton("CSV");
        btnCSV.setBounds(699, 155, 106, 23);
        panel.add(btnCSV);
        btnCSV.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //System.out.println("View Client");
                BookController.generateReport("CSV");
                JOptionPane.showMessageDialog(frame,
                        "Raport Creat!");
            }
        });

        frame.setVisible(true);
        btnListUsers.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //System.out.println("View Client");

                JTable table =new JTable(UserController.listAllUsers());
                JOptionPane.showMessageDialog(null, new JScrollPane(table));
            }
        });
    }
//public static void main(String[] args)
//    {
//        AdminView ad = new AdminView();
//    }

}
