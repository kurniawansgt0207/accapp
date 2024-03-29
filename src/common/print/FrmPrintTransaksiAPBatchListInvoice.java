/*
 * FrmPrintMasterBahanBaku.java
 *
 * Created on September 8, 2009, 4:18 PM
 */

package common.print;

import accapp.objectclasses.ap.Ap_invbatchlists;
import accapp.objectclasses.ap.Ap_paybatchlists;
import common.component.FrmBrowse;
import common.utils.CodeException;
import common.utils.GlobalUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author  wgata
 */
public class FrmPrintTransaksiAPBatchListInvoice extends javax.swing.JDialog {
    
    DateFormat dateformat=new SimpleDateFormat("MM/dd/yyyy");
    DateFormat dateformatprint =new SimpleDateFormat("yyyy-MM-dd");

    /** Creates new form FrmPrintMasterBahanBaku */
    public FrmPrintTransaksiAPBatchListInvoice(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public FrmPrintTransaksiAPBatchListInvoice() {
        initComponents();

    }

    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtNoBatchFr = new javax.swing.JTextField();
        jlblHeader = new javax.swing.JLabel();
        jbtnCetak = new javax.swing.JButton();
        jbtnSelesai = new javax.swing.JButton();
        jbtnBatchFr = new javax.swing.JButton();
        jtxtNoBatchTo = new javax.swing.JTextField();
        jbtnBatchTo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jcmblistingfor = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        batchdatefr = new org.kazao.calendar.KazaoCalendarDate();
        jLabel9 = new javax.swing.JLabel();
        batchdateto = new org.kazao.calendar.KazaoCalendarDate();
        jPanel1 = new javax.swing.JPanel();
        jchkenter = new javax.swing.JCheckBox();
        jchkimport = new javax.swing.JCheckBox();
        jchktransfer = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jchkopen = new javax.swing.JCheckBox();
        jchkpost = new javax.swing.JCheckBox();
        jchkdeleted = new javax.swing.JCheckBox();
        jchkerror = new javax.swing.JCheckBox();
        jchkinclude = new javax.swing.JCheckBox();
        jcmbCuttOf = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Report: AP-Transaction Batch Listing");
        getContentPane().setLayout(null);

        jtxtNoBatchFr.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxtNoBatchFr);
        jtxtNoBatchFr.setBounds(140, 140, 100, 20);

