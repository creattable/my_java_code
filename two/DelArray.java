import java.util.*;
public class DelArray{
	public static void main(String[] args){
		int[] arr={12,34,56,1,3};

		System.out.println("ɾ��ǰ������"+Arrays.toString(arr));
		
		
		int index=-1;

		for (int i=0;i<arr.length;i++){
			if(arr[i]==3){
				index=i;
				break;
			}
		}
		
		
		if(index!=-1){
			for (int i=index;i<=arr.length-2;i++){
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=0;
		}else{
			System.out.println("ɾ����");
		}
		
		
		

		
		System.out.println("ɾ���������"+Arrays.toString(arr));
		
	}
}