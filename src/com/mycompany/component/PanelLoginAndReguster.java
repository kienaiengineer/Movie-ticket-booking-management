
package com.mycompany.component;


import com.mycompany.swing.MyTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

public class PanelLoginAndReguster extends javax.swing.JLayeredPane {


    public PanelLoginAndReguster() {
        initComponents();
        initLogin();
        initRegister();
        login.setVisible(false);
        register.setVisible(true);
    }
    private void initLogin(){

    }
    private void initRegister(){
        register.setLayout(new MigLayout("wrap","push[center]push","push[]25[]10[]10[]push"));
        JLabel label = new JLabel("Create Account");
        label.setFont(new Font("sansserif", 1,30));
        label.setForeground(new Color(7, 164,121));
        register.add(label);
        MyTextField txtUser = new MyTextField();
        txtUser.setPrefixIcon(new ImageIcon("D:\\Project Java\\MovieTicketBookingManagement\\src\\com\\mycompany\\icon\\user.png"));
        txtUser.setHint("Name");
        register.add(txtUser, "w 60%");
        MyTextField txtPassword = new MyTextField();
        txtPassword.setPrefixIcon(new ImageIcon("D:\\Project Java\\MovieTicketBookingManagement\\src\\com\\mycompany\\icon\\pass.png"));
        txtPassword.setHint("Password");
        register.add(txtPassword, "w 60%");
        MyTextField txtConfirmPass = new MyTextField();
        txtConfirmPass.setPrefixIcon(new ImageIcon("D:\\Project Java\\MovieTicketBookingManagement\\src\\com\\mycompany\\icon\\pass.png"));
        txtConfirmPass.setHint("Password");
        register.add(txtConfirmPass, "w 60%");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        register = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(login, "card3");

        register.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    // End of variables declaration//GEN-END:variables
}
