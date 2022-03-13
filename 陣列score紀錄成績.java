package 第一次作業;

public class 陣列score紀錄成績 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		int[] score = {80,65,40,90,25,100,86,72,28,56,85,95,78,82,74,88};
		String a1="";
		int n1=0;int n2=9;
		
		
		for (int j=0;j<=9;j++) {
			for (int i=0;i<=score.length-1;i++) {
				
				if (score[i]>=n1 && score[i] <= n2) {
					a1 +="*";
				}
				
				}
			System.out.println(n1+"-"+n2+":"+a1);
			n1+=10;n2+=10;
			a1="";
		}
			
		for (int i=0;i<=score.length-1;i++) {
			if (score[i]>=100) {
				a1 +="*";
			}
			}
		System.out.println("100:"+a1);
		
		
		
		
		
		
		
	}

}
