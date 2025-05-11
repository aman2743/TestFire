package keywordsInJava;
class Test1{
    int i;
    public void display(){
        System.out.println("Inside display method");
    }
   public void show(){
        this.display();
    }
}
public class thisKeyword1 {
    public static void main(String[] args) {
        Test1 t=new Test1();
        t.show();

    }
}
