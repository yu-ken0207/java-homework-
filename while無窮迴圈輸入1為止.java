package test123;

import java.util.Scanner;

public class while�L�a�j���J1���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int i=0;
		Scanner sc= new Scanner(System.in);
		int sum = 0 ; 
		while (true) 
		{  
			System.out.print("�п�J�Ʀr:");			
			a = sc.nextInt(); 
			sum=sum+a;
			i++;
			if (a==-1) {
				break;
			}
		}
		System.out.println("�`�M"+sum);
		System.out.println("�ӼƬO�G"+i);
	}

}
