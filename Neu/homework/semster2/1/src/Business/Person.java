/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author liuyi
 */
public class Person {
    private Address address;
    private CheckingAccount checkingaccount;
    private Demographic demographic;
    private SavingAccount savingaccout;
    private License license;
    private Medical medical;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public CheckingAccount getCheckingaccount() {
        return checkingaccount;
    }

    public void setCheckingaccount(CheckingAccount checkingaccount) {
        this.checkingaccount = checkingaccount;
    }

    public Demographic getDemographic() {
        return demographic;
    }

    public void setDemographic(Demographic demographic) {
        this.demographic = demographic;
    }

    public SavingAccount getSavingaccout() {
        return savingaccout;
    }

    public void setSavingaccout(SavingAccount savingaccout) {
        this.savingaccout = savingaccout;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public Medical getMedical() {
        return medical;
    }

    public void setMedical(Medical medical) {
        this.medical = medical;
    }
    
    
    
}
