/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addcontent;

import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author tosyngy
 */
public class ill_map_sub_sym extends javax.swing.JFrame {

    DbConnect dbcon = new DbConnect();
    DefaultComboBoxModel combomodel = new DefaultComboBoxModel();
    Vector<String> combo1;
    Vector<String> combo2;
    Vector<String> combo3;
    Vector<String> combo4;
    Vector<String> combo5;
    Vector<String> combo6;
    Vector<String> combo7;
    Vector<String> combo8;
    Vector<String> point;
    Vector<String> teset;
    DefaultListModel list = new DefaultListModel();
    Vector<String> lst1 = new Vector<>();

    /**
     * Creates new form ill_map_sub_sym
     */
    public ill_map_sub_sym() {
        initComponents();
        loadCombo(0);
        jComboBox3.setSelectedIndex(9);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList7 = new javax.swing.JList();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList8 = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jList9 = new javax.swing.JList();
        jScrollPane10 = new javax.swing.JScrollPane();
        jList10 = new javax.swing.JList();
        jScrollPane11 = new javax.swing.JScrollPane();
        jList11 = new javax.swing.JList();
        jScrollPane12 = new javax.swing.JScrollPane();
        jList12 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jList13 = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel3.setText("pin symptoms");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 150, 30));

        jList7.setFont(new java.awt.Font("Monospaced", 1, 9)); // NOI18N
        jList7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList7MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jList7);

        jPanel4.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 500));

        jList8.setFont(new java.awt.Font("Monospaced", 1, 9)); // NOI18N
        jList8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList8MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jList8);

        jPanel4.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 200, 440));

        jLabel7.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel7.setText("illness");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 30));

        jList9.setFont(new java.awt.Font("Monospaced", 1, 9)); // NOI18N
        jList9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList9MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jList9);

        jPanel4.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 210, 250));

        jList10.setFont(new java.awt.Font("Monospaced", 1, 9)); // NOI18N
        jList10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList10MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jList10);

        jPanel4.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 230, 250));

        jList11.setFont(new java.awt.Font("Monospaced", 1, 9)); // NOI18N
        jList11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList11MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(jList11);

        jPanel4.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, 230));

        jList12.setFont(new java.awt.Font("Monospaced", 1, 9)); // NOI18N
        jScrollPane12.setViewportView(jList12);

        jPanel4.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 180, 260));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(219, 11, 11));
        jLabel1.setText("remove");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 50, 30));

        jButton2.setText("piority");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 100, 40));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-9", "-8", "-7", "-6", "-5", "-4", "-3", "-2", "-1", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", " " }));
        jPanel4.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 100, 40));

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 531, 70, 30));

        jList13.setFont(new java.awt.Font("Monospaced", 1, 9)); // NOI18N
        jScrollPane13.setViewportView(jList13);

        jPanel4.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 60, 500));

        jTabbedPane1.addTab("view map illnss", jPanel4);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 640, 40));

        jLabel2.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel2.setText("pin symptoms");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 150, 50));

        jList1.setFont(new java.awt.Font("Monospaced", 1, 9)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 480));

        jList2.setFont(new java.awt.Font("Monospaced", 1, 9)); // NOI18N
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 200, 400));

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel4.setText("map sub illness");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 170, 50));

        jLabel5.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel5.setText("illness");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 90, 50));

        jList3.setFont(new java.awt.Font("Monospaced", 1, 9)); // NOI18N
        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 230, 220));

        jList4.setFont(new java.awt.Font("Monospaced", 1, 9)); // NOI18N
        jList4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jList4);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 210, 230));

        jList5.setFont(new java.awt.Font("Monospaced", 1, 9)); // NOI18N
        jList5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jList5);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 220, 220));

        jList6.setFont(new java.awt.Font("Monospaced", 1, 9)); // NOI18N
        jScrollPane6.setViewportView(jList6);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 220, 220));

        jComboBox1.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 51, 200, 40));

        jTabbedPane1.addTab("map illness", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(935, 624));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String rel_ = "";
        if (jList2.getSelectedIndex() != -1) {
            rel_ += "|%" + combo2.elementAt(jList2.getSelectedIndex()) + "%";
        }
        if (jList3.getSelectedIndex() != -1) {
            rel_ += "|%" + combo3.elementAt(jList3.getSelectedIndex()) + "%";
        }
        if (jList4.getSelectedIndex() != -1) {
            rel_ += "|%" + combo4.elementAt(jList4.getSelectedIndex()) + "%";
        }
        if (jList5.getSelectedIndex() != -1) {
            rel_ += "|%" + combo5.elementAt(jList5.getSelectedIndex()) + "%";
        }
        if (jList6.getSelectedIndex() != -1) {
            rel_ += "|%" + combo6.elementAt(jList6.getSelectedIndex()) + "%";
        }
        try {
            if (!rel_.isEmpty()) {
                dbcon.rs = dbcon.st.executeQuery("Select id from piority_map where sym_id_group='" + rel_ + "' and ill_id='" + combo1.elementAt(jList1.getSelectedIndex()) + "'");
                if (dbcon.rs.next()) {
                    JOptionPane.showMessageDialog(rootPane, "already exist");
                    return;
                }

                dbcon.ps = dbcon.con.prepareStatement("INSERT INTO `piority_map` (`sym_id_group`,  `ill_id`) VALUES ( ?,?)");
                dbcon.ps.setString(1, rel_);
                dbcon.ps.setString(2, combo1.elementAt(jList1.getSelectedIndex()));
            } else {
                JOptionPane.showMessageDialog(rootPane, "please select mapping relative");
                return;
            }
            dbcon.ps.execute();
            JOptionPane.showMessageDialog(rootPane, "done");

        } catch (Exception ms) {
            JOptionPane.showMessageDialog(rootPane, "already exist " + ms.getMessage());
            ms.printStackTrace();
        }
        list = new DefaultListModel();
        jList4.setModel(list);
        jList5.setModel(list);
        jList6.setModel(list);
        jList2.requestFocus();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        combo3 = new Vector<>();
        if (jList2.isFocusOwner() && jList2.getSelectedIndex() != -1) {
            try {
                list = new DefaultListModel();
                combomodel.addElement("select from below");
                dbcon.rs = dbcon.st.executeQuery("select id,name from symptoms_sub where sym_id='" + combo2.elementAt(jList2.getSelectedIndex()) + "'");
                while (dbcon.rs.next()) {
                    list.addElement(dbcon.rs.getString(2));
                    combo3.addElement(dbcon.rs.getString(1));
                }
                jList3.setModel(list);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        list = new DefaultListModel();
        jList4.setModel(list);
        jList5.setModel(list);
        jList6.setModel(list);

// TODO add your handling code here:
    }//GEN-LAST:event_jList2MouseClicked

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
        combo4 = new Vector<>();
        if (jList3.isFocusOwner() && jList3.getSelectedIndex() != -1) {
            try {
                list = new DefaultListModel();
                combomodel.addElement("select from below");
                dbcon.rs = dbcon.st.executeQuery("select id,name from symptoms_sub_sub where sub_id='" + combo3.elementAt(jList3.getSelectedIndex()) + "'");
                while (dbcon.rs.next()) {
                    list.addElement(dbcon.rs.getString(2));
                    combo4.addElement(dbcon.rs.getString(1));
                }
                jList4.setModel(list);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        list = new DefaultListModel();
        jList5.setModel(list);
        jList6.setModel(list);

// TODO add your handling code here:
    }//GEN-LAST:event_jList3MouseClicked

    private void jList4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList4MouseClicked
        combo5 = new Vector<>();
        if (jList4.isFocusOwner() && jList4.getSelectedIndex() != -1) {
            try {
                list = new DefaultListModel();
                combomodel.addElement("select from below");
                dbcon.rs = dbcon.st.executeQuery("select id,name from symptoms_sub_sub_sub where sub_id='" + combo4.elementAt(jList4.getSelectedIndex()) + "' order by name");
                while (dbcon.rs.next()) {
                    list.addElement(dbcon.rs.getString(2));
                    combo5.addElement(dbcon.rs.getString(1));
                }
                jList5.setModel(list);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        list = new DefaultListModel();
        jList6.setModel(list);
// TODO add your handling code here:
    }//GEN-LAST:event_jList4MouseClicked

    private void jList5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList5MouseClicked
        combo6 = new Vector<>();
        if (jList5.isFocusOwner() && jList5.getSelectedIndex() != -1) {
            try {
                list = new DefaultListModel();
                combomodel.addElement("select from below");
                dbcon.rs = dbcon.st.executeQuery("select id,name from symptoms_sub_sub_sub_sub where sub_id='" + combo5.elementAt(jList5.getSelectedIndex()) + "'");
                while (dbcon.rs.next()) {
                    list.addElement(dbcon.rs.getString(2));
                    combo6.addElement(dbcon.rs.getString(1));
                }
                jList6.setModel(list);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        list = new DefaultListModel();
        // TODO add your handling code here:
    }//GEN-LAST:event_jList5MouseClicked

    private void jList8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList8MouseClicked
jLabel6.setText(point.elementAt(jList8.getSelectedIndex()));
        jList10.clearSelection();
        jList11.clearSelection();
        jList12.clearSelection();
        jList9.clearSelection();
        // TODO add your handling code here:
    }//GEN-LAST:event_jList8MouseClicked

    private void jList9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList9MouseClicked
        jList10.clearSelection();
        jList11.clearSelection();
        jList12.clearSelection();
        // TODO add your handling code here:
    }//GEN-LAST:event_jList9MouseClicked

    private void jList10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList10MouseClicked

        jList11.clearSelection();
        jList12.clearSelection();
        // TODO add your handling code here:
    }//GEN-LAST:event_jList10MouseClicked

    private void jList11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList11MouseClicked

        jList12.clearSelection();
        // TODO add your handling code here:
    }//GEN-LAST:event_jList11MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.isFocusOwner() && jComboBox1.getSelectedIndex() > 0) {
            try {
                list = new DefaultListModel();
                combo2 = new Vector<>();
                dbcon.rs = dbcon.st.executeQuery("select id,name from symptoms where body_location like '%" + jComboBox1.getSelectedItem().toString() + "%' or name like '%" + jComboBox1.getSelectedItem().toString() + "%' order by name");
                if (jComboBox1.getSelectedIndex() == 1) {
                    dbcon.rs = dbcon.st.executeQuery("select id,name from symptoms");
                }
                while (dbcon.rs.next()) {
                    list.addElement(dbcon.rs.getString(2));
                    combo2.addElement(dbcon.rs.getString(1));
                }
                jList2.setModel(list);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jList7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList7MouseClicked
        Vector<String> subs = new Vector<>();
          DefaultListModel   list1 = new DefaultListModel();
          DefaultListModel   list2 = new DefaultListModel();
          DefaultListModel   list3 = new DefaultListModel();
          DefaultListModel   list4 = new DefaultListModel();
          DefaultListModel   list5 = new DefaultListModel();
          DefaultListModel   list6 = new DefaultListModel();
          
           jList8.setModel(list1);
             jList9.setModel(list2);
             jList10.setModel(list3);
            jList11.setModel(list4);
             jList12.setModel(list5);
            combo8 = new Vector<>();
            point = new Vector<>();
        
        if (jList7.isFocusOwner() && jList7.getSelectedIndex() > -1) {
                 int id1=0,id2=0,id3=0,id4=0,id5=0;
            try {
                combomodel.addElement("select from below");
                dbcon.rs = dbcon.st.executeQuery("select id,sym_id_group,point from piority_map  where ill_id='" + combo7.elementAt(jList7.getSelectedIndex()) + "'");
                while (dbcon.rs.next()) {
                    String data = dbcon.rs.getString(2).replaceAll("|%", "");
                    subs.addElement(data);
                    System.out.println(dbcon.rs.getString(2));
                    combo8.addElement(dbcon.rs.getString(1));
                    point.addElement(dbcon.rs.getString(3));
                    list6.addElement(dbcon.rs.getString(3));
                }
                jList13.setModel(list6);

                for (int i = 0; i < subs.size(); i++) {
                    String d[] = subs.elementAt(i).split("%");
                    int k = 0;
                    for (String d1 : d) {
                        System.out.println("d1 :"+d1 +"        "+" k :" +k);
                        if (k % 2 == 1) {
                            if(k==1){
                            dbcon.rs = dbcon.st.executeQuery("select id,name from symptoms  where id='" + d1 + "' order by name");
                            while (dbcon.rs.next()) {
                                String data = dbcon.rs.getString(2);
                                list1.addElement(++id1+":"+data);
                            }
                            jList8.setModel(list1);
                            }else if(k==3){
                                    dbcon.rs = dbcon.st.executeQuery("select id,name from symptoms_sub  where id='" + d1 + "'");
                            while (dbcon.rs.next()) {
                                String data = dbcon.rs.getString(2);
                                list2.addElement(id1+"."+ ++id2+":"+data);
                            }
                               jList9.setModel(list2);
                            }else if(k==5){
                                    dbcon.rs = dbcon.st.executeQuery("select id,name from symptoms_sub_sub  where id='" + d1 + "'");
                            while (dbcon.rs.next()) {
                                String data = dbcon.rs.getString(2);
                                list3.addElement(id1+"."+id2+"."+ ++id3+":"+data);
                            }
                               jList10.setModel(list3);
                            }else if(k==7){
                                    dbcon.rs = dbcon.st.executeQuery("select id,name from symptoms_sub_sub_sub where id='" + d1 + "'");
                            while (dbcon.rs.next()) {
                                String data = dbcon.rs.getString(2);
                                list4.addElement(id1+"."+id2+"."+id3+"."+ ++id4+":"+data);
                            }
                               jList11.setModel(list4);
                            }else if(k==9){
                                    dbcon.rs = dbcon.st.executeQuery("select id,name from symptoms_sub_sub_sub_sub  where id='" + d1 + "'");
                            while (dbcon.rs.next()) {
                                String data = dbcon.rs.getString(2);
                                  list5.addElement(id1+"."+id2+"."+id3+"."+ id4+"."+ ++id5+":"+data);
                            }
                               jList12.setModel(list5);
                            }
                        }
                         k++;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jList7MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
if(jList8.getSelectedIndex()>-1){
        int chk=JOptionPane.showConfirmDialog(rootPane, "are you sure?");
    if(chk!=0)
        return;
        try {
                        dbcon.ps=dbcon.con.prepareStatement("delete from piority_map  where id ='"+combo8.elementAt(jList8.getSelectedIndex())+"'");
            dbcon.ps.executeUpdate();

                  JOptionPane.showMessageDialog(rootPane, "a deletion was perform under piority map  on id" +combo8.elementAt(jList8.getSelectedIndex()));
        } catch (Exception e) {
            e.printStackTrace();
        }
loadCombo(0) ;
}   
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   set_point(jComboBox3.getSelectedItem().toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ill_map_sub_sym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ill_map_sub_sym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ill_map_sub_sym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ill_map_sub_sym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ill_map_sub_sym().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JList jList10;
    private javax.swing.JList jList11;
    private javax.swing.JList jList12;
    private javax.swing.JList jList13;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JList jList4;
    private javax.swing.JList jList5;
    private javax.swing.JList jList6;
    private javax.swing.JList jList7;
    private javax.swing.JList jList8;
    private javax.swing.JList jList9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    void loadCombo(int i) {
        Vector<String> tester = new Vector<>();
        combomodel.addElement("select category below");
        combomodel.addElement("all");
        try {
            if (i == 0) {
                combo1 = new Vector<>();
                combo7 = new Vector<>();
                dbcon.rs = dbcon.st.executeQuery("select id,name from illness order by name");
                while (dbcon.rs.next()) {
                    list.addElement(dbcon.rs.getString(2));
                    combo1.addElement(dbcon.rs.getString(1));
                    combo7.addElement(dbcon.rs.getString(1));
                }
                jList1.setModel(list);
                jList7.setModel(list);
            }
            combo2 = new Vector<>();
            teset = new Vector<>();
            list = new DefaultListModel();
            dbcon.rs = dbcon.st.executeQuery("select DISTINCT id,name, body_location from symptoms");
            while (dbcon.rs.next()) {
                if (!teset.contains(dbcon.rs.getString(2))) {
                    list.addElement(dbcon.rs.getString(2));
                    teset.addElement(dbcon.rs.getString(2));
                }
                if (!tester.contains(dbcon.rs.getString(3))) {
                    combomodel.addElement(dbcon.rs.getString(3));
                    tester.addElement(dbcon.rs.getString(3));
                }
                combo2.addElement(dbcon.rs.getString(1));
            }
            jList2.setModel(list);
            jComboBox1.setModel(combomodel);

                       list = new DefaultListModel();
        jList4.setModel(list);
        jList3.setModel(list);
        jList5.setModel(list);
        jList6.setModel(list);
        jList2.requestFocus();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void set_point(String point){
         String a=combo8.elementAt(jList8.getSelectedIndex());
        try {
            dbcon.ps=dbcon.con.prepareStatement("Update piority_map set point ='"+point+"' where id="+a);
               dbcon.ps.execute();
                        JOptionPane.showMessageDialog(null,combo8.elementAt(jList8.getSelectedIndex()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
