package assignment3;

public class TestObject {

	int table;
	int row;
	int column;

	TestObject(int table, int row, int column) {
		this.table = table;
		this.row = row;
		this.column = column;
	}

	void info() {
		System.out.printf("This is a test object. Table: %d, Row: %d, Column: %d\n", 
			this.table, this.row, this.column);
	}
}
