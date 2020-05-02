package First;

import java.util.Scanner;

public class reverse_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//System.out.println(deFront(str));
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		for(int i = 0; i<sb.length(); i++)
		{
			System.out.print(sb.charAt(i)+"-");
		}
		
		
	}

}
