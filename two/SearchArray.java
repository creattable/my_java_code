public class SearchArray{
	public static void main(String[] args){
		
		int[] arr={12,124,12,51,2,3};
		
		/*
		int index=-1;//�����Ҫ��������±�ֵ
		for(int i=0;i<arr.length;i++){
			if (arr[i]==2){
				index=i;
				break;//�ҵ���ֹͣ���������������ͬ��Ԫ��
			}
		}
		System.out.println("Ԫ�ض�Ӧ��������"+index);
		*/
		int index=getIndex(arr,3);
		
		if (index!=-1){
			System.out.println("Ԫ�ض�Ӧ��������"+index);
		}else{
			System.out.println("û�ҵ�");
		}
		
		
		
	}
	public static int getIndex(int[] arr,int ele){
				int index=-1;//�����Ҫ��������±�ֵ
		for(int i=0;i<arr.length;i++){
			if (arr[i]==2){
				index=i;
				break;//�ҵ���ֹͣ���������������ͬ��Ԫ��
			}
		}
		return index;
	}
	
}