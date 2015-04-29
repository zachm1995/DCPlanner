/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

/**
 *
 * @author Zach
 */
public class loginGUI extends javax.swing.JFrame {

    /**
     * Creates new form StartGUI
     */
    int xMouse;
    int yMouse;
    public loginGUI() {
        initComponents();
        CustomCursor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backTile = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        usernameField = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        alertBar = new javax.swing.JTextField();
        logButton = new javax.swing.JButton();
        registerTitle = new javax.swing.JLabel();
        closeB = new javax.swing.JLabel();
        miniB = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        frameDrag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DCPlanner");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setForeground(new java.awt.Color(105, 105, 105));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backTile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/BackTile.png"))); // NOI18N
        backTile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backTile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backTileMouseReleased(evt);
            }
        });
        getContentPane().add(backTile, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        password.setEditable(false);
        password.setBackground(new java.awt.Color(105, 105, 105));
        password.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password.setText("Password:");
        password.setToolTipText("");
        password.setBorder(null);
        password.setOpaque(false);
        password.setSelectionColor(new java.awt.Color(0, 255, 255));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 120, 20));

        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.setText("Password");
        passwordField.setBorder(null);
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 230, 50));

        usernameField.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        usernameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameField.setText("Username");
        usernameField.setBorder(null);
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        usernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameFieldKeyPressed(evt);
            }
        });
        getContentPane().add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 172, 230, 50));

        username.setEditable(false);
        username.setBackground(new java.awt.Color(105, 105, 105));
        username.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.setText("Username:");
        username.setToolTipText("");
        username.setBorder(null);
        username.setOpaque(false);
        username.setSelectedTextColor(new java.awt.Color(0, 255, 255));
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 120, 20));

        alertBar.setEditable(false);
        alertBar.setBackground(new java.awt.Color(105, 105, 105));
        alertBar.setFont(new java.awt.Font("Raleway", 1, 18)); // NOI18N
        alertBar.setForeground(new java.awt.Color(255, 0, 0));
        alertBar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        alertBar.setBorder(null);
        alertBar.setOpaque(false);
        getContentPane().add(alertBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 490, 30));

        logButton.setText("Login");
        logButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logButtonMouseReleased(evt);
            }
        });
        logButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 130, 50));

        registerTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/logTitle.png"))); // NOI18N
        getContentPane().add(registerTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, -1, -1));

        closeB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBMouseClicked(evt);
            }
        });
        getContentPane().add(closeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 50, 20));

        miniB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miniB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniBMouseClicked(evt);
            }
        });
        getContentPane().add(miniB, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 50, 20));

        background.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/GUI.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        frameDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                frameDragMouseDragged(evt);
            }
        });
        frameDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frameDragMousePressed(evt);
            }
        });
        getContentPane().add(frameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -6, 820, 30));

        setSize(new java.awt.Dimension(800, 598));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void CustomCursor(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image img = toolkit.getImage("Cursor.png");
        Point point = new Point(0,0);
        Cursor cursor = toolkit.createCustomCursor(img, point, "Cursor");
        
        setCursor(cursor);
    }
    private void miniBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBMouseClicked
        this.setState(loginGUI.ICONIFIED);
    }//GEN-LAST:event_miniBMouseClicked

    private void closeBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBMouseClicked

    private void frameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_frameDragMouseDragged

    private void frameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_frameDragMousePressed

    private void logButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logButtonActionPerformed
        String pass = new String(passwordField.getPassword());
        DBClass DB = new DBClass();
        if (DB.checkAdminLogin(usernameField.getText(), pass) == true){
            alertBar.setText("Admin Recognized.");
        }
        else if (DB.checkLogin(usernameField.getText(), pass) == true){
            alertBar.setText("Login Correct");
        }
        else{
            alertBar.setText("Invalid login");
        }
    }//GEN-LAST:event_logButtonActionPerformed

    private void logButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logButtonMouseReleased

    }//GEN-LAST:event_logButtonMouseReleased

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void backTileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backTileMouseReleased
        this.setVisible(false);
        new StartGUI().setVisible(true);
    }//GEN-LAST:event_backTileMouseReleased

    private void usernameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            String pass = new String(passwordField.getPassword());
            DBClass DB = new DBClass();
            if (DB.checkAdminLogin(usernameField.getText(), pass) == true){
                alertBar.setText("Admin Recognized.");
            }
            else if (DB.checkLogin(usernameField.getText(), pass) == true){
                alertBar.setText("Login Correct");
            }
            else{
                alertBar.setText("Invalid login");
            }
        } 
    }//GEN-LAST:event_usernameFieldKeyPressed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            String pass = new String(passwordField.getPassword());
            DBClass DB = new DBClass();
            if (DB.checkAdminLogin(usernameField.getText(), pass) == true){
                alertBar.setText("Admin Recognized.");
            }
            else if (DB.checkLogin(usernameField.getText(), pass) == true){
                alertBar.setText("Login Correct");
            }
            else{
                alertBar.setText("Invalid login");
            }
        }   
    }//GEN-LAST:event_passwordFieldKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(5000);
                }
                catch(Exception e){
                    
                }
                new loginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alertBar;
    private javax.swing.JLabel backTile;
    private javax.swing.JLabel background;
    private javax.swing.JLabel closeB;
    private javax.swing.JLabel frameDrag;
    private javax.swing.JButton logButton;
    private javax.swing.JLabel miniB;
    private javax.swing.JTextField password;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel registerTitle;
    private javax.swing.JTextField username;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}