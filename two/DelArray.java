import java.util.*;
public class DelArray{
	public static void main(String[] args){
		int[] arr={12,34,56,1,3};

		System.out.println("删除前的数组"+Arrays.toString(arr));
		
		
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
			System.out.println("删除无");
		}
		
		
		

		
		System.out.println("删除后的数组"+Arrays.toString(arr));
		
	}
}