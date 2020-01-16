/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicproject.icons.DataType.Patient;

/**
 *
 * @author omer358
 */
public class Doctor {
    
    private String pname;
    private int pAge ;
    private String pAddress;
    private long pPhone;
    private String specialization;

    public Doctor(String pname, int pAge, String pAddress, long pPhone, String specialization) {
        this.pname = pname;
        this.pAge = pAge;
        this.pAddress = pAddress;
        this.pPhone = pPhone;
        this.specialization = specialization;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
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

    public long getpPhone() {
        return pPhone;
    }

    public void setpPhone(long pPhone) {
        this.pPhone = pPhone;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    
    
}
