package class11;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		// creating 2D array;

		int[][] d = new int[3][4];// 3*4=12 elements
		// 1 row
		d[0][0] = 12;
		d[0][1] = 13;
		d[0][2] = 14;
		d[0][3] = 15;
		// 2 row
		d[1][0] = 1;
		d[1][1] = 2;
		d[1][2] = 3;
		d[1][3] = 4;
		// 3 row
		d[2][0] = 5;
		d[2][1] = 10;
		d[2][2] = 15;
		d[2][3] = 20;

		System.out.println(d[1][2]);// 3
		System.out.println(d[2][3]);// 20

		int[][] c = { 
				{ 12, 13, 14, 15 }, 
				{ 1, 2, 3, 4 }, 
				{ 5, 10, 15, 20 }, 
				{ 100, 200, 300, 400 } 
		};
		
		
		System.out.println(c[3][1]);//200
		System.out.println(c[0][0]);//12
		
		String[][] groups= {
                {"Andrei","Artem","Julia","Zoya"},
                {"Bilal","Shaban","Asmit","Sasha","Olga","Moe"},
                };
		
		System.out.println(groups[0][1]);
		
		System.out.println(groups[0][1]+" "+groups[1][2]);

		


		
		
		
		
		
		
		
		
		
		

	}
}
