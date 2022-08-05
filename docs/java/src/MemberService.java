
public class MemberService {
    public static void main(String[] args){
        Member nMember1 = new Member("examplename", "hong1");
        Member nMember2 = new Member("examplename", "hong","12345");

        login(nMember1.id,nMember1.password);
        login(nMember2.id,nMember2.password);


    }
    static boolean login(String id,String password){
        boolean nTemp= false;
        if("hong".equals(id)&&"12345".equals(password)){
            System.out.println("successfuly login...");
            nTemp=true;
        }else{
            System.out.println("unavailable value...");
        }
        return nTemp;
    }
    static void logout(String id){  
        System.out.println("successfuly logout...");
    }
}
