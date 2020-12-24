package arraysAndStrings;

public class ArraysAndStrings {

	public static void main(String[] args) {
		String basicWord = "waterbottle";
		String basicWord2 = "Vayetek";
		String test1 = "erbottlewat";
		String test2 = "terbottlewa";
		String test3 = null;
		String test4 = "tekVaye";
		String test5 = "tektek";
		String test6 = "";
		if (isRotation(basicWord,test1))	
			System.out.println(test1+" is the rotation of "+basicWord); 
		
		else System.out.println(test1+" is not the rotation of "+basicWord);
		
		if (isRotation(basicWord,test2))	
			System.out.println(test2+" is the rotation of "+basicWord);  
		
		else System.out.println(test2+" is not the rotation of "+basicWord);
		
		if (isRotation(basicWord,test3))	
			System.out.println(test3+" is the rotation of "+basicWord); 
		
		else System.out.println(test3+" is not the rotation of "+basicWord);
		
		if (isRotation(basicWord2,test4))	
			System.out.println(test4+" is the rotation of "+basicWord2); 
		
		else System.out.println(test4+" is not the rotation of "+basicWord2);
		
		if (isRotation(basicWord2,test5))	
			System.out.println(test5+" is the rotation of "+basicWord2);  
		
		else System.out.println(test5+" is not the rotation of "+basicWord2);
		
		if (isRotation(basicWord2,test6))	
			System.out.println(test6+" is the rotation of "+basicWord2);
		
		else System.out.println(test6+" is not the rotation of "+basicWord2);
	}
	public static boolean isSubString(String basicWordStr,String test){
		if(basicWordStr == null || test == null)	return false;
		if((basicWordStr.indexOf(test)) >= 0)	return true;
		else return false;
			
	}
	public static boolean isRotation(String basicWord,String test){
		if(basicWord == null || test == null)	return false;
		if(basicWord.length() != test.length())	return false;
		
		if(isSubString(basicWord+basicWord, test))	return true;
		else 	return false;
	}

}
