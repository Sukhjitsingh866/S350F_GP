/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject;

/**
 *
 * @author Owner
 */
public class User {
    private String HKID;
    private String staffID;
    
    public User(String hkid, String id){
        this.HKID = hkid;
        this.staffID = id;
    }

    public String getHKID() {
        return HKID;
    }

    public void setHKID(String HKID) {
        this.HKID = HKID;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }
    
    
}
