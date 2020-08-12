import java.util.Scanner;
public class TestVar12{
	public static void main(String[] args){
		//键盘录入学生信息：年龄、身高、姓名、性别
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入年龄");
		int age =sc.nextInt();
		
		System.out.println("请输入身高");
		double height=sc.nextDouble();
		
		System.out.println("请输入姓名");
		String name=sc.next();
		
		System.out.println("请输入性别");
		String sexStr=sc.next();
		char sex=sexStr.charAt(0);
		//上面两句可以合成一句话：char sex=sc.next().charAT(0);
		
		System.out.println("该学生的信息为：姓名是："+name+",年龄是:"+age
		+"，身高是："+height+"性别是:"+sex);
	}
}