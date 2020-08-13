public class TestDiamond{
	public static void main(String[] args){
		/*菱形
		*
	   ***
	  *****
	 *******
	  *****
	   ***
	    *
		*/
		//上三角
		for (int j=1;j<=4;j++){
			for (int i=1;i<=(9-j);i++){//i控制空格个数
				System.out.print(" ");
			}
			
			for (int i=1;i<=(2*j-1);i++){//i控制*的个数
				System.out.print("*");
			}
			
			//换行
			System.out.println();
		}
		
		//下三角
		for (int j=1;j<=3;j++){
			for (int i=1;i<=(j+5);i++){//空格
				System.out.print(" ");
			}
			
			for (int i=1;i<=(7-2*j);i++){//*
				System.out.print("*");
			}
			//换行
			System.out.println();
			
		}

	}
}