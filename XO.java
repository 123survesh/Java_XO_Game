
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sundar Madhavan
 */
public class XO extends javax.swing.JFrame {
    int countx=0,county=0;
int x[]={0,0,0,0,0};
int o[]={0,0,0,0,0};
    int i = 0;int finish=0;
    int count1 = 1;
    int count2 = 1;
    int count3 = 1;
    int count4 = 1;
    int count5 = 1;
    int count6 = 1;
    int count7 = 1;
    int count8 = 1;
    int count9 = 1;
void checker(int[] temp,char aa)
{
switch(temp[0])
{
    case 1:
        int a1=0,b1=0,c1=0;
        for(int iter=0;iter<5;iter++)
        {
            if(temp[iter]==3||temp[iter]==2)
            {a1++;}
            else if(temp[iter]==7||temp[iter]==4)
            {b1++;}
            else if(temp[iter]==5||temp[iter]==9)
            {c1++;}
                }
        
        if(a1>1||b1>1||c1>1)
            switch(aa)
            {case 'x':
                JOptionPane.showMessageDialog(this,"X WON" );finish=1;
                break;
            case 'o':
                JOptionPane.showMessageDialog(this,"O WON" );finish=1;
                break;}
                
        break;
    case 2:
        int a2=0,b2=0;

        for(int iter=0;iter<5;iter++)
        {
            if(temp[iter]==1||temp[iter]==3)
            {a2++;}
            else if(temp[iter]==5||temp[iter]==8)
            {b2++;}
                }
         
        if(a2>1||b2>1)
            switch(aa)
            {case 'x':
                JOptionPane.showMessageDialog(this,"X WON" );finish=1;
                break;
            case 'o':
                JOptionPane.showMessageDialog(this,"O WON" );finish=1;
                break;}
        break;
    case 3:
        int a3=0,b3=0,c3=0;
        for(int iter=0;iter<5;iter++)
        {
            if(temp[iter]==1||temp[iter]==2)
            {a3++;}
            else if(temp[iter]==6||temp[iter]==9)
            {b3++;}
            else if(temp[iter]==7||temp[iter]==5)
            {c3++;}
                }
         
        if(a3>1||b3>1||c3>1)
            switch(aa)
            {case 'x':
                JOptionPane.showMessageDialog(this,"X WON" );finish=1;
                break;
            case 'o':
                JOptionPane.showMessageDialog(this,"O WON" );finish=1;
                break;}
        
        break;
    case 4:
        int a4=0,b4=0;
        for(int iter=0;iter<5;iter++)
        {
            if(temp[iter]==1||temp[iter]==7)
            {a4++;}
            else if(temp[iter]==5||temp[iter]==6)
            {b4++;}
            
                }
        
        if(a4>1||b4>1)
            switch(aa)
            {case 'x':
                JOptionPane.showMessageDialog(this,"X WON" );finish=1;
                break;
            case 'o':
                JOptionPane.showMessageDialog(this,"O WON" );finish=1;
                break;}
        
        break;
    case 5:
        int a5=0,b5=0,c5=0,d5=0;
        for(int iter=0;iter<5;iter++)
        {
            if(temp[iter]==1||temp[iter]==9)
            {a5++;}
            else if(temp[iter]==7||temp[iter]==3)
            {b5++;}
            else if(temp[iter]==2||temp[iter]==8)
            {c5++;}
            else if(temp[iter]==4||temp[iter]==6)
            {d5++;}
                }
       
        if(a5>1||b5>1||c5>1||d5>1)
            switch(aa)
            {case 'x':
                JOptionPane.showMessageDialog(this,"X WON" );finish=1;
                break;
            case 'o':
                JOptionPane.showMessageDialog(this,"O WON" );finish=1;
                break;}
        
        break;
    case 6:
        int a6=0,b6=0,c6=0;
        for(int iter=0;iter<5;iter++)
        {
            if(temp[iter]==5||temp[iter]==4)
            {a6++;}
            else if(temp[iter]==3||temp[iter]==9)
            {b6++;}
            
                }
        
        if(a6>1||b6>1)
            switch(aa)
            {case 'x':
                JOptionPane.showMessageDialog(this,"X WON" );finish=1;
                break;
            case 'o':
                JOptionPane.showMessageDialog(this,"O WON" );finish=1;
                break;}
        
        break;
    case 7:
        int a7=0,b7=0,c7=0;
        for(int iter=0;iter<5;iter++)
        {
            if(temp[iter]==1||temp[iter]==4)
            {a7++;}
            else if(temp[iter]==8||temp[iter]==9)
            {b7++;}
            else if(temp[iter]==5||temp[iter]==3)
            {c7++;}
                }
        
        if(a7>1||b7>1||c7>1)
            switch(aa)
            {case 'x':
                JOptionPane.showMessageDialog(this,"X WON" );finish=1;
                break;
            case 'o':
                JOptionPane.showMessageDialog(this,"O WON" );finish=1;
                break;}
        
        break;
    case 8:
        int a8=0,b8=0;
        for(int iter=0;iter<5;iter++)
        {
            if(temp[iter]==7||temp[iter]==9)
            {a8++;}
            else if(temp[iter]==5||temp[iter]==2)
            {b8++;}
           
                }
        
        if(a8>1||b8>1)
            switch(aa)
            {case 'x':
                JOptionPane.showMessageDialog(this,"X WON" );finish=1;
                break;
            case 'o':
                JOptionPane.showMessageDialog(this,"O WON" );finish=1;
                break;}
        
        break;
    case 9:
        int a9=0,b9=0,c9=0;
        for(int iter=0;iter<5;iter++)
        {
            if(temp[iter]==3||temp[iter]==6)
            {a9++;}
            else if(temp[iter]==7||temp[iter]==8)
            {b9++;}
            else if(temp[iter]==5||temp[iter]==1)
            {c9++;}
                }
        
        if(a9>1||b9>1||c9>1)
           switch(aa)
            {case 'x':
                JOptionPane.showMessageDialog(this,"X WON" );finish=1;
                break;
            case 'o':
                JOptionPane.showMessageDialog(this,"O WON" );finish=1;
                break;}
        
        break;
}
if(finish!=1&&(countx>4||county>4))
 {
                 JOptionPane.showMessageDialog(this,"MATCH DRAW" );finish=1;

 }
}

