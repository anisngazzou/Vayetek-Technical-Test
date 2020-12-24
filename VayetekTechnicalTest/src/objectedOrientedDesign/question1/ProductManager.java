package objectedOrientedDesign.question1;

public class ProductManager extends Employee {

	ProductManager(String name, CallManager callManager) {
        super(name, callManager);
        this.priority = 3;
    }
}
