package stringInJava;

public class equalsMethodInString {
    public static void main(String[] args) {
        String str1="Automation";
        String str2="Testing";
        String str3="Automation";
        boolean b=str1.equals(str3);
//        System.out.println(b);

        if(str1==str3){
            System.out.println("Same");
        }else{
            System.out.println("different");
        }


    }
}

