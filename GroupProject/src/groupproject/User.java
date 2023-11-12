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
    private Role role;
    
    public User(String hkid, String id, Role role){
        this.HKID = hkid;
        this.staffID = id;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
