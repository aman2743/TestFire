package stringInJava;

public class StringLiteral1 {
    public static void main(String[] args) {
        String str1="aman";
        String str2="aman";
        str1.concat("kumar");

//        if(str1==str2){
//            System.out.println("equals");
//        }
//        else{
//            System.out.println("Not Equals");
//        }

        if(str1.equals(str2)){ //compares value
            System.out.println("Same");
        }
        else{
            System.out.println("Different");
        }

    }
}
