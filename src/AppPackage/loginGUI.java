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

        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        miniB = new javax.swing.JLabel();
        closeB = new javax.swing.JLabel();
        logTile = new javax.swing.JLabel();
        backTile = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        usernameField = new javax.swing.JTextField();
        alertBar = new javax.swing.JTextField();
        loginTitle = new javax.swing.JLabel();
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

        username.setEditable(false);
        username.setBackground(new java.awt.Color(105, 105, 105));
        username.setFont(new java.awt.Font("Raleway", 2, 36)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.setText("Username:");
        username.setToolTipText("");
        username.setBorder(null);
        username.setOpaque(false);
        username.setSelectionColor(new java.awt.Color(56, 195, 228));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 180, 40));

        password.setEditable(false);
        password.setBackground(new java.awt.Color(105, 105, 105));
        password.setFont(new java.awt.Font("Raleway", 2, 36)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password.setText("Password:");
        password.setToolTipText("");
        password.setBorder(null);
        password.setOpaque(false);
        password.setSelectionColor(new java.awt.Color(56, 195, 228));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 170, 40));

        miniB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/mini.png"))); // NOI18N
        miniB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miniB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniBMouseClicked(evt);
            }
        });
        getContentPane().add(miniB, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        closeB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/close.png"))); // NOI18N
        closeB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBMouseClicked(evt);
            }
        });
        getContentPane().add(closeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 50, -1));

        logTile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/LoginTile.png"))); // NOI18N
        logTile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logTile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logTileMouseReleased(evt);
            }
        });
        getContentPane().add(logTile, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        backTile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/BackTile.png"))); // NOI18N
        backTile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backTile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backTileMouseReleased(evt);
            }
        });
        getContentPane().add(backTile, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        passwordField.setBackground(new java.awt.Color(105, 105, 105));
        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.setText("Password");
        passwordField.setBorder(null);
        passwordField.setSelectionColor(new java.awt.Color(56, 195, 228));
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
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 230, 50));

        usernameField.setBackground(new java.awt.Color(105, 105, 105));
        usernameField.setFont(new java.awt.Font("Raleway", 0, 36)); // NOI18N
        usernameField.setForeground(new java.awt.Color(255, 255, 255));
        usernameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameField.setText("Type Here");
        usernameField.setBorder(null);
        usernameField.setSelectionColor(new java.awt.Color(56, 195, 228));
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
        getContentPane().add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 230, 50));

        alertBar.setEditable(false);
        alertBar.setBackground(new java.awt.Color(105, 105, 105));
        alertBar.setFont(new java.awt.Font("Raleway", 1, 18)); // NOI18N
        alertBar.setForeground(new java.awt.Color(255, 0, 0));
        alertBar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        alertBar.setBorder(null);
        alertBar.setOpaque(false);
        getContentPane().add(alertBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 490, 30));

        loginTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/logTitle.png"))); // NOI18N
        getContentPane().add(loginTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, -1, -1));

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
    private void frameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_frameDragMouseDragged

    private void frameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_frameDragMousePressed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void backTileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backTileMouseReleased
        this.setVisible(false);
        StartGUI start = new StartGUI();
        start.setVisible(true);
        start.setLocation(this.getX(),this.getY());
    }//GEN-LAST:event_backTileMouseReleased

    private void usernameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            String pass = new String(passwordField.getPassword());
            DBClass DB = new DBClass();
            if (DB.checkAdminLogin(usernameField.getText(), pass) == true){
                this.setVisible(false);
                adminGUI admin = new adminGUI();
                admin.setVisible(true);
                admin.setLocation(this.getX(),this.getY());
            }
            else if (DB.checkLogin(usernameField.getText(), pass) == true){
                this.setVisible(false);
                StartGUI start = new StartGUI();
                start.setVisible(true);
                start.setLocation(this.getX(),this.getY());
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
                this.setVisible(false);
                new adminGUI().setVisible(true);
            }
            else if (DB.checkLogin(usernameField.getText(), pass) == true){
                this.setVisible(false);
                StartGUI start = new StartGUI();
                start.setVisible(true);
                start.setLocation(this.getX(),this.getY());
            }
            else{
                alertBar.setText("Invalid login");
            }
        }   
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void logTileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logTileMouseReleased
        String pass = new String(passwordField.getPassword());
        DBClass DB = new DBClass();
        if (DB.checkAdminLogin(usernameField.getText(), pass) == true){
            this.setVisible(false);
            new adminGUI().setVisible(true);
        }
        else if (DB.checkLogin(usernameField.getText(), pass) == true){
            this.setVisible(false);
            StartGUI start = new StartGUI();
            start.setVisible(true);
            start.setLocation(this.getX(),this.getY());
        }
        else{
            alertBar.setText("Invalid login");
        }
    }//GEN-LAST:event_logTileMouseReleased

    private void miniBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBMouseClicked
        this.setState(adminGUI.ICONIFIED);
    }//GEN-LAST:event_miniBMouseClicked

    private void closeBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBMouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

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
    private javax.swing.JLabel logTile;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JLabel miniB;
    private javax.swing.JTextField password;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField username;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
