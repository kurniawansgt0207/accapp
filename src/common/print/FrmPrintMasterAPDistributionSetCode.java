/*
 * FrmPrintMasterBahanBaku.java
 *
 * Created on September 8, 2009, 4:18 PM
 */

package common.print;

import common.objectclasses.Masterkodesetting;
import common.utils.GlobalUtils;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author  wgata
 */
public class FrmPrintMasterAPDistributionSetCode extends javax.swing.JDialog {
    
    

    /** Creates new form FrmPrintMasterBahanBaku */
    public FrmPrintMasterAPDistributionSetCode(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public FrmPrintMasterAPDistributionSetCode() {
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

        jLabel1 = new javax.swing.JLabel();
        jtxtDistCode = new javax.swing.JTextField();
        jcmbModel = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jlblHeader = new javax.swing.JLabel();
        jbtnCetak = new javax.swing.JButton();
        jbtnSelesai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PRINT AR - DISTRIBUTION SET MASTER");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel1.setText("Model");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 60, 90, 13);
        getContentPane().add(jtxtDistCode);
        jtxtDistCode.setBounds(160, 90, 130, 19);

        jcmbModel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dist. Set Code", "Daftar Distribution" }));
        jcmbModel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbModelItemStateChanged(evt);
            }
        });
        getContentPane().add(jcmbModel);
        jcmbModel.setBounds(160, 60, 150, 24);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel2.setText("Distribution Set Code");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 90, 130, 13);

        jlblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblHeader.setText("AP - DISTRIBUTION SET MASTER REPORT");
        getContentPane().add(jlblHeader);
        jlblHeader.setBounds(30, 20, 280, 30);

        jbtnCetak.setText("Cetak");
        jbtnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCetakActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCetak);
        jbtnCetak.setBounds(40, 130, 70, 25);

        jbtnSelesai.setText("Selesai");
        jbtnSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSelesaiActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSelesai);
        jbtnSelesai.setBounds(140, 130, 77, 25);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-348)/2, (screenSize.height-201)/2, 348, 201);
    }// </editor-fold>//GEN-END:initComponents

private void jbtnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSelesaiActionPerformed
    this.dispose();
}//GEN-LAST:event_jbtnSelesaiActionPerformed

private void jbtnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCetakActionPerformed
        
    try{
        Map parameter = new HashMap();
        parameter.put("operator", (GlobalUtils.getUserId()));
       
        Masterkodesetting mks = new Masterkodesetting();
        mks.loadData("RPT", "HEADERRPT");
        parameter.put("kodeperusahaan", mks.getDescription());

        parameter.put("distcode", jtxtDistCode.getText());
        String file   = GlobalUtils.getCurrentDir() +"/Reports/MasterAPDistributionSet.jrxml";

        System.out.println(GlobalUtils.getUserId()+""+mks.getDescription()+""+jtxtDistCode.getText());
        
        GlobalUtils.printReport(file, parameter, false); 
    }catch (Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jbtnCetakActionPerformed

private void jmbModelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jmbModelPropertyChange

}//GEN-LAST:event_jmbModelPropertyChange

private void jcmbModelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbModelItemStateChanged
    if (jcmbModel.getSelectedIndex() == 1) {
        jtxtDistCode.setEnabled(false);
        jtxtDistCode.setText("");
    }else{
        jtxtDistCode.setEnabled(true);
    }
    
}//GEN-LAST:event_jcmbModelItemStateChanged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPrintMasterAPDistributionSetCode dialog = new FrmPrintMasterAPDistributionSetCode(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnCetak;
    private javax.swing.JButton jbtnSelesai;
    private javax.swing.JComboBox jcmbModel;
    public javax.swing.JLabel jlblHeader;
    public javax.swing.JTextField jtxtDistCode;
    // End of variables declaration//GEN-END:variables

}
