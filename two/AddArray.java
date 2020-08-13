public class AddArray{
	public static void main(String[] args){
		
		int[] arr={12,34,56,77,3,10};
		
		
		System.out.print("增加前的数组");
		for(int i=0;i<arr.length;i++){
			if(i!=arr.length-1){
				System.out.print(arr[i]+",");
			}else{
				System.out.print(arr[i]);
			}
		}	
			
		

		//增加元素;
		/*
		arr[5]=arr[4];
		arr[4]=arr[3];
		arr[3]=arr[2];
		arr[2]=91;
		*/
		
		
		/*
		int index=2;//再这个位置添加元素
		for(int i=arr.length-1;i>=(index+1);i--){
			arr[i]=arr[i-1];
		}
		arr[index]=91;
		*/
		insertEle(arr,1,888);
		
			
			
		System.out.print("增加后的数组");
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