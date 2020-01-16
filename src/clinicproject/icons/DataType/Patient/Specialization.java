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
public class Specialization {
    private String pName;
    private boolean status;

    public Specialization(String pName, boolean status) {
        this.pName = pName;
        this.status = status;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
