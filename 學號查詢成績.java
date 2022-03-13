package 第一次作業;
import java.util.*;
public class 學號查詢成績 {

	public static void main(String[] args) {
		try (// TODO 自動產生的方法 Stub
				Scanner in = new Scanner(System.in)) {
				
				String sno[] = {"s10914010", "s10914011", "s10914012", "s10914013", "s10914014"};
				int score[] = {80, 95, 70, 65, 85};
				String a="";

				while (!(a.equals("quit"))){
					
					System.out.print("請輸入學號或quit: ");
					a=in.nextLine();
					if ((Arrays.binarySearch(sno,a)) >= 0) {
						System.out.println(score[(Arrays.binarySearch(sno,a))]);}
					else if(a.equals("quit"))
						break;
					else
						System.out.println("查無學號");
				}
		}
		}
	}
			
		
	


