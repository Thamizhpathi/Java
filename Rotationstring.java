package lastoccur;
import java.util.*;
public class Rotationstring {

	    static boolean rotateString(String s, String goal) {
	    
	        String result=s;
	        for(int i=0; i<s.length(); i++) {
	        	result=result.charAt(s.length()-1)+result.substring(0,s.length()-1);
	        	if(result.equals(goal)) {
	        		return true;
	        	}
	        	
	        }
	       
	       return false;
	    }
	    
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	String a=sc.next();
	    	String b=sc.next();
	    	System.out.print(rotateString(a,b));
	    	rotateString(a,b);
	    	sc.close();
	}
}
