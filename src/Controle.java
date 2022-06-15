
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dhion
 */
public class Controle {
    public int contRodada = 0;
    
    public String jogadorDaVez;
    public boolean fimRodada = false;
    public int rodadas;
   
    
    
    public String JogadorDaVez(){
    if(contRodada%2 == 0){
    jogadorDaVez = "O";
    
    }
    else{ jogadorDaVez = "X";}
   
    
    if(this.contRodada <9){
      fimRodada = false;
      }
     return jogadorDaVez;
      
    }
    
    
    public  void reset1(){
    
    
    Tela btn = new Tela();
    btn.jButton1.setText("Teste");
    
    if(this.contRodada == 9){
     JOptionPane.showMessageDialog(null, "Fim da Rodada");
    
     this.fimRodada = true;
     
             
             
             btn.jButton1.setText("");
    btn.jButton1.setEnabled(true);
    btn.jButton2.setEnabled(true);
    btn.jButton3.setEnabled(true);
    btn.jButton4.setEnabled(true);
    btn.jButton5.setEnabled(true);
    btn.jButton6.setEnabled(true);
    btn.jButton7.setEnabled(true);
    btn.jButton8.setEnabled(true);
    btn.jButton9.setEnabled(true);
    this.jogadorDaVez = "";
    this.contRodada = 0;
     JOptionPane.showMessageDialog(null, this.contRodada);
     JOptionPane.showMessageDialog(null, this.jogadorDaVez);
     JOptionPane.showMessageDialog(null, this.fimRodada);
     
    }
           
    
    }

   
    
}
