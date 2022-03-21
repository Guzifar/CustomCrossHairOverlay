
package crosshairoverlay;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class main extends javax.swing.JFrame {
    int x,y;
    boolean hide;
    public main() {
        initComponents();
        centerWindow();
//        this.getContentPane().setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
//        this.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minimize = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        CenterButton = new javax.swing.JButton();
        CrossHairSymbol = new javax.swing.JTextField();
        CurrentSize = new javax.swing.JLabel();
        SizeSlider = new javax.swing.JSlider();
        HideUI = new javax.swing.JButton();
        HotkeyField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        border = new javax.swing.JLabel();
        CrossHair = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusCycleRoot(false);
        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        minimize.setText("➖");
        minimize.setBorder(null);
        minimize.setContentAreaFilled(false);
        minimize.setFocusPainted(false);
        minimize.setFocusable(false);
        minimize.setOpaque(true);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 40, 20));

        exit.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        exit.setText("🞬");
        exit.setAlignmentY(0.0F);
        exit.setBorder(null);
        exit.setContentAreaFilled(false);
        exit.setFocusPainted(false);
        exit.setFocusable(false);
        exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit.setIconTextGap(0);
        exit.setOpaque(true);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 40, 20));

        CenterButton.setBackground(new java.awt.Color(153, 153, 153));
        CenterButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        CenterButton.setForeground(new java.awt.Color(255, 255, 255));
        CenterButton.setText("CENTER");
        CenterButton.setToolTipText("Press to center window");
        CenterButton.setAlignmentY(0.0F);
        CenterButton.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 0, 0, new java.awt.Color(102, 102, 102)));
        CenterButton.setContentAreaFilled(false);
        CenterButton.setFocusPainted(false);
        CenterButton.setFocusable(false);
        CenterButton.setOpaque(true);
        CenterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CenterButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CenterButtonMouseExited(evt);
            }
        });
        CenterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CenterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CenterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 200, 30));

        CrossHairSymbol.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        CrossHairSymbol.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CrossHairSymbol.setText("🔘");
        CrossHairSymbol.setToolTipText("Paste your desired symbol and press enter");
        CrossHairSymbol.setFocusable(false);
        CrossHairSymbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrossHairSymbolActionPerformed(evt);
            }
        });
        getContentPane().add(CrossHairSymbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 90, 30));

        CurrentSize.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        CurrentSize.setText("Crosshair size: 20");
        CurrentSize.setFocusable(false);
        getContentPane().add(CurrentSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 400, 20));

        SizeSlider.setMaximum(200);
        SizeSlider.setValue(20);
        SizeSlider.setFocusable(false);
        SizeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SizeSliderStateChanged(evt);
            }
        });
        getContentPane().add(SizeSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 400, 30));

        HideUI.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.selectionBackground"));
        HideUI.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        HideUI.setForeground(new java.awt.Color(255, 255, 255));
        HideUI.setText("HIDE UI");
        HideUI.setToolTipText("Press to hide ui");
        HideUI.setContentAreaFilled(false);
        HideUI.setFocusPainted(false);
        HideUI.setOpaque(true);
        HideUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HideUIActionPerformed(evt);
            }
        });
        getContentPane().add(HideUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 130, 30));

        HotkeyField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        HotkeyField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        HotkeyField.setText("F9");
        HotkeyField.setToolTipText("Press the Hotkey to hide ui");
        HotkeyField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        HotkeyField.setFocusable(false);
        getContentPane().add(HotkeyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 90, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SYMBOL");
        jLabel2.setFocusable(false);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 90, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOTKEY");
        jLabel1.setFocusable(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 90, 20));

        border.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));
        border.setFocusable(false);
        border.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                borderMouseDragged(evt);
            }
        });
        border.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                borderMousePressed(evt);
            }
        });
        getContentPane().add(border, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        CrossHair.setFont(new java.awt.Font("Segoe UI Symbol", 0, 20)); // NOI18N
        CrossHair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CrossHair.setText("🔘");
        CrossHair.setAlignmentY(0.0F);
        CrossHair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CrossHair.setIconTextGap(0);
        CrossHair.setMaximumSize(new java.awt.Dimension(480, 480));
        CrossHair.setMinimumSize(new java.awt.Dimension(480, 480));
        CrossHair.setPreferredSize(new java.awt.Dimension(480, 480));
        CrossHair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CrossHairKeyPressed(evt);
            }
        });
        getContentPane().add(CrossHair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void borderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borderMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_borderMousePressed

    private void borderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borderMouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
        border.requestFocus();
    }//GEN-LAST:event_borderMouseDragged

    private void CenterButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CenterButtonMouseEntered
        CenterButton.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_CenterButtonMouseEntered

    private void CenterButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CenterButtonMouseExited
        CenterButton.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_CenterButtonMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setForeground(Color.WHITE);
        exit.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setForeground(Color.BLACK);
        exit.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_exitMouseExited

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setForeground(Color.WHITE);
        minimize.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setForeground(Color.BLACK);
        minimize.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_minimizeMouseExited

    private void CenterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CenterButtonActionPerformed
        centerWindow();
    }//GEN-LAST:event_CenterButtonActionPerformed

    private void CrossHairSymbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrossHairSymbolActionPerformed
        setCrossHairSymbol();
    }//GEN-LAST:event_CrossHairSymbolActionPerformed

    private void SizeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SizeSliderStateChanged
        setCrossHairSize();
    }//GEN-LAST:event_SizeSliderStateChanged

    private void CrossHairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CrossHairKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_F9){
            hide = false;
            toggleHotkey();
        }
    }//GEN-LAST:event_CrossHairKeyPressed

    private void HideUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HideUIActionPerformed
        hide = true;
        toggleHotkey();
    }//GEN-LAST:event_HideUIActionPerformed

    public void  toggleHotkey(){
        if(hide==true){
            this.setAlwaysOnTop(true);
            this.getContentPane().setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
            this.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
            CrossHairSymbol.setVisible(false);
            exit.setVisible(false);
            minimize.setVisible(false);
            HideUI.setVisible(false);
            CenterButton.setVisible(false);
            CurrentSize.setVisible(false);
            SizeSlider.setVisible(false);
            HotkeyField.setVisible(false);
            jLabel2.setVisible(false);
            jLabel1.setVisible(false);
            border.setVisible(false);
            CrossHair.requestFocus();
            CrossHair.requestFocusInWindow();
        }else{
            this.setAlwaysOnTop(false);
            this.getContentPane().setBackground(new Color(240,240,240));
            this.setBackground(new Color(240,240,240));
            CrossHairSymbol.setVisible(true);
            exit.setVisible(true);
            minimize.setVisible(true);
            HideUI.setVisible(true);
            CenterButton.setVisible(true);
            CurrentSize.setVisible(true);
            SizeSlider.setVisible(true);
            HotkeyField.setVisible(true);
            jLabel2.setVisible(true);
            jLabel1.setVisible(true);
            border.setVisible(true);
        }
    }
    
    public void setCrossHairSize(){
        int sliderValue = SizeSlider.getValue();
        CurrentSize.setText("Crosshair size: "+sliderValue);
        CrossHair.setFont(new java.awt.Font("Segoe UI Symbol", 0, sliderValue));
    }
    
    public void setCrossHairSymbol(){
        String crosshairSymbol = CrossHairSymbol.getText();
        CrossHair.setText(crosshairSymbol);
    }

    public void centerWindow(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();  
        Dimension screenSize = toolkit.getScreenSize();  
        int x = (screenSize.width - getWidth()) / 2;  
        int y = (screenSize.height - getHeight()) / 2;  
        setLocation(x, y);
    }
        
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);   
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CenterButton;
    private javax.swing.JLabel CrossHair;
    private javax.swing.JTextField CrossHairSymbol;
    private javax.swing.JLabel CurrentSize;
    private javax.swing.JButton HideUI;
    private javax.swing.JTextField HotkeyField;
    private javax.swing.JSlider SizeSlider;
    private javax.swing.JLabel border;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton minimize;
    // End of variables declaration//GEN-END:variables

}
