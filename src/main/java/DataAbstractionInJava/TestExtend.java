package DataAbstractionInJava;

class TestNew extends TestAbstract{

    @Override
    public void Display() {
        System.out.println("Inside TestNew -> Display");
    }

    @Override
    public void print() {
        System.out.println("Inside TestNew -> Print");
    }
}

public class TestExtend {
    public static void main(String[] args) {
        TestNew obj=new TestNew();
      obj.cal();
      obj.TestAbstract();
      obj.Display();
      obj.print();
    }

}
