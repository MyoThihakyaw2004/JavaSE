package assignment3;

public class Create3DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int saleRecord[][][]=new int[3][3][3];
		//yangon's saleRecord
		saleRecord[0][0][0]= 180;
		saleRecord[0][1][1]=200;
		saleRecord[0][2][2]=140;
		//mandalay's saleRecord
		saleRecord[1][0][0]=180;
		saleRecord[1][1][1]=250;
		saleRecord[1][2][2]=160;
		//TaungGyi's saleRecord
		saleRecord[2][0][0]=130;
		saleRecord[2][1][1]=150;
		saleRecord[2][2][2]=170;
		System.out.println("Yangon Brach's saleRecord :"+saleRecord[0][0][0]);
		
	}

}
