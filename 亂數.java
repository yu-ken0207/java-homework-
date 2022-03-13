package test123;

public class ¶Ã¼Æ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		for (int i = 1 ; i <=5 ; i++) {
			int sum=0;
			do {
				a = (int)(Math.random()*6);
				sum += a;
				System.out.print(a+" ");
				
			} 
			while (a!=0);
			System.out.println();
			System.out.println("The sum = "+sum);
		}
		
		
	}

}
