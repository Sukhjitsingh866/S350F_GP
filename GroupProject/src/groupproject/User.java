/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Owner
 */
public class User {
    private String HKID;
    private String staffID;
    private Role role;
    
    public static List<User> users = new ArrayList<>();
    
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
    
    
    public static User findUserByHKIDAndID(String hkid,String id){
        for (User each:users){
            if(each.getHKID().equals(hkid)&&each.getStaffID().equals(id)){
                return each;
            }
        }
        return null;
    }
    
}
