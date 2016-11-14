package squares;
/*
利用データ ： x = {0.0,0.2,0.4,0.6,0.8,1.0,1.2}
		 y = {1.2,4.6,5.9,7.5,10.9,12.3,13.6}
実行結果 ： 999 : theta[0] = 1.8285714285714323
　　　　         999 : theta[1] = 10.28571428571428
　　　　　　    999 : Objective function = 1.1142857142857134
Excelで求めた近似直線 ： y=2.0571x-0.2286
*/
public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[] = {0.0,0.2,0.4,0.6,0.8,1.0,1.2};
		double y[] = {1.2,4.6,5.9,7.5,10.9,12.3,13.6};
		double theta[] = new double[2];
		Squares_lib slib = new Squares_lib(x,y);
		for(int i = 0; i < 1000; i++){
			theta = slib.getDx();
			System.out.println(i+" : theta[0] = "+theta[0]);
			System.out.println(i+" : theta[1] = "+theta[1]);
			System.out.println(i+" : Objective function = "+slib.getRx());
		}
	}

}
