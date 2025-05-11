package factoryMethodInJava;

abstract class Plan{
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}

class  DomesticPlan extends Plan{
    //@override
    public void getRate(){
        rate=3.50;
    }
}

class  CommercialPlan extends Plan{
    //@override
    public void getRate(){
        rate=7.50;
    }
    }

    class  InstitutionalPlan extends Plan {
        //@override
        public void getRate() {
            rate = 5.50;
        }
    }

        class GetPlanFactory{

            //use getPlan method to get object of type Plan
            public static Plan getPlan(String planType){
                if(planType == null){
                    return null;
                }
                if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
                    DomesticPlan dp=new DomesticPlan();
                    return dp;
                }
                else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
                    CommercialPlan cp=new CommercialPlan();
                    return cp;
                }
                else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
                    InstitutionalPlan ip= new InstitutionalPlan();
                    return ip;
                }
                return null;
            }
        }

        public class GenerateBill {
      public static void main(String[] args) {
      Plan pl;
      pl=GetPlanFactory.getPlan("COMMERCIALPLAN");
      pl.getRate();
      pl.calculateBill(20);

    }
}

