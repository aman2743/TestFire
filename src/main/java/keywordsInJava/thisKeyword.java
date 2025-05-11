package keywordsInJava;
class Test{
    int i;
    void setValue(int a){
        this.i=a;
    }
   public void display(){
        System.out.println(i);
    }

}
public class thisKeyword {
    public static void main(String[] args) {
        Test t=new Test();
        t.setValue(10);
        t.display();

    }
}
