/*
 * FrmPrintMasterBahanBaku.java
 *
 * Created on September 8, 2009, 4:18 PM
 */

package common.print;

import accapp.objectclasses.ar.Ar_accsets;
import accapp.objectclasses.ar.Ar_customers;
import common.component.FrmBrowse;
import common.utils.CodeException;
import common.utils.GlobalUtils;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author  wgata
 */
public class FrmPrintTransaksiARAgedTrialBalancebyDueDate extends javax.swing.JDialog {
    
    

    /** Creates new form FrmPrintMasterBahanBaku */
    public FrmPrintTransaksiARAgedTrialBalancebyDueDate(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public FrmPrintTransaksiARAgedTrialBalancebyDueDate() {
        initComponents();
        jtxtyopfr.setText((new Date()).getYear() + 1900 +"");

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
        jButton1 = new javax.swing.JButton();
        jtxtNoBatchTo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtyopfr = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcmbjenislaporan = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jcmbmopfr = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jtxtNoBatchFr1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jtxtNoBatchTo1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PRINT AR - AGING REPORT");
        getContentPane().setLayout(null);

        jtxtNoBatchFr.setFont(new java.awt.Font("SansSerif", 0, 10));
        jtxtNoBatchFr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtNoBatchFr);
        jtxtNoBatchFr.setBounds(140, 80, 100, 20);

        jlblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblHeader.setText("AR - AGING REPORT");
        jlblHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jlblHeader);
        jlblHeader.setBounds(30, 10, 390, 40);

        jbtnCetak.setText("Print");
        jbtnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCetakActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCetak);
        jbtnCetak.setBounds(140, 210, 90, 23);

        jbtnSelesai.setText("End");
        jbtnSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSelesaiActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSelesai);
        jbtnSelesai.setBounds(300, 210, 90, 23);

        jButton1.setText("...");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 80, 20, 20);

        jtxtNoBatchTo.setFont(new java.awt.Font("SansSerif", 0, 10));
        jtxtNoBatchTo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtNoBatchTo);
        jtxtNoBatchTo.setBounds(300, 80, 100, 20);

        jButton2.setText("...");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 80, 20, 20);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel3.setText("Cust. Code");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 80, 90, 20);

        jLabel8.setText("MOP");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 140, 40, 20);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel5.setText("YOP ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 140, 90, 20);

        jtxtyopfr.setFont(new java.awt.Font("SansSerif", 0, 10));
        jtxtyopfr.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jtxtyopfr);
        jtxtyopfr.setBounds(140, 140, 50, 18);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel6.setText("Report Type");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 170, 110, 20);

        jcmbjenislaporan.setFont(new java.awt.Font("Dialog", 1, 9));
        jcmbjenislaporan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Detail", "Summary" }));
        jcmbjenislaporan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jcmbjenislaporan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbjenislaporanItemStateChanged(evt);
            }
        });
        getContentPane().add(jcmbjenislaporan);
        jcmbjenislaporan.setBounds(140, 170, 120, 20);

        jLabel9.setText("To");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(270, 80, 20, 20);

        jcmbmopfr.setFont(new java.awt.Font("Dialog", 1, 10));
        jcmbmopfr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jcmbmopfr.setSelectedIndex(1);
        jcmbmopfr.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbmopfrItemStateChanged(evt);
            }
        });
        getContentPane().add(jcmbmopfr);
        jcmbmopfr.setBounds(300, 140, 38, 20);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel4.setText("Set Code");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 110, 90, 20);

        jtxtNoBatchFr1.setFont(new java.awt.Font("SansSerif", 0, 10));
        jtxtNoBatchFr1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtNoBatchFr1);
        jtxtNoBatchFr1.setBounds(140, 110, 100, 20);

        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(240, 110, 20, 20);

        jLabel10.setText("To");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(270, 110, 20, 20);

        jtxtNoBatchTo1.setFont(new java.awt.Font("SansSerif", 0, 10));
        jtxtNoBatchTo1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtNoBatchTo1);
        jtxtNoBatchTo1.setBounds(300, 110, 100, 20);

        jButton4.setText("...");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(400, 110, 20, 20);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-462)/2, (screenSize.height-282)/2, 462, 282);
    }// </editor-fold>//GEN-END:initComponents

