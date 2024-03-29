/*
 * FrmPrintMasterBahanBaku.java
 *
 * Created on September 8, 2009, 4:18 PM
 */

package common.print;

import accapp.objectclasses.gl.Gl_accounts;
import common.component.FrmBrowse;
import common.utils.CodeException;
import common.utils.GlobalUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Calendar;



/**
 *
 * @author  wgata
 */
public class Frmgl_ProvPosJournalRpt extends javax.swing.JDialog {
    
    DateFormat dateformat=new SimpleDateFormat("MM/dd/yyyy");
    DateFormat dateformatprint =new SimpleDateFormat("yyyy-MM-dd");


    /** Creates new form FrmPrintMasterBahanBaku */
    public Frmgl_ProvPosJournalRpt(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        jtxtyop.setText(GlobalUtils.getYear(GlobalUtils.sessiondate)+"");
        jcmbBulan.setSelectedIndex(GlobalUtils.getMonth(GlobalUtils.sessiondate)-1);
    }
    public Frmgl_ProvPosJournalRpt() {
        initComponents();
        jtxtyop.setText(GlobalUtils.getYear(GlobalUtils.sessiondate)+"");
        jcmbBulan.setSelectedIndex(GlobalUtils.getMonth(GlobalUtils.sessiondate)-1);

    }

    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblHeader = new javax.swing.JLabel();
        jbtnCetak = new javax.swing.JButton();
        jbtnSelesai = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtxtacccode_fr = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jtxtacccode_to = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jcmbBulan = new javax.swing.JComboBox();
        jtxtyop = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxtacccode_fr_desc = new javax.swing.JTextField();
        jtxtacccode_to_desc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Report: GL-Trial Balance");
        getContentPane().setLayout(null);

        jlblHeader.setFont(new java.awt.Font("Dialog", 1, 12));
        jlblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblHeader.setText("GL - Trial Balance");
        jlblHeader.setToolTipText("FrmPrintTransaksiGLTrialBalance:TransaksiGLTrialBalance.jrxml");
        jlblHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jlblHeader);
        jlblHeader.setBounds(10, 10, 620, 40);

        jbtnCetak.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnCetak.setText("Print");
        jbtnCetak.setName("FrmPrintTransaksiGLJournal"); // NOI18N
        jbtnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCetakActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCetak);
        jbtnCetak.setBounds(250, 310, 70, 20);

        jbtnSelesai.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnSelesai.setText("End");
        jbtnSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSelesaiActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSelesai);
        jbtnSelesai.setBounds(360, 310, 70, 20);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel2.setText("Acc. Code From");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 110, 90, 13);

        jtxtacccode_fr.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxtacccode_fr);
        jtxtacccode_fr.setBounds(150, 110, 180, 23);

        jButton1.setFont(new java.awt.Font("Dialog", 0, 10));
        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 110, 20, 20);

        jtxtacccode_to.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxtacccode_to);
        jtxtacccode_to.setBounds(150, 160, 180, 23);

        jButton2.setFont(new java.awt.Font("Dialog", 0, 10));
        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 160, 20, 20);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel4.setText("Periode");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 80, 100, 20);

        jcmbBulan.setFont(new java.awt.Font("Dialog", 0, 10));
        jcmbBulan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jcmbBulan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbBulanItemStateChanged(evt);
            }
        });
        getContentPane().add(jcmbBulan);
        jcmbBulan.setBounds(150, 80, 50, 20);

        jtxtyop.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtyop.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jtxtyop);
        jtxtyop.setBounds(220, 80, 60, 20);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel10.setText("Acc. Code To");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 160, 110, 20);

        jtxtacccode_fr_desc.setEditable(false);
        jtxtacccode_fr_desc.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        getContentPane().add(jtxtacccode_fr_desc);
        jtxtacccode_fr_desc.setBounds(150, 130, 460, 23);

        jtxtacccode_to_desc.setEditable(false);
        jtxtacccode_to_desc.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxtacccode_to_desc);
        jtxtacccode_to_desc.setBounds(150, 180, 460, 23);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-648)/2, (screenSize.height-388)/2, 648, 388);
    }// </editor-fold>//GEN-END:initComponents

private void jbtnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSelesaiActionPerformed

    this.dispose();
}//GEN-LAST:event_jbtnSelesaiActionPerformed

private void jbtnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCetakActionPerformed

        
    try{
        setCursor(GlobalUtils.HOURGLASSCURSOR);
        String file   = "" ;
        String neraca = "" ;
        Map parameter = new HashMap();
        String TanggalJam = "" ;

        String mope=(jcmbBulan.getSelectedIndex()+1+"" );
        parameter.put("yop", jtxtyop.getText());
        parameter.put("mop", mope);
        parameter.put("acccode_fr", jtxtacccode_fr.getText());
        parameter.put("acccode_to", jtxtacccode_to.getText());
        

        
        System.out.println(parameter);
        file = GlobalUtils.getCurrentDir() +"/Reports/gl_ProvPosJournalRpt.jrxml";
        GlobalUtils.printReport(file, parameter, false);

    }catch (Exception e) {
        e.printStackTrace();
    }
    setCursor(GlobalUtils.NORMALCURSOR);
}//GEN-LAST:event_jbtnCetakActionPerformed

private void jmbModelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jmbModelPropertyChange

}//GEN-LAST:event_jmbModelPropertyChange

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        Gl_accounts brs = new Gl_accounts();
        FrmBrowse bd = new FrmBrowse(brs);
        bd.setSecondValue(jtxtacccode_fr);
        bd.setThirdValue(jtxtacccode_fr_desc);
        bd.setModal(true);
        bd.setVisible(true);

    } catch (CodeException ex) {
        ex.printStackTrace();
    }
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try {
        Gl_accounts brs = new Gl_accounts();
        FrmBrowse bd = new FrmBrowse(brs);
        bd.setSecondValue(jtxtacccode_to);
        bd.setThirdValue(jtxtacccode_to_desc);
        bd.setModal(true);
        bd.setVisible(true);

    } catch (CodeException ex) {
        ex.printStackTrace();
    }
}//GEN-LAST:event_jButton2ActionPerformed

private void jcmbBulanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbBulanItemStateChanged
int year = Calendar.getInstance().get(Calendar.YEAR);
jtxtyop.setText(year+"");
}//GEN-LAST:event_jcmbBulanItemStateChanged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Frmgl_ProvPosJournalRpt dialog = new Frmgl_ProvPosJournalRpt(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbtnCetak;
    private javax.swing.JButton jbtnSelesai;
    private javax.swing.JComboBox jcmbBulan;
    public javax.swing.JLabel jlblHeader;
    public javax.swing.JTextField jtxtacccode_fr;
    public javax.swing.JTextField jtxtacccode_fr_desc;
    public javax.swing.JTextField jtxtacccode_to;
    public javax.swing.JTextField jtxtacccode_to_desc;
    public javax.swing.JTextField jtxtyop;
    // End of variables declaration//GEN-END:variables

}
