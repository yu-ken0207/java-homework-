package �Ĥ@���@�~;
import java.util.*;
public class ���i������ {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
			Scanner in = new Scanner(System.in); {
			System.out.print("��J�@�Ӽ�");
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