private void jbtnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSelesaiActionPerformed

    this.dispose();
}//GEN-LAST:event_jbtnSelesaiActionPerformed

private void jbtnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCetakActionPerformed

        
    try{
        Map parameter = new HashMap();
//        parameter.put("kodeperusahaan", " ");
        parameter.put("operator", (GlobalUtils.getUserId()));
        parameter.put("custmrcodefr", jtxtNoBatchFr.getText());
        parameter.put("custmrcodeto", jtxtNoBatchTo.getText());
        parameter.put("accsetfr", jtxtNoBatchFr1.getText());
        parameter.put("accsetto", jtxtNoBatchTo1.getText());
        parameter.put("yon", jtxtyopfr.getText());

        Integer mope=(jcmbmopfr.getSelectedIndex() );
        String mon="";
        if (mope < 9 ){
            mon='0'+mope.toString();
        }else{
            mon=mope.toString();
        }
        System.out.println(mon);
        parameter.put("mon", mon );

        String jenis="";
        if(jcmbjenislaporan.getSelectedIndex()==0 ){
            jenis="0";
        }else {
            jenis="1";
        }

        String file   = "";
        System.out.println(parameter);

        if(jenis.equals("0") ){
           file = GlobalUtils.getCurrentDir() +"/Reports/TransaksiARAgedTrialBalanceByDueDateDetail.jrxml";
        }else{
           file = GlobalUtils.getCurrentDir() +"/Reports/TransaksiARAgedTrialBalanceByDueDateSummary.jrxml";
        }
        
        GlobalUtils.printReport(file, parameter, false);
    }catch (Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jbtnCetakActionPerformed

private void jmbModelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jmbModelPropertyChange

}//GEN-LAST:event_jmbModelPropertyChange

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
	      Ar_customers brs = new Ar_customers();
	      FrmBrowse bd = new FrmBrowse(brs);
	      bd.setFirstValue(jtxtNoBatchFr);
	      bd.setModal(true);
	      bd.setVisible(true);

	  } catch (CodeException ex) {
	      ex.printStackTrace();
	  }
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try {
	      Ar_customers brs = new Ar_customers();
	      FrmBrowse bd = new FrmBrowse(brs);
	      bd.setFirstValue(jtxtNoBatchTo);
	      bd.setModal(true);
	      bd.setVisible(true);

	  } catch (CodeException ex) {
	      ex.printStackTrace();
	  }
}//GEN-LAST:event_jButton2ActionPerformed

private void jcmbjenislaporanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbjenislaporanItemStateChanged
    // TODO add your handling code here:
}//GEN-LAST:event_jcmbjenislaporanItemStateChanged

private void jcmbmopfrItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbmopfrItemStateChanged

}//GEN-LAST:event_jcmbmopfrItemStateChanged

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try {
        Ar_accsets brs = new Ar_accsets();
        FrmBrowse bd = new FrmBrowse(brs);
        bd.setFirstValue(jtxtNoBatchFr1);
        bd.setModal(true);
        bd.setVisible(true);

    } catch (CodeException ex) {
        ex.printStackTrace();
    }
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    try {
        Ar_accsets brs = new Ar_accsets();
        FrmBrowse bd = new FrmBrowse(brs);
        bd.setFirstValue(jtxtNoBatchTo1);
        bd.setModal(true);
        bd.setVisible(true);

    } catch (CodeException ex) {
        ex.printStackTrace();
    }
}//GEN-LAST:event_jButton4ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPrintTransaksiARAgedTrialBalancebyDueDate dialog = new FrmPrintTransaksiARAgedTrialBalancebyDueDate(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbtnCetak;
    private javax.swing.JButton jbtnSelesai;
    private javax.swing.JComboBox jcmbjenislaporan;
    private javax.swing.JComboBox jcmbmopfr;
    public javax.swing.JLabel jlblHeader;
    public javax.swing.JTextField jtxtNoBatchFr;
    public javax.swing.JTextField jtxtNoBatchFr1;
    public javax.swing.JTextField jtxtNoBatchTo;
    public javax.swing.JTextField jtxtNoBatchTo1;
    public javax.swing.JTextField jtxtyopfr;
    // End of variables declaration//GEN-END:variables

}
