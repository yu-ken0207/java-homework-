package test123;

import java.util.Scanner;

public class while無窮迴圈輸入1為止 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int i=0;
		Scanner sc= new Scanner(System.in);
		int sum = 0 ; 
		while (true) 
		{  
			System.out.print("請輸入數字:");			
			a = sc.nextInt(); 
			sum=sum+a;
			i++;
			if (a==-1) {
				break;
			}
		}
		System.out.println("總和"+sum);
		System.out.println("個數是："+i);
	}

}
