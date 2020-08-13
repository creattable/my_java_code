public class TestArrayMax{
	public static void main(String[] args){
		int[] arr={12,33,5,2,6,12,1};
		/*
		int maxNum=arr[0];
		for (int i=0;i<arr.length;i++){
			if(arr[i]>maxNum){
				maxNum=arr[i];
			}
		}
		*/
		
		
		
		
		int num=getMaxNum(arr);
		System.out.println("最大数为："+num);

		
		
	}
	
	public static int getMaxNum(int[] arr){
		int maxNum=arr[0];
		for (int i=0;i<arr.length;i++){
			if(arr[i]>maxNum){
				maxNum=arr[i];
			}
		}
		return maxNum;
	}
	
}