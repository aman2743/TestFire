package staticKeywordInJava;

public class UserCountTest {
    static int count;
  UserCountTest(){
        count++;
    }

    public static void main(String[] args) {
        UserCountTest U1=new UserCountTest();
        UserCountTest U2=new UserCountTest();
        UserCountTest U3=new UserCountTest();
        UserCountTest U4=new UserCountTest();
        System.out.println(UserCountTest.count);
    }
}
