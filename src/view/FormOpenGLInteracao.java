/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import opengl.OpenGLExemplo05;

public class FormOpenGLInteracao extends javax.swing.JFrame implements java.awt.event.KeyListener {

    private Object obj;

    public FormOpenGLInteracao() {
        initComponents();
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn = new opengl.OpenGLExemplo05();
        lblTransalacao = new javax.swing.JLabel();
        txtTx = new javax.swing.JTextField();
        lblTx = new javax.swing.JLabel();
        lblTy = new javax.swing.JLabel();
        txtTy = new javax.swing.JTextField();
        lblTz = new javax.swing.JLabel();
        txtTz = new javax.swing.JTextField();
        btnAplicarTranslacao = new javax.swing.JButton();
        lblSx = new javax.swing.JLabel();
        lblSy = new javax.swing.JLabel();
        txtSy = new javax.swing.JTextField();
        lblSz = new javax.swing.JLabel();
        txtSz = new javax.swing.JTextField();
        btnAplicarEscala = new javax.swing.JButton();
        lblEscala = new javax.swing.JLabel();
        txtSx = new javax.swing.JTextField();
        lblRx = new javax.swing.JLabel();
        lblTranslacao = new javax.swing.JLabel();
        btnAplicarRotacao = new javax.swing.JButton();
        txtAngulo = new javax.swing.JTextField();
        ckbRy = new javax.swing.JCheckBox();
        ckbRz = new javax.swing.JCheckBox();
        ckbRx = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pn.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout pnLayout = new javax.swing.GroupLayout(pn);
        pn.setLayout(pnLayout);
        pnLayout.setHorizontalGroup(
            pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        pnLayout.setVerticalGroup(
            pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        lblTransalacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTransalacao.setText("Translação");

        txtTx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTx.setText("0");

        lblTx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTx.setText("Tx:");

        lblTy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTy.setText("Ty:");

        txtTy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTy.setText("0");

        lblTz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTz.setText("Tz:");

        txtTz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTz.setText("0");

        btnAplicarTranslacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAplicarTranslacao.setText("aplicar");
        btnAplicarTranslacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarTranslacaoActionPerformed(evt);
            }
        });

        lblSx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSx.setText("Sx:");

        lblSy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSy.setText("Sy:");

        txtSy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSy.setText("0");

        lblSz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSz.setText("Sz:");

        txtSz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSz.setText("0");

