/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.Date;

/**
 *
 * @author Muhammad Taha Azam
 */
public class Employee8 extends javax.swing.JFrame {

    /**
     * Creates new form Employee8
     */
    public Employee8() {
          initComponents();
        
        showDate();
     }
    
    void showDate(){
    Date d=new Date();
             dateLab.setText(" "+d.toString());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ebill = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        sal7 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sal5 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        rent = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sal = new javax.swing.JTextField();
        oexp = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        timeLab = new javax.swing.JLabel();
        dateLab = new javax.swing.JLabel();
        sexp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        sal1 = new javax.swing.JTextField();
        sal6 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        ibill = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        sal3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        sal2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        wbill = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        sal4 = new javax.swing.JTextField();
        total = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 220, 30));

        jLabel8.setText("Internet Payement");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, -1, 30));

        jLabel10.setText("Rent Payement");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, -1, 30));

        ebill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ebillActionPerformed(evt);
            }
        });
        jPanel1.add(ebill, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, 193, 40));

        jLabel18.setText("Enter Salary");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, 20));

        jLabel20.setText("Enter Salary");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, 20));
        jPanel1.add(sal7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 150, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Employee Records");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 37, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 51));
        jLabel6.setText("<--GO Back");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, -1, -1));

        jLabel13.setText("Enter Salary");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));
        jPanel1.add(sal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 156, 30));

        jLabel17.setText("Employee#04 Name:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 20));

        jLabel9.setText("Stationary Expense");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, -1, 30));

        jLabel16.setText("Enter Salary");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, 20));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 220, 30));

        jLabel12.setText("Employee#02 Name:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, 20));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 218, 30));

        rent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentActionPerformed(evt);
            }
        });
        jPanel1.add(rent, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, 193, 40));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 220, 30));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 220, 30));

        jLabel2.setText("Employee#01 Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 74, -1, -1));

        sal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salActionPerformed(evt);
            }
        });
        jPanel1.add(sal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 159, 30));

        oexp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oexpActionPerformed(evt);
            }
        });
        jPanel1.add(oexp, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 320, 193, 40));

        jLabel15.setText("Employee#03 Name:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel26.setText("Total  Expenses");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, -1, 20));

        jLabel14.setText("Enter Salary");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 70, 20));

        timeLab.setText("Date of Issue:");
        jPanel1.add(timeLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));

        dateLab.setText("Date");
        jPanel1.add(dateLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 15, -1, -1));

        sexp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexpActionPerformed(evt);
            }
        });
        jPanel1.add(sexp, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 220, 193, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Utility Payements");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, -1, -1));

        jLabel11.setText("Other Expenses");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 330, -1, -1));

        jLabel19.setText("Employee#05 Name:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 20));
        jPanel1.add(sal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 160, 30));
        jPanel1.add(sal6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 155, 30));

        jLabel25.setText("Employee#08 Name:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 110, -1));

        jLabel5.setText("Water Bill");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, -1, 30));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 220, 30));

        jLabel22.setText("Enter Salary");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, 20));

        ibill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibillActionPerformed(evt);
            }
        });
        jPanel1.add(ibill, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, 193, 40));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 218, 30));

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 400, -1, 30));

        jLabel4.setText("Electricity Bill");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, -1, -1));

        jLabel23.setText("Employee#07 Name:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel24.setText("Enter Salary ");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 70, 20));
        jPanel1.add(sal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 156, 30));

        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 440, -1, 30));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 220, 30));
        jPanel1.add(sal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 156, 30));

        jLabel21.setText("Employee#06 Name:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 20));

        jLabel3.setText("Enter Salary:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, 20));

        wbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wbillActionPerformed(evt);
            }
        });
        jPanel1.add(wbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 120, 193, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));
        jPanel1.add(sal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 156, 30));

        total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total.setForeground(new java.awt.Color(255, 51, 0));
        total.setText("Total Amount");
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 400, -1, 20));

        jMenu3.setText("File");

        jMenuItem1.setText("Main Page");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Account");

        jMenuItem3.setText("Logout Account");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(683, 683, 683))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void ebillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebillActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_ebillActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void oexpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oexpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oexpActionPerformed

    private void wbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wbillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wbillActionPerformed

    private void rentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rentActionPerformed

    private void sexpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexpActionPerformed

    private void salActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salActionPerformed

    private void ibillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ibillActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        EmployeeRecords obj=new EmployeeRecords();
        obj.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
  NewJFrame obj=new NewJFrame();
obj.setVisible(true);
dispose();


        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

NewJFrame obj=new NewJFrame();
obj.setVisible(true);
dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int a=Integer.parseInt(sal.getText());
        int a1=Integer.parseInt(sal1.getText());
        int a2=Integer.parseInt(sal2.getText());
        int a3=Integer.parseInt(sal3.getText());
        int a4=Integer.parseInt(sal4.getText());
        int a5=Integer.parseInt(sal5.getText());
        int a6=Integer.parseInt(sal6.getText());
        int a7=Integer.parseInt(sal7.getText());
        int b=Integer.parseInt(ebill.getText());
        int c=Integer.parseInt(wbill.getText());
        int d=Integer.parseInt(ibill.getText());
        int e=Integer.parseInt(sexp.getText());
        int f=Integer.parseInt(oexp.getText());
        int g=Integer.parseInt(rent.getText());
        int emp1total=a+a1+a2+a3+a4+a5+a6+a7+b+c+d+e+f+g;
        total.setText(emp1total+"  Rs");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
PrinterJob job=PrinterJob.getPrinterJob();
        job.setJobName("Printer Data");
        job.setPrintable(new Printable(){
        
        public int print(Graphics pg,PageFormat pf,int pageNum){
                        
                            if(pageNum>0){
                            return Printable.NO_SUCH_PAGE;
                            }
                            Graphics2D g2=(Graphics2D)pg;
                            g2.translate(pf.getImageableX(),pf.getImageableY());
                            g2.scale(0.24,0.24);
                            
                            jPanel1.paint(g2);
                            return Printable.PAGE_EXISTS;
                        }
        
        
        
    });
        
boolean ok=job.printDialog();
if(ok){
try{
job.print();
}
catch(PrinterException ex){}
}              // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employee8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLab;
    private javax.swing.JTextField ebill;
    private javax.swing.JTextField ibill;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField oexp;
    private javax.swing.JTextField rent;
    private javax.swing.JTextField sal;
    private javax.swing.JTextField sal1;
    private javax.swing.JTextField sal2;
    private javax.swing.JTextField sal3;
    private javax.swing.JTextField sal4;
    private javax.swing.JTextField sal5;
    private javax.swing.JTextField sal6;
    private javax.swing.JTextField sal7;
    private javax.swing.JTextField sexp;
    private javax.swing.JLabel timeLab;
    private javax.swing.JLabel total;
    private javax.swing.JTextField wbill;
    // End of variables declaration//GEN-END:variables
}