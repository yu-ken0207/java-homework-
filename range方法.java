package 第一次作業;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class range方法 {

	public static void range(int n) {
		int all[]= new int[n];
		for (int i=0;i<n;i++) 
			all[i]=i;
		System.out.print(Arrays.toString(all));		
		System.out.println();	
	}
	public static void range(int n,int n1) {
		int all[]= new int[n1-n+1];
		for (int i=n;i<n1;i++) 
			all[i]=i;
		System.out.print(Arrays.toString(all));	
		System.out.println();	
		
	}
	public static void range(int n,int n1,int n2) {
		
		ArrayList a1 = new ArrayList();
			for (int i=n;i<n1;i=i+n2) 
				a1.add(i);
				
			System.out.print(a1);	
			
			
			
			
		}
			
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		range(10);
		range(1,8);
		range(5,15,2);
		
		
	}

}
