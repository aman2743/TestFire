package VariableTypesBasedOnScope;

class InstanceVariableClass{
    int marks;
    public void m1(int x,int y){
        int sumOfMarks;
        sumOfMarks=x+y;
        marks=sumOfMarks;
        System.out.println(marks);
    }

    public void result(){
        if(marks>50 && marks<60){
            System.out.println("Student is pass and division is second");
        }
        else if(marks>60){
            System.out.println("Student is pass and division is First");
        }
        else{
            System.out.println("Student is pass and division is third");
        }
    }

}

public class InstanceVariable {
    public static void main(String[] args) {
        InstanceVariableClass student1=new InstanceVariableClass();//Created the object of TestNew Class
        student1.m1(34,33);
        student1.result();
    }
}
