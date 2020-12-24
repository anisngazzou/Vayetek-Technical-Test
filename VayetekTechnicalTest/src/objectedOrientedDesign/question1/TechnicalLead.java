package objectedOrientedDesign.question1;

public class TechnicalLead extends Employee {

	TechnicalLead(String name, CallManager callManager) {
        super(name, callManager);
        this.priority = 2;
    }
}
