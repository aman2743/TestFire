package keywordsInJava;


class FinalKeywordTest{
   final int a=20;

   public void display(){
//       a=40;
       System.out.println(a);
   }

}


public class finalKeywordInJava {
    public static void main(String[] args) {
        FinalKeywordTest obj=new FinalKeywordTest();
        obj.display();
    }
}
