package 第一次作業;
import java.util.*;
public class 終極密碼遊戲 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
			Scanner sc= new Scanner(System.in);
			int a ;
			int lowest = 1;
			int highest = 100;
			int i=(int)(Math.random()*100); 
			System.out.print(i);

			while (true) {
				System.out.print("輸入一個"+lowest+"~"+highest+"的數:");
				a = sc.nextInt();
				if (a == i ) {
					System.out.print("答對了");
					break;
				}				
				if (a <= i ) {
					lowest = a;			
				}
				if (a >= i ) {
					highest = a;
				}
			}
	}

}
