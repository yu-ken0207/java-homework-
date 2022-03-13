package test1;
import java.util.*;
public class ¼í¦~ {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double year = in.nextDouble();
		
		String answer;
		answer =((year%4==0)&&(year % 100!=0) || (year%400==0))? "True" : "False" ;
			System.out.println(answer);
	}

}