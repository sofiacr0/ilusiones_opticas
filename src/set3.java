
import java.awt.Graphics;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class set3 extends javax.swing.JFrame {

    /**
     * Creates new form set2
     */
    public set3() {
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

        jPanel1 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent (g);
                int h = jPanel1.getHeight();
                int w = jPanel1.getWidth();
                for (int i = 0; i <= w/2; i+=5){
                    g.drawLine(i,h, w/2, h-i);
                    g.drawLine(w-i,h,w/2,h-i);
                    g.drawLine(i,0,w/2,i);
                    g.drawLine(w-i,0,w/2,i);
                    g.drawLine(i,h-i,w/2-i,h/2-i);
                    g.drawLine(w-i,i,w/2+i,h/2+i);
                }

            }
        };
        jPanel2 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent (g);
                int h = jPanel2.getHeight();
                int w = jPanel2.getWidth();
                for (int i = 0; i <= w/2; i+=5){
                    g.drawLine(i,h, w/2, h-i);
                    g.drawLine(w-i,h,w/2,h-i);
                    g.drawLine(i,0,w/2,i);
                    g.drawLine(w-i,0,w/2,i);
                    g.drawLine(0,i,i,h/2);
                    g.drawLine(0,h-i,i,h/2);
                    g.drawLine(w,h-i,w-i,h/2);
                    g.drawLine(w,i,w-i,h/2);
                }
            }
        };
        jPanel3 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                int h = jPanel4.getHeight();
                int w = jPanel4.getWidth();

                for (int i = 0; i <= w/2; i+=10){
                    g.drawLine(i, 0, 0, h/2-i);
                    g.drawLine(i, h, 0, h/2+i);
                    g.drawLine(w/2+i, 0, w, i);
                    g.drawLine(w/2+i, h, w, h-i);
                    g.drawLine(w/4+(i/2), h/2-(i/2),w/2, h/4-(i/2));
                    g.drawLine(w/4+(i/2), h/2-(i/2), w/2+(i/2), h/4+(i/2));
                    g.drawLine(w/2, h/4-(i/2), (w-(w/4))-(i/2), h/2-(i/2));
                    g.drawLine(w/4+(i/2), h/2+(i/2), w/2, (h-(h/4))+(i/2));
                    g.drawLine(w/4+(i/2), h/2+(i/2), w/2+(i/2), (h-(h/4))-(i/2));
                    g.drawLine(w/2, (h-(h/4))+(i/2), (w-(w/4)-(i/2)), h/2+(i/2));
                    g.drawLine(i/2, h/4+(i/2), w/4-(i/2), h/2+(i/2));
                    g.drawLine((w-(w/4))+(i/2), h/2-(i/2), w-(i/2), (h-(h/4))-(i/2));
                }
            }
        };
        jPanel4 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                int h = jPanel2.getHeight();
                int w = jPanel2.getWidth();

                for (int i = 0; i <= w/2; i+= 5){
                    g.drawLine(0, h/2 + i, 0 + i, h);
                    g.drawLine(w, h/2 + i, w - i, h);
                }
                for (int i = 0; i <= w/4; i+= 5){
                    g.drawLine(w/4 + i, 3*h/4, w/2, 3*h/4 - i);
                    g.drawLine(w/2 + i, 3*h/4, w/2, h/2 + i);
                    g.drawLine(w/4 + i, 3*h/4, w/2, 3*h/4 + i);
                    g.drawLine(w/2 + i, 3*h/4, w/2, h - i);
                }
                for (int i = 0; i <= w/2; i+= 5){
                    g.drawLine(0, i, w/2 - i, h/2 - i);
                    g.drawLine(w/2, i, w/2 -i, h/2-i);
                    g.drawLine(w/2, i, w/2+i, h/2 -i);
                    g.drawLine(w, i, w/2 + i, h/2 - i);
                }
            }
        };
        jPanel5 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent (g);
                int h = jPanel1.getHeight();
                int w = jPanel1.getWidth();
                for (int i = 0; i <= w/2; i+=5){
                    //Rombo
                    g.drawLine(w/2, h/2-i, 0+i, h/2);
                    g.drawLine(w/2, h/2-i, w-i, h/2);
                    //g.drawLine(h/2+i,0+i, w, h/2-i);
                    //g.drawLine(w/2, h/2+i, w/2+i,h/2);
                    //g.drawLine(w/2+i,h/2, w, h/2+i);
                    //g.drawLine(w/2, h/2, 0-i, w/2);
                    g.drawLine(w/2, h/2+i, w-i, h/2);
                    g.drawLine(w/2, h/2+i, i, h/2);

                    //Piso
                    g.drawLine(0,h/2+i, 0+i,h);
                    g.drawLine(w, h/2 + i, w - i, h);

                    //Techo
                    g.drawLine(0,h/2-i,i,0);
                    g.drawLine(w,h/2-i,w-i,0);

                    //Arriba
                    //g.drawLine(w-i, h/2-i, h/2+i,0);
                    //g.drawLine(h/2-i, w-i, 0, h/2+i);
                }
            }
        };
        jPanel6 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent (g);
                int h = jPanel6.getHeight();
                int w = jPanel6.getWidth();
                for (int i = 0; i <= w/2; i+=5){
                    //g.drawLine(h/4+i,0,  w-i, h);
                    g.drawLine(0, 0, w/2-1, h/2-i);
                    g.drawLine(w/2, i, w-1, 0);
                    //abajo
                    g.drawLine(0, h, w/2-1, h-i);
                    g.drawLine(w/2, h-i, w-1, h);

                    //g.drawLine(w/2, 0, w/2, h);
                    g.drawLine(0, i, w/2 - i, h/2 - i);
                    g.drawLine(w, i, w/2 + i, h/2 - i);

                    //g.drawLine(0, h, w/2 + i, h/2 - i);
                    //g.drawLine(w, h, w/2 - i, h/2 - i);
                    g.drawLine(0, h - i, w/2 - i, h/2 + i);
                    g.drawLine(w, h - i, w/2 + i, h/2 + i);

                }
            }
        };
        jPanel7 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent (g);
                int h = jPanel7.getHeight();
                int w = jPanel7.getWidth();
                for (int i = 0; i <= w/2; i+=5){
                    //g.drawLine(w/2,h/2, i, 0);
                    g.drawLine(w/2,h/2, i, h);
                    g.drawLine(w/2, h/2, w-i, h);

                    g.drawLine(0, h/2-i, w, h/2-i);
                    g.drawLine(0, h-i, w, h-i);

                    //Arriba
                    //g.drawLine(0, i, w/2 - i, h/2 - i);
                    //g.drawLine(w, i, w/2 + i, h/2 - i);
                }

                for (int i = 0; i <= w/4; i += 5){
                    g.drawLine(w/4 + i, h/4, w/2, h/4 + i);
                    g.drawLine(w/2 + i, h/4, w/2, h/2 - i);
                    g.drawLine(w/4 + i, h/4, w/2, h/4 - i);
                    g.drawLine(w/2 + i, h/4, w/2, i);
                }
            }
        };
        jPanel8 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent (g);
                int h = jPanel8.getHeight();
                int w = jPanel8.getWidth();
                for (int i = 0; i <= w/2; i+=5){
                    //g.drawLine(0, i, w/2 - i, h - i);
                    //g.drawLine(w, i, w/2 + i, h - i);
                    //g.drawLine(w - i, h - i, i, h - i);
                    //g.drawLine(0 + i, 0 + i, w + i, i);
                    //g.drawLine(0 + i, 0 + i, i, 0);

                    //arriba
                    g.drawLine(w/2 - i, h/2 - i, i, 0);
                    g.drawLine(h/2 - i, w/2 - i, 0, i);
                    g.drawLine(w/2 + i, h/2 - i, w - i, 0);
                    g.drawLine(h/2 + i, w/2 - i, w, i);

                    //abajo
                    g.drawLine(w/2 - i, h/2 + i, i, h);
                    g.drawLine(h/2 - i, w/2 + i, 0, h - i);
                    g.drawLine(w/2 + i, h/2 + i, w - i, h);
                    g.drawLine(h/2 + i, w/2 + i, w, h - i);

                }
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(set3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(set3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(set3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(set3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new set3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
