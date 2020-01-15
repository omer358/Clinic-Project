/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicproject.icons.DataType.Patient;

/**
 *
 * @author O.M.O
 */
public class Patient {
    
    private String pName;
    private int pAge;
    private String pAddress;
    private Long pPhone;
    private String pGender;

    public Patient(String pName, int pAge, String pAddress, Long pPhone, String pGender) {
        this.pName = pName;
        this.pAge = pAge;
        this.pAddress = pAddress;
        this.pPhone = pPhone;
        this.pGender = pGender;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpAge() {
        return pAge;
    }

    public void setpAge(int pAge) {
        this.pAge = pAge;
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }

    public Long getpPhone() {
        return pPhone;
    }

    public void setpPhone(Long pPhone) {
        this.pPhone = pPhone;
    }

    public String getpGender() {
        return pGender;
    }

    public void setpGender(String pGender) {
        this.pGender = pGender;
    }
    
}
