package OOPSInJava;

public class Person {
    String id;
    String name;
    int age;
    String city;
    String gender;

    public void eat(){
        System.out.println("Person "+name+ " eat");
    }
    public void study() {
        System.out.println("Person with age "+age+" study");
    }
    public void sleep(){
        System.out.println("person lives in city "+city+" sleep");
    }
    public void play(){
        System.out.println("person with gender "+gender+" play");
    }

    public static void main(String[] args) {
        Person obj=new Person();//to create the object
        Person obj1=new Person();
        obj.name="John";
        obj.age=35;
        obj.city="Delhi";
        obj.gender="Male";
        obj.eat();
        obj.play();
        obj.sleep();
        obj.study();
        obj1.name="Dessy";
        obj1.age=20;
        obj1.city="Pune";
        obj1.gender="Female";
        obj1.eat();
        obj1.play();
        obj1.sleep();
        obj1.study();


    }
}

