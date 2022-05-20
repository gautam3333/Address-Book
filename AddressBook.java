import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddressBook extends javax.swing.JFrame {
    Connection con = null;
    
    public AddressBook() {
        initComponents();
        con = DatabaseConnection.getDB();
        showData();
    }
    
    //----------------------------------- ARRAY LIST -----------------------------------
    public ArrayList<Contacts> conList()
    {
        ArrayList<Contacts> al = new ArrayList();
        try
        {
            String selectQuery = "select fname, phone, email, address from addressbook.contacts";
            PreparedStatement ps = con.prepareStatement(selectQuery);
            ResultSet rs = ps.executeQuery();
            Contacts conts;
            while (rs.next())
            {
                conts = new Contacts(rs.getString("fname"), rs.getLong("phone"), rs.getString("email"), rs.getString("address"));
                al.add(conts);
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return al;
    }
    
    //----------------------------------- SHOW TABLE DATA -----------------------------------
    public void showData()
    {
        ArrayList<Contacts> list = conList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getName();
            row[1] = list.get(i).getPhone();
            row[2] = list.get(i).getEmail();
            row[3] = list.get(i).getAddress();
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 243, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(244, 243, 244));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(4, 3, 12)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 50)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo1.png"))); // NOI18N
        jLabel1.setText("Address Book");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 410, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 120));

        jPanel3.setBackground(new java.awt.Color(244, 243, 244));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(4, 3, 12)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Phone");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 70, 30));

        txtPhone.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 243)));
        jPanel3.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 250, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Email");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 70, 30));

        txtEmail.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 243)));
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 250, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Address");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 70, 30));

        txtAddress.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 243)));
        jPanel3.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 250, 30));

        txtName.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 241, 243)));
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 250, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 70, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 630, 200));

        jPanel4.setBackground(new java.awt.Color(244, 243, 244));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(4, 3, 12));
        btnAdd.setText("Add");
        btnAdd.setBorder(null);
        btnAdd.setFocusPainted(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel4.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 120, 35));

        btnExit.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(4, 3, 12));
        btnExit.setText("Exit");
        btnExit.setBorder(null);
        btnExit.setFocusPainted(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel4.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 120, 35));

        btnEdit.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(4, 3, 12));
        btnEdit.setText("Edit");
        btnEdit.setBorder(null);
        btnEdit.setFocusPainted(false);
        btnEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel4.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 120, 35));

        btnDelete.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(4, 3, 12));
        btnDelete.setText("Delete");
        btnDelete.setBorder(null);
        btnDelete.setFocusPainted(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 120, 35));

        btnReset.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(4, 3, 12));
        btnReset.setText("Reset");
        btnReset.setBorder(null);
        btnReset.setFocusPainted(false);
        btnReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel4.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 120, 35));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 270, 200));

        jTable1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(4, 3, 12));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Phone", "Email", "Address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 900, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //----------------------------------- EXIT THE APPLICATION -----------------------------------
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        ImageIcon icon = new ImageIcon("src/images/exit.png");
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, icon);
        if (option == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    //----------------------------------- CLEARS DATA -----------------------------------
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtName.setText(null);
        txtPhone.setText(null);
        txtEmail.setText(null);
        txtAddress.setText(null);
    }//GEN-LAST:event_btnResetActionPerformed
    
    //----------------------------------- INSERT DATA -----------------------------------
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        ImageIcon icon = new ImageIcon("src/images/adc.png");
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to add this contact?", "New Contact", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, icon);
        if (option == JOptionPane.YES_OPTION)
        {
            try
            {
                String insertQuery = "insert into contacts values (?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(insertQuery);
                ps.setString(1, txtName.getText());
                ps.setLong(2, Long.valueOf(txtPhone.getText()));
                ps.setString(3, txtEmail.getText());
                ps.setString(4, txtAddress.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Contact saved");
                //---------------------------- CLEARS TABLE DATA ----------------------------
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                showData();
            }
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed
    
    //---------------------------- RETRIEVE TABLE DATA ----------------------------
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        txtName.setText(String.valueOf(model.getValueAt(selectedRow, 0)));
        txtPhone.setText(String.valueOf(model.getValueAt(selectedRow, 1)));
        txtEmail.setText(String.valueOf(model.getValueAt(selectedRow, 2)));
        txtAddress.setText(String.valueOf(model.getValueAt(selectedRow, 3)));
    }//GEN-LAST:event_jTable1MouseClicked

    //------------------------------- UPDATE DATA -------------------------------
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        ImageIcon icon = new ImageIcon("src/images/update.png");
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to update the contact", "Update Contact", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, icon);
        if (option == JOptionPane.YES_OPTION)
        {
            try
            {
                String updateQuery = "update contacts set "
                + " phone = ?, "
                + " email = ?, "
                + " address = ? where fname = ?";
                PreparedStatement ps = con.prepareStatement(updateQuery);
                ps.setLong(1, Long.valueOf(txtPhone.getText()));
                ps.setString(2, txtEmail.getText());
                ps.setString(3, txtAddress.getText());
                ps.setString(4, txtName.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Contact updated");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                showData();
            }
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed
    
    //---------------------------------DETETE DATA ---------------------------------
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        ImageIcon icon = new ImageIcon("src/images/delete.png");
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this contact?", "Delete Contact", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, icon);
        if (option == JOptionPane.YES_OPTION)
        {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int selectedRow = jTable1.getSelectedRow();
            String name = String.valueOf(model.getValueAt(selectedRow, 0));
            try
            {
                String deleteQuery = "delete from contacts where fname = ?";
                PreparedStatement ps = con.prepareStatement(deleteQuery);
                ps.setString(1, name);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Contact deleted");
                model.setRowCount(0);
                showData(); 
            }
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddressBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
