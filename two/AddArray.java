public class AddArray{
	public static void main(String[] args){
		
		int[] arr={12,34,56,77,3,10};
		
		
		System.out.print("����ǰ������");
		for(int i=0;i<arr.length;i++){
			if(i!=arr.length-1){
				System.out.print(arr[i]+",");
			}else{
				System.out.print(arr[i]);
			}
		}	
			
		

		//����Ԫ��;
		/*
		arr[5]=arr[4];
		arr[4]=arr[3];
		arr[3]=arr[2];
		arr[2]=91;
		*/
		
		
		/*
		int index=2;//�����λ�����Ԫ��
		for(int i=arr.length-1;i>=(index+1);i--){
			arr[i]=arr[i-1];
		}
		arr[index]=91;
		*/
		insertEle(arr,1,888);
		
			
			
		System.out.print("���Ӻ������");
		for(int i=0;i<arr.length;i++){
			if(i!=arr.length-1){
				System.out.print(arr[i]+",");
			}else{
				System.out.print(arr[i]);
			}
		}	
			

		
		
	}
	public static void insertEle(int[] arr,int index,int ele){
		for(int i=arr.length-1;i>=(index+1);i--){
			arr[i]=arr[i-1];
		}
		arr[index]=ele;
	}
	
	
}