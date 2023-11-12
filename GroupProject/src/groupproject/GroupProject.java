
package groupproject;

public class GroupProject {


    public static void main(String[] args) {
        LoginSystem ls = new LoginSystem();
        ls.addUser("A123567","s12345",Role.ADMIN);
        ls.addUser("B123567","s34656",Role.TEACHER);
        ls.addUser("C123567","s37543",Role.TEACHER);
        ls.addUser("D123567","s45677",Role.STUDENT);
        ls.addUser("E123567","s56785",Role.STUDENT);
        
        ls.pickRole();
    }
    
}
