/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign;

import static assign.Assign.*;
import static assign.click.alledge;
import static assign.click.allvertex;
import static assign.click.firstofedge;
import static assign.click.lastofedge;
import static assign.click.namepts;
import static assign.click.pts;
import static assign.click.weigh;
import static assign.mark.*;
import static assign.point.*;
import java.util.*;

import javax.swing.JOptionPane;

/**
 *
 * @author kaun_meet
 */
public class Deletevertex extends javax.swing.JFrame {

    /**
     * Creates new form Deletevertex
     */
    public Deletevertex() {
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

        jLabel1 = new javax.swing.JLabel();
        deletename = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Name of vertex to be deleted");

        deletename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletenameActionPerformed(evt);
            }
        });

        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51)
                        .addComponent(deletename, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jButton1)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(deletename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jButton1)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletenameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            String f = deletename.getText().trim();
            if (f.isEmpty()) {
                JOptionPane.showMessageDialog(null, "enter the name please !!!");
            } else {
//            int i=0;
//            int n=vertexlist.size();
//            for(i=0;i<n;i++){
//                if(f.equals(vertexlist.get(i).nameofvertex)){
//                    break;
//                }
//            }
//            if(i<n){
//                JOptionPane.showMessageDialog(null,"removed "+vertexlist.get(i).nameofvertex+" "+vertexlist.get(i).xcoordinate
//                        +" "+vertexlist.get(i).ycoordinate);
//            
//            vertexlist.remove(i);

                int g = mark.checkvertex(f);
//            int valid = 1;
//            valid = mark.cnof(f);
                if (false) {
//                System.out.println("Invalid input");
                } else {
                    if (g == -1) {

                        JOptionPane.showMessageDialog(null, "NOT FOUND any vertex with this name");
//                        System.out.println("NOT FOUND any vertex with this name");
                    } else {
                        namepts.remove(g);
                        pts.remove(g);
                        allvertex.remove(g);

//                    vertexlist.remove(g);
                        ArrayList<Integer> de = new ArrayList<Integer>();

                        String del = f;
                        System.out.println(del);

                        int i = 0;
//                    int m = edgelist.size();
                        int m = alledge.size();

                        for (i = 0; i < m; i++) {
//                        System.out.println(i+" "+edgelist.get(i).from+" "+edgelist.get(i).to);
                            if (alledge.get(i).fromvertex.equals(del) || alledge.get(i).tovertex.equals(del)) {
                                de.add(i);
                            }

                        }
                        m = de.size();
//                    edgelist.remove(0);
                        for (i = m - 1; i >= 0; i--) {
//                        System.out.print(de.get(i));
                            try {
                                int xx = de.get(i);
                                alledge.remove(xx);
                                firstofedge.remove(xx);
                                lastofedge.remove(xx);
                                weigh.remove(xx);

//                        edgelist.remove(xx);
                            } catch (Exception e) {

                            }
                        }
//                    for(i=0;i<edgelist.size();i++){
//                        System.out.println(edgelist.get(i).from+" "+edgelist.get(i).to);
//                    }
                        JOptionPane.showMessageDialog(null, "REMOVED the vertex and also the edges of it");

//                        System.out.println("REMOVED the vertex and also the edges of it");
                    }
                }

            }
//        first.jPanel2.repaint();

            this.dispose();
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Deletevertex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deletevertex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deletevertex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deletevertex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deletevertex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField deletename;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
