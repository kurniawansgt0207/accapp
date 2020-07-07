/*
 * From Template
 *
 * Created on June 29, 2007, 2:00 PM
 * 
 * 
 * How to Call this Form on FrmMainFrame
 * Sample : 
 *    
 * import test.FrmUt_external_data;
 * 
 * .......
 * 
 * 
 * FrmUt_external_data frmUt_external_data;
 * 
 * .......
 * 
 try {
        if (frmUt_external_data == null) {
            frmmUt_external_data = new FrmUt_external_data(this);
        }
        
        showForm(frmUt_external_data);
        
    }catch(Exception e) {
        e.printStackTrace();
    }
 * 
 */

package cpp_utils.component;

import accapp.component.ar.FrmAr_invpopaddress;
import accapp.objectclasses.gl.Gl_account;
import accapp.objectclasses.gl.Gl_accounts;
import common.component.FrmBrowse;
import common.classinterface.NavigatorFormInt;
import common.classinterface.NavigatorObjectInt;
import common.component.FrmMainFrame;

import common.utils.CodeException;
import common.utils.GlobalUtils;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import common.utils.ExtFileChooserFilter;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import cpp_utils.objectclasses.Ut_external_data;
import cpp_utils.objectclasses.Ut_external_datas;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author  Generator
 */

