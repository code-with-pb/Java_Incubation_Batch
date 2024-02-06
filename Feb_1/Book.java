
public class Book {
	int bid;
	String nm;
	double price;
	int numofpage;
	void dis() {
		System.out.println(bid+"\t"+nm+"\t"+price+"\t"+numofpage);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		b.bid = 123;
		b.nm = "Akash Kengar";
		b.price = 10000;
		b.numofpage = 200;
		
		b.dis();
		
		Book b1 = new Book();
		b1.bid = 321;
		b1.nm = "Akash Pawar";
		b1.price = 400000;
		b1.numofpage = 800;
		
		b1.dis();
	}

}
