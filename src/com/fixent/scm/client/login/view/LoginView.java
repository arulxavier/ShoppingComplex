/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fixent.scm.client.login.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 *
 * @author Mathan
 */
public class LoginView extends javax.swing.JPanel {

	private BufferedImage img;
    /**
     * Creates new form LoginView
     */
    public LoginView() {
        initComponents();
        
        try {
        	File file = new File("");
        	String path = file.getAbsolutePath();
			img = ImageIO.read(new File(path + "\\src\\com\\fixent\\scm\\client\\login\\view\\Polish_Wikinews_header_image.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
    }
    
    
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// paint the background image and scale it to fill the entire space
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	}
	

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");

        loginButton.setBackground(new java.awt.Color(153, 204, 255));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userNameTextField)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(loginButton)
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
	public javax.swing.JButton getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(javax.swing.JButton loginButton) {
		this.loginButton = loginButton;
	}

	public javax.swing.JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(javax.swing.JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	public javax.swing.JTextField getUserNameTextField() {
		return userNameTextField;
	}

	public void setUserNameTextField(javax.swing.JTextField userNameTextField) {
		this.userNameTextField = userNameTextField;
	}
    
    
}
