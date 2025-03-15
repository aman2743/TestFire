package PolymorphismInJava;

class PolicyBazar{
    public void ROI(){
        System.out.println("Policy Bazar ROI is 10.65");
    }
}

class HSBC extends PolicyBazar{
    public void ROI(){
        //  API gets real time ROI of HSBC
        System.out.println("HSBC ROI is 10.55");
    }
}

class ICICI extends PolicyBazar{
    public void ROI(){
//  API gets real time ROI of ICICI
        System.out.println("ICICI ROI is 10.60");
    }
}


public class MethodOverridingInJava {
    public static void main(String[] args) {
        ICICI Deepak=new ICICI();
        Deepak.ROI();
        HSBC Bibek=new HSBC();
        Bibek.ROI();
    }

}
