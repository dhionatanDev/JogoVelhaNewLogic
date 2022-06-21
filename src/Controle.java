


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
    
    
    public int contClic = 0;
    
    public String jogadorDaVez;
    public boolean fimRodada = false;
    private int rodadas;
    private String jogadorX;
    private String jogadorY;
    private String A;
    private String B;
    private String R;
    private String sX;
    private String sY;
    private String sbX;
    private String sbY;
    private String scX;
    private String scY;
    private String somaX;
    private String subtracaoX;
    private String multiplicacaoX;
    private String somaY;
    private String subtracaoY;
    private String multiplicacaoY;
    private String binario;
    private String octal;
    private String hexadecial;
    
    
    

    public String getSbX() {
        return sbX;
    }

    public void setSbX(String sbX) {
        this.sbX = sbX;
    }

    public String getSbY() {
        return sbY;
    }

    public void setSbY(String sbY) {
        this.sbY = sbY;
    }
    
    
    private int [][] matrizResultado; 
    
    
    
  
  
  
  
    
    
    public String JogadorDaVez(){
    if(contClic%2 == 0){
    jogadorDaVez = "O";
    
    }
    else{ jogadorDaVez = "X";}
   
    
    if(this.contClic <9){
      fimRodada = false;
      }
     return jogadorDaVez;
      
    }
    
    
    

    public String getJogadorX() {
        return jogadorX;
    }

    public void setJogadorX(String jogadorX) {
        this.jogadorX = jogadorX;
    }

    public String getJogadorY() {
        return jogadorY;
    }

    public void setJogadorY(String jogadorY) {
        this.jogadorY = jogadorY;
    }

    public int getRodadas() {
        return rodadas;
    }

    public void setRodadas(int rodadas) {
        this.rodadas = rodadas;
    }

    public int[][] getMatrizResultado() {
        return matrizResultado;
    }

    public void setMatrizResultado(int[][] matrizResultado) {
        this.matrizResultado = matrizResultado;
    }

    public String getA() {
        return A;
    }

    public void setA(String A) {
        this.A = A;
    }

    public String getB() {
        return B;
    }

    public void setB(String B) {
        this.B = B;
    }

    public String getR() {
        return R;
    }

    public void setR(String R) {
        this.R = R;
    }

    public String getsX() {
        return sX;
    }

    public void setsX(String sX) {
        this.sX = sX;
    }

    public String getsY() {
        return sY;
    }

    public void setsY(String sY) {
        this.sY = sY;
    }

    public String getScX() {
        return scX;
    }

    public void setScX(String scX) {
        this.scX = scX;
    }

    public String getScY() {
        return scY;
    }

    public void setScY(String scY) {
        this.scY = scY;
    }

    public String getSomaX() {
        return somaX;
    }

    public void setSomaX(String somaX) {
        this.somaX = somaX;
    }

    public String getSubtracaoX() {
        return subtracaoX;
    }

    public void setSubtracaoX(String subtracaoX) {
        this.subtracaoX = subtracaoX;
    }

    public String getMultiplicacaoX() {
        return multiplicacaoX;
    }

    public void setMultiplicacaoX(String multiplicacaoX) {
        this.multiplicacaoX = multiplicacaoX;
    }

    public String getSomaY() {
        return somaY;
    }

    public void setSomaY(String somaY) {
        this.somaY = somaY;
    }

    public String getSubtracaoY() {
        return subtracaoY;
    }

    public void setSubtracaoY(String subtracaoY) {
        this.subtracaoY = subtracaoY;
    }

    public String getMultiplicacaoY() {
        return multiplicacaoY;
    }

    public void setMultiplicacaoY(String multiplicacaoY) {
        this.multiplicacaoY = multiplicacaoY;
    }

    public String getBinario() {
        return binario;
    }

    public void setBinario(String binario) {
        this.binario = binario;
    }

    public String getOctal() {
        return octal;
    }

    public void setOctal(String octal) {
        this.octal = octal;
    }

    public String getHexadecial() {
        return hexadecial;
    }

    public void setHexadecial(String hexadecial) {
        this.hexadecial = hexadecial;
    }

   
    
}
