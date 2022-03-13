package 第一次作業;
import java.util.*;
public class 阿姆斯壯數 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
			Scanner in = new Scanner(System.in); {
			System.out.print("輸入一個數");
			int a1 = in.nextInt();
			int a2=(a1-a1/100*100)/10;
			int a3=a1/100;
			int a4=a1-a1/10*10;
			double n =Math.pow(a3,3)+Math.pow(a2,3)+Math.pow(a4,3);
			if (a1==n) {
				System.out.println("True");
			}
			else {
				System.out.println("False");}
			
			
			
}
	}

}
