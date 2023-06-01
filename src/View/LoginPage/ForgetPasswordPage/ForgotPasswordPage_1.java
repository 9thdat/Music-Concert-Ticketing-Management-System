package View.LoginPage.ForgetPasswordPage;

import Controller.LoginPage.ForgetPasswordPage1Listener;
import Model.BEAN.Employee;
import Model.DAO.Employee.EmployeeDAO;
import Model.DAO.Employee.VerificationCode;
import View.LoginPage.LoginPage;
import org.apache.commons.mail.EmailException;

import javax.mail.MessagingException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

public class ForgotPasswordPage_1 extends JPanel {
    ActionListener ac = new ForgetPasswordPage1Listener(this);

    String userName;
    public ForgotPasswordPage_1() {
        initComponents();
        NextJbt.addActionListener(ac);
        BackJbt.addActionListener(ac);
    }

    public ForgotPasswordPage_1(String userName) {
        initComponents();
        NextJbt.addActionListener(ac);
        BackJbt.addActionListener(ac);
        this.userName = userName;
        userNameField.setText(userName);
    }

    public JDialog getForgotPasswordPage_1JDialog() {
        return ForgotPasswordPage_1JDialog;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Dat
        ForgotPasswordPage_1JDialog = new JDialog();
        label2 = new JLabel();
        label4 = new JLabel();
        userNameField = new JTextField();
        label5 = new JLabel();
        NextJbt = new JButton();
        BackJbt = new JButton();

        //======== ForgotPasswordPage_1JDialog ========
        {
            ForgotPasswordPage_1JDialog.setTitle("MuzikTic - Concert Music Ticketing");
            ForgotPasswordPage_1JDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            var ForgotPasswordPage_1JDialogContentPane = ForgotPasswordPage_1JDialog.getContentPane();

            //---- label2 ----
            label2.setText("FORGOT PASSWORD");
            label2.setFont(new Font("Fredoka One", Font.BOLD, 24));
            label2.setForeground(new Color(0xa8cf45));

            //---- label4 ----
            label4.setText("Username");
            label4.setFont(new Font("Segoe UI", Font.BOLD, 16));

            //---- label5 ----
            label5.setText("Enter the username you want to reset password");
            label5.setFont(new Font("Segoe UI", Font.PLAIN, 14));

            //---- NextJbt ----
            NextJbt.setText("NEXT");

            //---- BackJbt ----
            BackJbt.setText("BACK");

            GroupLayout ForgotPasswordPage_1JDialogContentPaneLayout = new GroupLayout(ForgotPasswordPage_1JDialogContentPane);
            ForgotPasswordPage_1JDialogContentPane.setLayout(ForgotPasswordPage_1JDialogContentPaneLayout);
            ForgotPasswordPage_1JDialogContentPaneLayout.setHorizontalGroup(
                ForgotPasswordPage_1JDialogContentPaneLayout.createParallelGroup()
                    .addGroup(ForgotPasswordPage_1JDialogContentPaneLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(ForgotPasswordPage_1JDialogContentPaneLayout.createParallelGroup()
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 308, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4)
                            .addGroup(ForgotPasswordPage_1JDialogContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(BackJbt)
                                .addComponent(userNameField, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(274, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, ForgotPasswordPage_1JDialogContentPaneLayout.createSequentialGroup()
                        .addContainerGap(218, Short.MAX_VALUE)
                        .addGroup(ForgotPasswordPage_1JDialogContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(NextJbt)
                            .addComponent(label2))
                        .addGap(216, 216, 216))
            );
            ForgotPasswordPage_1JDialogContentPaneLayout.setVerticalGroup(
                ForgotPasswordPage_1JDialogContentPaneLayout.createParallelGroup()
                    .addGroup(ForgotPasswordPage_1JDialogContentPaneLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(label2)
                        .addGap(18, 18, 18)
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userNameField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(ForgotPasswordPage_1JDialogContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(NextJbt)
                            .addComponent(BackJbt))
                        .addGap(55, 55, 55))
            );
            ForgotPasswordPage_1JDialog.pack();
            ForgotPasswordPage_1JDialog.setLocationRelativeTo(ForgotPasswordPage_1JDialog.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Dat
    private JDialog ForgotPasswordPage_1JDialog;
    private JLabel label2;
    private JLabel label4;
    private JTextField userNameField;
    private JLabel label5;
    private JButton NextJbt;
    private JButton BackJbt;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public void goToNextPage() throws MessagingException, EmailException {
        userName = userNameField.getText();
        Employee realuser = EmployeeDAO.getInstance().selectUserandPassByID(userName);

        if (realuser == null) {
            JOptionPane.showMessageDialog(null, "Username is not exist");
        } else {
            List<String> realUserName = EmployeeDAO.getListUsername();
            boolean checkUserName = false;
            for (String s : realUserName) {
                if (s.equals(userName)) {
                    checkUserName = true;
                    break;
                }
            }
            if (!checkUserName) {
                JOptionPane.showMessageDialog(null, "Username is not exist");
            }
            else {
                String email = EmployeeDAO.getEmailByUsername(userName);
                System.out.println("email: " + email);
                int verificationCode = VerificationCode.createVerificationCode();
                System.out.println("verificationCode: " + verificationCode);

                ForgotPasswordPage_2 forgotPasswordPage_2 = new ForgotPasswordPage_2(verificationCode, userName, email);
                forgotPasswordPage_2.getForgotPasswordPage_2JDialog().setVisible(true);
                ForgotPasswordPage_1JDialog.dispose();
            }
        }

    }

    public void backToPreviousPage() {
        LoginPage loginPage = new LoginPage();
        loginPage.getLoginPageDialog().setVisible(true);
        ForgotPasswordPage_1JDialog.dispose();
    }
}
