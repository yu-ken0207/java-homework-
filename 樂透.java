package �Ĥ@���@�~;
import java.util.Arrays;
public class �ֳz {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		int ran[] = new int[6];{
			  for(int i=0;i<6;i++){
			   ran[i]=(int) Math.floor(Math.random()*49+1);   
			   for(int j=0;j<i;j++){//�ˬd���L����
			    if(ran[i]==ran[j]){//�����Э���@��
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





