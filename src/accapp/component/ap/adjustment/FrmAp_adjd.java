/*
 * From Template
 *
 * Created on June 29, 2007, 2:00 PM
 * 
 * 
 * How to Call this Form on FrmMainFrame
 * Sample : 
 *    
 * import accapp.component.ap.adjustment.FrmAp_adjd;
 * 
 * .......
 * 
 * 
 * FrmAp_adjd frmAp_adjd;
 * 
 * .......
 * 
 try {
        if (frmAp_adjd == null) {
            frmmAp_adjd = new FrmAp_adjd(this);
        }
        
        showForm(frmAp_adjd);
        
    }catch(Exception e) {
        e.printStackTrace();
    }
 * 
 */

package accapp.component.ap.adjustment;

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
import accapp.objectclasses.ap.adjustment.Ap_adjd;
import accapp.objectclasses.ap.adjustment.Ap_adjds;

/**
 *
 * @author  Generator
 */

public class FrmAp_adjd extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="FrmAp_adjd";
    
    FrmMainFrame mf ;
    
    
    public Ap_adjd obj = new Ap_adjd();
    
   
    /** Creates new form Area */
    public FrmAp_adjd() throws CodeException {
        initComponents();
    }
    
    public FrmAp_adjd(FrmMainFrame mf) throws CodeException{
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
         jlblbatchno = new javax.swing.JLabel(); 
         jtxtbatchno = new javax.swing.JTextField(); 
         jlbldocentry = new javax.swing.JLabel(); 
         jtxtdocentry = new javax.swing.JTextField(); 
         jlbllinenum = new javax.swing.JLabel(); 
         jtxtlinenum = new javax.swing.JTextField(); 
         jlbllinests = new javax.swing.JLabel(); 
         jtxtlinests = new javax.swing.JTextField(); 
         jlbldistcode = new javax.swing.JLabel(); 
         jtxtdistcode = new javax.swing.JTextField(); 
         jlbldistamt = new javax.swing.JLabel(); 
         jtxtdistamt = new javax.swing.JTextField(); 
         jlblacccode = new javax.swing.JLabel(); 
         jtxtacccode = new javax.swing.JTextField(); 
         jlblaccfmttd = new javax.swing.JLabel(); 
         jtxtaccfmttd = new javax.swing.JTextField(); 
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
        setTitle("Ap_adjd");
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
        jHeader.setText(" : : Ap_adjd");
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
        jbtnBrowse.setBounds(350, 100, 30, 20);

	
         jlblid.setText("id"); 
         getContentPane().add(jlblid); 
         jlblid.setBounds(70, 80, 140, 15); 
         jtxtid.setText("jtxtid"); 
         getContentPane().add(jtxtid); 
         jtxtid.setBounds(260, 80, 80, 19); 
         jlblbatchno.setText("batchno"); 
         getContentPane().add(jlblbatchno); 
         jlblbatchno.setBounds(70, 100, 140, 15); 
         jtxtbatchno.setText("jtxtbatchno"); 
         getContentPane().add(jtxtbatchno); 
         jtxtbatchno.setBounds(260, 100, 80, 19); 
         jlbldocentry.setText("docentry"); 
         getContentPane().add(jlbldocentry); 
         jlbldocentry.setBounds(70, 120, 140, 15); 
         jtxtdocentry.setText("jtxtdocentry"); 
         getContentPane().add(jtxtdocentry); 
         jtxtdocentry.setBounds(260, 120, 80, 19); 
         jlbllinenum.setText("linenum"); 
         getContentPane().add(jlbllinenum); 
         jlbllinenum.setBounds(70, 140, 140, 15); 
         jtxtlinenum.setText("jtxtlinenum"); 
         getContentPane().add(jtxtlinenum); 
         jtxtlinenum.setBounds(260, 140, 80, 19); 
         jlbllinests.setText("linests"); 
         getContentPane().add(jlbllinests); 
         jlbllinests.setBounds(70, 160, 140, 15); 
         jtxtlinests.setText("jtxtlinests"); 
         getContentPane().add(jtxtlinests); 
         jtxtlinests.setBounds(260, 160, 80, 19); 
         jlbldistcode.setText("distcode"); 
         getContentPane().add(jlbldistcode); 
         jlbldistcode.setBounds(70, 180, 140, 15); 
         jtxtdistcode.setText("jtxtdistcode"); 
         getContentPane().add(jtxtdistcode); 
         jtxtdistcode.setBounds(260, 180, 80, 19); 
         jlbldistamt.setText("distamt"); 
         getContentPane().add(jlbldistamt); 
         jlbldistamt.setBounds(70, 200, 140, 15); 
         jtxtdistamt.setText("jtxtdistamt"); 
         getContentPane().add(jtxtdistamt); 
         jtxtdistamt.setBounds(260, 200, 80, 19); 
         jlblacccode.setText("acccode"); 
         getContentPane().add(jlblacccode); 
         jlblacccode.setBounds(70, 220, 140, 15); 
         jtxtacccode.setText("jtxtacccode"); 
         getContentPane().add(jtxtacccode); 
         jtxtacccode.setBounds(260, 220, 80, 19); 
         jlblaccfmttd.setText("accfmttd"); 
         getContentPane().add(jlblaccfmttd); 
         jlblaccfmttd.setBounds(70, 240, 140, 15); 
         jtxtaccfmttd.setText("jtxtaccfmttd"); 
         getContentPane().add(jtxtaccfmttd); 
         jtxtaccfmttd.setBounds(260, 240, 80, 19); 
         jlblentrydate.setText("entrydate"); 
         getContentPane().add(jlblentrydate); 
         jlblentrydate.setBounds(70, 260, 140, 15); 
         jtxtentrydate.setText("jtxtentrydate"); 
         getContentPane().add(jtxtentrydate); 
         jtxtentrydate.setBounds(260, 260, 80, 19); 
         jlblauditdate.setText("auditdate"); 
         getContentPane().add(jlblauditdate); 
         jlblauditdate.setBounds(70, 280, 140, 15); 
         jtxtauditdate.setText("jtxtauditdate"); 
         getContentPane().add(jtxtauditdate); 
         jtxtauditdate.setBounds(260, 280, 80, 19); 
         jlblaudituser.setText("audituser"); 
         getContentPane().add(jlblaudituser); 
         jlblaudituser.setBounds(70, 300, 140, 15); 
         jtxtaudituser.setText("jtxtaudituser"); 
         getContentPane().add(jtxtaudituser); 
         jtxtaudituser.setBounds(260, 300, 80, 19); 
         jlblobjtype.setText("objtype"); 
         getContentPane().add(jlblobjtype); 
         jlblobjtype.setBounds(70, 320, 140, 15); 
         jtxtobjtype.setText("jtxtobjtype"); 
         getContentPane().add(jtxtobjtype); 
         jtxtobjtype.setBounds(260, 320, 80, 19); 
         jlblcmpnyid.setText("cmpnyid"); 
         getContentPane().add(jlblcmpnyid); 
         jlblcmpnyid.setBounds(70, 340, 140, 15); 
         jtxtcmpnyid.setText("jtxtcmpnyid"); 
         getContentPane().add(jtxtcmpnyid); 
         jtxtcmpnyid.setBounds(260, 340, 80, 19); 

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
	      Ap_adjds brs = new Ap_adjds();
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
                    new FrmAp_adjd().setVisible(true);
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

    
      private javax.swing.JLabel jlblid;  
      private javax.swing.JTextField jtxtid; 
      private javax.swing.JLabel jlblbatchno;  
      private javax.swing.JTextField jtxtbatchno; 
      private javax.swing.JLabel jlbldocentry;  
      private javax.swing.JTextField jtxtdocentry; 
      private javax.swing.JLabel jlbllinenum;  
      private javax.swing.JTextField jtxtlinenum; 
      private javax.swing.JLabel jlbllinests;  
      private javax.swing.JTextField jtxtlinests; 
      private javax.swing.JLabel jlbldistcode;  
      private javax.swing.JTextField jtxtdistcode; 
      private javax.swing.JLabel jlbldistamt;  
      private javax.swing.JTextField jtxtdistamt; 
      private javax.swing.JLabel jlblacccode;  
      private javax.swing.JTextField jtxtacccode; 
      private javax.swing.JLabel jlblaccfmttd;  
      private javax.swing.JTextField jtxtaccfmttd; 
      private javax.swing.JLabel jlblentrydate;  
      private javax.swing.JTextField jtxtentrydate; 
      private javax.swing.JLabel jlblauditdate;  
      private javax.swing.JTextField jtxtauditdate; 
      private javax.swing.JLabel jlblaudituser;  
      private javax.swing.JTextField jtxtaudituser; 
      private javax.swing.JLabel jlblobjtype;  
      private javax.swing.JTextField jtxtobjtype; 
      private javax.swing.JLabel jlblcmpnyid;  
      private javax.swing.JTextField jtxtcmpnyid; 

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
        obj = new Ap_adjd(this.jtxtid.getText());
        showData();
        mf.setIcon(CLASSNAME);

    }
    public void newData() throws CodeException {
        obj = new Ap_adjd();
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
	
             jtxtid.setText(obj.toString(Ap_adjd.PROPERTY_ID));
             jtxtbatchno.setText(obj.toString(Ap_adjd.PROPERTY_BATCHNO));
             jtxtdocentry.setText(obj.toString(Ap_adjd.PROPERTY_DOCENTRY));
             jtxtlinenum.setText(obj.toString(Ap_adjd.PROPERTY_LINENUM));
             jtxtlinests.setText(obj.toString(Ap_adjd.PROPERTY_LINESTS));
             jtxtdistcode.setText(obj.toString(Ap_adjd.PROPERTY_DISTCODE));
             jtxtdistamt.setText(obj.toString(Ap_adjd.PROPERTY_DISTAMT));
             jtxtacccode.setText(obj.toString(Ap_adjd.PROPERTY_ACCCODE));
             jtxtaccfmttd.setText(obj.toString(Ap_adjd.PROPERTY_ACCFMTTD));
             jtxtentrydate.setText(obj.toString(Ap_adjd.PROPERTY_ENTRYDATE));
             jtxtauditdate.setText(obj.toString(Ap_adjd.PROPERTY_AUDITDATE));
             jtxtaudituser.setText(obj.toString(Ap_adjd.PROPERTY_AUDITUSER));
             jtxtobjtype.setText(obj.toString(Ap_adjd.PROPERTY_OBJTYPE));
             jtxtcmpnyid.setText(obj.toString(Ap_adjd.PROPERTY_CMPNYID));
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
        
	
          obj.fromString(Ap_adjd.PROPERTY_ID, jtxtid.getText()) ;
          obj.fromString(Ap_adjd.PROPERTY_BATCHNO, jtxtbatchno.getText()) ;
          obj.fromString(Ap_adjd.PROPERTY_DOCENTRY, jtxtdocentry.getText()) ;
          obj.fromString(Ap_adjd.PROPERTY_LINENUM, jtxtlinenum.getText()) ;
          obj.fromString(Ap_adjd.PROPERTY_LINESTS, jtxtlinests.getText()) ;
          obj.fromString(Ap_adjd.PROPERTY_DISTCODE, jtxtdistcode.getText()) ;
          obj.fromString(Ap_adjd.PROPERTY_DISTAMT, jtxtdistamt.getText()) ;
          obj.fromString(Ap_adjd.PROPERTY_ACCCODE, jtxtacccode.getText()) ;
          obj.fromString(Ap_adjd.PROPERTY_ACCFMTTD, jtxtaccfmttd.getText()) ;
          obj.fromString(Ap_adjd.PROPERTY_ENTRYDATE, jtxtentrydate.getText()) ;
          obj.fromString(Ap_adjd.PROPERTY_AUDITDATE, jtxtauditdate.getText()) ;
          obj.fromString(Ap_adjd.PROPERTY_AUDITUSER, jtxtaudituser.getText()) ;
          obj.fromString(Ap_adjd.PROPERTY_OBJTYPE, jtxtobjtype.getText()) ;
          obj.fromString(Ap_adjd.PROPERTY_CMPNYID, jtxtcmpnyid.getText()) ;

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
