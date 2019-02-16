/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Address;
import Business.CheckingAccount;
import Business.Demographic;
import Business.License;
import Business.Medical;
import Business.Person;
import Business.SavingAccount;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;;
/*import Business.Address;
import Business.CheckingAccount;
import Business.Demographic;
import Business.License;
import Business.Medical;
import Business.SavingAccount;
/**
 *
 * @author liuyi
 */
public class ViewAllJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAllJPanel
     */
    private Person person;
    public ViewAllJPanel(Person person) {
        initComponents();
                if(person== null){
            
            return;
        }
        displayPerson(person);
    }
    
    private void displayPerson(Person person){
      displayDemographic(person.getDemographic());
      displayAddress(person.getAddress());
      displaySavingAccount(person.getSavingaccout());
      displayCheckingAccount(person.getCheckingaccount());
      displayLicense(person.getLicense());
      displayMedical(person.getMedical());
    }
  
      public void displayDemographic(Demographic demographic){
      String age=demographic.getAge( );
      AgeTxtField.setText(age);
      String birthday=demographic.getDateofbirth();
      BirthdayTxtField.setText(birthday);
      String first=demographic.getFirstname();
      FirstnameTxtField.setText(first);
      String height=demographic.getHeight();
      HeightTxtField.setText(height);
      String last=demographic.getLastname();
      LastnameTxtField.setText(last);
      String phone=demographic.getPhonenumber();
      PhonenumTxtField.setText(phone);
      String ssn=demographic.getSSN();
      SSNTxtField.setText(ssn);
      String weight=demographic.getWeight();
      WeightTxtField.setText(weight);
      }
     public void displayAddress(Address addresss){
      String city=addresss.getCity();
        CityTxtField.setText(city);
        CityTxtField.setEnabled(false);
        String state=addresss.getState();
        StateTxtField.setText(state);
        StateTxtField.setEnabled(false);
        String street=addresss.getStreet();
        StreetTxtField.setText(street);
        StreetTxtField.setEnabled(false);
        String zipcode=addresss.getZipcode();
        ZipcodeTxtField.setText(zipcode);
        ZipcodeTxtField.setEnabled(false);
       }
      public void displayCheckingAccount(CheckingAccount checkingaccount){
      String number=checkingaccount.getAccountnum();
      AccountnumTxtField.setText(number);
       AccountnumTxtField.setEnabled(false);
      String balance=checkingaccount.getBalance();
      BalanceTxtField.setText(balance);
      BalanceTxtField.setEnabled(false);
      String name=checkingaccount.getBankname();
      BanknameTxtField.setText(name);
      BanknameTxtField.setEnabled(false);
      String routing=checkingaccount.getRoutingnum();
      RoutingnumTxtField.setText(routing);
      RoutingnumTxtField.setEnabled(false);
      String type=checkingaccount.getType();
      TypeTxtField.setText(type);
      TypeTxtField.setEnabled(false);
      }
      public void displaySavingAccount(SavingAccount savingaccount){
      String number2=savingaccount.getAccountnum();
      AccountnumTxtField.setText(number2);
      AccountnumTxtField.setEnabled(false);
      String balance2=savingaccount.getBalance();
      BalanceTxtField.setText(balance2);
      BalanceTxtField.setEnabled(false);
      String name2=savingaccount.getBankname();
      BanknameTxtField.setText(name2);
      BanknameTxtField.setEnabled(false);
      String routing2=savingaccount.getRoutingnum();
      RoutingnumTxtField.setText(routing2);
      RoutingnumTxtField.setEnabled(false);
      String type2=savingaccount.getType();
      TypeTxtField.setText(type2);
      TypeTxtField.setEnabled(false);}
      public void displayLicense(License license){
       String blood=license.getBloodtype();
       BloodtypeTxtField.setText(blood);
        BloodtypeTxtField.setEnabled(false);
       String expiration=license.getExpiration();
       ExpirationTxtField.setText(expiration);
       ExpirationTxtField.setEnabled(false);
       String issued=license.getIssueddate();
       IssuedTxtField.setText(issued);
       IssuedTxtField.setEnabled(false);
       String number3=license.getLicensenum();
       LicensenumTxtField.setText(number3);
        LicensenumTxtField.setEnabled(false);
      }
      public void displayMedical(Medical medical){
       String one=medical.getAlergy1();
       Alergy1TxtField.setText(one);
       Alergy1TxtField.setEnabled(false);
       String two=medical.getAlergy2();
       Alergy2TxtField.setText(two);
       Alergy2TxtField.setEnabled(false);
       String three=medical.getAlergy3();
       Alergy3TxtField.setText(three);
       Alergy3TxtField.setEnabled(false);
       String record=medical.getRecordNum();
       RecordTxtField.setText(record);
        RecordTxtField.setEnabled(false);
       
       ImageIcon icon;
        icon = new ImageIcon(CreateDriverLicenseJPanel.path);
        icon.setImage(icon.getImage().getScaledInstance(450, 450, Image.SCALE_DEFAULT));
        picture.setIcon(icon);
      }

      
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollJPanel = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        HeightTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AgeTxtField = new javax.swing.JTextField();
        PhonenumTxtField = new javax.swing.JTextField();
        WeightTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        LastnameTxtField = new javax.swing.JTextField();
        FirstnameTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SSNTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BirthdayTxtField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        StreetTxtField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        CityTxtField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        StateTxtField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        ZipcodeTxtField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TypeTxtField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        BalanceTxtField = new javax.swing.JTextField();
        AccountnumTxtField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        RoutingnumTxtField = new javax.swing.JTextField();
        BanknameTxtField = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        CheckingBanknameTxtField = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        CheckingRoutingnumTxtField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        CheckingAccountnumTxtField = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        CheckingBalanceTxtField = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        CheckingTypeTxtField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        BloodtypeTxtField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        ExpirationTxtField = new javax.swing.JTextField();
        IssuedTxtField = new javax.swing.JTextField();
        LicensenumTxtField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        RecordTxtField = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        Alergy1TxtField = new javax.swing.JTextField();
        Alergy2TxtField = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        Alergy3TxtField = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SaveBtn = new javax.swing.JButton();

        ScrollJPanel.setBackground(new java.awt.Color(249, 254, 254));
        ScrollJPanel.setPreferredSize(new java.awt.Dimension(1043, 2312));
        ScrollJPanel.setRequestFocusEnabled(false);

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Demographic Information");

        HeightTxtField.setBackground(new java.awt.Color(240, 240, 240));
        HeightTxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        HeightTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeightTxtFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel7.setText("Weight:");

        AgeTxtField.setBackground(new java.awt.Color(240, 240, 240));
        AgeTxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        AgeTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTxtFieldActionPerformed(evt);
            }
        });

        PhonenumTxtField.setBackground(new java.awt.Color(240, 240, 240));
        PhonenumTxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        PhonenumTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhonenumTxtFieldActionPerformed(evt);
            }
        });

        WeightTxtField.setBackground(new java.awt.Color(240, 240, 240));
        WeightTxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        WeightTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeightTxtFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel5.setText("Phone number:");

        LastnameTxtField.setBackground(new java.awt.Color(240, 240, 240));
        LastnameTxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        LastnameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastnameTxtFieldActionPerformed(evt);
            }
        });

        FirstnameTxtField.setBackground(new java.awt.Color(240, 240, 240));
        FirstnameTxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        FirstnameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstnameTxtFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel2.setText("Last name:");

        SSNTxtField.setBackground(new java.awt.Color(240, 240, 240));
        SSNTxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        SSNTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSNTxtFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel1.setText("First name:");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel6.setText("Age:");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel8.setText("Date of birth:");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel9.setText("Social Security number:");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel10.setText("Height:");

        BirthdayTxtField.setBackground(new java.awt.Color(240, 240, 240));
        BirthdayTxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        BirthdayTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BirthdayTxtFieldActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(153, 153, 153));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Address Information");

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel12.setText("Street address:");

        StreetTxtField.setBackground(new java.awt.Color(240, 240, 240));
        StreetTxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        StreetTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StreetTxtFieldActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel13.setText("City:");

        CityTxtField.setBackground(new java.awt.Color(240, 240, 240));
        CityTxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        CityTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityTxtFieldActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel14.setText("State:");

        StateTxtField.setBackground(new java.awt.Color(240, 240, 240));
        StateTxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        StateTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateTxtFieldActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel15.setText("Zip code:");

        ZipcodeTxtField.setBackground(new java.awt.Color(240, 240, 240));
        ZipcodeTxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        ZipcodeTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZipcodeTxtFieldActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("-------------------------------------------------------------------------------------------------------------------------");

        jLabel17.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("-------------------------------------------------------------------------------------------------------------------------");

        jLabel18.setBackground(new java.awt.Color(153, 153, 153));
        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));
        jLabel18.setText("Saving Account Information");

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel19.setText("Bank name:");

        TypeTxtField.setBackground(new java.awt.Color(240, 240, 240));
        TypeTxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        TypeTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeTxtFieldActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel22.setText("Account type:");

        BalanceTxtField.setBackground(new java.awt.Color(240, 240, 240));
        BalanceTxtField.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        BalanceTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceTxtFieldActionPerformed(evt);
            }
        });

        AccountnumTxtField.setBackground(new java.awt.Color(240, 240, 240));
        AccountnumTxtField.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        AccountnumTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountnumTxtFieldActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel21.setText("Account balance:");

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel20.setText("Bank account number:");

        jLabel23.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel23.setText("Bank routing number:");

        RoutingnumTxtField.setBackground(new java.awt.Color(240, 240, 240));
        RoutingnumTxtField.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        RoutingnumTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoutingnumTxtFieldActionPerformed(evt);
            }
        });

        BanknameTxtField.setBackground(new java.awt.Color(240, 240, 240));
        BanknameTxtField.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        BanknameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BanknameTxtFieldActionPerformed(evt);
            }
        });

        jLabel31.setBackground(new java.awt.Color(153, 153, 153));
        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 102, 102));
        jLabel31.setText("Checking Account Information");

        jLabel32.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(153, 153, 153));
        jLabel32.setText("-------------------------------------------------------------------------------------------------------------------------");

        jLabel33.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel33.setText("Bank name:");

        CheckingBanknameTxtField.setBackground(new java.awt.Color(240, 240, 240));
        CheckingBanknameTxtField.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        CheckingBanknameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckingBanknameTxtFieldActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel34.setText("Bank routing number:");

        CheckingRoutingnumTxtField.setBackground(new java.awt.Color(240, 240, 240));
        CheckingRoutingnumTxtField.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        CheckingRoutingnumTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckingRoutingnumTxtFieldActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel35.setText("Bank account number:");

        CheckingAccountnumTxtField.setBackground(new java.awt.Color(240, 240, 240));
        CheckingAccountnumTxtField.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        CheckingAccountnumTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckingAccountnumTxtFieldActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel36.setText("Account balance:");

        CheckingBalanceTxtField.setBackground(new java.awt.Color(240, 240, 240));
        CheckingBalanceTxtField.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        CheckingBalanceTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckingBalanceTxtFieldActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel37.setText("Account type:");

        CheckingTypeTxtField.setBackground(new java.awt.Color(240, 240, 240));
        CheckingTypeTxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        CheckingTypeTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckingTypeTxtFieldActionPerformed(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(153, 153, 153));
        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 102, 102));
        jLabel24.setText("Driver License Information");

        jLabel38.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(153, 153, 153));
        jLabel38.setText("-------------------------------------------------------------------------------------------------------------------------");

        BloodtypeTxtField.setBackground(new java.awt.Color(240, 240, 240));
        BloodtypeTxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        BloodtypeTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodtypeTxtFieldActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel25.setText("License number:");

        ExpirationTxtField.setBackground(new java.awt.Color(240, 240, 240));
        ExpirationTxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        ExpirationTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpirationTxtFieldActionPerformed(evt);
            }
        });

        IssuedTxtField.setBackground(new java.awt.Color(240, 240, 240));
        IssuedTxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        IssuedTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssuedTxtFieldActionPerformed(evt);
            }
        });

        LicensenumTxtField.setBackground(new java.awt.Color(240, 240, 240));
        LicensenumTxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        LicensenumTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LicensenumTxtFieldActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel26.setText("Date it was issued:");

        jLabel27.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel27.setText("blood type:");

        jLabel28.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel28.setText("Date of expiration:");

        jLabel29.setBackground(new java.awt.Color(153, 153, 153));
        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 102, 102));
        jLabel29.setText("Medical Record Information");

        jLabel39.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(153, 153, 153));
        jLabel39.setText("-------------------------------------------------------------------------------------------------------------------------");

        jLabel30.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel30.setText("Medical record number:");

        RecordTxtField.setBackground(new java.awt.Color(240, 240, 240));
        RecordTxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        RecordTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordTxtFieldActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel40.setText("Alergy 3:");

        Alergy1TxtField.setBackground(new java.awt.Color(240, 240, 240));
        Alergy1TxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        Alergy1TxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alergy1TxtFieldActionPerformed(evt);
            }
        });

        Alergy2TxtField.setBackground(new java.awt.Color(240, 240, 240));
        Alergy2TxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        Alergy2TxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alergy2TxtFieldActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel41.setText("Allergy 2:");

        Alergy3TxtField.setBackground(new java.awt.Color(240, 240, 240));
        Alergy3TxtField.setFont(new java.awt.Font("宋体", 1, 36)); // NOI18N
        Alergy3TxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alergy3TxtFieldActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel42.setText("Allergy 1:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel32)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(PhonenumTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(FirstnameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(107, 107, 107)
                                            .addComponent(jLabel2)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BirthdayTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LastnameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(AgeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(HeightTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(WeightTxtField))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(SSNTxtField)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(StateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ZipcodeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel19)
                                                .addComponent(jLabel23)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(RoutingnumTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                            .addComponent(AccountnumTxtField)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BalanceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel22)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TypeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel31)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel33)
                                                .addComponent(jLabel34)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(CheckingRoutingnumTxtField)
                                            .addComponent(CheckingAccountnumTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CheckingBalanceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel37)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckingTypeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel24)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BloodtypeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LicensenumTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(IssuedTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel28)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExpirationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel29)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BanknameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CheckingBanknameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel41)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Alergy2TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel30)
                                        .addComponent(jLabel42))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Alergy1TxtField)
                                        .addComponent(RecordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel40)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Alergy3TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(154, 154, 154)
                                .addComponent(StreetTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(499, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(FirstnameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(PhonenumTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(BirthdayTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AgeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(HeightTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(WeightTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(LastnameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SSNTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel16)
                .addGap(7, 7, 7)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(StreetTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(StateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(ZipcodeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addGap(2, 2, 2)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BanknameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(RoutingnumTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(AccountnumTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BalanceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(TypeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addGap(2, 2, 2)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckingBanknameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(CheckingRoutingnumTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(CheckingAccountnumTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckingBalanceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(CheckingTypeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addGap(2, 2, 2)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(LicensenumTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(IssuedTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(ExpirationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BloodtypeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(15, 15, 15)
                .addComponent(picture, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel39)
                .addGap(2, 2, 2)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(RecordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Alergy1TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Alergy2TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(Alergy3TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );

        ScrollJPanel.setViewportView(jPanel1);

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Report");

        SaveBtn.setBackground(new java.awt.Color(0, 102, 102));
        SaveBtn.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SaveBtn.setForeground(java.awt.Color.white);
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(442, 442, 442)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(ScrollJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
     JOptionPane.showMessageDialog(null, "You have saved your information successfully!", "SAVE", HEIGHT);
    }//GEN-LAST:event_SaveBtnActionPerformed

    
    
    
    private void Alergy3TxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alergy3TxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alergy3TxtFieldActionPerformed

    private void Alergy2TxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alergy2TxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alergy2TxtFieldActionPerformed

    private void Alergy1TxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alergy1TxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alergy1TxtFieldActionPerformed

    private void RecordTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecordTxtFieldActionPerformed

    private void LicensenumTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LicensenumTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LicensenumTxtFieldActionPerformed

    private void IssuedTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssuedTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IssuedTxtFieldActionPerformed

    private void ExpirationTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpirationTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExpirationTxtFieldActionPerformed

    private void BloodtypeTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodtypeTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodtypeTxtFieldActionPerformed

    private void CheckingTypeTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckingTypeTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckingTypeTxtFieldActionPerformed

    private void CheckingBalanceTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckingBalanceTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckingBalanceTxtFieldActionPerformed

    private void CheckingAccountnumTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckingAccountnumTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckingAccountnumTxtFieldActionPerformed

    private void CheckingRoutingnumTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckingRoutingnumTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckingRoutingnumTxtFieldActionPerformed

    private void CheckingBanknameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckingBanknameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckingBanknameTxtFieldActionPerformed

    private void BanknameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BanknameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BanknameTxtFieldActionPerformed

    private void RoutingnumTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoutingnumTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoutingnumTxtFieldActionPerformed

    private void AccountnumTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountnumTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountnumTxtFieldActionPerformed

    private void BalanceTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalanceTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BalanceTxtFieldActionPerformed

    private void TypeTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeTxtFieldActionPerformed

    private void ZipcodeTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZipcodeTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZipcodeTxtFieldActionPerformed

    private void StateTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StateTxtFieldActionPerformed

    private void CityTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityTxtFieldActionPerformed

    private void StreetTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StreetTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StreetTxtFieldActionPerformed

    private void BirthdayTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BirthdayTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BirthdayTxtFieldActionPerformed

    private void SSNTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSNTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SSNTxtFieldActionPerformed

    private void FirstnameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstnameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstnameTxtFieldActionPerformed

    private void LastnameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastnameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastnameTxtFieldActionPerformed

    private void WeightTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WeightTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WeightTxtFieldActionPerformed

    private void PhonenumTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhonenumTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhonenumTxtFieldActionPerformed

    private void AgeTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeTxtFieldActionPerformed

    private void HeightTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeightTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HeightTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountnumTxtField;
    private javax.swing.JTextField AgeTxtField;
    private javax.swing.JTextField Alergy1TxtField;
    private javax.swing.JTextField Alergy2TxtField;
    private javax.swing.JTextField Alergy3TxtField;
    private javax.swing.JTextField BalanceTxtField;
    private javax.swing.JTextField BanknameTxtField;
    private javax.swing.JTextField BirthdayTxtField;
    private javax.swing.JTextField BloodtypeTxtField;
    private javax.swing.JTextField CheckingAccountnumTxtField;
    private javax.swing.JTextField CheckingBalanceTxtField;
    private javax.swing.JTextField CheckingBanknameTxtField;
    private javax.swing.JTextField CheckingRoutingnumTxtField;
    private javax.swing.JTextField CheckingTypeTxtField;
    private javax.swing.JTextField CityTxtField;
    private javax.swing.JTextField ExpirationTxtField;
    private javax.swing.JTextField FirstnameTxtField;
    private javax.swing.JTextField HeightTxtField;
    private javax.swing.JTextField IssuedTxtField;
    private javax.swing.JTextField LastnameTxtField;
    private javax.swing.JTextField LicensenumTxtField;
    private javax.swing.JTextField PhonenumTxtField;
    private javax.swing.JTextField RecordTxtField;
    private javax.swing.JTextField RoutingnumTxtField;
    private javax.swing.JTextField SSNTxtField;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JScrollPane ScrollJPanel;
    private javax.swing.JTextField StateTxtField;
    private javax.swing.JTextField StreetTxtField;
    private javax.swing.JTextField TypeTxtField;
    private javax.swing.JTextField WeightTxtField;
    private javax.swing.JTextField ZipcodeTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel picture;
    // End of variables declaration//GEN-END:variables
}