        jlblHeader.setFont(new java.awt.Font("Dialog", 1, 12));
        jlblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblHeader.setText("AP - Transaction Batch Listing");
        jlblHeader.setToolTipText("<html>\nFrmPrintTransaksiAPBatchListInvoice:Invoice:TransaksiAPBatchListInvoice.jrxml<br>\nFrmPrintTransaksiAPBatchListInvoice:Payment:TransaksiAPBatchListPayment.jrxml\n</html>");
        jlblHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jlblHeader);
        jlblHeader.setBounds(10, 10, 430, 40);

        jbtnCetak.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnCetak.setText("Print");
        jbtnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCetakActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCetak);
        jbtnCetak.setBounds(70, 390, 90, 23);

        jbtnSelesai.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnSelesai.setText("End");
        jbtnSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSelesaiActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSelesai);
        jbtnSelesai.setBounds(280, 390, 90, 23);

        jbtnBatchFr.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBatchFr.setText("...");
        jbtnBatchFr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBatchFrActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBatchFr);
        jbtnBatchFr.setBounds(240, 140, 20, 20);

        jtxtNoBatchTo.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxtNoBatchTo);
        jtxtNoBatchTo.setBounds(300, 140, 100, 20);

        jbtnBatchTo.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBatchTo.setText("...");
        jbtnBatchTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBatchToActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBatchTo);
        jbtnBatchTo.setBounds(400, 140, 20, 20);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel3.setText("Date");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 180, 100, 20);

        jcmblistingfor.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jcmblistingfor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Invoice Batches", "Buku Ekspedisi REKAP", "Buku Ekspedisi DETAIL", "Payment Batches" }));
        jcmblistingfor.setToolTipText("Invoice Batches, Buku Ekspedisi REKAP, Buku Ekspedisi DETAIL, Payment Batches");
        jcmblistingfor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmblistingforItemStateChanged(evt);
            }
        });
        jcmblistingfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmblistingforActionPerformed(evt);
            }
        });
        getContentPane().add(jcmblistingfor);
        jcmblistingfor.setBounds(140, 70, 150, 20);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("To");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(270, 180, 20, 20);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel4.setText("Listing For");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 70, 110, 20);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel5.setText("Batch");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 140, 100, 20);

        batchdatefr.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(batchdatefr);
        batchdatefr.setBounds(140, 180, 120, 20);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("To");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(270, 140, 20, 20);

        batchdateto.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(batchdateto);
        batchdateto.setBounds(300, 180, 120, 20);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Of Type"));
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 10));
        jPanel1.setLayout(null);

        jchkenter.setFont(new java.awt.Font("Dialog", 1, 10));
        jchkenter.setSelected(true);
        jchkenter.setText("Entered");
        jPanel1.add(jchkenter);
        jchkenter.setBounds(10, 20, 63, 23);

        jchkimport.setFont(new java.awt.Font("Dialog", 1, 10));
        jchkimport.setSelected(true);
        jchkimport.setText("Imported");
        jPanel1.add(jchkimport);
        jchkimport.setBounds(10, 50, 69, 23);

        jchktransfer.setFont(new java.awt.Font("Dialog", 1, 10));
        jchktransfer.setSelected(true);
        jchktransfer.setText("Generated");
        jPanel1.add(jchktransfer);
        jchktransfer.setBounds(10, 80, 77, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 250, 170, 120);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Having Status Of"));
        jPanel2.setFont(new java.awt.Font("Dialog", 0, 10));
        jPanel2.setLayout(null);

        jchkopen.setFont(new java.awt.Font("Dialog", 1, 10));
        jchkopen.setSelected(true);
        jchkopen.setText("Open");
        jPanel2.add(jchkopen);
        jchkopen.setBounds(10, 20, 51, 23);

        jchkpost.setFont(new java.awt.Font("Dialog", 1, 10));
        jchkpost.setSelected(true);
        jchkpost.setText(" Post");
        jPanel2.add(jchkpost);
        jchkpost.setBounds(10, 40, 150, 23);

        jchkdeleted.setFont(new java.awt.Font("Dialog", 1, 10));
        jchkdeleted.setText(" Deleted");
        jPanel2.add(jchkdeleted);
        jchkdeleted.setBounds(10, 80, 150, 23);

        jchkerror.setFont(new java.awt.Font("Dialog", 1, 10));
        jchkerror.setText(" Error");
        jPanel2.add(jchkerror);
        jchkerror.setBounds(10, 60, 90, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(250, 250, 170, 120);

        jchkinclude.setFont(new java.awt.Font("Dialog", 1, 10));
        jchkinclude.setSelected(true);
        jchkinclude.setText("Including Previously Printed Batches");
        getContentPane().add(jchkinclude);
        jchkinclude.setBounds(30, 210, 290, 23);

        jcmbCuttOf.setFont(new java.awt.Font("Dialog", 0, 10));
        jcmbCuttOf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "No Batch", "Document Date" }));
        jcmbCuttOf.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcmbCuttOf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbCuttOfItemStateChanged(evt);
            }
        });
        getContentPane().add(jcmbCuttOf);
        jcmbCuttOf.setBounds(140, 110, 150, 20);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel1.setText("Cutt Of by");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 110, 80, 14);

        jButton1.setFont(new java.awt.Font("Dialog", 0, 10));
        jButton1.setText("Export CSV");
        jButton1.setToolTipText("Export format .csv (tabel)");
        getContentPane().add(jButton1);
        jButton1.setBounds(175, 390, 90, 23);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-462)/2, (screenSize.height-463)/2, 462, 463);
    }// </editor-fold>//GEN-END:initComponents

private void jbtnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSelesaiActionPerformed

    this.dispose();
}//GEN-LAST:event_jbtnSelesaiActionPerformed

