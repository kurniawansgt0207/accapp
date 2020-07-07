/*
 * From Template
 *
 * Created on June 29, 2007, 2:00 PM
 * 
 * 
 * How to Call this Form on FrmMainFrame
 * Sample : 
 *    
 * import test.FrmGl_sourcelgr_desc;
 * 
 * .......
 * 
 * 
 * FrmGl_sourcelgr_desc frmGl_sourcelgr_desc;
 * 
 * .......
 * 
 try {
        if (frmGl_sourcelgr_desc == null) {
            frmmGl_sourcelgr_desc = new FrmGl_sourcelgr_desc(this);
        }
        
        showForm(frmGl_sourcelgr_desc);
        
    }catch(Exception e) {
        e.printStackTrace();
    }
 * 
 */

package accapp.component.gl;

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
import accapp.objectclasses.gl.Gl_sourcelgr_desc;
import accapp.objectclasses.gl.Gl_sourcelgr_desc;
import accapp.objectclasses.gl.Gl_sourcelgr_descs;
import accapp.objectclasses.gl.Gl_sourcelgr_descs;

/**
 *
 * @author  Generator
 */

public class FrmGl_sourcelgr_desc extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="FrmGl_sourcelgr_desc";
    
    FrmMainFrame mf ;
    
    
    public Gl_sourcelgr_desc obj = new Gl_sourcelgr_desc();
    
   
    /** Creates new form Area */
    public FrmGl_sourcelgr_desc() throws CodeException {
        initComponents();
    }
    
    public FrmGl_sourcelgr_desc(FrmMainFrame mf) throws CodeException{
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
        jlblsrcelgrcode = new javax.swing.JLabel();
        jtxtsrcelgrcode = new javax.swing.JTextField();
        jlblsrcelgrdesc = new javax.swing.JLabel();
        jtxtsrcelgrdesc = new javax.swing.JTextField();
        jlblentrydate = new javax.swing.JLabel();
        jtxtentrydate = new javax.swing.JTextField();
        jlblauditdate = new javax.swing.JLabel();
        jtxtauditdate = new javax.swing.JTextField();
        jlblaudituser = new javax.swing.JLabel();
        jtxtaudituser = new javax.swing.JTextField();
        jlblobjtype = new javax.swing.JLabel();
        jtxtobjtype = new javax.swing.JTextField();
        jlblcmpnyid = new javax.swing.JLabel();
        jtxtcmpnyid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gl_sourcelgr_desc");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jHeader.setBackground(new java.awt.Color(102, 102, 102));
        jHeader.setFont(new java.awt.Font("Dialog", 1, 10));
        jHeader.setForeground(new java.awt.Color(255, 255, 255));
        jHeader.setText(" : : Gl_sourcelgr_desc");
        jHeader.setAlignmentY(0.0F);
        jHeader.setOpaque(true);
        getContentPane().add(jHeader);
        jHeader.setBounds(30, 30, 130, 20);

        HorizontalLine.setForeground(new java.awt.Color(102, 102, 102));
        HorizontalLine.setAlignmentX(0.0F);
        HorizontalLine.setAlignmentY(0.0F);
        getContentPane().add(HorizontalLine);
        HorizontalLine.setBounds(160, 50, 650, 12);

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setAlignmentX(0.0F);
        jSeparator3.setAlignmentY(0.0F);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(30, 50, 12, 400);

        jbtnBrowse.setText("...");
        jbtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowseActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse);
        jbtnBrowse.setBounds(430, 80, 30, 17);

        jlblid.setText("id");
        getContentPane().add(jlblid);
        jlblid.setBounds(70, 80, 140, 16);

        jtxtid.setText("id");
        getContentPane().add(jtxtid);
        jtxtid.setBounds(260, 80, 80, 28);

        jlblsrcelgrcode.setText("srcelgrcode");
        getContentPane().add(jlblsrcelgrcode);
        jlblsrcelgrcode.setBounds(70, 100, 140, 16);

        jtxtsrcelgrcode.setText("srcelgrcode");
        getContentPane().add(jtxtsrcelgrcode);
        jtxtsrcelgrcode.setBounds(260, 100, 80, 28);

        jlblsrcelgrdesc.setText("srcelgrdesc");
        getContentPane().add(jlblsrcelgrdesc);
        jlblsrcelgrdesc.setBounds(70, 120, 140, 16);

        jtxtsrcelgrdesc.setText("srcelgrdesc");
        getContentPane().add(jtxtsrcelgrdesc);
        jtxtsrcelgrdesc.setBounds(260, 120, 80, 28);

        jlblentrydate.setText("entrydate");
        getContentPane().add(jlblentrydate);
        jlblentrydate.setBounds(70, 140, 140, 16);

        jtxtentrydate.setText("entrydate");
        getContentPane().add(jtxtentrydate);
        jtxtentrydate.setBounds(260, 140, 80, 28);

        jlblauditdate.setText("auditdate");
        getContentPane().add(jlblauditdate);
        jlblauditdate.setBounds(70, 160, 140, 16);

        jtxtauditdate.setText("auditdate");
        getContentPane().add(jtxtauditdate);
        jtxtauditdate.setBounds(260, 160, 80, 28);

        jlblaudituser.setText("audituser");
        getContentPane().add(jlblaudituser);
        jlblaudituser.setBounds(70, 180, 140, 16);

        jtxtaudituser.setText("audituser");
        getContentPane().add(jtxtaudituser);
        jtxtaudituser.setBounds(260, 180, 80, 28);

        jlblobjtype.setText("objtype");
        getContentPane().add(jlblobjtype);
        jlblobjtype.setBounds(70, 200, 140, 16);

        jtxtobjtype.setText("objtype");
        getContentPane().add(jtxtobjtype);
        jtxtobjtype.setBounds(260, 200, 80, 28);

        jlblcmpnyid.setText("cmpnyid");
        getContentPane().add(jlblcmpnyid);
        jlblcmpnyid.setBounds(70, 220, 140, 16);

        jtxtcmpnyid.setText("cmpnyid");
        getContentPane().add(jtxtcmpnyid);
        jtxtcmpnyid.setBounds(260, 220, 80, 28);

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
	      Gl_sourcelgr_descs brs = new Gl_sourcelgr_descs();
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
                    new FrmGl_sourcelgr_desc().setVisible(true);
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
    private javax.swing.JLabel jlblauditdate;
    private javax.swing.JLabel jlblaudituser;
    private javax.swing.JLabel jlblcmpnyid;
    private javax.swing.JLabel jlblentrydate;
    private javax.swing.JLabel jlblid;
    private javax.swing.JLabel jlblobjtype;
    private javax.swing.JLabel jlblsrcelgrcode;
    private javax.swing.JLabel jlblsrcelgrdesc;
    private javax.swing.JTextField jtxtauditdate;
    private javax.swing.JTextField jtxtaudituser;
    private javax.swing.JTextField jtxtcmpnyid;
    private javax.swing.JTextField jtxtentrydate;
    private javax.swing.JTextField jtxtid;
    private javax.swing.JTextField jtxtobjtype;
    private javax.swing.JTextField jtxtsrcelgrcode;
    private javax.swing.JTextField jtxtsrcelgrdesc;
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
        obj = new Gl_sourcelgr_desc(this.jtxtid.getText());
        showData();
        mf.setIcon(CLASSNAME);

    }
    public void newData() throws CodeException {
        obj = new Gl_sourcelgr_desc();
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
	
             jtxtid.setText(obj.toString(Gl_sourcelgr_desc.PROPERTY_ID));
             jtxtsrcelgrcode.setText(obj.toString(Gl_sourcelgr_desc.PROPERTY_SRCELGRCODE));
             jtxtsrcelgrdesc.setText(obj.toString(Gl_sourcelgr_desc.PROPERTY_SRCELGRDESC));
             jtxtentrydate.setText(obj.toString(Gl_sourcelgr_desc.PROPERTY_ENTRYDATE));
             jtxtauditdate.setText(obj.toString(Gl_sourcelgr_desc.PROPERTY_AUDITDATE));
             jtxtaudituser.setText(obj.toString(Gl_sourcelgr_desc.PROPERTY_AUDITUSER));
             jtxtobjtype.setText(obj.toString(Gl_sourcelgr_desc.PROPERTY_OBJTYPE));
             jtxtcmpnyid.setText(obj.toString(Gl_sourcelgr_desc.PROPERTY_CMPNYID));
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
        
	
          obj.fromString(Gl_sourcelgr_desc.PROPERTY_ID, jtxtid.getText()) ;
          obj.fromString(Gl_sourcelgr_desc.PROPERTY_SRCELGRCODE, jtxtsrcelgrcode.getText()) ;
          obj.fromString(Gl_sourcelgr_desc.PROPERTY_SRCELGRDESC, jtxtsrcelgrdesc.getText()) ;
          obj.fromString(Gl_sourcelgr_desc.PROPERTY_ENTRYDATE, jtxtentrydate.getText()) ;
          obj.fromString(Gl_sourcelgr_desc.PROPERTY_AUDITDATE, jtxtauditdate.getText()) ;
          obj.fromString(Gl_sourcelgr_desc.PROPERTY_AUDITUSER, jtxtaudituser.getText()) ;
          obj.fromString(Gl_sourcelgr_desc.PROPERTY_OBJTYPE, jtxtobjtype.getText()) ;
          obj.fromString(Gl_sourcelgr_desc.PROPERTY_CMPNYID, jtxtcmpnyid.getText()) ;

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