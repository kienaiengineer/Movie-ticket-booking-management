
package com.mycompany.component;

import com.mycompany.event.EventMenuSelected;
import com.mycompany.model.Model_MenuAdmin;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

public class MenuAdmin extends javax.swing.JPanel {
    
    private EventMenuSelected event;
    public void addEventMenuSelected(EventMenuSelected event){
        this.event = event;
        listMenuAdmin1.addEventMenuSelected(event);
    }
    public MenuAdmin() {
        initComponents();
        setOpaque(false);
        listMenuAdmin1.setOpaque(false);
        init();
    }
    
    private void init(){
        listMenuAdmin1.additem(new Model_MenuAdmin("", " ", Model_MenuAdmin.MenuType.TITLE));
        listMenuAdmin1.additem(new Model_MenuAdmin("1", "Dashboard", Model_MenuAdmin.MenuType.MENU));
        listMenuAdmin1.additem(new Model_MenuAdmin("2", "Add movies", Model_MenuAdmin.MenuType.MENU));
        listMenuAdmin1.additem(new Model_MenuAdmin("3", "Available movies", Model_MenuAdmin.MenuType.MENU));
        listMenuAdmin1.additem(new Model_MenuAdmin("4", "Edit screening", Model_MenuAdmin.MenuType.MENU));
        listMenuAdmin1.additem(new Model_MenuAdmin("5", "Customers", Model_MenuAdmin.MenuType.MENU));
        listMenuAdmin1.additem(new Model_MenuAdmin("", " ", Model_MenuAdmin.MenuType.TITLE));
        listMenuAdmin1.additem(new Model_MenuAdmin("", " ", Model_MenuAdmin.MenuType.TITLE));
        listMenuAdmin1.additem(new Model_MenuAdmin("", " ", Model_MenuAdmin.MenuType.TITLE));
        listMenuAdmin1.additem(new Model_MenuAdmin("", " ", Model_MenuAdmin.MenuType.TITLE));
        listMenuAdmin1.additem(new Model_MenuAdmin("", " ", Model_MenuAdmin.MenuType.TITLE));
        listMenuAdmin1.additem(new Model_MenuAdmin("", " ", Model_MenuAdmin.MenuType.TITLE));
        listMenuAdmin1.additem(new Model_MenuAdmin("", " ", Model_MenuAdmin.MenuType.TITLE));
        listMenuAdmin1.additem(new Model_MenuAdmin("", " ", Model_MenuAdmin.MenuType.TITLE));
        listMenuAdmin1.additem(new Model_MenuAdmin("", " ", Model_MenuAdmin.MenuType.TITLE));
        listMenuAdmin1.additem(new Model_MenuAdmin("", " ", Model_MenuAdmin.MenuType.TITLE));
        listMenuAdmin1.additem(new Model_MenuAdmin("", " ", Model_MenuAdmin.MenuType.TITLE));
        listMenuAdmin1.additem(new Model_MenuAdmin("", " ", Model_MenuAdmin.MenuType.TITLE));
        listMenuAdmin1.additem(new Model_MenuAdmin("", " ", Model_MenuAdmin.MenuType.TITLE));
        listMenuAdmin1.additem(new Model_MenuAdmin("", " ", Model_MenuAdmin.MenuType.TITLE));
        listMenuAdmin1.additem(new Model_MenuAdmin("", " ", Model_MenuAdmin.MenuType.TITLE));
        listMenuAdmin1.additem(new Model_MenuAdmin("", " ", Model_MenuAdmin.MenuType.TITLE));       
        listMenuAdmin1.additem(new Model_MenuAdmin("logout", "Log out", Model_MenuAdmin.MenuType.MENU));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listMenuAdmin1 = new com.mycompany.swing.ListMenuAdmin<>();

        panelMoving.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Project Java\\MovieTicketBookingManagement\\src\\com\\mycompany\\icon\\admin.png")); // NOI18N
        jLabel1.setText("Welcome Admin");

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listMenuAdmin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(listMenuAdmin1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g1 = new GradientPaint(0, 0, Color.decode("#EB5757"), 0, getHeight(), Color.decode("#000000"));
        g2.setPaint(g1);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        g2.fillRect(getWidth()-20, 0, getWidth(), getHeight());
        super.paintChildren(g);
    }

    private int x,y;
    public void initMoving(JFrame fram){
        panelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }
        });
        panelMoving.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                fram.setLocation(e.getXOnScreen()-x,e.getYOnScreen()-y);

            }
            
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.mycompany.swing.ListMenuAdmin<String> listMenuAdmin1;
    private javax.swing.JPanel panelMoving;
    // End of variables declaration//GEN-END:variables
}
