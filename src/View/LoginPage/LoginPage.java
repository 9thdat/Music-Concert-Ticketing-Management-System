package View.LoginPage;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

import Controller.LoginPage.LoginPageListener;
import Model.DAO.Employee.EmployeeDAO;
import Model.BEAN.Employee;
import View.LoginPage.ForgetPasswordPage.ForgotPasswordPage_1;
import View.MainPage.MainPage;

public class LoginPage extends JPanel {
    ActionListener ac = new LoginPageListener(this);

    private static int loginAttempt = 0;

    String loginStatus = "Login Failed";
    public LoginPage() {
        initComponents();
        initMoreComponents();
    }

    public void initMoreComponents() {
        this.getLoginButton().addActionListener(ac);
        getLoginButton().addKeyListener(new LoginPageListener(this));
        getUsernameField().addKeyListener(new LoginPageListener(this));
        getPasswordField().addKeyListener(new LoginPageListener(this));
        getForgetPasswordJbt().addActionListener(ac);
    }

    public JButton getLoginButton() {
        return LoginButton;
    }

    public JTextField getUsernameField() {
        return UsernameField;
    }

    public JPasswordField getPasswordField() {
        return PasswordField;
    }

    public JButton getForgetPasswordJbt() {
        return ForgetPasswordJbt;
    }

    public static JDialog getLoginPageDialog() {
        return LoginPageDialog;
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Dat
        LoginPageDialog = new JDialog();
        LoginPagePanel = new JPanel();
        PasswordField = new JPasswordField();
        UsernameField = new JTextField();
        LoginButton = new JButton();
        Password = new JLabel();
        Username = new JLabel();
        LoginStatus = new JLabel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        ForgetPasswordJbt = new JButton();

        //======== LoginPageDialog ========
        {
            LoginPageDialog.setTitle("MuzikTic - Concert Music Ticketing");
            LoginPageDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            LoginPageDialog.setVisible(true);
            var LoginPageDialogContentPane = LoginPageDialog.getContentPane();

            //======== LoginPagePanel ========
            {
                LoginPagePanel.setBackground(Color.white);
                LoginPagePanel.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
                EmptyBorder(0,0,0,0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e",javax.swing.border.TitledBorder.CENTER,javax.swing
                .border.TitledBorder.BOTTOM,new java.awt.Font("D\u0069al\u006fg",java.awt.Font.BOLD,12),
                java.awt.Color.red),LoginPagePanel. getBorder()));LoginPagePanel. addPropertyChangeListener(new java.beans.PropertyChangeListener()
                {@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062or\u0064er".equals(e.getPropertyName()))
                throw new RuntimeException();}});

                //---- PasswordField ----
                PasswordField.setBorder(new LineBorder(new Color(0x61b884)));

                //---- UsernameField ----
                UsernameField.setCaretColor(new Color(0x61b884));
                UsernameField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                UsernameField.setFont(new Font("Lato Black", Font.PLAIN, 14));
                UsernameField.setForeground(new Color(0x003333));
                UsernameField.setDisabledTextColor(new Color(0xccffcc));
                UsernameField.setBackground(Color.white);
                UsernameField.setBorder(new LineBorder(new Color(0x61b884)));

                //---- LoginButton ----
                LoginButton.setText("LOGIN");
                LoginButton.setFont(new Font("Lato Black", Font.BOLD, 14));
                LoginButton.setForeground(Color.white);
                LoginButton.setBackground(new Color(0x61b884));

                //---- Password ----
                Password.setText(" Password");
                Password.setFont(new Font("Lato Black", Font.BOLD, 15));
                Password.setForeground(new Color(0x61b884));

                //---- Username ----
                Username.setText(" Username");
                Username.setFont(new Font("Lato Black", Font.BOLD, 15));
                Username.setForeground(new Color(0x61b884));

                //---- LoginStatus ----
                LoginStatus.setFont(new Font("Lato Black", Font.BOLD, 14));
                LoginStatus.setForeground(new Color(0xd45c5c));

                //---- label1 ----
                label1.setIcon(new ImageIcon(getClass().getResource("/Asset/music logo design - no name.png")));
                label1.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label2 ----
                label2.setText("MUZIKTIC");
                label2.setFont(new Font("Fredoka One", Font.BOLD, 24));
                label2.setForeground(new Color(0xa8cf45));

                //---- label3 ----
                label3.setText("MUSIC CONCERT TICKETING");
                label3.setFont(new Font("Fredoka One", Font.BOLD, 18));
                label3.setForeground(new Color(0x0098da));

