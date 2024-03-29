/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmAp_invpopdoctotal.java
 *
 * Created on Nov 11, 2010, 3:02:53 PM
 */

package accapp.component.ap;

import accapp.objectclasses.ap.Ap_invh;
import accapp.objectclasses.ap.Ap_vendor;
import accapp.objectclasses.op.Op_tax;
import accapp.objectclasses.op.Op_taxs;
import common.component.FrmBrowse;
import common.tablemodels.GlobalModel;
import common.utils.CodeException;
import common.utils.GlobalUtils;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author isparthama
 */
public class FrmAp_invpopdoctotal extends javax.swing.JDialog {
    Ap_invh arinvh=null;
    Ap_vendor arcust=null;
    Op_tax optax=null;

    Object[] datadetail;
    DefaultTableModel tmodeldetail;
    /** Creates new form FrmAp_invpopdoctotal */
    public FrmAp_invpopdoctotal(Ap_invh arinvh) {
        initComponents();
        this.setLocationRelativeTo(null);

        datadetail = new Object[jtblDetail.getRowCount()];
        tmodeldetail = (DefaultTableModel) jtblDetail.getModel();

        this.arinvh=arinvh;
        showdata();
    }

    private void calculateundistributed() throws CodeException{
        Double undistributed=new Double(0);
        Double doctoalafttaxamt=arinvh.getdoctotalafttaxamt();
        Double doctotalamt=GlobalUtils.toDbl(jtxtdoctotalamt.getText());
        Double taxtotalamt=GlobalUtils.toDbl(jtxttaxtotalamt.getText());

        undistributed=doctoalafttaxamt-(doctotalamt+taxtotalamt);

        jtxtppdtotalamt.setText(GlobalUtils.formatnumber(undistributed));
    }

    private void showdata(){
        GlobalModel.clearRow(tmodeldetail);
        try {
            jtxtDocEntry.setText(GlobalUtils.churuf(arinvh.getdocentry()));
            jtxtCustomerNo.setText(arinvh.getvendcode());

            arcust=new Ap_vendor(arinvh.getvendcode());

            jtxtdoctype.setText(arinvh.getdoctype());
            jtxtcurnccode.setText(arinvh.getcurnccode());
            jtxtdocnum.setText(arinvh.getdocnum());

            jtxtdoctotalamt.setText(GlobalUtils.formatnumber(arinvh.getdoctotalamt()));
            jtxttaxtotalamt.setText(GlobalUtils.formatnumber(arinvh.gettaxtotalamt()));
            jtxtdiscvalueamt.setText(GlobalUtils.formatnumber(arinvh.getdiscvalueamt()));

            GlobalModel.clearRow(tmodeldetail);
            tmodeldetail.addRow(datadetail);

            tmodeldetail.setValueAt(arinvh.gettaxcode(), tmodeldetail.getRowCount()-1, 1);
            tmodeldetail.setValueAt(arinvh.getdoctotalamt(), tmodeldetail.getRowCount()-1, 2);

            optax=new Op_tax(arinvh.gettaxcode());
            double taxval=optax.gettaxvalue();

            double taxamount=arinvh.getdoctotalamt()*(taxval/100);

            tmodeldetail.setValueAt(taxamount, tmodeldetail.getRowCount()-1, 3);
            tmodeldetail.setValueAt(optax.getdscription(), tmodeldetail.getRowCount()-1, 0);

            //jtxttaxtotalamt.setText(GlobalUtils.formatnumber(taxamount));
            GlobalUtils.selectCellTable(jtblDetail, 0, 0);

            calculatetotal();

            calculateundistributed();

        } catch (CodeException ex) {
            Logger.getLogger(FrmAp_invpopdoctotal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void calculatetotal(){
        double doctotalamt=GlobalUtils.toDbl(jtxtdoctotalamt.getText());
        double taxtotalamt=GlobalUtils.toDbl(jtxttaxtotalamt.getText());
        double ppdtotalamt=GlobalUtils.toDbl(jtxtppdtotalamt.getText());
        double discvalueamt=GlobalUtils.toDbl(jtxtdiscvalueamt.getText());

        double doctotal=0;
        double amountdue=0;

        doctotal=taxtotalamt+doctotalamt;
        amountdue=doctotal-discvalueamt-ppdtotalamt;

        jtxtDocEntry6.setText(GlobalUtils.formatnumber(doctotal));
        jtxtDocEntry9.setText(GlobalUtils.formatnumber(amountdue));


    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtDocEntry = new javax.swing.JTextField();
        jtxtCustomerNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtdocnum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtDocEntry1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtdoctype = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtcurnccode = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jbtnDistTaxes = new javax.swing.JButton();
        jbtnCalcTax = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDetail = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jtxtdoctotalamt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxttaxtotalamt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtDocEntry6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxtppdtotalamt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtxtdiscvalueamt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxtDocEntry9 = new javax.swing.JTextField();
        jbtnPrint = new javax.swing.JButton();
        jbtnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Document Totals");
        setMinimumSize(new java.awt.Dimension(600, 455));
        getContentPane().setLayout(null);

        jLabel1.setText("Document");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 50, 90, 15);

        jLabel2.setText("Entry");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 90, 15);

        jtxtDocEntry.setEditable(false);
        jtxtDocEntry.setText("jtxtdocentry");
        getContentPane().add(jtxtDocEntry);
        jtxtDocEntry.setBounds(110, 10, 130, 19);

        jtxtCustomerNo.setEditable(false);
        jtxtCustomerNo.setText("jtxtCustomerNo");
        getContentPane().add(jtxtCustomerNo);
        jtxtCustomerNo.setBounds(110, 30, 130, 19);

        jLabel3.setText("Customer No.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 30, 90, 15);

        jtxtdocnum.setEditable(false);
        jtxtdocnum.setText("jtxtCustomerNo");
        getContentPane().add(jtxtdocnum);
        jtxtdocnum.setBounds(110, 50, 130, 19);

        jLabel4.setText("Printed");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 10, 60, 15);

        jtxtDocEntry1.setEditable(false);
        jtxtDocEntry1.setText("jtxtdocentry");
        getContentPane().add(jtxtDocEntry1);
        jtxtDocEntry1.setBounds(320, 10, 80, 19);

        jLabel5.setText("Type");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 30, 60, 15);

        jtxtdoctype.setEditable(false);
        jtxtdoctype.setText("jtxtdocentry");
        getContentPane().add(jtxtdoctype);
        jtxtdoctype.setBounds(320, 30, 80, 19);

        jLabel6.setText("Currency");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(410, 30, 60, 15);

        jtxtcurnccode.setEditable(false);
        jtxtcurnccode.setText("jtxtdocentry");
        getContentPane().add(jtxtcurnccode);
        jtxtcurnccode.setBounds(470, 30, 80, 19);

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Calculate Tax");
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(260, 50, 110, 23);

        jbtnDistTaxes.setText("Dist. Taxes");
        jbtnDistTaxes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDistTaxesActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDistTaxes);
        jbtnDistTaxes.setBounds(470, 50, 110, 25);

