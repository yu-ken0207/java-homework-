package 第一次作業;

public class tt99_1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int i,j=1;int st1=1,st2=3;
		for (i=1;i<=9;i++) {
			for (j=st1;j<=st2;j++) {
				System.out.print(Integer.toString(j)+"*"+Integer.toString(i)+"="+i*j+"\t");
				if ((j%3==0)&&(i==9)&&(j<=7)) {
					st1 = st2+1;st2 += 3;
					System.out.println("\n");
					i=1;
					}
			}
			System.out.println("");
			
		}
	}

}
