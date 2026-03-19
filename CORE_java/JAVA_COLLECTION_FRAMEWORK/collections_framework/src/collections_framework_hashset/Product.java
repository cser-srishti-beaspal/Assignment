package collections_framework_hashset;

public class Product {
	int id;
	String branch;
	String item;
	double price;
	public Product(int id, String branch, String item, double price) {
		
		this.id = id;
		this.branch = branch;
		this.item = item;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", branch=" + branch + ", item=" + item + ", price=" + price + "]";
	}
	
	

}
