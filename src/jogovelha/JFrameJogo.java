package jogovelha;

public class JFrameJogo extends javax.swing.JFrame {

    JogoVelha jogovelha = new JogoVelha();
    boolean jogador; //Saber quem vai jogar
    boolean mudarnome; //Para poder mudar de jogador após ganhar

    public JFrameJogo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldJogador1 = new javax.swing.JTextField();
        jTextField2Jogador2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSimbolo1 = new javax.swing.JTextField();
        jTextFieldSimbolo2 = new javax.swing.JTextField();
        jButtonIniciar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneVez = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Jogador 1");

        jLabel2.setText("Jogador 2");

        jLabel3.setText("Símbolo:");

        jLabel4.setText("Símbolo:");

        jTextFieldSimbolo1.setText(" ");

        jTextFieldSimbolo2.setText(" ");

        jButtonIniciar.setText("Iniciar");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("X");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("X");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("X");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("X");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("X");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("X");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\n\t\t\tJogo da Velha");
        jTextArea1.setToolTipText("");
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea1.setHighlighter(null);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel5.setText("Vez:");

        jTextPaneVez.setEditable(false);
        jScrollPane2.setViewportView(jTextPaneVez);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextFieldJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jTextFieldSimbolo1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField2Jogador2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jTextFieldSimbolo2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))))))
                    .addComponent(jButtonIniciar))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldSimbolo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2Jogador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSimbolo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonIniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        jogador = false; //Sempre jogador1 começa
        jogovelha.simboloigual = false; //Para não poder jogar se os símbolos forem iguais
        jogovelha.IniciarJogo(jTextFieldJogador1.getText(), jTextField2Jogador2.getText(), jTextFieldSimbolo1.getText(), jTextFieldSimbolo2.getText());
        jogovelha.VerificarSimbolo(); //Verificar se símbolos são iguais
        jButton1.setText(" "); //Tirar valores dos campos de jogo
        jButton2.setText(" ");
        jButton3.setText(" ");
        jButton4.setText(" ");
        jButton5.setText(" ");
        jButton6.setText(" ");
        jButton7.setText(" ");
        jButton8.setText(" ");
        jButton9.setText(" ");
        jTextFieldJogador1.setEditable(false); //Não poder trocar após começo de jogo
        jTextField2Jogador2.setEditable(false); 
        jTextPaneVez.setText(jTextFieldJogador1.getText()); //Mudar a caixa de texto de quem joga
        mudarnome = jogovelha.VerificarGanhador(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jogador);
        //Após jogar, poder mudar nome
        if (jogovelha.simboloigual == true) { //Se for simbolo igual
            jButton1.setEnabled(false);       //Não poder clicar nos campos de jogo
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
            jButton5.setEnabled(false);
            jButton6.setEnabled(false);
            jButton7.setEnabled(false);
            jButton8.setEnabled(false);
            jButton9.setEnabled(false);
        } else {    //Simbolo diferente
            jButton1.setEnabled(true); //Pode jogar
            jButton2.setEnabled(true); 
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
            jButton5.setEnabled(true);
            jButton6.setEnabled(true);
            jButton7.setEnabled(true);
            jButton8.setEnabled(true);
            jButton9.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jogador == false) {//Jogadas do jogador 1
            jButton1.setText(jogovelha.jogador1.getSimbolo()); //Mudar campo de jogo com o símbolo do jogador1
            jogovelha.VerificarGanhador(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), 
                    jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jogador); //Verificar se há ganhador
            jButton1.setEnabled(false); //Não poder trocar a jogada
            jogador = true; //Mudar para vez de jogador 2
            jTextPaneVez.setText(jTextField2Jogador2.getText()); //Mudar caixa de texto de quem joga
            if (mudarnome == true) { //Se tiver ganhador, pode mudar os nomes dos jogadores novamente
                jTextFieldJogador1.setEditable(true); 
                jTextField2Jogador2.setEditable(true);
            }

        } else {
            jButton1.setText(jogovelha.jogador2.getSimbolo()); //Mudar campo de jogo com o símbolo do Jogador 2
            jogovelha.VerificarGanhador(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), 
                    jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jogador); //Ver se alguém ja ganhou
            jButton1.setEnabled(false);//Não poder trocar a jogada
            jogador = false; //Mudar para jogador 1
            jTextPaneVez.setText(jTextFieldJogador1.getText()); //Trocar caixa de texto de quem joga
            if (mudarnome == true) { //Ganhador, pode mudar os nomes novamente
                jTextFieldJogador1.setEditable(true);
                jTextField2Jogador2.setEditable(true);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jogador == false) {
            jButton2.setText(jogovelha.jogador1.getSimbolo());
            jogovelha.VerificarGanhador(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jogador);
            jButton2.setEnabled(false);
            jogador = true;
            jTextPaneVez.setText(jTextField2Jogador2.getText());
            if (mudarnome == true) {
                jTextFieldJogador1.setEditable(true);
                jTextField2Jogador2.setEditable(true);
            }
        } else {
            jButton2.setText(jogovelha.jogador2.getSimbolo());
            jogovelha.VerificarGanhador(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jogador);
            jButton2.setEnabled(false);
            jogador = false;
            jTextPaneVez.setText(jTextFieldJogador1.getText());
            if (mudarnome == true) {
                jTextFieldJogador1.setEditable(true);
                jTextField2Jogador2.setEditable(true);
            }

}    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jogador == false) {
            jButton3.setText(jogovelha.jogador1.getSimbolo());
            jogovelha.VerificarGanhador(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jogador);
            jButton3.setEnabled(false);
            jogador = true;
            jTextPaneVez.setText(jTextField2Jogador2.getText());
            if (mudarnome == true) {
                jTextFieldJogador1.setEditable(true);
                jTextField2Jogador2.setEditable(true);
            }
        } else {
            jButton3.setText(jogovelha.jogador2.getSimbolo());
            jogovelha.VerificarGanhador(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jogador);
            jButton3.setEnabled(false);
            jogador = false;
            jTextPaneVez.setText(jTextFieldJogador1.getText());
            if (mudarnome == true) {
                jTextFieldJogador1.setEditable(true);
                jTextField2Jogador2.setEditable(true);
            }

}    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jogador == false) {
            jButton4.setText(jogovelha.jogador1.getSimbolo());
            jogovelha.VerificarGanhador(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jogador);
            jButton4.setEnabled(false);
            jogador = true;
            jTextPaneVez.setText(jTextField2Jogador2.getText());
            if (mudarnome == true) {
                jTextFieldJogador1.setEditable(true);
                jTextField2Jogador2.setEditable(true);
            }

        } else {
            jButton4.setText(jogovelha.jogador2.getSimbolo());
            jogovelha.VerificarGanhador(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jogador);
            jButton4.setEnabled(false);
            jogador = false;
            jTextPaneVez.setText(jTextFieldJogador1.getText());
            if (mudarnome == true) {
                jTextFieldJogador1.setEditable(true);
                jTextField2Jogador2.setEditable(true);
            }

}    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (jogador == false) {
            jButton5.setText(jogovelha.jogador1.getSimbolo());
            jogovelha.VerificarGanhador(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jogador);
            jButton5.setEnabled(false);
            jogador = true;
            jTextPaneVez.setText(jTextField2Jogador2.getText());
            if (mudarnome == true) {
                jTextFieldJogador1.setEditable(true);
                jTextField2Jogador2.setEditable(true);
            }

        } else {
            jButton5.setText(jogovelha.jogador2.getSimbolo());
            jogovelha.VerificarGanhador(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jogador);
            jButton5.setEnabled(false);
            jogador = false;
            jTextPaneVez.setText(jTextFieldJogador1.getText());
            if (mudarnome == true) {
                jTextFieldJogador1.setEditable(true);
                jTextField2Jogador2.setEditable(true);
            }

}    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (jogador == false) {
            jButton6.setText(jogovelha.jogador1.getSimbolo());
            jogovelha.VerificarGanhador(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jogador);
            jButton6.setEnabled(false);
            jogador = true;
            jTextPaneVez.setText(jTextField2Jogador2.getText());
            if (mudarnome == true) {
                jTextFieldJogador1.setEditable(true);
                jTextField2Jogador2.setEditable(true);
            }

        } else {
            jButton6.setText(jogovelha.jogador2.getSimbolo());
            jogovelha.VerificarGanhador(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jogador);
            jButton6.setEnabled(false);
            jogador = false;
            jTextPaneVez.setText(jTextFieldJogador1.getText());
            if (mudarnome == true) {
                jTextFieldJogador1.setEditable(true);
                jTextField2Jogador2.setEditable(true);
            }

}    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (jogador == false) {
            jButton7.setText(jogovelha.jogador1.getSimbolo());
            jogovelha.VerificarGanhador(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jogador);
            jButton7.setEnabled(false);
            jogador = true;
            jTextPaneVez.setText(jTextField2Jogador2.getText());
            if (mudarnome == true) {
                jTextFieldJogador1.setEditable(true);
                jTextField2Jogador2.setEditable(true);
            }

        } else {
            jButton7.setText(jogovelha.jogador2.getSimbolo());
            jogovelha.VerificarGanhador(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jogador);
            jButton7.setEnabled(false);
            jogador = false;
            jTextPaneVez.setText(jTextFieldJogador1.getText());
            if (mudarnome == true) {
                jTextFieldJogador1.setEditable(true);
                jTextField2Jogador2.setEditable(true);
            }
}    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (jogador == false) {
            jButton8.setText(jogovelha.jogador1.getSimbolo());
            jogovelha.VerificarGanhador(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jogador);
            jButton8.setEnabled(false);
            jogador = true;
            jTextPaneVez.setText(jTextField2Jogador2.getText());
            if (mudarnome == true) {
                jTextFieldJogador1.setEditable(true);
                jTextField2Jogador2.setEditable(true);
            }

        } else {
            jButton8.setText(jogovelha.jogador2.getSimbolo());
            jogovelha.VerificarGanhador(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jogador);
            jButton8.setEnabled(false);
            jogador = false;
            jTextPaneVez.setText(jTextFieldJogador1.getText());
            if (mudarnome == true) {
                jTextFieldJogador1.setEditable(true);
                jTextField2Jogador2.setEditable(true);
            }

}    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (jogador == false) {
            jButton9.setText(jogovelha.jogador1.getSimbolo());
            jogovelha.VerificarGanhador(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jogador);
            jButton9.setEnabled(false);
            jogador = true;
            jTextPaneVez.setText(jTextField2Jogador2.getText());
            if (mudarnome == true) {
                jTextFieldJogador1.setEditable(true);
                jTextField2Jogador2.setEditable(true);
            }

        } else {
            jButton9.setText(jogovelha.jogador2.getSimbolo());
            jogovelha.VerificarGanhador(jButton1.getText(), jButton2.getText(), jButton3.getText(), jButton4.getText(), jButton5.getText(), jButton6.getText(), jButton7.getText(), jButton8.getText(), jButton9.getText(), jogador);
            jButton9.setEnabled(false);
            jogador = false;
            jTextPaneVez.setText(jTextFieldJogador1.getText());
            if (mudarnome == true) {
                jTextFieldJogador1.setEditable(true);
                jTextField2Jogador2.setEditable(true);
            }

}    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2Jogador2;
    private javax.swing.JTextField jTextFieldJogador1;
    private javax.swing.JTextField jTextFieldSimbolo1;
    private javax.swing.JTextField jTextFieldSimbolo2;
    private javax.swing.JTextPane jTextPaneVez;
    // End of variables declaration//GEN-END:variables
}
