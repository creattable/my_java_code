public class TestVar10{
	public static void main(String[] args){
		double d=6;//int-->double
		System.out.println(d);
		
		//int i=6.5;//double-->int 会报错
		//int-->double 可以、
		//double-->int 不行
		int i=(int)6.5; //这样才正确、强制类型转换
		System.out.println(i);
		
		
		//在同一个表达式里面、如果有多种类型参与运算
		//整数、浮点、字符、都可以参与、唯独布尔不行
		double d2=12+12L+8.5F+3.14+'a';
		System.out.println(d2);
		
		//注意：对于byte,short,char来说、只要在表数范围中
		//赋值就不需要进行强制转换、直接赋值就行
		byte b=12;//-128~127
		System.out.println(b);
		
		
	}
}