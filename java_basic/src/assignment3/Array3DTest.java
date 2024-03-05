package assignment3;

public class Array3DTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestObject objectTables[][][] = new TestObject[3][3][3];
		
		for (int i = 0; i < objectTables.length; i++) {
			for (int j = 0; j < objectTables[i].length; j++) {
				for (int k = 0; k < objectTables[j].length; k++) {
					objectTables[i][j][k] = new TestObject(i, j, k);
				}
			}
		}
		
		for (TestObject[][] table : objectTables) {
			for (TestObject[] row : table) {
				for (TestObject column : row) {
					column.info();
				}
			}
		}
	}

}
