/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pequisaordenacao;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author laboratorio
 */
public class JFrame_Principal extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_Principal
     */
    public JFrame_Principal() {
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

        lblAreaTxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaTexto = new javax.swing.JTextArea();
        lblPesquisa = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        lblOcorrencias = new javax.swing.JLabel();
        txtOcorrencias = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAreaTxt.setText("Área de texto");

        txaTexto.setColumns(20);
        txaTexto.setRows(5);
        jScrollPane1.setViewportView(txaTexto);

        lblPesquisa.setText("Pesquisa");

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });

        lblOcorrencias.setText("Ocorrências");

        txtOcorrencias.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPesquisa)
                    .addComponent(lblAreaTxt)
                    .addComponent(lblOcorrencias))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(txtPesquisa)
                    .addComponent(txtOcorrencias))
                .addContainerGap(440, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAreaTxt))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPesquisa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOcorrencias)
                    .addComponent(txtOcorrencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        //JOptionPane.showMessageDialog(this, "Tecla: " + evt.getKeyCode()); evt.getKeyChar
        //ESC = 27
        //ESPAÇO = 32
        //BACKSPACE = 8
        //SHIFT = 16
        //CTRL = 17
        
    }//GEN-LAST:event_txtPesquisaActionPerformed
    
    int contarOcorrenciasExpressao(String expressao, StringBuilder texto){
        int ocorrencias = 0;
        int tamanhoExpressao = expressao.length();
        
        for(int i = 0; i+tamanhoExpressao < texto.length(); i++){
            if (expressao.equalsIgnoreCase(texto.substring(i, i+tamanhoExpressao))){
                ocorrencias++;
            }
        }
   
        return ocorrencias;
    }
    
    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
        ArrayList<Integer> teclasProibidas = new ArrayList<>();
        teclasProibidas.add(10);
        //teclasProibidas.add(8);
        teclasProibidas.add(20);
        teclasProibidas.add(27);
        teclasProibidas.add(127);
        //teclasProibidas.add(37);
        //teclasProibidas.add(38);
        //teclasProibidas.add(39);
        //teclasProibidas.add(40);
        
        if(!teclasProibidas.contains(evt.getExtendedKeyCode())){
                if (txaTexto.getText().isBlank() || txaTexto.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Área de texto vazia"); 
                    txtPesquisa.setText("");
                }else{            
                    //JOptionPane.showMessageDialog(this, evt.getKeyCode() + txaTexto.getText()); 
                    String expressao_pesquisa = txtPesquisa.getText();
                    StringBuilder texto = new StringBuilder(txaTexto.getText()); //StringBuffer
                    
                    txtOcorrencias.setText("" + contarOcorrenciasExpressao(expressao_pesquisa, texto));
            }
        }
    }//GEN-LAST:event_txtPesquisaKeyPressed

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
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAreaTxt;
    private javax.swing.JLabel lblOcorrencias;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JTextArea txaTexto;
    private javax.swing.JTextField txtOcorrencias;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}