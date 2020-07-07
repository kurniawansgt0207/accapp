/*
 * From Template
 *
 * Created on June 29, 2007, 2:00 PM
 * 
 * 
 * How to Call this Form on FrmMainFrame
 * Sample : 
 *    
 * import accapp.component.op.FrmOp_phone;
 * 
 * .......
 * 
 * 
 * FrmOp_phone frmOp_phone;
 * 
 * .......
 * 
 try {
        if (frmOp_phone == null) {
            frmmOp_phone = new FrmOp_phone(this);
        }
        
        showForm(frmOp_phone);
        
    }catch(Exception e) {
        e.printStackTrace();
    }
 * 
 */

package accapp.component.op;

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
import accapp.objectclasses.op.Op_phone;
import accapp.objectclasses.op.Op_phones;

/**
 *
 * @author  Generator
 */

public class FrmOp_phone extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="FrmOp_phone";
    
    FrmMainFrame mf ;
    
    
    public Op_phone obj = new Op_phone();
    
   
    /** Creates new form Area */
    public FrmOp_phone() throws CodeException {
        initComponents();
    }
    
    public FrmOp_phone(FrmMainFrame mf) throws CodeException{
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
        jlblid = new javax.swing.JLabel();
        jtxtid = new javax.swing.JTextField();
        jlblownercode = new javax.swing.JLabel();
        jtxtownercode = new javax.swing.JTextField();
        jlbladdrcode = new javax.swing.JLabel();
        jtxtaddrcode = new javax.swing.JTextField();
        jlbladdrtypecode = new javax.swing.JLabel();
        jtxtaddrtypecode = new javax.swing.JTextField();
        jlblphonetypecode = new javax.swing.JLabel();
        jtxtphonetypecode = new javax.swing.JTextField();
        jlblphone = new javax.swing.JLabel();
        jtxtphone = new javax.swing.JTextField();
        jlblobjtype = new javax.swing.JLabel();
        jtxtobjtype = new javax.swing.JTextField();
        jlblentrydate = new javax.swing.JLabel();
        jtxtentrydate = new javax.swing.JTextField();
        jlblauditDate = new javax.swing.JLabel();
        jtxtauditDate = new javax.swing.JTextField();
        jlblauditUser = new javax.swing.JLabel();
        jtxtauditUser = new javax.swing.JTextField();
        jlblcmpnyid = new javax.swing.JLabel();
        jtxtcmpnyid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Optional: Phone");
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
        jHeader.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jHeader.setForeground(new java.awt.Color(255, 255, 255));
        jHeader.setText(" : : Phone");
        jHeader.setAlignmentY(0.0F);
        jHeader.setOpaque(true);
        getContentPane().add(jHeader);
        jHeader.setBounds(30, 30, 130, 20);

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

        jbtnBrowse.setText("...");
        jbtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowseActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse);
        jbtnBrowse.setBounds(340, 80, 30, 20);

        jlblid.setText("id");
        getContentPane().add(jlblid);
        jlblid.setBounds(70, 80, 140, 14);

        jtxtid.setText("id");
        getContentPane().add(jtxtid);
        jtxtid.setBounds(260, 80, 80, 20);

        jlblownercode.setText("Owner Code");
        getContentPane().add(jlblownercode);
        jlblownercode.setBounds(70, 100, 140, 14);

        jtxtownercode.setText("ownercode");
        getContentPane().add(jtxtownercode);
        jtxtownercode.setBounds(260, 100, 80, 20);

        jlbladdrcode.setText("Address Code");
        getContentPane().add(jlbladdrcode);
        jlbladdrcode.setBounds(70, 120, 140, 14);

        jtxtaddrcode.setText("addrcode");
        getContentPane().add(jtxtaddrcode);
        jtxtaddrcode.setBounds(260, 120, 80, 20);

        jlbladdrtypecode.setText("Address Type Code");
        getContentPane().add(jlbladdrtypecode);
        jlbladdrtypecode.setBounds(70, 140, 140, 14);

        jtxtaddrtypecode.setText("addrtypecode");
        getContentPane().add(jtxtaddrtypecode);
        jtxtaddrtypecode.setBounds(260, 140, 80, 20);

        jlblphonetypecode.setText("Phone Type Code");
        getContentPane().add(jlblphonetypecode);
        jlblphonetypecode.setBounds(70, 160, 140, 14);

        jtxtphonetypecode.setText("phonetypecode");
        getContentPane().add(jtxtphonetypecode);
        jtxtphonetypecode.setBounds(260, 160, 80, 20);

        jlblphone.setText("Phone");
        getContentPane().add(jlblphone);
        jlblphone.setBounds(70, 180, 140, 14);

        jtxtphone.setText("phone");
        getContentPane().add(jtxtphone);
        jtxtphone.setBounds(260, 180, 80, 20);

        jlblobjtype.setText("Object Type");
        getContentPane().add(jlblobjtype);
        jlblobjtype.setBounds(70, 200, 140, 14);

        jtxtobjtype.setText("objtype");
        getContentPane().add(jtxtobjtype);
        jtxtobjtype.setBounds(260, 200, 80, 20);

        jlblentrydate.setText("entrydate");
        getContentPane().add(jlblentrydate);
        jlblentrydate.setBounds(70, 220, 140, 14);

        jtxtentrydate.setText("entrydate");
        getContentPane().add(jtxtentrydate);
        jtxtentrydate.setBounds(260, 220, 80, 20);

        jlblauditDate.setText("auditDate");
        getContentPane().add(jlblauditDate);
        jlblauditDate.setBounds(70, 240, 140, 14);

        jtxtauditDate.setText("auditDate");
        getContentPane().add(jtxtauditDate);
        jtxtauditDate.setBounds(260, 240, 80, 20);

        jlblauditUser.setText("auditUser");
        getContentPane().add(jlblauditUser);
        jlblauditUser.setBounds(70, 260, 140, 14);

        jtxtauditUser.setText("auditUser");
        getContentPane().add(jtxtauditUser);
        jtxtauditUser.setBounds(260, 260, 80, 20);

        jlblcmpnyid.setText("Company ID");
        getContentPane().add(jlblcmpnyid);
        jlblcmpnyid.setBounds(70, 280, 140, 14);

        jtxtcmpnyid.setText("cmpnyid");
        getContentPane().add(jtxtcmpnyid);
        jtxtcmpnyid.setBounds(260, 280, 80, 20);

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


