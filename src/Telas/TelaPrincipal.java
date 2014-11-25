/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import SistemaUniversitario.Aluno;
import SistemaUniversitario.Curso;
import SistemaUniversitario.Disciplina;
import SistemaUniversitario.Excecoes;
import SistemaUniversitario.Periodo;
import SistemaUniversitario.Turma;
import SistemaUniversitario.TurmaGraduacao;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Maquina 8
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    //Adicionar alunos a uma turma de graduação ou de extensão.
    static ArrayList<Aluno> listaBDAluno = new ArrayList<Aluno>();
    //Adicionar uma turma para uma disciplina ou para um curso de extensão;
    static ArrayList<Turma> listaBDTurma = new ArrayList<Turma>();
    //Incluir uma disciplina em um período de um curso;
    static ArrayList<Disciplina> listaBDDisciplina = new ArrayList<Disciplina>();
    //Incluir um período em um curso; 
    static ArrayList<Periodo> listaBDPeriodo = new ArrayList<Periodo>();
    //Incluir um novo curso, de extensão ou de graduação; 
    static ArrayList<Curso> listaBDCurso = new ArrayList<Curso>();
    
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
        listaBDAluno.add(new Aluno(1, "Fulano", "end"));
        listaBDAluno.add(new Aluno(2, "Ciclano", "end"));
        listaBDAluno.add(new Aluno(3, "Beltrano", "end"));
        listaBDAluno.add(new Aluno(4, "Bacana", "end"));
        listaBDAluno.add(new Aluno(5, "Tretado", "end"));
        try {
            listaBDTurma.add(new TurmaGraduacao(1, 2014, "Miriam Maia", listaBDAluno)); //Codigo : CIC1AM
            //listaBDTurma.add(new TurmaGraduacao(1, 2014, "Miriam Maia", listaBDAluno)); //Codigo : CIC1AN
            listaBDTurma.add(new TurmaGraduacao(1, 2014, "Moisés", listaBDAluno));
           
            Disciplina d1 = new Disciplina(1, "POO", 40, 20, 10);
            Disciplina d2 = new Disciplina(2, "CVV", 40, 20, 10);
            d1.insertArrayTurma(listaBDTurma);
            listaBDDisciplina.add(d1);
            listaBDDisciplina.add(d2);
        
        } catch (Excecoes ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //<editor-fold defaultstate="collapsed" desc="Método para manipular o retorno do OptionPane">
    public static boolean handleOptionPane(String nomeDaTela, String mensagem){
        // display the showOptionDialog
        int choice = JOptionPane.showOptionDialog(null,
                mensagem,
                nomeDaTela,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, null, null);
        
        // interpret the user's choice
        if (choice == JOptionPane.YES_OPTION)
        {
            return true;
        }
        return false;
    }
//</editor-fold>
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemAluno = new javax.swing.JMenuItem();
        jMenuItemCurso = new javax.swing.JMenuItem();
        jMenuItemDiscip = new javax.swing.JMenuItem();
        jMenuItemTurma = new javax.swing.JMenuItem();
        jMenuItemPeriodo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );

        jMenu1.setText("Menu");

        jMenu3.setText("Cadastrar");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItemAluno.setText("Aluno");
        jMenuItemAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlunoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemAluno);

        jMenuItemCurso.setText("Curso");
        jMenuItemCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCursoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemCurso);

        jMenuItemDiscip.setText("Disciplina");
        jMenuItemDiscip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDiscipActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemDiscip);

        jMenuItemTurma.setText("Turma");
        jMenuItemTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTurmaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemTurma);

        jMenuItemPeriodo.setText("Período");
        jMenuItemPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPeriodoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemPeriodo);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );

        setBounds(0, 0, 638, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlunoActionPerformed
        // TODO add your handling code here:
        cadastraraluno obj = new cadastraraluno ();
       jdpPrincipal.add(obj);
       try{
           obj.setVisible(true);
           obj.setClosable(true);
           obj.setPosicao();
           //obj.setMaximum(true);
       }catch (Exception e){
           e.printStackTrace();
       }
        
    }//GEN-LAST:event_jMenuItemAlunoActionPerformed

    private void jMenuItemCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCursoActionPerformed
       cadastrarcurso obj = new cadastrarcurso ();
       jdpPrincipal.add(obj);
       try{
           obj.setVisible(true);
           obj.setClosable(true);
           obj.setPosicao();
           //obj.setMaximum(true);
       }catch (Exception e){
           e.printStackTrace();
       }
        
    }//GEN-LAST:event_jMenuItemCursoActionPerformed

    private void jMenuItemTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTurmaActionPerformed
        // TODO add your handling code here:
        
        cadastrarturma obj = new cadastrarturma();
        jdpPrincipal.add(obj);
        
         try{
           obj.setVisible(true);
           obj.setClosable(true);
           obj.setPosicao();
           //obj.setMaximum(true);
       }catch (Exception e){
           e.printStackTrace();
       }
        
    }//GEN-LAST:event_jMenuItemTurmaActionPerformed

    private void jMenuItemPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPeriodoActionPerformed
        // TODO add your handling code here:
        
        cadastrarperiodo obj = new cadastrarperiodo();
        jdpPrincipal.add(obj);
          try{
           obj.setVisible(true);
           obj.setClosable(true);
           obj.setPosicao();
           //obj.setMaximum(true);
       }catch (Exception e){
           e.printStackTrace();
       }
        
    }//GEN-LAST:event_jMenuItemPeriodoActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
   
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItemDiscipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDiscipActionPerformed
        // TODO add your handling code here:
             cadastrardisciplina obj = new cadastrardisciplina();
        jdpPrincipal.add(obj);
          try{
           obj.setVisible(true);
           obj.setClosable(true);
           obj.setPosicao();
           //obj.setMaximum(true);
       }catch (Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_jMenuItemDiscipActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAluno;
    private javax.swing.JMenuItem jMenuItemCurso;
    private javax.swing.JMenuItem jMenuItemDiscip;
    private javax.swing.JMenuItem jMenuItemPeriodo;
    private javax.swing.JMenuItem jMenuItemTurma;
    private javax.swing.JDesktopPane jdpPrincipal;
    // End of variables declaration//GEN-END:variables
}