                //---- ForgetPasswordJbt ----
                ForgetPasswordJbt.setText("Forgot Password?");
                ForgetPasswordJbt.setForeground(Color.red);
                ForgetPasswordJbt.setBorder(LineBorder.createBlackLineBorder());

                GroupLayout LoginPagePanelLayout = new GroupLayout(LoginPagePanel);
                LoginPagePanel.setLayout(LoginPagePanelLayout);
                LoginPagePanelLayout.setHorizontalGroup(
                    LoginPagePanelLayout.createParallelGroup()
                        .addGroup(LoginPagePanelLayout.createSequentialGroup()
                            .addContainerGap(90, Short.MAX_VALUE)
                            .addGroup(LoginPagePanelLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, LoginPagePanelLayout.createSequentialGroup()
                                    .addComponent(LoginButton)
                                    .addGap(244, 244, 244))
                                .addGroup(GroupLayout.Alignment.TRAILING, LoginPagePanelLayout.createSequentialGroup()
                                    .addGroup(LoginPagePanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(LoginPagePanelLayout.createSequentialGroup()
                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                                            .addGap(50, 50, 50))
                                        .addGroup(LoginPagePanelLayout.createSequentialGroup()
                                            .addComponent(label2)
                                            .addGap(71, 71, 71))
                                        .addComponent(label3)
                                        .addGroup(LoginPagePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addGroup(LoginPagePanelLayout.createSequentialGroup()
                                                .addComponent(LoginStatus, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ForgetPasswordJbt))
                                            .addComponent(PasswordField)
                                            .addComponent(Password, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(UsernameField)
                                            .addComponent(Username, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(150, 150, 150))))
                );
                LoginPagePanelLayout.setVerticalGroup(
                    LoginPagePanelLayout.createParallelGroup()
                        .addGroup(LoginPagePanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label3)
                            .addGap(26, 26, 26)
                            .addComponent(Username, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(UsernameField, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Password)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(PasswordField, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(LoginPagePanelLayout.createParallelGroup()
                                .addGroup(LoginPagePanelLayout.createSequentialGroup()
                                    .addComponent(LoginStatus, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(LoginButton))
                                .addComponent(ForgetPasswordJbt))
                            .addGap(16, 16, 16))
                );
            }

            GroupLayout LoginPageDialogContentPaneLayout = new GroupLayout(LoginPageDialogContentPane);
            LoginPageDialogContentPane.setLayout(LoginPageDialogContentPaneLayout);
            LoginPageDialogContentPaneLayout.setHorizontalGroup(
                LoginPageDialogContentPaneLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, LoginPageDialogContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LoginPagePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
            LoginPageDialogContentPaneLayout.setVerticalGroup(
                LoginPageDialogContentPaneLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, LoginPageDialogContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LoginPagePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
            LoginPageDialog.pack();
            LoginPageDialog.setLocationRelativeTo(LoginPageDialog.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Dat
    public static JDialog LoginPageDialog;
    public JPanel LoginPagePanel;
    public JPasswordField PasswordField;
    public JTextField UsernameField;
    public JButton LoginButton;
    public JLabel Password;
    public JLabel Username;
    public JLabel LoginStatus;
    public JLabel label1;
    public JLabel label2;
    public JLabel label3;
    public JButton ForgetPasswordJbt;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    //Logo

    public void DoLogin(){
        String username = this.UsernameField.getText();
        String password = this.PasswordField.getText();

        Employee realuser = EmployeeDAO.getInstance().selectUserandPassByID(username);

        if (loginAttempt >= 3) {
            loginStatus = "Forgot your password? Click Forgot Password to reset the password";
        }

        if (realuser == null) {
            this.LoginStatus.setText(loginStatus);
            this.LoginStatus.setForeground(Color.decode("EB1212"));
            loginAttempt++;
        }
        else {
            String realUsername = realuser.getUsername();
            String realPassword = realuser.getPassword();

            if (username.equals(realUsername) && password.equals(realPassword)) {
                this.LoginStatus.setForeground(Color.GREEN);
                this.LoginPageDialog.dispose();
                MainPage mainMenu = new MainPage(username);
                mainMenu.setVisible(true);
            }
            else {
                    this.LoginStatus.setText(loginStatus);
                    this.LoginStatus.setForeground(Color.decode("EB1212"));
                    loginAttempt++;
                }

            }
        }

    public void SwitchToForgotPasswordPage() {
        System.out.println("Switching to Forgot Password Page");
        ForgotPasswordPage_1 forgotPasswordPage1 = new ForgotPasswordPage_1();
        forgotPasswordPage1.getForgotPasswordPage_1JDialog().setVisible(true);
        this.LoginPageDialog.dispose();
    }
}
