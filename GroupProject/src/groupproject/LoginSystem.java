
package groupproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LoginSystem {
    int pick=0;
    private static List<User> users;
    
    public LoginSystem(){
        users = new ArrayList<>();
    }
    
    public void addUser(String hkid, String id){
        users.add(new User(hkid,id));
    }
    
    public void Login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your HKID (without brackets)\n");
        String hkid = sc.nextLine();
        System.out.println("Enter your Staff/Student ID\n");
        String id = sc.nextLine();
        boolean isCorrect = false;
        for (User each: users) {
            if (each.getHKID().equals(hkid) && each.getStaffID().equals(id)){
                isCorrect = true;
                break;
            }
        }
        
        if (isCorrect) {
            System.out.println("Login successful!");
            switch (pick) {
                case 1:
                    Staff staff = new Staff();
                        break;
                case 2:
                    Teacher teacher = new Teacher();
                    break;
                case 3:
                    Student student = new Student();
                    break;
                default:
                    System.out.println("Invalid role.");
                    break;
            }
        }else{
            System.out.println("Incorrect HKID or Staff/Student ID");
        }
        
        sc.close();
    }
    public void pickRole(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a role:");
        System.out.println("1. Staff");
        System.out.println("2. Teacher");
        System.out.println("3. Student");
        System.out.println("Insert your Role: ");
        pick = sc.nextInt();
        
        switch(pick){
            case 1:
                System.out.println("Code for Staff");
                Login();
                break;
            case 2:
                System.out.println("Code for Teacher");
                Login();
                break;
            case 3:
                System.out.println("Code for Student");
                Login();
                break;
            default:
                System.out.println("Incorrect input");
        }
        sc.close();
    }
    
    public static void main(String[] args){
        
    }
    
}
