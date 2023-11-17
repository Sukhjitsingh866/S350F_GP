
package groupproject;

import java.util.Scanner;


public class LoginSystem {
    int pick=0;
    public static String hkid;

    
    public void Login(){
        
        Scanner sc = new Scanner(System.in);
        Role userRole= Role.ADMIN;
        System.out.println("Enter your HKID (without brackets)\n");
        hkid = sc.nextLine();
        System.out.println("Enter your Staff/Student ID\n");
        String id = sc.nextLine();
        boolean isCorrect = false;
        for (User each: User.users) {
            if (each.getHKID().equals(hkid) && each.getStaffID().equals(id)){
                isCorrect = true;
                userRole = each.getRole();
                break;
            }
        }
        if (isCorrect) {
            
            switch (pick) {
                case 1: 
                        if(userRole == Role.ADMIN){
                        System.out.println("Login successful!");
                        Admin admin = new Admin();
                        admin.assignRole();
                        break;
                        } else{
                            System.out.println("Incorrect Role");
                            break;
                        }
                case 2:
                    if(userRole == Role.TEACHER){
                    System.out.println("Login successful!");
                    Teacher teacher = new Teacher();
                    teacher.teacher();
                    break;
                    }else{
                        System.out.println("Incorrect Role");
                        break;
                    }
                case 3:
                    if(userRole == Role.STUDENT){
                    System.out.println("Login successful!");
                    Student student = new Student(hkid);
                    student.viewStudent();
                    break;
                    }else{
                        System.out.println("Incorrect Role");
                        break;
                    }
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
        System.out.println("1. Admin");
        System.out.println("2. Teacher");
        System.out.println("3. Student");
        System.out.println("Insert your Role: ");
        pick = sc.nextInt();
        
        switch(pick){
            case 1:
                System.out.println("Code for Admin");
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
    

    
}
