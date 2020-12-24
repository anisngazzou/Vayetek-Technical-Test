package objectedOrientedDesign.question1;
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello Vayetek");
    CallManager CM = new CallManager();

    CM.addEmployee(new Fresher("F1", CM));
    CM.addEmployee(new Fresher("F2", CM));
    CM.addEmployee(new Fresher("F3", CM));
    CM.addEmployee(new ProductManager("PM", CM));
    CM.addEmployee(new TechnicalLead("TL", CM));

    Caller C1 = new Caller("Call num 1");
    Caller C2 = new Caller("Call num 2");
    Caller C3 = new Caller("Call num 3");
    
    CM.dispatch(C1); //For F1
    CM.dispatch(C2); //For F2
    CM.dispatch(C3); //For F3
    CM.dispatch(new Call()); // NO Fresher so For TL 
    CM.dispatch(new Call()); // NO TL so For PM 
    
  }
}

