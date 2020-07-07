/*
 * From Template
 *
 * Created on June 29, 2007, 2:00 PM
 */

package generate;

import common.classinterface.NavigatorFormInt;
import common.classinterface.NavigatorObjectInt;
import common.component.FrmMainFrame;

import common.utils.GlobalUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import common.utils.CodeException;


/**
 *
 * @author  sandy
 */

public class FrmSample extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="FrmAccount";
    
    FrmMainFrame mf ;
    
    
    //public Account obj = new Account();
    
   
    /** Creates new form Area */
    public FrmSample() throws CodeException {
        initComponents();
    }
    
    public FrmSample(FrmMainFrame mf) throws CodeException{
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        kdatePurchaseDate = new org.kazao.calendar.KazaoCalendarDate();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("<Table>");
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
        jHeader.setText(" : : <Table>");
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

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 80, 140, 15);

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(260, 80, 80, 19);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 100, 45, 15);

        kdatePurchaseDate.setFont(new java.awt.Font("Dialog", 0, 10));
        kdatePurchaseDate.setFontDate(new java.awt.Font("Dialog", 0, 10));
        kdatePurchaseDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                kdatePurchaseDateFocusLost(evt);
            }
        });
        kdatePurchaseDate.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                kdatePurchaseDateCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        kdatePurchaseDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                kdatePurchaseDatePropertyChange(evt);
            }
        });
        getContentPane().add(kdatePurchaseDate);
        kdatePurchaseDate.setBounds(260, 100, 94, 19);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
         try {
            moveFirst();

         } catch (CodeException ex) {
            Logger.getLogger(FrmSample.class.getName()).log(Level.SEVERE, null, ex);
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
    }

                                                

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmSample().setVisible(true);
                } catch (CodeException ex) {
                    Logger.getLogger(FrmSample.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator HorizontalLine;
    private javax.swing.JLabel jHeader;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private org.kazao.calendar.KazaoCalendarDate kdatePurchaseDate;
    // End of variables declaration//GEN-END:variables

 
    public void moveFirst() throws CodeException {
        //obj.moveFirst();
        showData();
        setToolBar(iformtype,istatus);
    }

    public void movePrevious() throws CodeException {
        //obj.movePrevious();
        showData();
        setToolBar(iformtype,istatus);
    }

    public void moveNext() throws CodeException {
        //obj.moveNext();
        showData();
        setToolBar(iformtype,istatus);
    }

    public void moveLast() throws CodeException {
        //obj.moveLast();
        showData();
        setToolBar(iformtype,istatus);
    }

    public void searchData() throws CodeException {
        //obj = new Account(this.jtxtAccount.getText());
        showData();
        setToolBar(iformtype,istatus);
    }
    public void newData() throws CodeException {
        //obj = new Account();
        istatus=1;
        showData();
        setToolBar(iformtype,istatus);
    }

    public void saveData() throws CodeException {
        istatus = 0;
        setData();
        //obj.save();
        
        setToolBar(iformtype,istatus);
    }

    public void showData() throws CodeException {
        //this.jtxtAccount.setText(obj.getAccount());
        //this.jtxtDescription.setText(obj.getDescription());
    }

    public void delete() throws CodeException {
        //obj.delete();
        //obj.moveFirst();
        showData();
        setToolBar(iformtype,istatus);
    }

    public void setToolBar(int iFormType, int istatus) {
        mf.setToolBar(iformtype,istatus);        
    }

    public void setData() throws CodeException {
        
        //obj.setAccount(jtxtAccount.getText());
        //obj.setDescription(jtxtDescription.getText());
    }

    public void undo() throws CodeException {
        istatus = 0;
        moveFirst();
        showData();
    }

    public void execute() throws CodeException {
       saveData();
    }


    public void importCsv() throws CodeException {
        //if (obj.importCsv()) {
        //    JOptionPane.showMessageDialog(null, "Already Imported table " + obj.TABLE + " From CSV");
        //}
    }

    public void exportCsv() throws CodeException {
        //if (obj.exportCsv()) {
        //    JOptionPane.showMessageDialog(null, "Already Exported to CSV, please check on " + GlobalUtils.currentdir + GlobalUtils.temp);
        //}
    }

    public void importText() throws CodeException {
        //if (obj.importCsv()) {
        //    JOptionPane.showMessageDialog(null, "Already Imported table " + obj.TABLE + " From Text");
        //}
    }

    public void exportText() throws CodeException {
        //if (obj.exportText()) {
        //    JOptionPane.showMessageDialog(null, "Already Exported to Text, please check on " + GlobalUtils.currentdir + GlobalUtils.temp);
        //}
    }
    public void printData() throws CodeException {
        //Map parameter = new HashMap();
        //NavigatorObjectInt noi = (NavigatorObjectInt) obj;        
        //String file   = GlobalUtils.getCurrentDir() +"/Reports/" + noi.getClassName() + ".jrxml";
        //GlobalUtils.printReport(file,  false);    
    }
    
}