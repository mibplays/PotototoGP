package defpack01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Invoice {
	private ArrayList<Product> items = new ArrayList<>();
	private LocalDateTime date;
	Product p;
	//Invoice i = new Invoice();
	
	public Invoice() {
		
	}

public String getLocalDateTime() {
		date = LocalDateTime.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return date.format(f);
	}

public void addProduct(Product p) {
	items.add(p);
	items.remove(p);
	
}
	
	
	
}
