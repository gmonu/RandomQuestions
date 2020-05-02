package First;
import java.util.*;

public class SubstringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(deFront(str));

	}
	public static String deFront(String str) {    
		  if(str.length() > 0) {
			  //if starting both characters are k & b
		    if(str.substring(0,1).equals("k") && !str.substring(1,2).equals("b")) {
		      return str.substring(0,1) + str.substring(2,str.length());
		    }
			  //if second character is b
		    else if(str.substring(1,2).equals("b")) {
		      return str.substring(1,2) + str.substring(2,str.length());
		    } 
			  //if first character is a
		    else if(str.substring(0,1).equals("k")) {
		      return str.substring(0,1) + str.substring(1,str.length());
		    } 
		    
		    else {
		      return str.substring(2,str.length());
		    }
		    
		  } 
		  //if string is empty
		  else {
		    return "";
		  }
		}

}
