package QuestionBank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class UserDashboard extends javax.swing.JFrame {

    private String selectedSubject;
    private String correctOption;

    public UserDashboard() {
        initComponents();

        cmbSubject.removeAllItems();
        cmbSubject.addItem("Physics 2");
        cmbSubject.addItem("Calculus 2");
        cmbSubject.addItem("Material Science");

        // Disable question/quiz controls initially
        btnSubmit.setEnabled(false);
        btnNext.setEnabled(false);
        optA.setEnabled(false);
        optB.setEnabled(false);
        optC.setEnabled(false);
        optD.setEnabled(false);
        txtQuestion.setEditable(false);
        lblResult.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupOptions = new javax.swing.ButtonGroup();
        background = new javax.swing.JPanel();
        lblSubject = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        optA = new javax.swing.JRadioButton();
        optB = new javax.swing.JRadioButton();
        optC = new javax.swing.JRadioButton();
        optD = new javax.swing.JRadioButton();
        btnSubmit = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        lblChoose = new javax.swing.JLabel();
        cmbSubject = new javax.swing.JComboBox<>();
        btnStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 204));
        background.setPreferredSize(new java.awt.Dimension(1440, 810));

        lblSubject.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        lblSubject.setText("Subject: ");

        txtQuestion.setEditable(false);
        txtQuestion.setColumns(20);
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        groupOptions.add(optA);
        optA.setText("Choice A");
        optA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optAActionPerformed(evt);
            }
        });

        groupOptions.add(optB);
        optB.setText("Choice B");

        groupOptions.add(optC);
        optC.setText("Choice C");

        groupOptions.add(optD);
        optD.setText("Choice D");
        optD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optDActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblResult.setText("Result");

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblChoose.setText("Choose Subject:");

        cmbSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSubjectActionPerformed(evt);
            }
        });

        btnStart.setText("Start Quiz");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(0, 94, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(lblChoose)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnStart))
                        .addGap(123, 123, 123)
                        .addComponent(lblSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optD)
                            .addComponent(optC)
                            .addComponent(optB)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblResult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(optA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 100, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblSubject)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblChoose)
                            .addComponent(cmbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStart)
                        .addGap(12, 12, 12)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(optA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optC)
                .addGap(10, 10, 10)
                .addComponent(optD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnNext)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optDActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        groupOptions.clearSelection();
        lblResult.setText("");
        loadQuestion(selectedSubject);
        btnSubmit.setEnabled(true);

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String selectedOption = groupOptions.getSelection() != null
                ? groupOptions.getSelection().getActionCommand() : null;

        if (selectedOption == null) {
            lblResult.setText("Please select an answer.");
            return;
        }

        if (selectedOption.equals(correctOption)) {
            lblResult.setText("Correct!");
        } else {
            lblResult.setText("Incorrect. Correct answer: " + correctOption);
        }

        btnSubmit.setEnabled(false);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cmbSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSubjectActionPerformed

    }//GEN-LAST:event_cmbSubjectActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        selectedSubject = cmbSubject.getSelectedItem().toString();
        lblSubject.setText("Subject: " + selectedSubject);
        loadQuestion(selectedSubject);

        // Enable components
        btnSubmit.setEnabled(true);
        btnNext.setEnabled(true);
        optA.setEnabled(true);
        optB.setEnabled(true);
        optC.setEnabled(true);
        optD.setEnabled(true);
    }//GEN-LAST:event_btnStartActionPerformed

    private void optAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optAActionPerformed

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
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboard().setVisible(true);
            }
        });
    }

    private void loadQuestion(String subject) {
        try {
            Connection conn = DB_Connection.getConnection();
            String sql = "SELECT * FROM questions WHERE subject=? ORDER BY RAND() LIMIT 1";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, subject);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                txtQuestion.setText(rs.getString("question_text"));

                // Set both display text and logical ActionCommand
                optA.setText("A. " + rs.getString("option_a"));
                optA.setActionCommand("A");

                optB.setText("B. " + rs.getString("option_b"));
                optB.setActionCommand("B");

                optC.setText("C. " + rs.getString("option_c"));
                optC.setActionCommand("C");

                optD.setText("D. " + rs.getString("option_d"));
                optD.setActionCommand("D");

                correctOption = rs.getString("correct_option");  // should be "A", "B", "C", or "D"
            } else {
                txtQuestion.setText("No questions available for " + subject);
            }

            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading question: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbSubject;
    private javax.swing.ButtonGroup groupOptions;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChoose;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JRadioButton optA;
    private javax.swing.JRadioButton optB;
    private javax.swing.JRadioButton optC;
    private javax.swing.JRadioButton optD;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
}
