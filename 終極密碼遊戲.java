package �Ĥ@���@�~;
import java.util.*;
public class �׷��K�X�C�� {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
			Scanner sc= new Scanner(System.in);
			int a ;
			int lowest = 1;
			int highest = 100;
			int i=(int)(Math.random()*100); 
			System.out.print(i);

			while (true) {
				System.out.print("��J�@��"+lowest+"~"+highest+"����:");
				a = sc.nextInt();
				if (a == i ) {
					System.out.print("����F");
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