private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {                                           
      try {
	      Op_phones brs = new Op_phones();
	      FrmBrowse bd = new FrmBrowse(this, brs);
	      bd.setFirstValue(jtxtid);
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
                    new FrmOp_phone().setVisible(true);
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
    private javax.swing.JLabel jlbladdrcode;
    private javax.swing.JLabel jlbladdrtypecode;
    private javax.swing.JLabel jlblauditDate;
    private javax.swing.JLabel jlblauditUser;
    private javax.swing.JLabel jlblcmpnyid;
    private javax.swing.JLabel jlblentrydate;
    private javax.swing.JLabel jlblid;
    private javax.swing.JLabel jlblobjtype;
    private javax.swing.JLabel jlblownercode;
    private javax.swing.JLabel jlblphone;
    private javax.swing.JLabel jlblphonetypecode;
    private javax.swing.JTextField jtxtaddrcode;
    private javax.swing.JTextField jtxtaddrtypecode;
    private javax.swing.JTextField jtxtauditDate;
    private javax.swing.JTextField jtxtauditUser;
    private javax.swing.JTextField jtxtcmpnyid;
    private javax.swing.JTextField jtxtentrydate;
    private javax.swing.JTextField jtxtid;
    private javax.swing.JTextField jtxtobjtype;
    private javax.swing.JTextField jtxtownercode;
    private javax.swing.JTextField jtxtphone;
    private javax.swing.JTextField jtxtphonetypecode;
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
        obj = new Op_phone(this.jtxtid.getText());
        showData();
        mf.setIcon(CLASSNAME);

    }
    public void newData() throws CodeException {
        obj = new Op_phone();
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
	
             jtxtid.setText(obj.toString(Op_phone.PROPERTY_ID));
             jtxtownercode.setText(obj.toString(Op_phone.PROPERTY_OWNERCODE));
             jtxtaddrcode.setText(obj.toString(Op_phone.PROPERTY_ADDRCODE));
             jtxtaddrtypecode.setText(obj.toString(Op_phone.PROPERTY_ADDRTYPECODE));
             jtxtphonetypecode.setText(obj.toString(Op_phone.PROPERTY_PHONETYPECODE));
             jtxtphone.setText(obj.toString(Op_phone.PROPERTY_PHONE));
             jtxtobjtype.setText(obj.toString(Op_phone.PROPERTY_OBJTYPE));
             jtxtentrydate.setText(obj.toString(Op_phone.PROPERTY_ENTRYDATE));
             jtxtauditDate.setText(obj.toString(Op_phone.PROPERTY_AUDITDATE));
             jtxtauditUser.setText(obj.toString(Op_phone.PROPERTY_AUDITUSER));
             jtxtcmpnyid.setText(obj.toString(Op_phone.PROPERTY_CMPNYID));
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
        
	
          obj.fromString(Op_phone.PROPERTY_ID, jtxtid.getText()) ;
          obj.fromString(Op_phone.PROPERTY_OWNERCODE, jtxtownercode.getText()) ;
          obj.fromString(Op_phone.PROPERTY_ADDRCODE, jtxtaddrcode.getText()) ;
          obj.fromString(Op_phone.PROPERTY_ADDRTYPECODE, jtxtaddrtypecode.getText()) ;
          obj.fromString(Op_phone.PROPERTY_PHONETYPECODE, jtxtphonetypecode.getText()) ;
          obj.fromString(Op_phone.PROPERTY_PHONE, jtxtphone.getText()) ;
          obj.fromString(Op_phone.PROPERTY_OBJTYPE, jtxtobjtype.getText()) ;
          obj.fromString(Op_phone.PROPERTY_ENTRYDATE, jtxtentrydate.getText()) ;
          obj.fromString(Op_phone.PROPERTY_AUDITDATE, jtxtauditDate.getText()) ;
          obj.fromString(Op_phone.PROPERTY_AUDITUSER, jtxtauditUser.getText()) ;
          obj.fromString(Op_phone.PROPERTY_CMPNYID, jtxtcmpnyid.getText()) ;

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