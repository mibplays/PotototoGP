package defpack01;

public class Main {

	public static void main(String[] args) {
		/*
		 * Product p = new Product(); String s; s = p.getInfo(); System.out.println(s);
		 * String k; k = p.getInfo2(); System.out.println(k);
		 */
		
		Game g = new Game("Apex",001,59.99,"BattleRoyale",2019,10.5,70,"respawn");
		g.addStock(5);
		g.removeStock(2);
		//g.editStock(10);
		String s1 = g.toString();
		System.out.println(s1);
		Music m = new Music("aimyon3636",001,5.99,"idk",2023,5.7,30,"Aimyon");
		m.addStock(2);
		m.removeStock(1);
		String s2 = m.toString();
		System.out.println(s2);
		Invoice i = new Invoice();
		System.out.println(i.getLocalDateTime());
		//Product p = new Product();
		Invoice i2 = new Invoice();
		i2.addProduct(g);
		System.out.println(g.toString());
		
		
				

	}

}