private void jbtnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCetakActionPerformed

        
    try{
        setCursor(GlobalUtils.HOURGLASSCURSOR);
        String file   = "" ;
        Map parameter = new HashMap();    

        parameter.put("operator",GlobalUtils.userid);
        parameter.put("listingfor", jcmblistingfor.getSelectedItem());
        if(jcmbCuttOf.getSelectedIndex()==1){
               parameter.put("batchnofr", jtxtNoBatchFr.getText());
               parameter.put("batchnoto", jtxtNoBatchTo.getText());
               parameter.put("batchdatefro","2000-01-01");
               parameter.put("batchdatetoo","3000-12-31");
               System.out.println( jtxtNoBatchFr.getText());
               System.out.println( jtxtNoBatchTo.getText());

        }else if(jcmbCuttOf.getSelectedIndex()==2){
               parameter.put("batchnofr", "1");
               parameter.put("batchnoto", "999999999999");
               String tgl1 = dateformatprint.format(dateformat.parse(batchdatefr.getDate()));
               String tgl2 = dateformatprint.format(dateformat.parse(batchdateto.getDate()));
               System.out.println(tgl1);
               System.out.println(tgl2);
               parameter.put("batchdatefro",tgl1);
               parameter.put("batchdatetoo",tgl2);
        }
        String open="";
        String ready="";
        String error="";
        String deleted="";
        if(jchkopen.isSelected()){
             open="1";
        }else{
            open="P";
        }
        if(jchkpost.isSelected()){
             ready="2";
        }else{
            ready="R";
        }
         if(jchkerror.isSelected()){
            error="3";
        }else{
            error="E";
        }
        if(jchkdeleted.isSelected()){
            deleted="4";
        }else{
            deleted="D";
        }

        parameter.put("status1", open);
        parameter.put("status2", ready);
        parameter.put("status3", error);
        parameter.put("status4", deleted);
        parameter.put("swprint", jchkinclude.isSelected() ? "1" : "0");
        parameter.put("entried", jchkenter.isSelected() ? "1" :"E");
        parameter.put("imported", jchkimport.isSelected() ? "2" :"I");
        parameter.put("transfer", jchktransfer.isSelected() ? "3" :"T");

        System.out.println(open);
        System.out.println(ready);
        System.out.println(jchkinclude.isSelected() ? "1" : "0");
        System.out.println(jchkenter.isSelected() ? "1" : "E");
        System.out.println(jchkimport.isSelected() ? "2" : "I");
        System.out.println(jchktransfer.isSelected() ? "3" : "T");
         
        if(jcmblistingfor.getSelectedIndex()==0 ){
           file = GlobalUtils.getCurrentDir() +"/Reports/TransaksiAPBatchListInvoice.jrxml";
        }else if(jcmblistingfor.getSelectedIndex()==1 ) {
           file = GlobalUtils.getCurrentDir() +"/Reports/TransaksiAPBukuEkspedisi.jrxml";
        }else if(jcmblistingfor.getSelectedIndex()==2 ) {
           file = GlobalUtils.getCurrentDir() +"/Reports/APBukuEkspedisi.jrxml";
        }else if(jcmblistingfor.getSelectedIndex()==3 ) {
           file = GlobalUtils.getCurrentDir() +"/Reports/TransaksiAPBatchListPayment.jrxml";
        }

        GlobalUtils.printReport(file, parameter, false);
    }catch (Exception e) {
        e.printStackTrace();
    }
    setCursor(GlobalUtils.NORMALCURSOR);
}//GEN-LAST:event_jbtnCetakActionPerformed

private void jmbModelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jmbModelPropertyChange

}//GEN-LAST:event_jmbModelPropertyChange

private void jbtnBatchFrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBatchFrActionPerformed
    try {
        if(jcmblistingfor.getSelectedIndex()==3){
            Ap_paybatchlists brs = new Ap_paybatchlists();
	    FrmBrowse bd = new FrmBrowse(brs);
            bd.setFirstValue(jtxtNoBatchFr);
            bd.setModal(true);
            bd.setVisible(true);
        }else{
            Ap_invbatchlists brs = new Ap_invbatchlists();
            FrmBrowse bd = new FrmBrowse(brs);
            bd.setFirstValue(jtxtNoBatchFr);
            bd.setModal(true);
            bd.setVisible(true);
        }

	  } catch (CodeException ex) {
	      ex.printStackTrace();
	  }
}//GEN-LAST:event_jbtnBatchFrActionPerformed

