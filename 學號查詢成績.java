package �Ĥ@���@�~;
import java.util.*;
public class �Ǹ��d�ߦ��Z {

	public static void main(String[] args) {
		try (// TODO �۰ʲ��ͪ���k Stub
				Scanner in = new Scanner(System.in)) {
				
				String sno[] = {"s10914010", "s10914011", "s10914012", "s10914013", "s10914014"};
				int score[] = {80, 95, 70, 65, 85};
				String a="";

				while (!(a.equals("quit"))){
					
					System.out.print("�п�J�Ǹ���quit: ");
					a=in.nextLine();
					if ((Arrays.binarySearch(sno,a)) >= 0) {
						System.out.println(score[(Arrays.binarySearch(sno,a))]);}
					else if(a.equals("quit"))
						break;
					else
						System.out.println("�d�L�Ǹ�");
				}
		}
		}
	}
			
		
	


