/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package buscaminas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static buscaminas.Opcion.busquedaBFS;
import static buscaminas.Opcion.columnas1;
import static buscaminas.Opcion.filas1;
import static buscaminas.Opcion.grafo1;
import static buscaminas.Opcion.minas1;

/**
 * Interfaz correspondiente al tablero del buscaminas. Est&aacute; compuesto de una
 * matr&iacute;z de botones.
 * @author ricardo
 */
public class NewJFrame extends javax.swing.JFrame {
    private JButton botones[][];
    private boolean banderaPoner;
    private boolean barrerBoolean;
    private int minasact;
    private Lista listabanderas;
    private Lista listaminas;
    
    /**
     * Constructor de la clase NewJFrame. Crea la matriz de botones y le asigna
     * su color, posici&oacute;n y identifica las columnas con letras, mientras
     * que las filas usan numeros empezando desde el 1.
     */
    
    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.setResizable(false);
        
        Lista listaminas = new Lista();
        Lista listabanderas = new Lista();
        for(int n=0; n<minas1; n++){
        Random m = new Random();
        int pFilas = m.nextInt(filas1);
        int pColumnas = m.nextInt(columnas1);
        for(int p=0; p<grafo1.listaady.length; p++){
        if(grafo1.listaady[p].Prow==pFilas && grafo1.listaady[p].Pcolumn==pColumnas){
            grafo1.listaady[p].Mine = true;
            listaminas.Append2(grafo1.listaady[p]);
        }
        }
        }
        
        
        botones = new JButton[filas1][columnas1];
        char[] filaschar = {'A','B','C','D','E','F','G','H','I','J'};
        for(int i=0; i<filas1; i++){
      
        for(int j=0; j<columnas1; j++){
        botones[i][j] = new JButton();
        botones[i][j].addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                if (barrerBoolean && !banderaPoner){
                 FActionPerformed(evt);
                }if(!barrerBoolean && banderaPoner){
                 DActionPerformed(evt);
                }if(!barrerBoolean && !banderaPoner){
                 GActionPerformed(evt);
                }
                
            }
            
        });
        botones[i][j].setBackground(Color.white);
        botones[i][j].setText(String.valueOf(filaschar[i])+Integer.toString(j+1));
        jPanel1.add(botones[i][j]);
        botones[i][j].setName(Integer.toString(i)+Integer.toString(j));
        }
        }
        
    }
    
    private void GActionPerformed(ActionEvent e) {
            String btn = ((JButton) e.getSource()).getName();
            int f = Integer.parseInt(btn.substring(0,1));
            int c = Integer.parseInt(btn.substring(1,2));
            for(int i=0; i<grafo1.listaady.length;i++){
            if(i==grafo1.ind(f, c)){
            if(grafo1.listaady[i].visited == false && grafo1.listaady[i].bandera == true){
                listabanderas.Append2(grafo1.listaady[i]);
                grafo1.listaady[i].bandera = false;
                botones[f][c].setText("");    
                minasact++;
                
            }
            }
            }
     }
    
    
    private void DActionPerformed(ActionEvent e) {
            String btn = ((JButton) e.getSource()).getName();
            int f = Integer.parseInt(btn.substring(0,1));
            int c = Integer.parseInt(btn.substring(1,2));
            for(int i=0; i<grafo1.listaady.length;i++){
            if(i==grafo1.ind(f,c)){
                if(grafo1.listaady[i].visited == false && grafo1.listaady[i].bandera == false){
                    //listaminas.Append2(grafo1.listaady[i]);
                    grafo1.listaady[i].bandera = true;
                    botones[f][c].setText("B");
                    minasact--;
                    
                    //if(listaminas == listabanderas){
                    //JOptionPane.showMessageDialog(null,"Ganaste");
                    //}
                    
                    
                    
                }
            }
            
            }
     }

    private void FActionPerformed(java.awt.event.ActionEvent evt){
    
    String btn = ((JButton) evt.getSource()).getName();
    int f = Integer.parseInt(btn.substring(0,1))+1;
    int c = Integer.parseInt(btn.substring(1,2))+1;
    
    grafo1.unir3(grafo1.ind(f,c));
    grafo1.minasAdyacentes();
       // Hay que hacerle una validacion antes
        for(int i=0; i<grafo1.listaady.length; i++){
            
            if(i==grafo1.ind(f,c)){
                if(grafo1.listaady[i].visited==true){
                botones[f-1][c-1].setEnabled(false);
                }
                if(grafo1.listaady[i].Mine == true){
                // Muestra todos los numeros de las casillas
                botones[f-1][c-1].setText("*");
                JOptionPane.showMessageDialog(null, "Perdiste");
                this.dispose();
                Opcion ventana4 = new Opcion();
                ventana4.setVisible(true);
                }else if(grafo1.listaady[i].Mine == false && grafo1.listaady[i].mineAdy>0){
                // Muestra la casilla
                grafo1.listaady[i].visited = true;
                int adj = grafo1.listaady[i].mineAdy;
                String adj_str = Integer.toString(adj);
                botones[f-1][c-1].setText(adj_str);
                botones[f-1][c-1].setEnabled(false);
                }else if(grafo1.listaady[i].Mine == false && grafo1.listaady[i].mineAdy==0){
                    grafo1.listaady[i].visited = true;
                    int adj = grafo1.listaady[i].mineAdy;
                    String adj_str = Integer.toString(adj);
                    botones[f-1][c-1].setText(adj_str);
                    botones[f-1][c-1].setEnabled(false);
                    if(busquedaBFS){
                    grafo1.BFS(grafo1.listaady[i]);
                    botones[f-1][c-1].setEnabled(false);
                        
                        
                        
                    }else{
                        //grafo1.DFS(listaady[i]);
                    JOptionPane.showMessageDialog(null,"Ganaste");
                    this.dispose();
                    Opcion ventana4 = new Opcion();
                    ventana4.setVisible(true);
                    }
                    
                
                }
            }

            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.GridLayout(filas1, columnas1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 520, 330));

        jToggleButton1.setText("Barrer casilla");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jToggleButton2.setText("Poner bandera");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("BUSCAMINAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if(jToggleButton1.isSelected()){
        barrerBoolean = true;
        }else{
        barrerBoolean = false;
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        
        if(jToggleButton2.isSelected()){
        banderaPoner = true;
        }else{
        banderaPoner = false;
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        /** Crea el objeto JFileChooser, usado para guardar el estado de juego
         * en formato CSV.
         */
        
        JFileChooser save = new JFileChooser();
        save.showSaveDialog(this);
        File gameState = save.getSelectedFile();
        
        /** Genera el archivo CSV que contiene las variables correspondientes
         * al juego en el momento en el que se guardo.
         */
        
        if (gameState != null) {
            BufferedWriter saveFile;
            try {
                
                // Crea un archivo con el nombre dado en la seleccion de
                // archivo y le agrega ".csv" al final, a menos que ya tenga
                // esa extensi&oacute;n.
                
                if (!gameState.getName().toLowerCase().endsWith(".csv")) {     
                    saveFile = new BufferedWriter(new FileWriter(gameState+".csv"));
                }else{
                    saveFile = new BufferedWriter(new FileWriter(gameState));
                }
                // Una primera linea que funciona para identificar que el
                // archivo que se abrio es un save file.
                
                saveFile.write("THIS IS A SAVE FILE!");
                saveFile.newLine();
                saveFile.write(filas1 + "," + columnas1 + "," + minas1);
                saveFile.newLine();
                
                // Recorre el grafo para obtener las casillas con sus propiedades.
                // Se divide usando comas para que en al abrir el archivo en
                // Excel, los datos esten en distintas celdas.
                
                for (int posRow = 0; posRow < filas1; posRow++) {
                    for (int posColumn = 0; posColumn < columnas1; posColumn++) {
                        Casilla casilla = grafo1.listaady[grafo1.ind(posRow + 1, posColumn + 1)];
                        String gameVariableLine = (posRow + 1) + "," + (posColumn + 1) + "," + casilla.isMine() + "," + casilla.isVisited() + "," + casilla.isBandera() + "," + casilla.getMineAdy();
                        saveFile.write(gameVariableLine);
                        saveFile.newLine();
                }
            }
                saveFile.flush();
            }catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error: No se ha podido guardar el estado del juego." + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