private void jbtnBatchToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBatchToActionPerformed
try {
	  if(jcmblistingfor.getSelectedIndex()==0){
            Ap_invbatchlists brs = new Ap_invbatchlists();
	    FrmBrowse bd = new FrmBrowse(brs);
            bd.setFirstValue(jtxtNoBatchTo);
            bd.setModal(true);
            bd.setVisible(true);
        }else{
             Ap_paybatchlists brs = new Ap_paybatchlists();
             FrmBrowse bd = new FrmBrowse(brs);
            bd.setFirstValue(jtxtNoBatchTo);
            bd.setModal(true);
            bd.setVisible(true);
        }

	  } catch (CodeException ex) {
	      ex.printStackTrace();
	  }
}//GEN-LAST:event_jbtnBatchToActionPerformed

private void jcmblistingforItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmblistingforItemStateChanged
    
}//GEN-LAST:event_jcmblistingforItemStateChanged

private void jcmbCuttOfItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbCuttOfItemStateChanged

    if(jcmbCuttOf.getSelectedIndex()==0){
        jtxtNoBatchFr.setVisible(false);
        jtxtNoBatchTo.setVisible(false);
        batchdatefr.setVisible(false);
        batchdateto.setVisible(false);
        jLabel3.setVisible(false);
        jLabel5.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jbtnBatchFr.setVisible(false);
        jbtnBatchTo.setVisible(false);
    }else{
        if(jcmbCuttOf.getSelectedIndex()==1){
            jtxtNoBatchFr.setVisible(true);
            jtxtNoBatchTo.setVisible(true);
            batchdatefr.setVisible(false);
            batchdateto.setVisible(false);
            jLabel3.setVisible(false);
            jLabel5.setVisible(true);
            jLabel8.setVisible(false);
            jLabel9.setVisible(true);
            jbtnBatchFr.setVisible(true);
            jbtnBatchTo.setVisible(true);
        }else{
            jtxtNoBatchFr.setVisible(false);
            jtxtNoBatchTo.setVisible(false);
            batchdatefr.setVisible(true);
            batchdateto.setVisible(true);
            jLabel3.setVisible(true);
            jLabel5.setVisible(false);
            jLabel8.setVisible(true);
            jLabel9.setVisible(false);
            jbtnBatchFr.setVisible(false);
            jbtnBatchTo.setVisible(false);
        }
    }
}//GEN-LAST:event_jcmbCuttOfItemStateChanged

private void jcmblistingforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmblistingforActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jcmblistingforActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPrintTransaksiAPBatchListInvoice dialog = new FrmPrintTransaksiAPBatchListInvoice(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.kazao.calendar.KazaoCalendarDate batchdatefr;
    private org.kazao.calendar.KazaoCalendarDate batchdateto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnBatchFr;
    private javax.swing.JButton jbtnBatchTo;
    private javax.swing.JButton jbtnCetak;
    private javax.swing.JButton jbtnSelesai;
    private javax.swing.JCheckBox jchkdeleted;
    private javax.swing.JCheckBox jchkenter;
    private javax.swing.JCheckBox jchkerror;
    private javax.swing.JCheckBox jchkimport;
    private javax.swing.JCheckBox jchkinclude;
    private javax.swing.JCheckBox jchkopen;
    private javax.swing.JCheckBox jchkpost;
    private javax.swing.JCheckBox jchktransfer;
    private javax.swing.JComboBox jcmbCuttOf;
    public javax.swing.JComboBox jcmblistingfor;
    public javax.swing.JLabel jlblHeader;
    public javax.swing.JTextField jtxtNoBatchFr;
    public javax.swing.JTextField jtxtNoBatchTo;
    // End of variables declaration//GEN-END:variables

}
