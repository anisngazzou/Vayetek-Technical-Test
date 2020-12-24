package objectedOrientedDesign.question1;

public class Employee {
	  private String name;
	  private Call currentCall;
	  private CallManager callManager;
	  protected int priority;

	  Employee(String name, CallManager callManager) 
	  {
	    this.name = name;
	    this.callManager = callManager; 
	  }

	  public boolean isFree() 
	  {
	    return this.currentCall == null;
	  }

	  private void escalateCall() 
	  {
	    if (!isFree()) {
	      currentCall.incrementRank();
	      callManager.putCallInWaitQueue(currentCall);
	    }
	  }
	  public int getPriority() 
	  {
	        return priority;
	  }

	  public void assignCall(Call call) 
	  {
	    System.out.println(name + " Received call!");
	    currentCall = call;
	  }
	}