package objectedOrientedDesign.question1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CallManager {
	  
	  List<List<Call>> waitQueue;
	  List<Employee>employees;

	  CallManager() 
	  {
	    this.employees = new ArrayList<>();
	    this.waitQueue = new ArrayList<List<Call>>();
	  }

	  private Optional <Employee> getCallHandler(Call call) 
	  {
		List<Employee> activeEmployees = employees.stream()
	                .filter(Employee::isFree)
	                .sorted(Comparator.comparingInt(Employee::getPriority))
	                .collect(Collectors.toList());

	        if(!activeEmployees.isEmpty())
	        {
	            return Optional.of(activeEmployees.get(0));
	        }
		  
	        return null; 
	  }

	  public void addEmployee(Employee emp) 
	  {
		  employees.add(emp);
	  }

	  public void dispatch(Caller caller) 
	  {
	    dispatch(new Call(caller));
	  }

	  public void dispatch(Call call) 
	  {
		  
		      Optional<Employee> handler = getCallHandler(call);
		      if (handler== null) {
		          System.out.println("Sorry, the line is busy, your call is going in wait queue");
		          putCallInWaitQueue(call);
		         
		          return ;
		      }
		      handler.get().assignCall(call);
		      call.setEmployee(handler.get());
	 }
	  
	  public void putCallInWaitQueue(Call call) 
	  {
	    waitQueue.get(call.getRank()).add(call);
	  }
	
}