public class FrmUt_external_data extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="FrmUt_external_data";
    
    FrmMainFrame mf ;
    
    
    public Ut_external_data obj = new Ut_external_data();
    
   
    /** Creates new form Area */
    public FrmUt_external_data() throws CodeException {
        initComponents();
    }
    
    public FrmUt_external_data(FrmMainFrame mf) throws CodeException{
        this.mf = mf;
        initComponents();
    }
     
       
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jHeader = new javax.swing.JLabel();
        HorizontalLine = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jbtnBrowse = new javax.swing.JButton();
        jlblexternal_id = new javax.swing.JLabel();
        jtxtexternal_id = new javax.swing.JTextField();
        jlblexternal_desc = new javax.swing.JLabel();
        jtxtexternal_desc = new javax.swing.JTextField();
        jlblexternal_svrip = new javax.swing.JLabel();
        jtxtexternal_svrip = new javax.swing.JTextField();
        jlblexternal_dbnm = new javax.swing.JLabel();
        jtxtexternal_dbnm = new javax.swing.JTextField();
        jlblexternal_uid = new javax.swing.JLabel();
        jtxtexternal_uid = new javax.swing.JTextField();
        jlblexternal_pwd = new javax.swing.JLabel();
        jtxtexternal_pwd = new javax.swing.JTextField();
        jtxtid1 = new javax.swing.JTextField();
        jtxtTanggalEntry = new javax.swing.JTextField();
        jtxtTanggalUpdate = new javax.swing.JTextField();
        jtxtUserID = new javax.swing.JTextField();
        jbtnBrowse1 = new javax.swing.JButton();
        jlblexternal_id1 = new javax.swing.JLabel();
        jtxtppn_account = new javax.swing.JTextField();
        jtxtpp_acc_name = new javax.swing.JTextField();
        jlblexternal_dbnm1 = new javax.swing.JLabel();
        jtxtexternal_port = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("External Data Setting");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jHeader.setBackground(new java.awt.Color(102, 102, 102));
        jHeader.setFont(new java.awt.Font("Dialog", 1, 10));
        jHeader.setForeground(new java.awt.Color(255, 255, 255));
        jHeader.setText(" : : External Data Setting");
        jHeader.setAlignmentY(0.0F);
        jHeader.setOpaque(true);
        getContentPane().add(jHeader);
        jHeader.setBounds(30, 30, 170, 20);

        HorizontalLine.setForeground(new java.awt.Color(102, 102, 102));
        HorizontalLine.setAlignmentX(0.0F);
        HorizontalLine.setAlignmentY(0.0F);
        getContentPane().add(HorizontalLine);
        HorizontalLine.setBounds(160, 50, 650, 2);

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setAlignmentX(0.0F);
        jSeparator3.setAlignmentY(0.0F);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(30, 50, 2, 400);

        jbtnBrowse.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse.setText("...");
        jbtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowseActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse);
        jbtnBrowse.setBounds(420, 90, 30, 17);

        jlblexternal_id.setFont(new java.awt.Font("Dialog", 0, 10));
        jlblexternal_id.setText("External Id");
        getContentPane().add(jlblexternal_id);
        jlblexternal_id.setBounds(70, 90, 140, 14);

        jtxtexternal_id.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtexternal_id.setText("external_id");
        getContentPane().add(jtxtexternal_id);
        jtxtexternal_id.setBounds(260, 90, 160, 20);

        jlblexternal_desc.setFont(new java.awt.Font("Dialog", 0, 10));
        jlblexternal_desc.setText("Description");
        getContentPane().add(jlblexternal_desc);
        jlblexternal_desc.setBounds(70, 110, 140, 14);

        jtxtexternal_desc.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtexternal_desc.setText("external_desc");
        getContentPane().add(jtxtexternal_desc);
        jtxtexternal_desc.setBounds(260, 110, 390, 20);

        jlblexternal_svrip.setFont(new java.awt.Font("Dialog", 0, 10));
        jlblexternal_svrip.setText("Server IP");
        getContentPane().add(jlblexternal_svrip);
        jlblexternal_svrip.setBounds(70, 130, 140, 14);

        jtxtexternal_svrip.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtexternal_svrip.setText("external_svrip");
        getContentPane().add(jtxtexternal_svrip);
        jtxtexternal_svrip.setBounds(260, 130, 160, 20);

        jlblexternal_dbnm.setFont(new java.awt.Font("Dialog", 0, 10));
        jlblexternal_dbnm.setText("Database Name");
        getContentPane().add(jlblexternal_dbnm);
        jlblexternal_dbnm.setBounds(70, 150, 140, 14);

        jtxtexternal_dbnm.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtexternal_dbnm.setText("external_dbnm");
        getContentPane().add(jtxtexternal_dbnm);
        jtxtexternal_dbnm.setBounds(260, 150, 160, 20);

        jlblexternal_uid.setFont(new java.awt.Font("Dialog", 0, 10));
        jlblexternal_uid.setText("Userid");
        getContentPane().add(jlblexternal_uid);
        jlblexternal_uid.setBounds(450, 130, 140, 14);

        jtxtexternal_uid.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtexternal_uid.setText("external_uid");
        getContentPane().add(jtxtexternal_uid);
        jtxtexternal_uid.setBounds(640, 130, 160, 20);

        jlblexternal_pwd.setFont(new java.awt.Font("Dialog", 0, 10));
        jlblexternal_pwd.setText("Password");
        getContentPane().add(jlblexternal_pwd);
        jlblexternal_pwd.setBounds(450, 150, 140, 14);

        jtxtexternal_pwd.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtexternal_pwd.setText("external_pwd");
        getContentPane().add(jtxtexternal_pwd);
        jtxtexternal_pwd.setBounds(640, 150, 160, 20);

        jtxtid1.setEditable(false);
        jtxtid1.setFont(new java.awt.Font("Dialog", 0, 8));
        jtxtid1.setText("id");
        getContentPane().add(jtxtid1);
        jtxtid1.setBounds(280, 30, 80, 16);

        jtxtTanggalEntry.setEditable(false);
        jtxtTanggalEntry.setFont(new java.awt.Font("Dialog", 0, 8));
        jtxtTanggalEntry.setText("TanggalEntry");
        getContentPane().add(jtxtTanggalEntry);
        jtxtTanggalEntry.setBounds(360, 30, 170, 16);

        jtxtTanggalUpdate.setEditable(false);
        jtxtTanggalUpdate.setFont(new java.awt.Font("Dialog", 0, 8));
        jtxtTanggalUpdate.setText("TanggalUpdate");
        getContentPane().add(jtxtTanggalUpdate);
        jtxtTanggalUpdate.setBounds(530, 30, 130, 16);

        jtxtUserID.setEditable(false);
        jtxtUserID.setFont(new java.awt.Font("Dialog", 0, 8));
        jtxtUserID.setText("UserID");
        getContentPane().add(jtxtUserID);
        jtxtUserID.setBounds(660, 30, 140, 16);

        jbtnBrowse1.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse1.setText("...");
        jbtnBrowse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse1);
        jbtnBrowse1.setBounds(420, 210, 30, 17);

        jlblexternal_id1.setFont(new java.awt.Font("Dialog", 0, 10));
        jlblexternal_id1.setText("PPN Account");
        getContentPane().add(jlblexternal_id1);
        jlblexternal_id1.setBounds(70, 210, 140, 14);

        jtxtppn_account.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtppn_account.setText("ppn_account");
        getContentPane().add(jtxtppn_account);
        jtxtppn_account.setBounds(260, 210, 160, 20);

        jtxtpp_acc_name.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtpp_acc_name.setText("ppn_acc_name");
        getContentPane().add(jtxtpp_acc_name);
        jtxtpp_acc_name.setBounds(460, 210, 340, 20);

        jlblexternal_dbnm1.setFont(new java.awt.Font("Dialog", 0, 10));
        jlblexternal_dbnm1.setText("Port");
        getContentPane().add(jlblexternal_dbnm1);
        jlblexternal_dbnm1.setBounds(70, 170, 140, 14);

        jtxtexternal_port.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtexternal_port.setText("external_port");
        getContentPane().add(jtxtexternal_port);
        jtxtexternal_port.setBounds(260, 170, 160, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
         try {
            moveFirst();

         } catch (CodeException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formInternalFrameOpened

private void kdatePurchaseDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kdatePurchaseDateFocusLost

}//GEN-LAST:event_kdatePurchaseDateFocusLost

private void kdatePurchaseDateCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_kdatePurchaseDateCaretPositionChanged

}//GEN-LAST:event_kdatePurchaseDateCaretPositionChanged

