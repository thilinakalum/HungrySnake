/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bolton.oom.assingment.snake;

import java.awt.GridLayout;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 *
 * @author kalum
 */
public class Main extends javax.swing.JFrame {

  private static final long serialVersionUID = -2542001418764869760L;
  public static ArrayList<ArrayList<DataOfSquare>> Grid;
  public static int width = 40;
  public static int height = 40;
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setTitle("Hungry Snake");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Creates the arraylist that'll contain the threads
    Grid = new ArrayList<ArrayList<DataOfSquare>>();
    ArrayList<DataOfSquare> data;

    // Creates Threads and its data and adds it to the arrayList
    for (int i = 0; i < width; i++) {
      data = new ArrayList<DataOfSquare>();
      for (int j = 0; j < height; j++) {
        DataOfSquare c = new DataOfSquare(2);
        data.add(c);
      }
      Grid.add(data);
    }

    // Setting up the layout of the panel
    getContentPane().setLayout(new GridLayout(40, 40, 0, 0));

    // Start & pauses all threads, then adds every square of each thread to the panel
    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        getContentPane().add(Grid.get(i).get(j).square);
      }
    }

    // initial position of the snake
    Tuple position = new Tuple(20, 20);
    // passing this value to the controller
    SnakeController c = new SnakeController(position);
    //Let's start the game now..
    c.start();
    
    // Links the window to the keyboardlistenner.
    this.addKeyListener((KeyListener) new EventListener());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}