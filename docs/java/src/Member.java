public class Member{
    String name;
    String id;
    String password;
    int age;
    
    
    Member(String name, String id){
        this.name = name;
        this.id = id;
    }
    Member(String name, String id, String password){
        this.name = name;   
        this.id = id;
        this.password = password;
    }
}