public class TestVar06{
	public static void main(String[] args){
		//浮点常量的两种形式
		//十进制形式
		double num1=3.14;
		System.out.println(num1);
		
		//科学计数法形式;
		double num2=314E-2;
		System.out.println(num2);
		
		//浮点类型的变量
		//注意、浮点类型是double类型的，
		//想要将一个double类型的数赋值给float类型
		//必须在后面加上F或者f
		
		float f1=3.14123456789F;
		System.out.println(f1);
		
		//double类后面可以加上D或d、但一般不写
		double d1=3.123456789123456;
		System.out.println(d1);
		
		
		//一般情况下最好不要进行浮点类型的比较
		float f2=0.3F;
		double d2=0.3;
		System.out.println(f2==d2);
		//ture或者false
		
		
	}
}