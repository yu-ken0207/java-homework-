package test123;
import java.util.*;
public class dowhile繩子長度 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		int i=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("請輸入繩子長度:");
		
		a = sc.nextDouble();   
		while (a>=5) 
		{  
			a=a/2;
			i++;
		}
		System.out.println("頓哲的次數："+i);
		System.out.println("長度是："+a);
	}

}
