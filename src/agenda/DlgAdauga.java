
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import javax.swing.*;
import java.time.*;
import java.time.format.*;

public class DlgAdauga extends javax.swing.JDialog {
    private Contact contact = null; 
  
    public DlgAdauga(java.awt.Frame parent, int id, boolean modal) {
        super(parent, modal);
        initComponents();    
        if (id > -1){
            contact = Agenda.getInstance().getContact(id);
            txtFirstname.setText(contact.getFirstname());
            txtLastname.setText(contact.getLastname());
            txtPhoneNr.setText(contact.getPhoneno());
            txtBirthdate.setText(contact.getBirthdate());
            if (contact.getMob_fix().equals("M")){
                ckTelMobil.setSelected(true);
            }
        }       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtFirstname = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtPhoneNr = new javax.swing.JTextField();
        ckTelMobil = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBirthdate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adauga/Editeaza");
        setResizable(false);

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        ckTelMobil.setText("Tel. Mobil");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Phone number");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("First name");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Last name");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Birth date");
        jLabel4.setToolTipText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstname)
                            .addComponent(txtPhoneNr)
                            .addComponent(txtBirthdate, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckTelMobil)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPhoneNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckTelMobil))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(btnCancel))
                .addGap(26, 26, 26))
        );

        btnOK.getAccessibleContext().setAccessibleName("btnOK");
        btnCancel.getAccessibleContext().setAccessibleName("btnCancel");
        txtFirstname.getAccessibleContext().setAccessibleName("txtFirstname");
        txtLastname.getAccessibleContext().setAccessibleName("txtLastname");
        txtPhoneNr.getAccessibleContext().setAccessibleName("txtPhoneNr");
        ckTelMobil.getAccessibleContext().setAccessibleName("ckTelMobil");
        txtBirthdate.getAccessibleContext().setAccessibleName("txtBirthdate");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        String phoneno = txtPhoneNr.getText();
        if (!checkPhoneNo(phoneno)){
            JOptionPane.showMessageDialog(null, "Format nr. de telefon incorect!",
                    "Eroare de editare", JOptionPane.INFORMATION_MESSAGE);
            txtPhoneNr.grabFocus();
            return;
        }
        String birthdate = txtBirthdate.getText();
        if (!checkBirthdate(birthdate)){
            JOptionPane.showMessageDialog(null, "Format ziua de nastere incorect!",
                    "Eroare de editare", JOptionPane.INFORMATION_MESSAGE);
            txtBirthdate.grabFocus();
            return;
        }
        String firstname = txtFirstname.getText();
        String lastname = txtLastname.getText();
        String mob_fix = "F";
        if(ckTelMobil.isSelected()){
            mob_fix = "M";
        }
        int id = Agenda.getInstance().getMaxId() + 1;
        Contact c = new Contact(id, firstname, lastname, phoneno,
            mob_fix, birthdate);
        if (contact != null){
            if (!contact.equals(c)){
                contact.setFirstname(firstname);
                contact.setLastname(lastname);
                contact.setPhoneno(phoneno);
                contact.setBirthdate(birthdate);
                contact.setMob_fix(mob_fix);
                Agenda.getInstance().setChanged(true);
            }
        }
        else {
            Agenda.getInstance().addContact(c);
            Agenda.getInstance().setMaxId(id);
            Agenda.getInstance().setChanged(true);
        }
        dispose();
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private boolean checkPhoneNo(String phoneno){
        // Verifica corectitudinea numarului de telefon
        if (phoneno.length() != 10) {
            return false;
        }
        String sub = phoneno.substring(0, 2);
        if (!sub.equals("07") && !sub.equals("02") && !sub.equals("03")) {
            return false;
        }
        for (int i = 2; i < phoneno.length(); i++) {
            if (!Character.isDigit(phoneno.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    private boolean checkBirthdate(String birthdate){
        // Verifica corectitudinea numarului de telefon
        LocalDate ld = null;
        try{
            ld = LocalDate.parse(birthdate);
        }
        catch(DateTimeParseException dtpe){
            return false;
        }
        LocalDate ldcurr = LocalDate.now();
        if (ldcurr.isBefore(ld)){
            return false;
        }
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JCheckBox ckTelMobil;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtBirthdate;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtPhoneNr;
    // End of variables declaration//GEN-END:variables
}

