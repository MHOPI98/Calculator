
package opi;


public class calculator_1 extends javax.swing.JFrame {

    double a,b,result;
    String operation;
    
    public calculator_1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Display = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Jbtn3 = new javax.swing.JButton();
        Jbtn4 = new javax.swing.JButton();
        Jbtn0 = new javax.swing.JButton();
        Jbtn1 = new javax.swing.JButton();
        Jbtn2 = new javax.swing.JButton();
        Jbtn5 = new javax.swing.JButton();
        Jbtn6 = new javax.swing.JButton();
        Jbtn7 = new javax.swing.JButton();
        Jbtn8 = new javax.swing.JButton();
        Jbtn9 = new javax.swing.JButton();
        Jbtn10 = new javax.swing.JButton();
        Jbtn11 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Jbtn12 = new javax.swing.JButton();
        Jbtn13 = new javax.swing.JButton();
        Jbtn14 = new javax.swing.JButton();
        Jbtn15 = new javax.swing.JButton();
        Jbtn16 = new javax.swing.JButton();
        Jbtn17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        Display.setBackground(new java.awt.Color(153, 0, 153));
        Display.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Display.setForeground(new java.awt.Color(0, 255, 255));
        Display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Display, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Display, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        Jbtn3.setBackground(new java.awt.Color(153, 0, 153));
        Jbtn3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jbtn3.setForeground(new java.awt.Color(0, 204, 204));
        Jbtn3.setText("3");
        Jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn3ActionPerformed(evt);
            }
        });

        Jbtn4.setBackground(new java.awt.Color(153, 0, 153));
        Jbtn4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jbtn4.setForeground(new java.awt.Color(0, 204, 204));
        Jbtn4.setText("4");
        Jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn4ActionPerformed(evt);
            }
        });

        Jbtn0.setBackground(new java.awt.Color(153, 0, 153));
        Jbtn0.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jbtn0.setForeground(new java.awt.Color(0, 255, 255));
        Jbtn0.setText("0");
        Jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn0ActionPerformed(evt);
            }
        });

        Jbtn1.setBackground(new java.awt.Color(153, 0, 153));
        Jbtn1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jbtn1.setForeground(new java.awt.Color(0, 204, 204));
        Jbtn1.setText("1");
        Jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn1ActionPerformed(evt);
            }
        });

        Jbtn2.setBackground(new java.awt.Color(153, 0, 153));
        Jbtn2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jbtn2.setForeground(new java.awt.Color(0, 255, 255));
        Jbtn2.setText("2");
        Jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn2ActionPerformed(evt);
            }
        });

        Jbtn5.setBackground(new java.awt.Color(153, 0, 153));
        Jbtn5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jbtn5.setForeground(new java.awt.Color(0, 204, 255));
        Jbtn5.setText("5");
        Jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn5ActionPerformed(evt);
            }
        });

        Jbtn6.setBackground(new java.awt.Color(153, 0, 153));
        Jbtn6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jbtn6.setForeground(new java.awt.Color(0, 204, 204));
        Jbtn6.setText("6");
        Jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn6ActionPerformed(evt);
            }
        });

        Jbtn7.setBackground(new java.awt.Color(153, 0, 153));
        Jbtn7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jbtn7.setForeground(new java.awt.Color(0, 255, 255));
        Jbtn7.setText("7");
        Jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn7ActionPerformed(evt);
            }
        });

        Jbtn8.setBackground(new java.awt.Color(153, 0, 153));
        Jbtn8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jbtn8.setForeground(new java.awt.Color(0, 204, 204));
        Jbtn8.setText("8");
        Jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn8ActionPerformed(evt);
            }
        });

        Jbtn9.setBackground(new java.awt.Color(153, 0, 153));
        Jbtn9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jbtn9.setForeground(new java.awt.Color(0, 204, 204));
        Jbtn9.setText("9");
        Jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn9ActionPerformed(evt);
            }
        });

        Jbtn10.setBackground(new java.awt.Color(153, 0, 153));
        Jbtn10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jbtn10.setForeground(new java.awt.Color(0, 255, 255));
        Jbtn10.setText(".");
        Jbtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn10ActionPerformed(evt);
            }
        });

        Jbtn11.setBackground(new java.awt.Color(153, 0, 153));
        Jbtn11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jbtn11.setForeground(new java.awt.Color(0, 255, 255));
        Jbtn11.setText("00");
        Jbtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(Jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Jbtn12.setBackground(new java.awt.Color(153, 0, 153));
        Jbtn12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jbtn12.setForeground(new java.awt.Color(0, 255, 255));
        Jbtn12.setText("+");
        Jbtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn12ActionPerformed(evt);
            }
        });

        Jbtn13.setBackground(new java.awt.Color(153, 0, 153));
        Jbtn13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jbtn13.setForeground(new java.awt.Color(0, 204, 204));
        Jbtn13.setText("-");
        Jbtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn13ActionPerformed(evt);
            }
        });

        Jbtn14.setBackground(new java.awt.Color(153, 0, 153));
        Jbtn14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jbtn14.setForeground(new java.awt.Color(0, 255, 255));
        Jbtn14.setText("/");
        Jbtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn14ActionPerformed(evt);
            }
        });

        Jbtn15.setBackground(new java.awt.Color(153, 0, 153));
        Jbtn15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jbtn15.setForeground(new java.awt.Color(0, 255, 255));
        Jbtn15.setText("*");
        Jbtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn15ActionPerformed(evt);
            }
        });

        Jbtn16.setBackground(new java.awt.Color(153, 0, 153));
        Jbtn16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jbtn16.setForeground(new java.awt.Color(0, 204, 204));
        Jbtn16.setText("%");
        Jbtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn16ActionPerformed(evt);
            }
        });

        Jbtn17.setBackground(new java.awt.Color(153, 0, 153));
        Jbtn17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jbtn17.setForeground(new java.awt.Color(0, 255, 255));
        Jbtn17.setText("=");
        Jbtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Jbtn16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(Jbtn12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jbtn13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jbtn14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jbtn15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jbtn17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Jbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jbtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jbtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jbtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jbtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jbtn17, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn12ActionPerformed
        a=Double.parseDouble(Display.getText());
       Display.setText("");
       operation="+";
    }//GEN-LAST:event_Jbtn12ActionPerformed

    private void Jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn0ActionPerformed
        String EnterNumber= Display.getText()+Jbtn0.getText();
            Display.setText(EnterNumber);
    }//GEN-LAST:event_Jbtn0ActionPerformed

    private void Jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn1ActionPerformed
         String EnterNumber= Display.getText()+Jbtn1.getText();
            Display.setText(EnterNumber);
    }//GEN-LAST:event_Jbtn1ActionPerformed

    private void Jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn2ActionPerformed
         String EnterNumber= Display.getText()+Jbtn2.getText();
            Display.setText(EnterNumber);
    }//GEN-LAST:event_Jbtn2ActionPerformed

    private void Jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn3ActionPerformed
         String EnterNumber= Display.getText()+Jbtn3.getText();
            Display.setText(EnterNumber);
    }//GEN-LAST:event_Jbtn3ActionPerformed

    private void Jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn4ActionPerformed
        String EnterNumber= Display.getText()+Jbtn4.getText();
            Display.setText(EnterNumber);
    }//GEN-LAST:event_Jbtn4ActionPerformed

    private void Jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn5ActionPerformed
         String EnterNumber= Display.getText()+Jbtn5.getText();
            Display.setText(EnterNumber);
    }//GEN-LAST:event_Jbtn5ActionPerformed

    private void Jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn6ActionPerformed
         String EnterNumber= Display.getText()+Jbtn6.getText();
            Display.setText(EnterNumber);
    }//GEN-LAST:event_Jbtn6ActionPerformed

    private void Jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn7ActionPerformed
        String EnterNumber= Display.getText()+Jbtn7.getText();
            Display.setText(EnterNumber);
    }//GEN-LAST:event_Jbtn7ActionPerformed

    private void Jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn8ActionPerformed
         String EnterNumber= Display.getText()+Jbtn8.getText();
            Display.setText(EnterNumber);
    }//GEN-LAST:event_Jbtn8ActionPerformed

    private void Jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn9ActionPerformed
         String EnterNumber= Display.getText()+Jbtn9.getText();
            Display.setText(EnterNumber);
    }//GEN-LAST:event_Jbtn9ActionPerformed

    private void Jbtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn10ActionPerformed
         String EnterNumber= Display.getText()+Jbtn10.getText();
            Display.setText(EnterNumber);
    }//GEN-LAST:event_Jbtn10ActionPerformed

    private void Jbtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn11ActionPerformed
        String EnterNumber= Display.getText()+Jbtn11.getText();
            Display.setText(EnterNumber);
    }//GEN-LAST:event_Jbtn11ActionPerformed

    private void Jbtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn13ActionPerformed
         a=Double.parseDouble(Display.getText());
       Display.setText("");
       operation="-";
    }//GEN-LAST:event_Jbtn13ActionPerformed

    private void Jbtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn14ActionPerformed
         a=Double.parseDouble(Display.getText());
       Display.setText("");
       operation="/";
    }//GEN-LAST:event_Jbtn14ActionPerformed

    private void Jbtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn15ActionPerformed
        a=Double.parseDouble(Display.getText());
       Display.setText("");
       operation="*";
    }//GEN-LAST:event_Jbtn15ActionPerformed

    private void Jbtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn16ActionPerformed
        a=Double.parseDouble(Display.getText());
       Display.setText("");
       operation="%";
    }//GEN-LAST:event_Jbtn16ActionPerformed

    private void Jbtn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn17ActionPerformed
        String sum;
         b=Double.parseDouble(Display.getText());
         if(operation== "+")
         {
             result=a+b;
             sum=String.format("%.2f",result);
             Display.setText(sum);
             
         }
         else if(operation== "-")
         {
             result=a-b;
             sum=String.format("%.2f",result);
             Display.setText(sum);
             
         }
         else if(operation == "/")
         {
             result=a/b;
             sum=String.format("%.2f",result);
             Display.setText(sum); 
         }
         else if(operation == "*")
         {
             result=a*b;
             sum=String.format("%.2f",result);
             Display.setText(sum);

         }
         else if(operation == "%")
         {
             result=a%b;
             sum=String.format("%.2f",result);
             Display.setText(sum);

         }
    
    }//GEN-LAST:event_Jbtn17ActionPerformed

   
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
            java.util.logging.Logger.getLogger(calculator_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                calculator_1 opi= new calculator_1();
                opi.setVisible(true);
                opi.setResizable(false);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Display;
    private javax.swing.JButton Jbtn0;
    private javax.swing.JButton Jbtn1;
    private javax.swing.JButton Jbtn10;
    private javax.swing.JButton Jbtn11;
    private javax.swing.JButton Jbtn12;
    private javax.swing.JButton Jbtn13;
    private javax.swing.JButton Jbtn14;
    private javax.swing.JButton Jbtn15;
    private javax.swing.JButton Jbtn16;
    private javax.swing.JButton Jbtn17;
    private javax.swing.JButton Jbtn2;
    private javax.swing.JButton Jbtn3;
    private javax.swing.JButton Jbtn4;
    private javax.swing.JButton Jbtn5;
    private javax.swing.JButton Jbtn6;
    private javax.swing.JButton Jbtn7;
    private javax.swing.JButton Jbtn8;
    private javax.swing.JButton Jbtn9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
