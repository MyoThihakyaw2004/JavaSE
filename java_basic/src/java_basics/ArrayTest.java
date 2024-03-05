package java_basics;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 3D Array
		int[][][] saleRecord = {
				{// Yangon
					{
						80, // laptop
						120, // phone
						300 // powerbank
					}, // Dec
					{100, 200, 500}, // Apr
					{60, 157, 660} // Aug
				}, 
				{// Mandalay
					{50, 90, 220}, 
					{90, 130, 330}, 
					{70, 110, 223}
				}};
		
		// Yangon, Aug, Phone
		System.out.println("Yangon, Aug, Phone = "+saleRecord[0][2][1]);
		
		// Mandalay, Dec, Powerbank
		System.out.println("Mandalay, Dec, Powerbank = "+ saleRecord[1][0][2]);
		
//		// 2D declare
//		int[][] marks = new int[3][4];
//		
//		// MgMg Data
//		marks[0][0] = 170;
//		marks[0][1] = 150;
//		marks[0][2] = 180;
//		marks[0][3] = 170;
//		
//		// MaSapal Data
//		marks[1][0] = 140;
//		marks[1][1] = 190;
//		marks[1][2] = 180;
//		marks[1][3] = 150;
//		
//		// YeYe Data
//		marks[2][0] = 160;
//		marks[2][1] = 170;
//		marks[2][2] = 200;
//		marks[2][3] = 180;
//		
//		int[][] marks = /*new int[][]*/{{170, 150, 180, 170}, {140, 190, 180, 150}, {160, 170, 200, 190}};
//		
//		// MgMg Science
//		System.out.println("MgMg's science mark = " + marks[0][3]);
//		System.out.println("MaSapal's languageArt mark = " + marks[1][2]);
//		System.out.println("YeYe's Maths mark = "+ marks[2][0]);
		
		// Declare
//		int[] marks = new int[6];
//		
//		
//		marks[0] = 70;
//		marks[1] = 90;
//		marks[2] = 100;
//		marks[3] = 67;
//		marks[4] = 88;
//		marks[5] = 99;
		
		// Initialize
//		int[] marks = {70, 90, 100, 67, 88, 99};
//		int[] marks = new int[]{70, 90, 100, 67, 88, 99};
//		
//		System.out.println(marks);
//		System.out.println("array size : "+ marks.length);
//		System.out.println("index - 0 = "+marks[0]);
//		System.out.println("index - 0 = "+marks[1]);
//		System.out.println("index - 0 = "+marks[2]);
//		System.out.println("index - 0 = "+marks[3]);
//		System.out.println("index - 0 = "+marks[4]);
//		System.out.println("index - 0 = "+marks[5]);

	}

}
