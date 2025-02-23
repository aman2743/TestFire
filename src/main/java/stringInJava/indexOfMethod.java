package stringInJava;

public class indexOfMethod {
    public static void main(String[] args) {
        String str="AUTOMATION TESTING";
//        System.out.println(str.indexOf('A'));
//        System.out.println(str.indexOf('M'));
//        System.out.println(str.indexOf('T'));
//        int ind=str.indexOf('T',str.indexOf("T")+1);
        int ind1=str.indexOf('T',(str.indexOf('T',str.indexOf("T")+1))+1);
//       System.out.println(ind);
        System.out.println(ind1);

    }
}