        btnAplicarEscala.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAplicarEscala.setText("aplicar");
        btnAplicarEscala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarEscalaActionPerformed(evt);
            }
        });

        lblEscala.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEscala.setText("Escala");

        txtSx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSx.setText("0");

        lblRx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRx.setText("Ângulo");

        lblTranslacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTranslacao.setText("Rotação");

        btnAplicarRotacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAplicarRotacao.setText("aplicar");
        btnAplicarRotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarRotacaoActionPerformed(evt);
            }
        });

        txtAngulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAngulo.setText("0");

        ckbRy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ckbRy.setText("Ry");

        ckbRz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ckbRz.setText("Rz");

        ckbRx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ckbRx.setText("Rx");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ckbRx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbRy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbRz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTx)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTx, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTy)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTy, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTz)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTz, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblTransalacao)
                        .addComponent(btnAplicarTranslacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSx, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSy, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSz, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblEscala)
                    .addComponent(btnAplicarEscala, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTranslacao)
                    .addComponent(btnAplicarRotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTransalacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTx)
                    .addComponent(txtTy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTy)
                    .addComponent(txtTz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAplicarTranslacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEscala)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSx)
                    .addComponent(txtSy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSy)
                    .addComponent(txtSz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAplicarEscala)
                .addGap(18, 18, 18)
                .addComponent(lblTranslacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbRy)
                    .addComponent(ckbRx)
                    .addComponent(ckbRz)
                    .addComponent(txtAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRx))
                .addGap(18, 18, 18)
                .addComponent(btnAplicarRotacao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAplicarTranslacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarTranslacaoActionPerformed
        try {
            float tx = Float.parseFloat(txtTx.getText());
            float ty = Float.parseFloat(txtTy.getText());
            float tz = Float.parseFloat(txtTz.getText());

            OpenGLExemplo05 glp = (OpenGLExemplo05) pn;
            glp.setTx(glp.getTx() + tx);
            glp.setTy(glp.getTy() + ty);
            glp.setTz(glp.getTz() + tz);

        } catch (Exception e) {
        }
        this.requestFocusInWindow();
    }//GEN-LAST:event_btnAplicarTranslacaoActionPerformed

    private void btnAplicarEscalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarEscalaActionPerformed
        try {
            float sx = Float.parseFloat(txtSx.getText());
            float sy = Float.parseFloat(txtSy.getText());
            float sz = Float.parseFloat(txtSz.getText());

            OpenGLExemplo05 glp = (OpenGLExemplo05) pn;
            glp.setSx(glp.getSx() + sx);
            glp.setSy(glp.getSy() + sy);
            glp.setSz(glp.getSz() + sz);

        } catch (Exception e) {
        }
        this.requestFocusInWindow();
    }//GEN-LAST:event_btnAplicarEscalaActionPerformed

    private void btnAplicarRotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarRotacaoActionPerformed
        try {
            int rx = (ckbRx.isSelected()) ? 1 : 0;
            int ry = (ckbRy.isSelected()) ? 1 : 0;
            int rz = (ckbRz.isSelected()) ? 1 : 0;
            float angulo = Float.parseFloat(txtAngulo.getText());

            OpenGLExemplo05 glp = (OpenGLExemplo05) pn;
            glp.setRx(rx);
            glp.setRy(ry);
            glp.setRz(rz);
            glp.setAngulo(glp.getAngulo()+angulo);

        } catch (Exception e) {
        }
        this.requestFocusInWindow();
    }//GEN-LAST:event_btnAplicarRotacaoActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FormOpenGLInteracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormOpenGLInteracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormOpenGLInteracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormOpenGLInteracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormOpenGLInteracao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicarEscala;
    private javax.swing.JButton btnAplicarRotacao;
    private javax.swing.JButton btnAplicarTranslacao;
    private javax.swing.JCheckBox ckbRx;
    private javax.swing.JCheckBox ckbRy;
    private javax.swing.JCheckBox ckbRz;
    private javax.swing.JLabel lblEscala;
    private javax.swing.JLabel lblRx;
    private javax.swing.JLabel lblSx;
    private javax.swing.JLabel lblSy;
    private javax.swing.JLabel lblSz;
    private javax.swing.JLabel lblTransalacao;
    private javax.swing.JLabel lblTranslacao;
    private javax.swing.JLabel lblTx;
    private javax.swing.JLabel lblTy;
    private javax.swing.JLabel lblTz;
    private javax.swing.JPanel pn;
    private javax.swing.JTextField txtAngulo;
    private javax.swing.JTextField txtSx;
    private javax.swing.JTextField txtSy;
    private javax.swing.JTextField txtSz;
    private javax.swing.JTextField txtTx;
    private javax.swing.JTextField txtTy;
    private javax.swing.JTextField txtTz;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("OpenGL - " + getClass().getName());
        this.obj = new opengl.OpenGLExemplo05();
        pn.addKeyListener(this);
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("TECLA = " + e.getKeyChar());

        OpenGLExemplo05 glp = (OpenGLExemplo05) pn;
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                glp.setTx(glp.getTx() + 0.1f);
                break;
            case KeyEvent.VK_LEFT:
                glp.setTx(glp.getTx() - 0.1f);
                break;
            case KeyEvent.VK_UP:
                glp.setTy(glp.getTy() + 0.1f);
                break;
            case KeyEvent.VK_DOWN:
                glp.setTy(glp.getTy() - 0.1f);
                break;
            case KeyEvent.VK_R:
                glp.setTx(0.0f);
                glp.setTy(0.0f);
                glp.setTz(0.0f);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
