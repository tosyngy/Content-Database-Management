package addcontent;

import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class addsymptoms extends javax.swing.JFrame {

    DefaultComboBoxModel combomodel = new DefaultComboBoxModel();
    DbConnect dbcon = new DbConnect();
    Vector<String> combo1;
    Vector<String> combo2;
    Vector<String> combo3;
    Vector<String> combo4;
    Vector<String> combo5;
    static int i = 0;

    public addsymptoms() {
        initComponents();
        loadCombo();
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
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(487, 547));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 220, -1));

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 220, -1));

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 220, -1));

        jButton1.setText("save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 370, 120, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 230, -1));

        jLabel1.setText("name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 30, 80, -1));

        jLabel2.setText("body location");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 60, 100, -1));

        jLabel3.setText("symptoms");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 100, -1));

        jLabel4.setText("sub level1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 140, 110, -1));

        jLabel5.setText("sub_level2");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 170, 110, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 220, -1));

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 150, -1));

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 220, -1));

        jLabel6.setText("sub_level3");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 200, 110, -1));

        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 230, -1));

        jLabel7.setText("sub_level4");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 240, 100, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  System.out.println("hrere  "+jTextField1.getText()+"   "+i);
        if (jTextField1.getText().isEmpty()) {
            jTextField1.requestFocus();
            return;
        }

        try {
            if (i == 1) {

                if (jTextField2.getText().isEmpty()) {
                    jTextField2.requestFocus();
                    return;
                }
                dbcon.ps = dbcon.con.prepareStatement("INSERT INTO `diagnosis`.`symptoms` (`name`, `body_location`, `description`) VALUES ( ?, ?, ?)");
                dbcon.ps.setString(1, jTextField1.getText());
                dbcon.ps.setString(2, jTextField2.getText());
                dbcon.ps.setString(3, jTextArea1.getText());
                dbcon.ps.execute();
                //add symptoms here
            } else if (i == 2) {

                if (jComboBox1.getSelectedIndex() == 0) {
                    jComboBox1.requestFocus();
                    return;
                }
                dbcon.ps = dbcon.con.prepareStatement("INSERT INTO `diagnosis`.`symptoms_sub` (sym_id,`name`, `description`) VALUES ( ?, ?,?)");
                dbcon.ps.setString(1, combo1.elementAt(jComboBox1.getSelectedIndex() - 1));
                dbcon.ps.setString(2, jTextField1.getText());
                dbcon.ps.setString(3, jTextArea1.getText());
                dbcon.ps.execute();
            } else if (i == 3) {
                if (jComboBox2.getSelectedIndex() == 0) {
                    jComboBox2.requestFocus();
                    return;
                }
                dbcon.ps = dbcon.con.prepareStatement("INSERT INTO `diagnosis`.`symptoms_sub_sub` (`sub_id`, `name`, `description`) VALUES ( ?, ?,?)");
                dbcon.ps.setString(1, combo2.elementAt(jComboBox2.getSelectedIndex() - 1));
                dbcon.ps.setString(2, jTextField1.getText());
                dbcon.ps.setString(3, jTextArea1.getText());
                dbcon.ps.execute();
                dbcon.ps = dbcon.con.prepareStatement("Update symptoms_sub set stage=1 where id=?");
                dbcon.ps.setString(1, combo2.elementAt(jComboBox2.getSelectedIndex() - 1));
                dbcon.ps.execute();
            } else if (i == 4) {
                if (jComboBox3.getSelectedIndex() == 0) {
                    jComboBox3.requestFocus();
                    return;
                }
                dbcon.ps = dbcon.con.prepareStatement("INSERT INTO `diagnosis`.`symptoms_sub_sub_sub` (`sub_id`, `name`,  `description`) VALUES (  ?, ?,?)");
                dbcon.ps.setString(1, combo3.elementAt(jComboBox3.getSelectedIndex() - 1));
                dbcon.ps.setString(2, jTextField1.getText());
                dbcon.ps.setString(3, jTextArea1.getText());
                dbcon.ps.execute();
                dbcon.ps = dbcon.con.prepareStatement("Update symptoms_sub_sub set stage=1 where id=?");
                dbcon.ps.setString(1, combo3.elementAt(jComboBox3.getSelectedIndex() - 1));
                dbcon.ps.execute();
            } else if (i == 5) {
                if (jComboBox4.getSelectedIndex() == 0) {
                    jComboBox4.requestFocus();
                    return;
                }
                dbcon.ps = dbcon.con.prepareStatement("INSERT INTO `diagnosis`.`symptoms_sub_sub_sub_sub` (`sub_id`, `name`,  `description`) VALUES (  ?, ?,?)");
                dbcon.ps.setString(1, combo4.elementAt(jComboBox4.getSelectedIndex() - 1));
                dbcon.ps.setString(2, jTextField1.getText());
                dbcon.ps.setString(3, jTextArea1.getText());
                dbcon.ps.execute();
                dbcon.ps = dbcon.con.prepareStatement("Update symptoms_sub_sub_sub set stage=1 where id=?");
                dbcon.ps.setString(1, combo4.elementAt(jComboBox4.getSelectedIndex() - 1));
                dbcon.ps.execute();
            } else if (i == 6) {
                if (jComboBox5.getSelectedIndex() == 0) {
                    jComboBox5.requestFocus();
                    return;
                }
                dbcon.ps = dbcon.con.prepareStatement("INSERT INTO `diagnosis`.`symptoms_sub_sub_sub_sub_sub` (`sub_id`, `name`,  `description`) VALUES (  ?, ?,?)");
                dbcon.ps.setString(1, combo5.elementAt(jComboBox5.getSelectedIndex() - 1));
                dbcon.ps.setString(2, jTextField1.getText());
                dbcon.ps.setString(3, jTextArea1.getText());
                dbcon.ps.execute();
                dbcon.ps = dbcon.con.prepareStatement("Update symptoms_sub_sub_sub_sub set stage=1 where id=?");
                dbcon.ps.setString(1, combo5.elementAt(jComboBox5.getSelectedIndex() - 1));
                dbcon.ps.execute();

            } else if (i == 7) {
                try{
                   dbcon.ps = dbcon.con.prepareStatement("INSERT INTO `diagnosis`.`illness` (`name`,  `description`) VALUES ( ?,?)");
                dbcon.ps.setString(1, jTextField1.getText());
                dbcon.ps.setString(2, jTextArea1.getText());
                dbcon.ps.execute();
                }catch(Exception ms){
                    JOptionPane.showMessageDialog(rootPane, "Name already exist "+ms.getMessage());
                            clear();
                    return;
                }
             
            } else if (i == 8) {
                if (jComboBox2.getSelectedIndex() == 0 || jComboBox1.getSelectedIndex() == 0) {
                    jComboBox1.requestFocus();
                    return;
                }
                dbcon.ps = dbcon.con.prepareStatement("INSERT INTO `diagnosis`.`ill_map_symptoms` (`ill_id`,`sym_id`,   `description`) VALUES ( ?,?)");
                dbcon.ps.setInt(1, jComboBox1.getSelectedIndex());
                dbcon.ps.setInt(2, jComboBox2.getSelectedIndex());
                dbcon.ps.setString(3, jTextArea1.getText());
                dbcon.ps.execute();
            }

            JOptionPane.showMessageDialog(rootPane, "done");
            clear();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        combo2 = new Vector<>();
        if (jComboBox1.isFocusOwner()) {
            try {
                combomodel = new DefaultComboBoxModel();
                combomodel.addElement("select from below");
                dbcon.rs = dbcon.st.executeQuery("select id,name from symptoms_sub where sym_id='" + combo1.elementAt(jComboBox1.getSelectedIndex() - 1) + "'");
                while (dbcon.rs.next()) {
                    combomodel.addElement(dbcon.rs.getString(2));
                    combo2.addElement(dbcon.rs.getString(1));
                }
                jComboBox2.setModel(combomodel);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        combo3 = new Vector<>();
        if (jComboBox2.isFocusOwner()) {
            try {
                combomodel = new DefaultComboBoxModel();
                combomodel.addElement("select from below");
                dbcon.rs = dbcon.st.executeQuery("select id,name from symptoms_sub_sub where sub_id='" + combo2.elementAt(jComboBox2.getSelectedIndex() - 1) + "'");
                while (dbcon.rs.next()) {
                    combomodel.addElement(dbcon.rs.getString(2));
                    combo3.addElement(dbcon.rs.getString(1));
                }
                jComboBox3.setModel(combomodel);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        combo4 = new Vector<>();
        if (jComboBox3.isFocusOwner()) {
            try {
                combomodel = new DefaultComboBoxModel();
                combomodel.addElement("select from below");
                dbcon.rs = dbcon.st.executeQuery("select id,name from symptoms_sub_sub_sub where sub_id='" + combo3.elementAt(jComboBox3.getSelectedIndex() - 1) + "'");
                while (dbcon.rs.next()) {
                    combomodel.addElement(dbcon.rs.getString(2));
                    combo4.addElement(dbcon.rs.getString(1));
                }
                jComboBox4.setModel(combomodel);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if (evt.getKeyCode() == 10) {
            jButton1ActionPerformed(null);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        combo5 = new Vector<>();
        if (jComboBox4.isFocusOwner()) {
            try {
                combomodel = new DefaultComboBoxModel();
                combomodel.addElement("select from below");
                dbcon.rs = dbcon.st.executeQuery("select id,name from symptoms_sub_sub_sub_sub where sub_id='" + combo4.elementAt(jComboBox4.getSelectedIndex() - 1) + "'");
                while (dbcon.rs.next()) {
                    combomodel.addElement(dbcon.rs.getString(2));
                    combo5.addElement(dbcon.rs.getString(1));
                }
                jComboBox5.setModel(combomodel);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        if (evt.getKeyCode() == 10) {
            jButton1ActionPerformed(null);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
 
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(addsymptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addsymptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addsymptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addsymptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addsymptoms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JComboBox jComboBox1;
    public static javax.swing.JComboBox jComboBox2;
    public static javax.swing.JComboBox jComboBox3;
    public static javax.swing.JComboBox jComboBox4;
    public static javax.swing.JComboBox jComboBox5;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    void clear() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextArea1.setText("");
        jTextField1.requestFocus();
    }

    void loadCombo() {

            combo1 = new Vector<>();
            combomodel.addElement("select from below");
            try {
                dbcon.rs = dbcon.st.executeQuery("select id,name from symptoms");
                while (dbcon.rs.next()) {
                    combomodel.addElement(dbcon.rs.getString(2));
                    combo1.addElement(dbcon.rs.getString(1));
                }
                jComboBox1.setModel(combomodel);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return;
        }
        
        
   
}