private void kdatePurchaseDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_kdatePurchaseDatePropertyChange

}//GEN-LAST:event_kdatePurchaseDatePropertyChange

private void jbtnBrowse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse1ActionPerformed
    // TODO add your handling code here:
    try {
          Gl_accounts brs = new Gl_accounts();
          FrmBrowse bd = new FrmBrowse(brs);
          bd.setFirstValue(jtxtppn_account);
          bd.setThirdValue(jtxtpp_acc_name);
          bd.setModal(true);
          bd.setVisible(true);

      } catch (CodeException ex) {
          ex.printStackTrace();
      }
}//GEN-LAST:event_jbtnBrowse1ActionPerformed


private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {                                           
      try {
	      Ut_external_datas brs = new Ut_external_datas();
	      FrmBrowse bd = new FrmBrowse(this, brs);
	      bd.setFirstValue(jtxtexternal_id);
	      bd.setModal(true);
	      bd.setVisible(true);            
	      
	  } catch (CodeException ex) {
	      ex.printStackTrace();
	  }
}                                                                                 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmUt_external_data().setVisible(true);
                } catch (CodeException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator HorizontalLine;
    private javax.swing.JLabel jHeader;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbtnBrowse;
    private javax.swing.JButton jbtnBrowse1;
    private javax.swing.JLabel jlblexternal_dbnm;
    private javax.swing.JLabel jlblexternal_dbnm1;
    private javax.swing.JLabel jlblexternal_desc;
    private javax.swing.JLabel jlblexternal_id;
    private javax.swing.JLabel jlblexternal_id1;
    private javax.swing.JLabel jlblexternal_pwd;
    private javax.swing.JLabel jlblexternal_svrip;
    private javax.swing.JLabel jlblexternal_uid;
    private javax.swing.JTextField jtxtTanggalEntry;
    private javax.swing.JTextField jtxtTanggalUpdate;
    private javax.swing.JTextField jtxtUserID;
    private javax.swing.JTextField jtxtexternal_dbnm;
    private javax.swing.JTextField jtxtexternal_desc;
    private javax.swing.JTextField jtxtexternal_id;
    private javax.swing.JTextField jtxtexternal_port;
    private javax.swing.JTextField jtxtexternal_pwd;
    private javax.swing.JTextField jtxtexternal_svrip;
    private javax.swing.JTextField jtxtexternal_uid;
    private javax.swing.JTextField jtxtid1;
    private javax.swing.JTextField jtxtpp_acc_name;
    private javax.swing.JTextField jtxtppn_account;
    // End of variables declaration//GEN-END:variables

 
    public void moveFirst() throws CodeException {
        obj.moveFirst();
        showData();
        mf.setIcon(CLASSNAME);
    }

    public void movePrevious() throws CodeException {
        obj.movePrevious();
        showData();
        mf.setIcon(CLASSNAME);
    }

    public void moveNext() throws CodeException {
        obj.moveNext();
        showData();
        mf.setIcon(CLASSNAME);
    }

    public void moveLast() throws CodeException {
        obj.moveLast();
        showData();
        mf.setIcon(CLASSNAME);
    }

    public void searchData() throws CodeException {
        obj = new Ut_external_data(this.jtxtexternal_id.getText());
        showData();
        mf.setIcon(CLASSNAME);

    }
    public void newData() throws CodeException {
        obj = new Ut_external_data();
        istatus=1;
        showData();
        setToolBar(iformtype,istatus);
    }

    public void saveData() throws CodeException {
        istatus = 0;
        setData();
        obj.save();
        
        showData();
        
        mf.setIcon(CLASSNAME);
    }

    public void showData() throws CodeException {
        setCursor(GlobalUtils.HOURGLASSCURSOR);
	
             jtxtexternal_id.setText(obj.toString(Ut_external_data.PROPERTY_ID));
             jtxtexternal_id.setText(obj.toString(Ut_external_data.PROPERTY_EXTERNAL_ID));
             jtxtexternal_desc.setText(obj.toString(Ut_external_data.PROPERTY_EXTERNAL_DESC));
             jtxtexternal_svrip.setText(obj.toString(Ut_external_data.PROPERTY_EXTERNAL_SVRIP));
             jtxtexternal_dbnm.setText(obj.toString(Ut_external_data.PROPERTY_EXTERNAL_DBNM));
             jtxtexternal_uid.setText(obj.toString(Ut_external_data.PROPERTY_EXTERNAL_UID));
             jtxtexternal_pwd.setText(obj.toString(Ut_external_data.PROPERTY_EXTERNAL_PWD));
             jtxtppn_account.setText(obj.toString(Ut_external_data.PROPERTY_PPN_ACC));

             jtxtexternal_port.setText(obj.toString(Ut_external_data.PROPERTY_EXTERNAL_PORT));

             Gl_account acc=new Gl_account(jtxtppn_account.getText());
             jtxtpp_acc_name.setText(acc.getaccdesc());
             
        setCursor(GlobalUtils.NORMALCURSOR);
    }

    public void delete() throws CodeException {
        obj.delete();
        obj.moveFirst();
        showData();
        mf.setIcon(CLASSNAME);
    }

    public void setToolBar(int iFormType, int istatus) {
        mf.setToolBar(iformtype,istatus);        
    }

    public void setData() throws CodeException {
        
	
          obj.fromString(Ut_external_data.PROPERTY_EXTERNAL_ID, jtxtexternal_id.getText()) ;
          obj.fromString(Ut_external_data.PROPERTY_EXTERNAL_DESC, jtxtexternal_desc.getText()) ;
          obj.fromString(Ut_external_data.PROPERTY_EXTERNAL_SVRIP, jtxtexternal_svrip.getText()) ;
          obj.fromString(Ut_external_data.PROPERTY_EXTERNAL_DBNM, jtxtexternal_dbnm.getText()) ;
          obj.fromString(Ut_external_data.PROPERTY_EXTERNAL_UID, jtxtexternal_uid.getText()) ;
          obj.fromString(Ut_external_data.PROPERTY_EXTERNAL_PWD, jtxtexternal_pwd.getText()) ;
          obj.fromString(Ut_external_data.PROPERTY_PPN_ACC, jtxtppn_account.getText()) ;

          obj.fromString(Ut_external_data.PROPERTY_EXTERNAL_PORT, jtxtexternal_port.getText()) ;

    }

    public void undo() throws CodeException {
        istatus = 0;
        moveFirst();
        showData();
    }

    public void execute() throws CodeException {
       saveData();
    }

    public void printData() throws CodeException {
        Map parameter = new HashMap();
        NavigatorObjectInt noi = (NavigatorObjectInt) obj;        
        String file   = GlobalUtils.getCurrentDir() +"/Reports/" + noi.getClassName() + ".jrxml";
        GlobalUtils.printReport(file,  false);    
    }

    public void importCsv() throws CodeException {
            
        String file1 = "";
        String file2 = GlobalUtils.getCurrentDir() + GlobalUtils.temp + obj.TABLEPROCESS + ".csv";   
        
        JFileChooser chooser = new JFileChooser(".");
        chooser.setDialogTitle("Pilih File ");
        FileFilter filter1 = new ExtFileChooserFilter("CSV", new String[] { "CSV"});
        chooser.setFileFilter(filter1);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            
            try {
                file1 = selectedFile.getCanonicalPath();
            
            }catch (Exception e) {}

            GlobalUtils.copyfile(file1, file2 );                

            obj.importCsv();
            
        }else {
          JOptionPane.showMessageDialog(null,"No Selection ");
        }

    }

    public void exportCsv() throws CodeException {
        
    
        if (obj.exportCsv()) {
            
            String file1 = GlobalUtils.getCurrentDir() + GlobalUtils.temp + obj.TABLEPROCESS + ".csv";   
            String file2 = "";
            
            JFileChooser chooser = new JFileChooser(".");
            chooser.setDialogTitle("Pilih Directory ");
    
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                try {
                    file2 = chooser.getSelectedFile().getCanonicalPath() + ".csv";
                        
                    JOptionPane.showMessageDialog(null, GlobalUtils.copyfile(file1, file2 ));                    
                    
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());                    
                }
                
            }else {
              JOptionPane.showMessageDialog(null,"No Selection ");
            }
    
        }
        
    }

    public void importText() throws CodeException {
        String file1 = "";
        String file2 = GlobalUtils.getCurrentDir() + GlobalUtils.temp + obj.TABLEPROCESS + ".txt";   
        
        JFileChooser chooser = new JFileChooser(".");
        chooser.setDialogTitle("Pilih File ");
        FileFilter filter1 = new ExtFileChooserFilter("txt", new String[] { "txt"});
        chooser.setFileFilter(filter1);


        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            
            try {
                file1 = selectedFile.getCanonicalPath();
            
            }catch (Exception e) {}

            GlobalUtils.copyfile(file1, file2 );                

            obj.importCsv();
            
        }else {
          JOptionPane.showMessageDialog(null,"No Selection ");
        }
    }

    public void exportText() throws CodeException {
        if (obj.exportText()) {
            
            String file1 = GlobalUtils.getCurrentDir() + GlobalUtils.temp + obj.TABLEPROCESS + ".txt";   
            String file2 = "";
            
            JFileChooser chooser = new JFileChooser(".");
            chooser.setDialogTitle("Pilih Directory ");
    
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                try {
                    file2 = chooser.getSelectedFile().getCanonicalPath() + ".txt";                        
                    JOptionPane.showMessageDialog(null, GlobalUtils.copyfile(file1, file2 ));                    
                    
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());                    
                }
                
            }else {
              JOptionPane.showMessageDialog(null,"No Selection ");
            }
    
        } 
    }

    
}