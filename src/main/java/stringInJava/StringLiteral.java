package stringInJava;

public class StringLiteral {
    public static void main(String[] args) {
        String str1="Welcome";
        String str2="Welcome";
        if(str1.equals(str2)){ //compares value
            System.out.println("Same");
        }
        else{
            System.out.println("Different");
        }
//        if(str1==str2){  //compares address
//            System.out.println("equals");
//        }
//        else{
//            System.out.println("Not Equals");
//        }
    }
}
