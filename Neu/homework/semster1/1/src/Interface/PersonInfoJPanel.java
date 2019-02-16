/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Person;
import javax.swing.JOptionPane;

/**
 *
 * @author Richard
 */
public class PersonInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonInfo
     */
    private Person person;
    int type;
    public PersonInfoJPanel(){
        initComponents();
    }
    
    public void inite(){
        FirNTF.setText("Jack");
       
        LstNTF.setText("Tom");
       
        dateTF.setText("1995/01/01");
        
        phoneNuJTF.setText("85729371632");
        
        ageJTF.setText("23");
        
        weightJTF.setText("45");
        
        heightJTF.setText("189");
        
        ssnJTF.setText("823723");
        type = 2;
        
    }
    
    public PersonInfoJPanel(Person person, int type) {
        initComponents();
        this.person = person;
        this.type = type;
        if(type == 2){
            displayPerson(person);
        }
    }
    
    private void displayPerson(Person person){
        String firstName = person.getFirstName();
        FirNTF.setText(firstName);
        FirNTF.setEnabled(false);
        
        String lastName = person.getLastName();
        LstNTF.setText(lastName);
        LstNTF.setEnabled(false);
        
        String birthday = person.getBirthDay();
        dateTF.setText(birthday);
        dateTF.setEnabled(false);
        
        String phoneNum = person.getPhoneNumber();
        phoneNuJTF.setText(phoneNum);
        phoneNuJTF.setEnabled(false);
        
        String age = person.getAge();
        ageJTF.setText(age);
        ageJTF.setEnabled(false);
        
        String weight = person.getWeight();
        weightJTF.setText(weight);
        weightJTF.setEnabled(false);
        
        String height = person.getHeight();
        heightJTF.setText(height);
        heightJTF.setEnabled(false);
        
        String ssn = person.getSsn();
        ssnJTF.setText(ssn);
        ssnJTF.setEnabled(false);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ssnJTF = new javax.swing.JTextField();
        dateTF = new javax.swing.JTextField();
        DateLa = new javax.swing.JLabel();
        heightJTF = new javax.swing.JTextField();
        FirNTF = new javax.swing.JTextField();
        phoneNuJTF = new javax.swing.JTextField();
        phoneNuJLa = new javax.swing.JLabel();
        LstNTF = new javax.swing.JTextField();
        ssnJLa = new javax.swing.JLabel();
        lastNLa = new javax.swing.JLabel();
        heightJLa = new javax.swing.JLabel();
        ageJLa = new javax.swing.JLabel();
        firstNLa = new javax.swing.JLabel();
        ageJTF = new javax.swing.JTextField();
        weightJLa = new javax.swing.JLabel();
        weightJTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 500));

        DateLa.setText("DOB(YYYY/MM/DD)");

        FirNTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirNTFActionPerformed(evt);
            }
        });

        phoneNuJLa.setText("Phone Number");

        ssnJLa.setText("SSN");

        lastNLa.setText("Last Name:");

        heightJLa.setText("Height");

        ageJLa.setText("Age");

        firstNLa.setText("First Name:");

        weightJLa.setText("weight");

        jButton1.setText("SUBMIT&NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(phoneNuJLa)
                                .addGap(40, 40, 40)
                                .addComponent(phoneNuJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(firstNLa)
                                    .addComponent(lastNLa))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FirNTF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LstNTF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(weightJLa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(weightJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateLa)
                            .addComponent(ageJLa)
                            .addComponent(heightJLa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(ssnJLa)
                        .addGap(96, 96, 96)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heightJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssnJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(217, 217, 217))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(firstNLa)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FirNTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateLa)
                            .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(ageJLa))
                    .addComponent(ageJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lastNLa))
                    .addComponent(LstNTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(phoneNuJLa))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(heightJLa))
                            .addComponent(phoneNuJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(heightJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ssnJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ssnJLa))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(weightJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(weightJLa)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FirNTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirNTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirNTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(type == 2){
            JOptionPane.showMessageDialog(null,"You Cannot Change Information");
            
        }else{
        person.setFirstName(FirNTF.getText());
        person.setLastName(LstNTF.getText());
        person.setBirthDay(dateTF.getText());
        person.setPhoneNumber(phoneNuJTF.getText());
        person.setAge(ageJTF.getText());
        person.setHeight(heightJTF.getText());
        person.setSsn(ssnJTF.getText());
        person.setWeight(weightJTF.getText());
        
        JOptionPane.showMessageDialog(null, "Create Personal Information successfully","warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DateLa;
    private javax.swing.JTextField FirNTF;
    private javax.swing.JTextField LstNTF;
    private javax.swing.JLabel ageJLa;
    private javax.swing.JTextField ageJTF;
    private javax.swing.JTextField dateTF;
    private javax.swing.JLabel firstNLa;
    private javax.swing.JLabel heightJLa;
    private javax.swing.JTextField heightJTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lastNLa;
    private javax.swing.JLabel phoneNuJLa;
    private javax.swing.JTextField phoneNuJTF;
    private javax.swing.JLabel ssnJLa;
    private javax.swing.JTextField ssnJTF;
    private javax.swing.JLabel weightJLa;
    private javax.swing.JTextField weightJTF;
    // End of variables declaration//GEN-END:variables
}