    /**
     * Creates new form XO
     */
    public XO() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("?");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("?");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("?");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("?");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("?");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("?");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("?");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("XO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        i++; int x1=0,y1=0;
       
        if (count2 != 0) {
            
            if (i % 2 != 0) {
                jButton2.setText("X");x1++;x[countx]=2;countx++;
            } else {
                jButton2.setText("O");y1++;o[county]=2;county++;
            }
            count2--;
            if(countx>2||county>2)
                if(x1>0)
                    checker(x,'x');
                            else
                    checker(o,'o');
// TODO add your handling code here:

    }//GEN-LAST:event_jButton2ActionPerformed
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        i++; int x1=0,y1=0;
         
        if (count4 != 0) {
            if (i % 2 != 0) {
                jButton4.setText("X");x1++;x[countx]=4;countx++;
            } else {
                jButton4.setText("O");y1++;o[county]=4;county++;
            }
// TODO add your handling code here:
            count4--;
        if(countx>2||county>2)
                if(x1>0)
                    checker(x,'x');
                            else
                    checker(o,'o');}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        i++; int x1=0,y1=0;
        if (count1 != 0) {
            
            if (i % 2 != 0) {
                jButton1.setText("X");x1++;x[countx]=1;countx++;
            } else {
                jButton1.setText("O");y1++;o[county]=1;county++;
            }
            count1--;
            if(countx>2||county>2)
                if(x1>0)
                    checker(x,'x');
                            else
                    checker(o,'o');
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        i++; int x1=0,y1=0;

        if (count3 > 0) {
            if (i % 2 != 0) {
                jButton3.setText("X");x1++;x[countx]=3;countx++;
            } else {
                jButton3.setText("O");y1++;o[county]=3;county++;
            }
// TODO add your handling code here:
            count3--;
            if(countx>2||county>2)
                if(x1>0){
                   
                    checker(x,'x');}
                            else
                    checker(o,'o');

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        i++; int x1=0,y1=0;
        
        if (count5 != 0) {
            if (i % 2 != 0) {
                jButton5.setText("X");x1++;x[countx]=5;countx++;
            } else {
                jButton5.setText("O");y1++;o[county]=5;county++;
            }
            count5--;
            if(countx>=2||county>=2)
                if(x1>0)
                    checker(x,'x');
                            else
                    checker(o,'o');
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        i++; int x1=0,y1=0;
        
        if (count6 != 0) {
            if (i % 2 != 0) {
                jButton6.setText("X");x1++;x[countx]=6;countx++;
            } else {
                jButton6.setText("O");y1++;o[county]=6;county++;
            }
            count6--;
            if(countx>2||county>2)
                if(x1>0)
                    checker(x,'x');
                            else
                    checker(o,'o');
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        i++; int x1=0,y1=0;

        if (count7 != 0) {
            if (i % 2 != 0) {
                jButton7.setText("X");x1++;x[countx]=7;countx++;
            } else {
                jButton7.setText("O");y1++;o[county]=7;county++;
            }
            count7--;
            if(countx>2||county>2)
                if(x1>0)
                    checker(x,'x');
                            else
                    checker(o,'o');
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        i++; int x1=0,y1=0;
        
        if (count8 != 0) {

            if (i % 2 != 0) {
                jButton8.setText("X");x1++;x[countx]=8;countx++;
            } else {
                jButton8.setText("O");y1++;      o[county]=8; county++; // TODO add your handling code here:
            }
            count8--;
            if(countx>2||county>2)
                if(x1>0)
                    checker(x,'x');
                            else
                    checker(o,'o');
        }


    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        i++; int x1=0,y1=0;
        
        if (count9 != 0) {
            if (i % 2 != 0) {
                jButton9.setText("X");x1++;x[countx]=9;countx++;
            } else {
                jButton9.setText("O");y1++;o[county]=9;county++;
            }
            count9--;
            if(countx>2||county>2)
                if(x1>0)
                    checker(x,'x');
                            else
                    checker(o,'o');
        }
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(XO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
