
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dhion
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
      
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
         
    }
    public String resultado1;
    public String resultado2;
    public String rodadasR;
    public String jogadorX;
    public String jogadorY;
    public int rodadas;
    public int somaX = 0;
    public int somaY = 0;
    
    public int rodadaInicio = 0;
    
    public int matriz[][] = new int[3][3];
    public int resultado[][] ;
    public  int matrizA[][];
    public  int matrizB[][];
    public int matrizC[][];
    public int matrizD[][];
    public int matrizE[][];
    public int matrizF[][];
    public int qntRodadaAt;
   
    
    public void preenchimento(Controle controle){
    jgX.setText("Jogador 'X': " + controle.getJogadorX());
    jgY.setText("Jogador 'O': " + controle.getJogadorY());
    jogadorX=controle.getJogadorX();
    jogadorY= controle.getJogadorY();
    qntRodada.setText(Integer.toString(controle.getRodadas()));
    qntRodadaAt = controle.getRodadas();

    this.resultado = new int[2][(int)controle.getRodadas()]; 
    matrizA = new int [2][resultado[0].length];
    matrizB = new int [2][resultado[0].length];
    matrizC = new int [resultado[0].length][2];
    matrizD = new int [2][resultado[0].length];
    matrizE = new int [2][resultado[0].length];
    matrizF = new int [2][resultado[0].length];
    }
    
    
    
   
        
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaPrincipal = new javax.swing.JPanel();
        painelResultados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jgX = new javax.swing.JLabel();
        jgY = new javax.swing.JLabel();
        btnResultados = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        qntRodada = new javax.swing.JLabel();
        resultadoY = new javax.swing.JTextField();
        qntRodadaAtual = new javax.swing.JLabel();
        contRodadas = new javax.swing.JTextField();
        resultadoX = new javax.swing.JTextField();
        vezJg = new javax.swing.JTextField();
        jogoVelha = new javax.swing.JPanel();
        telaJogo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 700));

        telaPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        telaPrincipal.setPreferredSize(new java.awt.Dimension(1200, 700));
        telaPrincipal.setLayout(new java.awt.BorderLayout());

        painelResultados.setBackground(new java.awt.Color(255, 255, 255));
        painelResultados.setPreferredSize(new java.awt.Dimension(1200, 300));
        painelResultados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("SCORE");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        painelResultados.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 40));

        jgX.setBackground(new java.awt.Color(255, 255, 255));
        jgX.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jgX.setForeground(new java.awt.Color(51, 102, 255));
        painelResultados.add(jgX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 240, 20));

        jgY.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jgY.setForeground(new java.awt.Color(255, 153, 153));
        painelResultados.add(jgY, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 240, 20));

        btnResultados.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        btnResultados.setText("Resultados");
        btnResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadosActionPerformed(evt);
            }
        });
        painelResultados.add(btnResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 250, 150, 40));

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Rodadas:");
        painelResultados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 30));

        qntRodada.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        qntRodada.setToolTipText("");
        qntRodada.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        painelResultados.add(qntRodada, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 50, 30));

        resultadoY.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        painelResultados.add(resultadoY, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 1000, -1));

        qntRodadaAtual.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        qntRodadaAtual.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        qntRodadaAtual.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        painelResultados.add(qntRodadaAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 70, 30));

        contRodadas.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        painelResultados.add(contRodadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 1000, -1));

        resultadoX.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        painelResultados.add(resultadoX, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 1000, -1));

        vezJg.setEditable(false);
        vezJg.setFont(new java.awt.Font("Kristen ITC", 0, 36)); // NOI18N
        vezJg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        painelResultados.add(vezJg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 990, 80));

        telaPrincipal.add(painelResultados, java.awt.BorderLayout.CENTER);

        jogoVelha.setBackground(new java.awt.Color(255, 255, 255));
        jogoVelha.setPreferredSize(new java.awt.Dimension(1200, 400));
        jogoVelha.setLayout(new java.awt.GridLayout(0, 1, 0, 1));

        telaJogo.setOpaque(false);
        telaJogo.setPreferredSize(new java.awt.Dimension(1200, 400));
        telaJogo.setLayout(new java.awt.GridLayout(0, 3, 5, 3));

        jButton1.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        telaJogo.add(jButton1);

        jButton2.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        telaJogo.add(jButton2);

        jButton3.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        telaJogo.add(jButton3);

        jButton4.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        telaJogo.add(jButton4);

        jButton5.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        telaJogo.add(jButton5);

        jButton6.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        telaJogo.add(jButton6);

        jButton7.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        jButton7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        telaJogo.add(jButton7);

        jButton8.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        jButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        telaJogo.add(jButton8);

        jButton9.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        jButton9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        telaJogo.add(jButton9);

        jogoVelha.add(telaJogo);

        telaPrincipal.add(jogoVelha, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Controle cont = new Controle();
    NovoJogoConfig novo = new NovoJogoConfig();
    
    
    public void campeao(){
        if(somaX>somaY && rodadaInicio == qntRodadaAt){
        vezJg.setForeground(Color.blue);
        vezJg.setText(" O Mestre supremo do jogo da velha é: " + jogadorX);
        }
        if(somaY>somaX && rodadaInicio == qntRodadaAt){
        vezJg.setForeground(Color.red);
        vezJg.setText(" O Mestre supremo do jogo da velha é: " + jogadorY);
        }
        if(somaY==somaX && rodadaInicio == qntRodadaAt){
        vezJg.setForeground(Color.black);
        vezJg.setText("Ninguém ganhou :,( ");
        }
    
    }
    
  
    public void reset(){
        
    if(rodadaInicio == qntRodadaAt){
              
        jButton1.setText("");
        jButton1.setEnabled(false);
        jButton2.setText("");
        jButton2.setEnabled(false);
        jButton3.setText("");
        jButton3.setEnabled(false);
        jButton4.setText("");
        jButton4.setEnabled(false);
        jButton5.setText("");
        jButton5.setEnabled(false);
        jButton6.setText("");
        jButton6.setEnabled(false);
        jButton7.setText("");
        jButton7.setEnabled(false);
        jButton8.setText("");
        jButton8.setEnabled(false);
        jButton9.setText("");
        jButton9.setEnabled(false);
        qntRodadaAtual.setText(Integer.toString(rodadaInicio)  + "  DE ");
        vezJg.setText("Fim do Jogo");
        JOptionPane.showMessageDialog(null, "Fim do Jogo");
    
    }
        
        if(cont.fimRodada||cont.contClic == 9){
            
        for(int i=0;i<3;i++){
            
           
            for(int j=0;j<3;j++){
                
                matriz[i][j]=0;
                        }}
            
    
        JOptionPane.showMessageDialog(null, "Fim da Rodada");
       
        pontuacao();
     
        jButton1.setText("");
        jButton1.setEnabled(true);
        jButton2.setText("");
        jButton2.setEnabled(true);
        jButton3.setText("");
        jButton3.setEnabled(true);
        jButton4.setText("");
        jButton4.setEnabled(true);
        jButton5.setText("");
        jButton5.setEnabled(true);
        jButton6.setText("");
        jButton6.setEnabled(true);
        jButton7.setText("");
        jButton7.setEnabled(true);
        jButton8.setText("");
        jButton8.setEnabled(true);
        jButton9.setText("");
        jButton9.setEnabled(true);
        cont.fimRodada = false;
        cont.contClic = 0;
        }
      
     
    }
    
     
    public void vencedor (){
        qntRodadaAtual.setText(Integer.toString(rodadaInicio+1)  + "  DE ");
        int diagonalP = 0;
        int diagonalS = 0;
        boolean empate = false;
        int soma = 0;
       
        for(int i=0;i<3;i++){
            soma = 0;
           
            // Vencedor Linha e diagonal Principal e Secundaria
            for(int j=0;j<3;j++){
                
                soma = soma + matriz[i][j];
               
                if(soma == 3){
//                JOptionPane.showMessageDialog(null, "O vencedor é X");
                empate = true;
                
                resultado[0][rodadaInicio] += 5;
                resultado[1][rodadaInicio] += 0;
                 rodadaInicio = rodadaInicio + 1;
                 vezJg.setForeground(Color.blue);
                vezJg.setText("O vencedor é: "+jogadorX);
                cont.fimRodada = true;
                }
                if(soma == -3){
//                JOptionPane.showMessageDialog(null, "O vencedor é O");
                 empate = true;
                 resultado[0][rodadaInicio] += 0;
                 resultado[1][rodadaInicio] += 5;
                  rodadaInicio = rodadaInicio + 1;
                  vezJg.setForeground(Color.red);
                  vezJg.setText("O vencedor é: "+jogadorY);
                 cont.fimRodada = true;
                }
                if(i==j){
                    
                    diagonalP = diagonalP + matriz[i][j];
                    if(diagonalP == 3){
//                    JOptionPane.showMessageDialog(null, "O vencedor é X");
                    empate = true;
                    resultado[0][rodadaInicio] += 5;
                    resultado[1][rodadaInicio] += 0;
                     rodadaInicio = rodadaInicio + 1;
                    cont.fimRodada = true;
                    vezJg.setForeground(Color.blue);
                    vezJg.setText("O vencedor é: "+jogadorX);
                    }
                    if(diagonalP == -3){
//                    JOptionPane.showMessageDialog(null, "O vencedor é O");
                     empate = true;
                     resultado[0][rodadaInicio] += 0;
                     resultado[1][rodadaInicio] += 5;
                      rodadaInicio = rodadaInicio + 1;
                     cont.fimRodada = true;
                     vezJg.setForeground(Color.red);
                     vezJg.setText("O vencedor é: "+jogadorY);
                    }
                
                }
                
                if(i==matriz.length-j-1){
                diagonalS += matriz[i][j];
                 if(diagonalS == 3){
//                    JOptionPane.showMessageDialog(null, "O vencedor é X");
                    empate = true;
                    resultado[0][rodadaInicio] += 5;
                    resultado[1][rodadaInicio] += 0;
                     rodadaInicio = rodadaInicio + 1;
                    cont.fimRodada = true;
                    vezJg.setForeground(Color.blue);
                    vezJg.setText("O vencedor é: "+jogadorX);
                    }
                    if(diagonalS == -3){
//                    JOptionPane.showMessageDialog(null, "O vencedor é O");
                     empate = true;
                     resultado[0][rodadaInicio] += 0;
                     resultado[1][rodadaInicio] += 5;
                      rodadaInicio = rodadaInicio + 1;
                     cont.fimRodada = true;
                     vezJg.setForeground(Color.red);
                     vezJg.setText("O vencedor é: "+jogadorY);
                    }
                
                }
                
                 
               
        
        }
       
        
        }
       
        // Vencedor Coluna
        for(int i=0;i<3;i++){
            soma = 0;
            
            for(int j=0;j<3;j++){
                
                soma = soma + matriz[j][i];
               
                if(soma == 3){
//                JOptionPane.showMessageDialog(null, "O vencedor é X");
                empate = true;
                resultado[0][rodadaInicio] += 5;
                resultado[1][rodadaInicio] += 0;
                 rodadaInicio = rodadaInicio + 1;
                cont.fimRodada = true;
                vezJg.setForeground(Color.blue);
                vezJg.setText("O vencedor é: "+jogadorX);
                }
                if(soma == -3){
//                JOptionPane.showMessageDialog(null, "O vencedor é O");
                 empate = true;
                 resultado[0][rodadaInicio] += 0;
                 resultado[1][rodadaInicio] += 5;
                  rodadaInicio = rodadaInicio + 1;
                 cont.fimRodada = true;
                 vezJg.setForeground(Color.red);
                 vezJg.setText("O vencedor é: "+jogadorY);
                }
                
                 
               
        
        }
            
        
        //empate
        }
        if(cont.contClic == 9 && !cont.fimRodada){
//                JOptionPane.showMessageDialog(null, "Empate");
                empate = false;
                resultado[0][rodadaInicio] += 2;
                resultado[1][rodadaInicio] += 2;
                 rodadaInicio = rodadaInicio + 1;
                cont.fimRodada = true;
                vezJg.setForeground(Color.black);
                vezJg.setText("Empate");
                
                }
        
    }
    String rodadaX = "";
    String rodadaY = "";
    String cntRodadas = "";
    
    
    
    public void pontuacao(){
        somaX = 0;
        somaY = 0;
        cntRodadas +="Rodada nº  " + rodadaInicio +" |  ";
        contRodadas.setText(cntRodadas);
        String espacoX = " ";
        for(int j =0; j<resultado[0].length;j++){
           
           somaX = somaX + resultado[0][j];
            matrizA[0][j] = somaX;
            matrizC[j][0] = somaX;
           
          if(resultado[0][j]==0){
              espacoX = " ";
    }
        }
         
        rodadaX += espacoX + "         ["+ somaX + "]          ";
        resultadoX.setText(rodadaX);
        
        String espacoY = " ";
    for(int j =0; j<resultado[1].length;j++){
        
           somaY = somaY + resultado[1][j];
           matrizA[1][j] = somaY;
           matrizC[j][1] = somaY;
          if(resultado[1][j]==0){
             espacoY = " ";
    }
            
        }
     
     rodadaY += espacoY +"         [" + somaY +"]          " ;
    
     resultadoY.setText(rodadaY );
     
    
    
    
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cont.contClic++;
        jButton1.setText(cont.JogadorDaVez());
        if(cont.JogadorDaVez() == "X"){
        jButton1.setForeground(Color.blue);
        
        matriz[0][0] = 1;
        vezJg.setForeground(Color.red);
        vezJg.setText("Vez do Jogador 'O'");
        }
        else{
        jButton1.setForeground(Color.red);
        matriz[0][0] = -1;
        vezJg.setForeground(Color.blue);
        vezJg.setText("Vez do Jogador 'X'");
        }
        jButton1.setEnabled(false);
       
        vencedor ();
        reset();
        campeao();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      cont.contClic++;
      jButton2.setText(cont.JogadorDaVez());
      if(cont.JogadorDaVez() == "X"){
        jButton2.setForeground(Color.blue);
        
        matriz[0][1] = 1;
        vezJg.setForeground(Color.red);
        vezJg.setText("Vez do Jogador 'O'");
        }
        else{
        jButton2.setForeground(Color.red);
        matriz[0][1] = -1;
        vezJg.setForeground(Color.blue);
        vezJg.setText("Vez do Jogador 'X'");
        }
      jButton2.setEnabled(false);
      vencedor ();
      reset();
      campeao();
      /*painelRodadas();*/
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       cont.contClic++;
      jButton3.setText(cont.JogadorDaVez());
      if(cont.JogadorDaVez() == "X"){
        jButton3.setForeground(Color.blue);
        
        matriz[0][2] = 1;
        vezJg.setForeground(Color.red);
        vezJg.setText("Vez do Jogador 'O'");
        }
        else{
        jButton3.setForeground(Color.red);
        matriz[0][2] = -1;
        vezJg.setForeground(Color.blue);
        vezJg.setText("Vez do Jogador 'X'");
        }
      jButton3.setEnabled(false);
      vencedor ();
      reset();
      campeao();
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      cont.contClic++;
      jButton4.setText(cont.JogadorDaVez());
      if(cont.JogadorDaVez() == "X"){
        jButton4.setForeground(Color.blue);
        
        matriz[1][0] = 1;
        vezJg.setForeground(Color.red);
        vezJg.setText("Vez do Jogador 'O'");
        }
        else{
        jButton4.setForeground(Color.red);
        matriz[1][0] = -1;
        vezJg.setForeground(Color.blue);
        vezJg.setText("Vez do Jogador 'X'");
        }
      jButton4.setEnabled(false);
      vencedor ();
      reset();
      campeao();
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       cont.contClic++;
      jButton5.setText(cont.JogadorDaVez());
      if(cont.JogadorDaVez() == "X"){
        jButton5.setForeground(Color.blue);
        matriz[1][1] = 1;
        vezJg.setForeground(Color.red);
        vezJg.setText("Vez do Jogador 'O'");
        }
        else{
        jButton5.setForeground(Color.red);
        matriz[1][1] = -1;
        vezJg.setForeground(Color.blue);
        vezJg.setText("Vez do Jogador 'X'");
        }
      jButton5.setEnabled(false);
      vencedor ();
      reset();
      campeao();
      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       cont.contClic++;
      jButton6.setText(cont.JogadorDaVez());
      if(cont.JogadorDaVez() == "X"){
        jButton6.setForeground(Color.blue);
        matriz[1][2] = 1;
        vezJg.setForeground(Color.red);
        vezJg.setText("Vez do Jogador 'O'");
        }
        else{
        jButton6.setForeground(Color.red);
        matriz[1][2] = -1;
        vezJg.setForeground(Color.blue);
        vezJg.setText("Vez do Jogador 'X'");
        }
      jButton6.setEnabled(false);
      vencedor ();
      reset();
      campeao();
      
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       cont.contClic++;
      jButton7.setText(cont.JogadorDaVez());
     if(cont.JogadorDaVez() == "X"){
        jButton7.setForeground(Color.blue);
        matriz[2][0] = 1;
        vezJg.setForeground(Color.red);
        vezJg.setText("Vez do Jogador 'O'");
        
        }
        else{
        jButton7.setForeground(Color.red);
        matriz[2][0] = -1;
        vezJg.setForeground(Color.blue);
        vezJg.setText("Vez do Jogador 'X'");
        
        }
      jButton7.setEnabled(false);
      vencedor ();
      reset();
      campeao();
       
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       cont.contClic++;
      jButton8.setText(cont.JogadorDaVez());
      if(cont.JogadorDaVez() == "X"){
       jButton8.setForeground(Color.blue);
        matriz[2][1] = 1;
        vezJg.setForeground(Color.red);
        vezJg.setText("Vez do Jogador 'O'");
        
        }
        else{
         jButton8.setForeground(Color.red);
        
        matriz[2][1] = -1;
        vezJg.setForeground(Color.blue);
        vezJg.setText("Vez do Jogador 'X'");
        
        }
      jButton8.setEnabled(false);
      vencedor ();
      reset();
      campeao();
      
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        cont.contClic++;
      jButton9.setText(cont.JogadorDaVez());
      if(cont.JogadorDaVez() == "X"){
        jButton9.setForeground(Color.blue);
        
        matriz[2][2] = 1;
        vezJg.setForeground(Color.red);
        vezJg.setText("Vez do Jogador 'O'");
        }
        else{
        jButton9.setForeground(Color.red);
        matriz[2][2] = -1;
        vezJg.setText("Vez do Jogador 'X'");
        vezJg.setForeground(Color.blue);
        }
      jButton9.setEnabled(false);
      vencedor ();
      reset();
      campeao();
      
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadosActionPerformed
        Controle controle = new Controle();
       //algumas variaveis para ler os nomes
        int somaXY = 0;
       //ler soma de sX/Y - X matriz A e Y
        String sX = "";
        String sY = "";
      //ler soma de sbX/Y - X matriz B e Y
        String sbX = "";
        String sbY = "";
        String scX = "";
        String scY = "";
        String somaX = "";
        String subtracaoX = "";
        String multiplicacaoX = "";
        String somaY = "";
        String subtracaoY = "";
        String multiplicacaoY = "";
        resultado1 = "";
        resultado2 = "";
        
        //ler o cabeçalho
        rodadasR = "";
        
        
        
        
        // Lendo a matriz B Transposta valor de Y
        for(int i=0; i<matrizA[0].length;i++){
           
            matrizB[1][i] =   matrizA[1][matrizA[0].length-(i+1)];
    
        }
        // Alimentar String de matrizes A e B valor de Y
        for(int i=0; i<matrizA[0].length;i++){
           if(matrizA[1][i]==0){
                sY += "         [" + Integer.toString(matrizA[1][i]) + "]          " ;
                }
           if(matrizA[1][i]>0){
                sY += "        [" + Integer.toString(matrizA[1][i]) + "]          " ;
                }
              
             if(matrizB[1][i]==0){
                sbY += "         [" + Integer.toString(matrizB[1][i]) + "]          ";
                }
             if(matrizB[1][i]>0){
                sbY += "        ["+ Integer.toString(matrizB[1][i]) + "]          ";
                }
                
               
               if(matrizC[i][1]==0){
               scY += "  ";
                }
                
              
            
        
        }
         // Lendo a matriz B valor de X
        for(int i=0; i<matrizA[0].length;i++){
           
            matrizB[0][i] =   matrizA[0][matrizA[0].length-(i+1)];
          
            
        
        }
        // Alimentar String de matrizes A e B valor de X
        for(int j= 0; j<matrizA[0].length;j++){
              if(matrizA[0][j]==0){
                sX += "         [" + Integer.toString(matrizA[0][j]) + "]          ";
                }
               if(matrizA[0][j]>0){
               sX += "        [" + Integer.toString(matrizA[0][j]) + "]          ";
                }
              
                
                
                if(matrizB[0][j]==0){
                sbX += "           ["+ Integer.toString(matrizB[0][j]) + "]          ";
                }
                if(matrizB[0][j]>0){
                sbX += "        ["+ Integer.toString(matrizB[0][j]) + "]          ";
                }
                
               
                
//                 if(matrizC[j][0]==0){
//                scX += "  ";
//                }
                
                
                
           
            }
        String maC = " ";
        for(int i=0; i<matrizC.length;i++){
            
            
            scX = Integer.toString(matrizC[i][0]);
            scY = Integer.toString(matrizC[i][1]);
            if(matrizC[i][0]==0){
                scX += " ";
                }
            if(matrizC[i][1]==0){
                scY += " ";
                }
                maC += "   " + scX + "                     " + scY + "\n";
            
            
       
        
        }
            
            
        // caberçalho rodadas
         for(int j = 0; j < resultado[0].length;j++){
            rodadasR = " |   Rodada  "+ (resultado[0].length-j) + rodadasR;
            
                       
         }
        //SOMA SUBTRAÇÃO E MULTIPLICAÇÃO DAS MATRIZES   
        
        for(int i=0; i<matrizA[0].length;i++){
            somaXY += (matrizA[0][i]+matrizA[1][i]);
            matrizD[0][i] = (matrizA[0][i]+matrizB[0][i]);
            matrizE[0][i] = (matrizA[0][i]-matrizB[0][i]);
            matrizF[0][i] = (matrizA[0][i]*matrizC[i][0]);       
           
            
        }
        for(int i=0; i<matrizA[0].length;i++){
            
            matrizD[1][i] = (matrizA[1][i]+matrizB[1][i]);
            matrizE[1][i] = (matrizA[1][i]-matrizB[1][i]);
            matrizF[1][i] = (matrizA[1][i]*matrizC[i][1]);       
          
        }
        
        for(int i=0; i<matrizD[0].length;i++){
            if(matrizD[0][i]==0){
                 somaX += "          ["+ Integer.toString(matrizD[0][i]) + "]          ";
                }
               
            if(matrizD[0][i]>0){
                 somaX += "        ["+ Integer.toString(matrizD[0][i]) + "]          ";
                }
                
                if(matrizE[0][i]<=0){
                subtracaoX += "          ["+ Integer.toString(matrizE[0][i]) + "]          ";
                }
                 if(matrizE[0][i]>0){
                subtracaoX += "        ["+ Integer.toString(matrizE[0][i]) + "]          ";
                }
                
                
                
                 if(matrizF[0][i]/100 ==0){
                    
                    multiplicacaoX += "          ["+ Integer.toString(matrizF[0][i]) + "]          ";
                   
                }
                 if(matrizF[0][i]/100 >=1&&matrizF[0][i]/100 <10 ){
                  
                    multiplicacaoX += "      ["+ Integer.toString(matrizF[0][i]) + "]        ";
                   
                }
                 if(matrizF[0][i]/100 >=10){
                    
                    multiplicacaoX += "     ["+ Integer.toString(matrizF[0][i]) + "]        ";
                   
                }
                 
//                multiplicacaoX += "         "+ Integer.toString(matrizF[0][i]) + "          ";
                   
        
        }
        for(int i=0; i<matrizA[0].length;i++){
            
                if(matrizD[1][i]==0){
               somaY += "          ["+ Integer.toString(matrizD[1][i]) + "]          ";
                }
                if(matrizD[1][i]>0){
               somaY += "         ["+ Integer.toString(matrizD[1][i]) + "]          ";
                }
                
              
                
                if(matrizE[1][i]<=0){
                 subtracaoY += "          ["+ Integer.toString(matrizE[1][i]) + "]          ";
                
                }
                if(matrizE[1][i]>0){
                subtracaoY += "         ["+ Integer.toString(matrizE[1][i]) + "]          ";
                
                }
                
                
                if(matrizF[1][i]/100 ==0){

                    multiplicacaoY += "          ["+ Integer.toString(matrizF[1][i]) + "]          ";
                }
                 if(matrizF[1][i]/100 >=1&&matrizF[1][i]/100 <10 ){

                    multiplicacaoY += "      ["+ Integer.toString(matrizF[1][i]) + "]        ";

                }
                 if(matrizF[1][i]/100 >=10){
                    multiplicacaoY += "     ["+ Integer.toString(matrizF[1][i]) + "]        ";

                }
                

        
        }
        
        //numero binario
         List<Integer> x = new ArrayList<>();
        
         
         int somaBi=somaXY;
         int restoBi = somaXY;
         
         int contador = 0;
        while(somaBi>0){
         int bi = 0;
         
         somaBi = somaBi/2;
         
         bi = restoBi - somaBi * 2;
         restoBi = somaBi;
         x.add(bi);
         
         // lista vai reeber bi na posiçao cont;
         contador++;
        
        }
       String bin = "";
        for(int i=x.size()-1;i>=0;i--){
        bin += x.get(i);
         
        }
        
        
        // binario vai receber a lsita de tras para frente;
       
        // Octal
        List<Integer> oct = new ArrayList<>();
        
         int somaOctalXY = somaXY;
         
         int restoOct = somaXY;
         
         
         int contadorOct = 0;
        
        while(somaOctalXY>0){
          int octal = 0;
         if(somaOctalXY%8==0){
         somaOctalXY =somaOctalXY/8;
         restoOct = somaOctalXY;
         octal = 0;
         }
         else{
         somaOctalXY = somaOctalXY/8;
         octal = restoOct - somaOctalXY * 8;
         restoOct = somaOctalXY;
         
         }
         
         
         oct.add(octal);
         
         
         // Hexadecimal
         
         
         
         // lista vai reeber bi na posiçao cont;
         contadorOct++;
        
        }
       String octalS = "";
        for(int i=oct.size()-1;i>=0;i--){
        octalS += oct.get(i);
         
        }
        
        
        //Hexadecimal
        
        List<String> hexaD = new ArrayList<>();
        
         int somaHexalXY = somaXY;
         
         int restoHexa = somaHexalXY;
         
         int contHexa = 0;
        while(somaHexalXY>0){
         int hexadecimal = 0;
         String hexa = "";
         if(somaHexalXY%16==0){
         somaHexalXY =somaHexalXY/16;
         restoHexa = somaHexalXY;
         hexadecimal = 0;
         hexa = Integer.toString(hexadecimal);
         }
         else{
         somaHexalXY = somaHexalXY/16;
         hexadecimal = restoHexa - somaHexalXY * 16;
         hexa = Integer.toString(hexadecimal);
         restoHexa = somaHexalXY;
         if(hexadecimal==10){
         hexa = "A";
         }
         if(hexadecimal==11){
         hexa = "B";
         }
         if(hexadecimal==12){
         hexa = "C";
         }
         if(hexadecimal==13){
         hexa = "D";
         }
         if(hexadecimal==14){
         hexa = "E";
         }
         if(hexadecimal==15){
         hexa = "F";
         }
         if(hexadecimal==16){
         hexa = "10";
         }
         if(hexadecimal==17){
         hexa = "11";
         }
         }
         
         
         hexaD.add(hexa);
         
         
         contHexa++;
        
        }
       String hexaN = "";
        for(int i=hexaD.size()-1;i>=0;i--){
        hexaN += hexaD.get(i);
         
        }
        
        
        
        
        // alimentando objeto Controle que levarar a informação para a proxima tela
        controle.setsX(sX);
        controle.setsY(sY);
            
        
         
         
         controle.setA(rodadaX);
         controle.setB(rodadaY);
         controle.setR(rodadasR);
         controle.setJogadorX(jogadorX);
         controle.setJogadorY(jogadorY);
         controle.setSbX(sbX);
         controle.setSbY(sbY);
         controle.setScX(maC);
         controle.setSomaX(somaX);
         controle.setSomaY(somaY);
         controle.setSubtracaoX(subtracaoX);
         controle.setSubtracaoY(subtracaoY);
         controle.setMultiplicacaoX(multiplicacaoX);
         controle.setMultiplicacaoY(multiplicacaoY);
         String B1 = bin;
         controle.setBinario(B1);
         String O1 = octalS;
         controle.setOctal(O1);
         String H1 = hexaN;
         controle.setHexadecial(H1);
         
         
         
         Resultados resultados = new Resultados();
         resultados.preenchimentoResultado(controle);
         resultados.setVisible(true);
        this.dispose();
       
     
     
    }//GEN-LAST:event_btnResultadosActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public JButton getjButton4() {
        return jButton4;
    }

    public void setjButton4(JButton jButton4) {
        this.jButton4 = jButton4;
    }

    public JButton getjButton5() {
        return jButton5;
    }

    public void setjButton5(JButton jButton5) {
        this.jButton5 = jButton5;
    }

    public JButton getjButton6() {
        return jButton6;
    }

    public void setjButton6(JButton jButton6) {
        this.jButton6 = jButton6;
    }

    public JButton getjButton7() {
        return jButton7;
    }

    public void setjButton7(JButton jButton7) {
        this.jButton7 = jButton7;
    }

    public JButton getjButton8() {
        return jButton8;
    }

    public void setjButton8(JButton jButton8) {
        this.jButton8 = jButton8;
    }

    public JButton getjButton9() {
        return jButton9;
    }

    public void setjButton9(JButton jButton9) {
        this.jButton9 = jButton9;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResultados;
    private javax.swing.JTextField contRodadas;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    public javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jgX;
    private javax.swing.JLabel jgY;
    private javax.swing.JPanel jogoVelha;
    private javax.swing.JPanel painelResultados;
    private javax.swing.JLabel qntRodada;
    private javax.swing.JLabel qntRodadaAtual;
    private javax.swing.JTextField resultadoX;
    private javax.swing.JTextField resultadoY;
    private javax.swing.JPanel telaJogo;
    private javax.swing.JPanel telaPrincipal;
    private javax.swing.JTextField vezJg;
    // End of variables declaration//GEN-END:variables
}
