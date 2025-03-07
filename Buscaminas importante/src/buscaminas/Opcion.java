/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package buscaminas;

/**
 *
 * @author zarna
 */
public class Opcion extends javax.swing.JFrame {

    /**
     * Creates new form Opcion
     */
    public Opcion() {
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

        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        filasTexto = new javax.swing.JTextField();
        columnasTexto = new javax.swing.JTextField();
        minasTexto = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        generarTablero = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        instruccionesTexto = new javax.swing.JTextArea();
        retroceder = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        errorLabel = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jRadioButton1.setText("Busqueda por anchura");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(filasTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, -1));

        columnasTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnasTextoActionPerformed(evt);
            }
        });
        jPanel1.add(columnasTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, -1));
        jPanel1.add(minasTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, -1));

        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        generarTablero.setText("Crear juego nuevo");
        generarTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarTableroActionPerformed(evt);
            }
        });
        jPanel1.add(generarTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jLabel1.setText("BUSCAMINAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("Numero de columnas:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setText("Numero de filas:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setText("Numero de minas:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        instruccionesTexto.setColumns(20);
        instruccionesTexto.setRows(5);
        instruccionesTexto.setText("Instrucciones:\nLas filas y columnas \ndeben de estar contenidas de 3 a 10\ny el numero de minas puede tener como \nminimo 1 y como maximo el numero \nmaximo de casillas menos 1");
        jScrollPane1.setViewportView(instruccionesTexto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 86, -1, 110));

        retroceder.setText("Retroceder");
        retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrocederActionPerformed(evt);
            }
        });
        jPanel1.add(retroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jRadioButton2.setText("Busqueda 1");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jRadioButton3.setText("Busqueda 2");
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));
        jPanel1.add(errorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void columnasTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnasTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_columnasTextoActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void generarTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarTableroActionPerformed
        try{
        int columnas = Integer.parseInt(columnasTexto.getText());
        int filas = Integer.parseInt(filasTexto.getText());
        int minas = Integer.parseInt(minasTexto.getText());
        int casillastotales = columnas*filas;
        if(columnas < 3 || columnas>10){
            errorLabel.setText("ERROR: Numero de columnas o filas incorrecto");
        }else if(filas<3 || filas>10){
            errorLabel.setText("ERROR: Numero de columnas o filas incorrecto");
        }else if(minas<1 || minas>(casillastotales-1)){
            errorLabel.setText("ERROR: Numero de minas incorrecto");
        }else{
         errorLabel.setText("Juego creado excitosamente");
         TableroUI ventana3 = new TableroUI();
         ventana3.setVisible(true);
         this.setVisible(false);
        }
        }catch(Exception e){
         errorLabel.setText("ERROR: No siguio las instrucciones debidamente");
        }
    }//GEN-LAST:event_generarTableroActionPerformed

    private void retrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrocederActionPerformed
        Buscaminas ventana1 = new Buscaminas();
        ventana1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_retrocederActionPerformed

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
            java.util.logging.Logger.getLogger(Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField columnasTexto;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton exit;
    private javax.swing.JTextField filasTexto;
    private javax.swing.JButton generarTablero;
    private javax.swing.JTextArea instruccionesTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField minasTexto;
    private javax.swing.JButton retroceder;
    // End of variables declaration//GEN-END:variables
}