        jbtnCalcTax.setText("Calc. Tax");
        jbtnCalcTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCalcTaxActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCalcTax);
        jbtnCalcTax.setBounds(381, 50, 89, 25);

        jtblDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tax Authority", "Cust. Tax Class", "Tax Base", "Tax Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtblDetail.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtblDetailPropertyChange(evt);
            }
        });
        jtblDetail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtblDetailKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtblDetail);
        jtblDetail.getColumnModel().getColumn(0).setMinWidth(200);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 570, 150);

        jLabel7.setText("Total Dist Net of Tax");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 240, 150, 15);

        jtxtdoctotalamt.setEditable(false);
        jtxtdoctotalamt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtdoctotalamt.setText("jtxtdoctotalamt");
        getContentPane().add(jtxtdoctotalamt);
        jtxtdoctotalamt.setBounds(250, 240, 130, 19);

        jLabel8.setText("Plus Taxes");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 280, 90, 15);

        jtxttaxtotalamt.setEditable(false);
        jtxttaxtotalamt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxttaxtotalamt.setText("jtxttaxtotalamt");
        getContentPane().add(jtxttaxtotalamt);
        jtxttaxtotalamt.setBounds(250, 280, 130, 19);

        jLabel9.setText("Doc. Total");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 300, 90, 15);

        jtxtDocEntry6.setEditable(false);
        jtxtDocEntry6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtDocEntry6.setText("jtxtdocentry");
        getContentPane().add(jtxtDocEntry6);
        jtxtDocEntry6.setBounds(250, 300, 130, 19);

        jLabel10.setText("Undistributted Amount");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 260, 180, 15);

        jtxtppdtotalamt.setEditable(false);
        jtxtppdtotalamt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtppdtotalamt.setText("jtxtppdtotalamt");
        getContentPane().add(jtxtppdtotalamt);
        jtxtppdtotalamt.setBounds(250, 260, 130, 19);

        jLabel11.setText("Less Discount");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 320, 90, 15);

        jtxtdiscvalueamt.setEditable(false);
        jtxtdiscvalueamt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtdiscvalueamt.setText("jtxtdiscvalueamt");
        getContentPane().add(jtxtdiscvalueamt);
        jtxtdiscvalueamt.setBounds(250, 320, 130, 19);

        jLabel12.setText("Net Payable");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 340, 90, 15);

        jtxtDocEntry9.setEditable(false);
        jtxtDocEntry9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtDocEntry9.setText("jtxtdocentry");
        getContentPane().add(jtxtDocEntry9);
        jtxtDocEntry9.setBounds(250, 340, 130, 19);

        jbtnPrint.setText("Print");
        getContentPane().add(jbtnPrint);
        jbtnPrint.setBounds(80, 380, 88, 25);

        jbtnSave.setText("Save");
        jbtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSave);
        jbtnSave.setBounds(10, 380, 62, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtblDetailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtblDetailKeyPressed
        // TODO add your handling code here:

        int row=jtblDetail.getSelectedRow();
        int col=jtblDetail.getSelectedColumn();

        if (evt.getKeyCode()==evt.VK_F5&&col==0){
            Op_taxs brs;
            try {
                brs = new Op_taxs();
                FrmBrowse bd=new FrmBrowse(tmodeldetail, brs, row, 1);
                bd.retrieveData();
                bd.setModal(true);
                bd.setVisible(true);

                String taxcode=GlobalUtils.churuf(jtblDetail.getValueAt(row,1));
                arinvh.settaxcode(taxcode);
                optax=new Op_tax(taxcode);
                tmodeldetail.setValueAt(optax.getdscription(), tmodeldetail.getRowCount()-1, 0);

                double taxval=optax.gettaxvalue();
                double taxamount=arinvh.getdoctotalamt()*(taxval/100);

                tmodeldetail.setValueAt(taxamount, tmodeldetail.getRowCount()-1, 3);

                calculatetotal();

            } catch (CodeException ex) {
                Logger.getLogger(FrmAp_invpopdoctotal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jtblDetailKeyPressed

    private void jtblDetailPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtblDetailPropertyChange
        // TODO add your handling code here:

        int col=jtblDetail.getSelectedColumn();

        if (col==2){
            calculatetotal();
        }
    }//GEN-LAST:event_jtblDetailPropertyChange

    private void jbtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveActionPerformed
        try {
            // TODO add your handling code here:
            arinvh.settaxbase(GlobalUtils.toDbl(jtxtdoctotalamt.getText()));
            arinvh.setdoctotalamt(GlobalUtils.toDbl(jtxtdoctotalamt.getText()));
            arinvh.settaxamt(optax.gettaxvalue());
            arinvh.settaxtotalamt(GlobalUtils.toDbl(jtxttaxtotalamt.getText()));
            //arinvh.setdoctotalafttaxamt(GlobalUtils.toDbl(jtxtDocEntry9.getText()));
        } catch (CodeException ex) {
            Logger.getLogger(FrmAp_invpopdoctotal.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_jbtnSaveActionPerformed

    private void jbtnCalcTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCalcTaxActionPerformed
        try {
            // TODO add your handling code here:
            optax = new Op_tax(arinvh.gettaxcode());
            double taxval=optax.gettaxvalue();

            double taxamount=arinvh.getdoctotalamt()*(taxval/100);

            tmodeldetail.setValueAt(taxamount, tmodeldetail.getRowCount()-1, 3);

            //jtxttaxtotalamt.setText(GlobalUtils.formatnumber(taxamount));

            calculatetotal();
        } catch (CodeException ex) {
            Logger.getLogger(FrmAp_invpopdoctotal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbtnCalcTaxActionPerformed

    private void jbtnDistTaxesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDistTaxesActionPerformed
        // TODO add your handling code here:
        jtxttaxtotalamt.setText(GlobalUtils.formatnumber(tmodeldetail.getValueAt(0, 3)));

        calculatetotal();
    }//GEN-LAST:event_jbtnDistTaxesActionPerformed

    /**
    * @param args the command line arguments
    */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnCalcTax;
    private javax.swing.JButton jbtnDistTaxes;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnSave;
    private javax.swing.JTable jtblDetail;
    private javax.swing.JTextField jtxtCustomerNo;
    private javax.swing.JTextField jtxtDocEntry;
    private javax.swing.JTextField jtxtDocEntry1;
    private javax.swing.JTextField jtxtDocEntry6;
    private javax.swing.JTextField jtxtDocEntry9;
    private javax.swing.JTextField jtxtcurnccode;
    private javax.swing.JTextField jtxtdiscvalueamt;
    private javax.swing.JTextField jtxtdocnum;
    private javax.swing.JTextField jtxtdoctotalamt;
    private javax.swing.JTextField jtxtdoctype;
    private javax.swing.JTextField jtxtppdtotalamt;
    private javax.swing.JTextField jtxttaxtotalamt;
    // End of variables declaration//GEN-END:variables

}
