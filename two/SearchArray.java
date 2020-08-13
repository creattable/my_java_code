public class SearchArray{
	public static void main(String[] args){
		
		int[] arr={12,124,12,51,2,3};
		
		/*
		int index=-1;//这个不要是数组的下标值
		for(int i=0;i<arr.length;i++){
			if (arr[i]==2){
				index=i;
				break;//找到就停止、如果出现两个相同的元素
			}
		}
		System.out.println("元素对应的索引："+index);
		*/
		int index=getIndex(arr,3);
		
		if (index!=-1){
			System.out.println("元素对应的索引："+index);
		}else{
			System.out.println("没找到");
		}
		
		
		
	}
	public static int getIndex(int[] arr,int ele){
				int index=-1;//这个不要是数组的下标值
		for(int i=0;i<arr.length;i++){
			if (arr[i]==2){
				index=i;
				break;//找到就停止、如果出现两个相同的元素
			}
		}
		return index;
	}
	
}