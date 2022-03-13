package test1;

public class 判斷質數 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int a =97;
		boolean a1 = false;	
		for (int j=2 ; j<a ;j++ ) {
			
		}
		
		for (int i=2;i<a;i++) {
			if (a % i==0){				
				System.out.print("非質數");
				a1 = true;
				break;
			}
		if (a1==false) {
				System.out.print("質數");
				break;
			}	
		}
	}

}
