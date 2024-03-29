/*
 * From Template
 *
 * Created on June 29, 2007, 2:00 PM
 * 
 * 
 * How to Call this Form on FrmMainFrame
 * Sample : 
 *    
 * import accapp.component.costapp.FrmCostacc_wipfg_temp;
 * 
 * .......
 * 
 * 
 * FrmCostacc_wipfg_temp frmCostacc_wipfg_temp;
 * 
 * .......
 * 
 try {
        if (frmCostacc_wipfg_temp == null) {
            frmmCostacc_wipfg_temp = new FrmCostacc_wipfg_temp(this);
        }
        
        showForm(frmCostacc_wipfg_temp);
        
    }catch(Exception e) {
        e.printStackTrace();
    }
 * 
 */

package accapp.component.costapp;

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
import accapp.objectclasses.costapp.Costacc_wipfg_temp;
import accapp.objectclasses.costapp.Costacc_wipfg_temps;

/**
 *
 * @author  Generator
 */

public class FrmCostacc_wipfg_temp extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="FrmCostacc_wipfg_temp";
    
    FrmMainFrame mf ;
    
    
    public Costacc_wipfg_temp obj = new Costacc_wipfg_temp();
    
   
    /** Creates new form Area */
    public FrmCostacc_wipfg_temp() throws CodeException {
        initComponents();
    }
    
    public FrmCostacc_wipfg_temp(FrmMainFrame mf) throws CodeException{
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
         jlblyop = new javax.swing.JLabel(); 
         jtxtyop = new javax.swing.JTextField(); 
         jlblmop = new javax.swing.JLabel(); 
         jtxtmop = new javax.swing.JTextField(); 
         jlblcost_detail_id = new javax.swing.JLabel(); 
         jtxtcost_detail_id = new javax.swing.JTextField(); 
         jlblcost_detail = new javax.swing.JLabel(); 
         jtxtcost_detail = new javax.swing.JTextField(); 
         jlblstandard = new javax.swing.JLabel(); 
         jtxtstandard = new javax.swing.JTextField(); 
         jlblactual = new javax.swing.JLabel(); 
         jtxtactual = new javax.swing.JTextField(); 
         jlblvariance = new javax.swing.JLabel(); 
         jtxtvariance = new javax.swing.JTextField(); 
         jlblpercenttostd = new javax.swing.JLabel(); 
         jtxtpercenttostd = new javax.swing.JTextField(); 
         jlbliscompleted = new javax.swing.JLabel(); 
         jtxtiscompleted = new javax.swing.JTextField(); 
         jlblcreatedate = new javax.swing.JLabel(); 
         kdatecreatedate = new org.kazao.calendar.KazaoCalendarDate(); 
         jlblcreateuser = new javax.swing.JLabel(); 
         jtxtcreateuser = new javax.swing.JTextField(); 
         jlblauditdate = new javax.swing.JLabel(); 
         kdateauditdate = new org.kazao.calendar.KazaoCalendarDate(); 
         jlblaudituser = new javax.swing.JLabel(); 
         jtxtaudituser = new javax.swing.JTextField(); 

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Costacc_wipfg_temp");
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
        jHeader.setText(" : : Costacc_wipfg_temp");
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
         jlblyop.setText("yop"); 
         getContentPane().add(jlblyop); 
         jlblyop.setBounds(70, 100, 140, 15); 
         jtxtyop.setText("jtxtyop"); 
         getContentPane().add(jtxtyop); 
         jtxtyop.setBounds(260, 100, 80, 19); 
         jlblmop.setText("mop"); 
         getContentPane().add(jlblmop); 
         jlblmop.setBounds(70, 120, 140, 15); 
         jtxtmop.setText("jtxtmop"); 
         getContentPane().add(jtxtmop); 
         jtxtmop.setBounds(260, 120, 80, 19); 
         jlblcost_detail_id.setText("cost_detail_id"); 
         getContentPane().add(jlblcost_detail_id); 
         jlblcost_detail_id.setBounds(70, 140, 140, 15); 
         jtxtcost_detail_id.setText("jtxtcost_detail_id"); 
         getContentPane().add(jtxtcost_detail_id); 
         jtxtcost_detail_id.setBounds(260, 140, 80, 19); 
         jlblcost_detail.setText("cost_detail"); 
         getContentPane().add(jlblcost_detail); 
         jlblcost_detail.setBounds(70, 160, 140, 15); 
         jtxtcost_detail.setText("jtxtcost_detail"); 
         getContentPane().add(jtxtcost_detail); 
         jtxtcost_detail.setBounds(260, 160, 80, 19); 
         jlblstandard.setText("standard"); 
         getContentPane().add(jlblstandard); 
         jlblstandard.setBounds(70, 180, 140, 15); 
         jtxtstandard.setText("jtxtstandard"); 
         getContentPane().add(jtxtstandard); 
         jtxtstandard.setBounds(260, 180, 80, 19); 
         jlblactual.setText("actual"); 
         getContentPane().add(jlblactual); 
         jlblactual.setBounds(70, 200, 140, 15); 
         jtxtactual.setText("jtxtactual"); 
         getContentPane().add(jtxtactual); 
         jtxtactual.setBounds(260, 200, 80, 19); 
         jlblvariance.setText("variance"); 
         getContentPane().add(jlblvariance); 
         jlblvariance.setBounds(70, 220, 140, 15); 
         jtxtvariance.setText("jtxtvariance"); 
         getContentPane().add(jtxtvariance); 
         jtxtvariance.setBounds(260, 220, 80, 19); 
         jlblpercenttostd.setText("percenttostd"); 
         getContentPane().add(jlblpercenttostd); 
         jlblpercenttostd.setBounds(70, 240, 140, 15); 
         jtxtpercenttostd.setText("jtxtpercenttostd"); 
         getContentPane().add(jtxtpercenttostd); 
         jtxtpercenttostd.setBounds(260, 240, 80, 19); 
         jlbliscompleted.setText("iscompleted"); 
         getContentPane().add(jlbliscompleted); 
         jlbliscompleted.setBounds(70, 260, 140, 15); 
         jtxtiscompleted.setText("jtxtiscompleted"); 
         getContentPane().add(jtxtiscompleted); 
         jtxtiscompleted.setBounds(260, 260, 80, 19); 
         jlblcreatedate.setText("createdate"); 
         getContentPane().add(jlblcreatedate); 
         jlblcreatedate.setBounds(70, 280, 140, 15); 
         kdatecreatedate.setFont(new java.awt.Font("Dialog", 0, 10)); 
         kdatecreatedate.setFontDate(new java.awt.Font("Dialog", 0, 10)); 
         getContentPane().add(kdatecreatedate); 
         kdatecreatedate.setBounds(260, 280, 80, 19); 
         jlblcreateuser.setText("createuser"); 
         getContentPane().add(jlblcreateuser); 
         jlblcreateuser.setBounds(70, 300, 140, 15); 
         jtxtcreateuser.setText("jtxtcreateuser"); 
         getContentPane().add(jtxtcreateuser); 
         jtxtcreateuser.setBounds(260, 300, 80, 19); 
         jlblauditdate.setText("auditdate"); 
         getContentPane().add(jlblauditdate); 
         jlblauditdate.setBounds(70, 320, 140, 15); 
         kdateauditdate.setFont(new java.awt.Font("Dialog", 0, 10)); 
         kdateauditdate.setFontDate(new java.awt.Font("Dialog", 0, 10)); 
         getContentPane().add(kdateauditdate); 
         kdateauditdate.setBounds(260, 320, 80, 19); 
         jlblaudituser.setText("audituser"); 
         getContentPane().add(jlblaudituser); 
         jlblaudituser.setBounds(70, 340, 140, 15); 
         jtxtaudituser.setText("jtxtaudituser"); 
         getContentPane().add(jtxtaudituser); 
         jtxtaudituser.setBounds(260, 340, 80, 19); 

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
	      Costacc_wipfg_temps brs = new Costacc_wipfg_temps();
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
                    new FrmCostacc_wipfg_temp().setVisible(true);
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
      private javax.swing.JLabel jlblyop;  
      private javax.swing.JTextField jtxtyop; 
      private javax.swing.JLabel jlblmop;  
      private javax.swing.JTextField jtxtmop; 
      private javax.swing.JLabel jlblcost_detail_id;  
      private javax.swing.JTextField jtxtcost_detail_id; 
      private javax.swing.JLabel jlblcost_detail;  
      private javax.swing.JTextField jtxtcost_detail; 
      private javax.swing.JLabel jlblstandard;  
      private javax.swing.JTextField jtxtstandard; 
      private javax.swing.JLabel jlblactual;  
      private javax.swing.JTextField jtxtactual; 
      private javax.swing.JLabel jlblvariance;  
      private javax.swing.JTextField jtxtvariance; 
      private javax.swing.JLabel jlblpercenttostd;  
      private javax.swing.JTextField jtxtpercenttostd; 
      private javax.swing.JLabel jlbliscompleted;  
      private javax.swing.JTextField jtxtiscompleted; 
      private javax.swing.JLabel jlblcreatedate;  
      private org.kazao.calendar.KazaoCalendarDate kdatecreatedate ; 
      private javax.swing.JLabel jlblcreateuser;  
      private javax.swing.JTextField jtxtcreateuser; 
      private javax.swing.JLabel jlblauditdate;  
      private org.kazao.calendar.KazaoCalendarDate kdateauditdate ; 
      private javax.swing.JLabel jlblaudituser;  
      private javax.swing.JTextField jtxtaudituser; 

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
        obj = new Costacc_wipfg_temp(this.jtxtid.getText());
        showData();
        mf.setIcon(CLASSNAME);

    }
    public void newData() throws CodeException {
        obj = new Costacc_wipfg_temp();
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
	
             jtxtid.setText(obj.toString(Costacc_wipfg_temp.PROPERTY_ID));
             jtxtyop.setText(obj.toString(Costacc_wipfg_temp.PROPERTY_YOP));
             jtxtmop.setText(obj.toString(Costacc_wipfg_temp.PROPERTY_MOP));
             jtxtcost_detail_id.setText(obj.toString(Costacc_wipfg_temp.PROPERTY_COST_DETAIL_ID));
             jtxtcost_detail.setText(obj.toString(Costacc_wipfg_temp.PROPERTY_COST_DETAIL));
             jtxtstandard.setText(obj.toString(Costacc_wipfg_temp.PROPERTY_STANDARD));
             jtxtactual.setText(obj.toString(Costacc_wipfg_temp.PROPERTY_ACTUAL));
             jtxtvariance.setText(obj.toString(Costacc_wipfg_temp.PROPERTY_VARIANCE));
             jtxtpercenttostd.setText(obj.toString(Costacc_wipfg_temp.PROPERTY_PERCENTTOSTD));
             jtxtiscompleted.setText(obj.toString(Costacc_wipfg_temp.PROPERTY_ISCOMPLETED));
             if (obj.getcreatedate() != null) {
                kdatecreatedate.setDate(obj.getcreatedate());  
             } 
             jtxtcreateuser.setText(obj.toString(Costacc_wipfg_temp.PROPERTY_CREATEUSER));
             if (obj.getauditdate() != null) {
                kdateauditdate.setDate(obj.getauditdate());  
             } 
             jtxtaudituser.setText(obj.toString(Costacc_wipfg_temp.PROPERTY_AUDITUSER));
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
        
	
          obj.fromString(Costacc_wipfg_temp.PROPERTY_ID, jtxtid.getText()) ;
          obj.fromString(Costacc_wipfg_temp.PROPERTY_YOP, jtxtyop.getText()) ;
          obj.fromString(Costacc_wipfg_temp.PROPERTY_MOP, jtxtmop.getText()) ;
          obj.fromString(Costacc_wipfg_temp.PROPERTY_COST_DETAIL_ID, jtxtcost_detail_id.getText()) ;
          obj.fromString(Costacc_wipfg_temp.PROPERTY_COST_DETAIL, jtxtcost_detail.getText()) ;
          obj.fromString(Costacc_wipfg_temp.PROPERTY_STANDARD, jtxtstandard.getText()) ;
          obj.fromString(Costacc_wipfg_temp.PROPERTY_ACTUAL, jtxtactual.getText()) ;
          obj.fromString(Costacc_wipfg_temp.PROPERTY_VARIANCE, jtxtvariance.getText()) ;
          obj.fromString(Costacc_wipfg_temp.PROPERTY_PERCENTTOSTD, jtxtpercenttostd.getText()) ;
          obj.fromString(Costacc_wipfg_temp.PROPERTY_ISCOMPLETED, jtxtiscompleted.getText()) ;
          obj.fromString(Costacc_wipfg_temp.PROPERTY_CREATEDATE, kdatecreatedate.getDate()); 
          obj.fromString(Costacc_wipfg_temp.PROPERTY_CREATEUSER, jtxtcreateuser.getText()) ;
          obj.fromString(Costacc_wipfg_temp.PROPERTY_AUDITDATE, kdateauditdate.getDate()); 
          obj.fromString(Costacc_wipfg_temp.PROPERTY_AUDITUSER, jtxtaudituser.getText()) ;

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
