package 第一次作業;
import java.util.Arrays;
public class 樂透 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int ran[] = new int[6];{
			  for(int i=0;i<6;i++){
			   ran[i]=(int) Math.floor(Math.random()*49+1);   
			   for(int j=0;j<i;j++){//檢查有無重覆
			    if(ran[i]==ran[j]){//有重覆重抽一次
			     i--;
			     break;
			    }   
			   }   
			  }
			  int b[] = Arrays.copyOf(ran, ran.length);
			  Arrays.sort(ran);
			  for(int x=0;x<6;x++){
			   System.out.print(ran[x]+" ");
			  }
			 }
}
}





