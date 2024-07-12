import java.awt.Choice;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
    JButton login, cancel, signup;

    Login() {
        super("Login Page");// super must be first statement inside constructor
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(300, 20, 100, 20);// wrt frame not screen
        add(lblusername);

        JTextField username = new JTextField();
        username.setBounds(400, 20, 150, 20);
        add(username);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(300, 60, 100, 20);// wrt frame not screen
        add(lblpassword);

        JTextField password = new JTextField();
        password.setBounds(400, 60, 150, 20);
        add(password);

        JLabel logginginas = new JLabel("Logging in as");
        logginginas.setBounds(300, 100, 100, 20);// wrt frame not screen
        add(logginginas);

        // dropdown can be made using choice which is awt as well as jcombobox in swing
        Choice loggingin = new Choice();
        loggingin.add("Admin");
        loggingin.add("Customer");
        loggingin.setBounds(400, 100, 150, 20);
        add(loggingin);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon\\login.png"));
        Image i2 = i1.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        login = new JButton("Login", new ImageIcon(i2));
        login.setBounds(330, 160, 100, 20);
        login.addActionListener(this);
        add(login);

        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icon\\cancel.jpg"));
        Image i4 = i3.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        cancel = new JButton("Cancel", new ImageIcon(i4));
        cancel.setBounds(450, 160, 100, 20);
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("icon\\signup.png"));
        Image i6 = i5.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);

        signup = new JButton("Sign Up", new ImageIcon(i6));
        signup.setBounds(380, 200, 100, 20);
        signup.addActionListener(this);
        add(signup);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icon\\second.jpg"));
        Image i8 = i7.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image = new JLabel(i9);
        image.setBounds(0, 0, 250, 250);
        add(image);

        setSize(640, 300);
        setLocation(400, 200);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {

        } else if (ae.getSource() == cancel) {
            setVisible(false);

        } else if (ae.getSource() == signup) {
            setVisible(false);
            new Signup();

        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
