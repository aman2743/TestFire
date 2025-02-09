package ConstructorInJava;

public class ConstructorProgram2 {
    String name;
    static String college_name;
    int roll_number;

    public ConstructorProgram2(String Name, int RollNumber){
        this.name=Name;
        this.roll_number=RollNumber;
    }

    public void display(){
        System.out.print(name);
        System.out.print(" "+college_name);
        System.out.print(" "+roll_number);
        System.out.println();
    }

    public static void main(String[] args) {
        ConstructorProgram2 constructor1 = new ConstructorProgram2("Suman",1234);
        ConstructorProgram2 constructor2 = new ConstructorProgram2("Raman",1235);
        ConstructorProgram2 constructor3 = new ConstructorProgram2("Rajan",1236);
        ConstructorProgram2 constructor4 = new ConstructorProgram2("Rekha",1237);
        ConstructorProgram2 constructor5 = new ConstructorProgram2("Hari",1238);
        ConstructorProgram2 constructor6 = new ConstructorProgram2("Roshan",1239);
        college_name="NIIT";
        constructor1.display();
        constructor2.display();
        constructor3.display();
        constructor4.display();
        constructor5.display();
        constructor6.display();

    }
}
