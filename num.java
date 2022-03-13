package 第一次作業;
import java.util.*;
public class num {

	public static void main(String[] args) {
		try (// TODO 自動產生的方法 Stub
		Scanner in = new Scanner(System.in)) {
		System.out.print("輸入一個數");
		int a1 = in.nextInt();
				int b2 =1;int c3 = 1;
		for (int i=1;a1>0;i++) {
			for (int j=b2;j<=c3;j++) {
				System.out.print(j+" ");
				a1--;
				if (a1==0) break;
			}
			b2=c3+1;c3=c3+i+1;
			if (a1==0)break;
			System.out.print("\n");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}


}