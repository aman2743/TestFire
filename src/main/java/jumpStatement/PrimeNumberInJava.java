package jumpStatement;

public class PrimeNumberInJava {
    public static void main(String[] args) {
        boolean flag=false;
        int num=734272377;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=true;
                break;
            }
        }
        if(flag==true){
            System.out.println("Not a Prime Number");
        }
        else{
            System.out.println("Prime Number");
        }
    }
}
