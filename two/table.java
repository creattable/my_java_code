import java.util.*;
public class table{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("����������");
		
		if (sc.hasNextInt()==true){
			int age=sc.nextInt();

			if (age>0){
				if (age>7){
					System.out.println("������");
				}else if (age>5){
					System.out.println("�������Ա�");
					String str=sc.next();
					char sex=str.charAt(0);
					if(sex=='��'){
						System.out.println("Ҳ����");
					}else{
						System.out.println("�㻹̫С��");
					}
					
				}else{
					System.out.println("�㻹̫С��");
				}
				
				
			}else{
				System.out.println("����Ϊ������Ϊ0");
			}
		}else{
			System.out.println("���䲻������");
		}
		
		
	}
}