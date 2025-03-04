/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Update extends javax.swing.JFrame {

    private static String usname, pass, type = "admin";

    private static String filepath = "src\\Data.json";
    private static JSONParser jsonParser = new JSONParser();
    private static JSONObject record = new JSONObject();
    private static JSONArray userlist = new JSONArray();

    public Update() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UsnTF = new javax.swing.JTextField();
        PssTF = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UpdateBttn = new javax.swing.JButton();
        ClearBttn = new javax.swing.JButton();
        HomeBttn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NewUsnTF = new javax.swing.JTextField();
        NewPassTF = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        UsnTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsnTFActionPerformed(evt);
            }
        });

        PssTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PssTFActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");

        UpdateBttn.setBackground(new java.awt.Color(51, 51, 51));
        UpdateBttn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        UpdateBttn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBttn.setText("UPDATE");
        UpdateBttn.setBorderPainted(false);
        UpdateBttn.setContentAreaFilled(false);
        UpdateBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBttnActionPerformed(evt);
            }
        });

        ClearBttn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        ClearBttn.setForeground(new java.awt.Color(255, 255, 255));
        ClearBttn.setText("CLEAR");
        ClearBttn.setBorderPainted(false);
        ClearBttn.setContentAreaFilled(false);
        ClearBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBttnActionPerformed(evt);
            }
        });

        HomeBttn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        HomeBttn.setForeground(new java.awt.Color(255, 255, 255));
        HomeBttn.setText("HOME");
        HomeBttn.setBorderPainted(false);
        HomeBttn.setContentAreaFilled(false);
        HomeBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBttnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New USERNAME");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("New PASSWORD");

        NewUsnTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewUsnTFActionPerformed(evt);
            }
        });

        NewPassTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPassTFActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UPDATE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(211, 211, 211))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(UpdateBttn)
                        .addGap(50, 50, 50)
                        .addComponent(ClearBttn)
                        .addGap(46, 46, 46)
                        .addComponent(HomeBttn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewPassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewUsnTF, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PssTF, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsnTF, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 115, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(UsnTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PssTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NewUsnTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(NewPassTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearBttn)
                    .addComponent(UpdateBttn)
                    .addComponent(HomeBttn))
                .addGap(104, 104, 104))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsnTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsnTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsnTFActionPerformed

    private void UpdateBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBttnActionPerformed
        try { // Check for any necessary file operations or preparations before adding data
            filecheck();
            String currentUsername = UsnTF.getText().trim();// Get the current usn, pass, New usn and New pass trimming any extra spaces
            String currentPassword = PssTF.getText().trim();
            String newUsername = NewUsnTF.getText().trim(); 
            String newPassword = NewPassTF.getText().trim(); 
            boolean found = false; // Flag to check if the user is found and updated

            for (int i = 0; i < userlist.size(); i++) { // Loop through the userlist to search for the user by the current username
                JSONObject user = (JSONObject) userlist.get(i); // Get the current user from the list
                if (user.get("password").equals(currentPassword) & user.get("username").equals(currentUsername)) { // // Check if the current user's username and password match the ones to be updated
                    user.put("username", newUsername.isEmpty() ? currentUsername : newUsername);  
                    user.put("password", newPassword.isEmpty() ? currentPassword : newPassword); // If new username and pass is empty, retain the old one
                    found = true; 
                    break; // Exit the loop since the user has been updated
                } else {
                }
            }
            

            if (found) {  // If the user was found and updated, show message
                record.put("users", userlist);  // Update the 'record' with the modified userlist
                JOptionPane.showMessageDialog(this, "User updated successfully."); 
            } else {  
                JOptionPane.showMessageDialog(this, "User not found.");
            }
             save(); // Save the updated user list to the storage
        } catch (IOException ex) { // Catch any IOExceptions that may occur during file operations and log the error
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "An error occurred.");
        } catch (ParseException ex) { //Catch any ParseExceptions that may occur during data processing
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    dispose(); //Closes the update frame and direct to dashboard frame
    Dashboard e = new Dashboard();
    e.setVisible (true);

    }//GEN-LAST:event_UpdateBttnActionPerformed

    private void ClearBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBttnActionPerformed
        UsnTF.setText("");
        PssTF.setText("");
        NewPassTF.setText("");
        NewUsnTF.setText("");
    }//GEN-LAST:event_ClearBttnActionPerformed

    private void HomeBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBttnActionPerformed
        dispose(); //Closes the update frame and direct to dashboard frame
        Dashboard e = new Dashboard();
        e.setVisible(true);
    }//GEN-LAST:event_HomeBttnActionPerformed

    private void PssTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PssTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PssTFActionPerformed

    private void NewUsnTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewUsnTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewUsnTFActionPerformed

    private void NewPassTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPassTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewPassTFActionPerformed

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
        java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
new Update().setVisible(true);
    });
}

    public void filecheck() throws FileNotFoundException, IOException, ParseException {
    FileReader reader = new FileReader(filepath);

    if (reader.ready()) {
        Scanner scan = new Scanner(reader);
        String line = "";
        while (scan.hasNext()) {
            line = line + scan.nextLine();
        }

        reader.close();

        if (!line.equals("")) {
            reader.close();
            FileReader reader2 = new FileReader(filepath);
            record = (JSONObject) jsonParser.parse(reader2);
            userlist = (JSONArray) record.get("users");
            reader2.close();
        }
    }

    dispose();
    Dashboard e = new Dashboard();
    e.setVisible(true);
}
    
     public static void save() throws IOException {
        FileWriter file = new FileWriter(filepath);
        file.write(record.toJSONString());
        file.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBttn;
    private javax.swing.JButton HomeBttn;
    private javax.swing.JTextField NewPassTF;
    private javax.swing.JTextField NewUsnTF;
    private javax.swing.JPasswordField PssTF;
    private javax.swing.JButton UpdateBttn;
    private javax.swing.JTextField UsnTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
