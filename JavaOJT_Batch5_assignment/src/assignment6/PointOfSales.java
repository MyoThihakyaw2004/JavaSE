package assignment6;

public class PointOfSales {
	
static class Transaction{
	private Items[] items;
	private Integer itemCount;
	



public  Transaction(int maxItems) {
    this.items = new Items[maxItems];
    this.itemCount = 0;
    
}
public void addItems(String ItemsName, Integer itemCount) {
	System.out.println(ItemsName+"is"+itemCount+"Add");
}
public Items[] getItems() {
	return items;
}
public void setItems(Items[] items) {
	this.items = items;
}
public Integer getItemCount() {
	return itemCount;
}
public void setItemCount(Integer itemCount) {
	this.itemCount = itemCount;
}


}		
	
}
