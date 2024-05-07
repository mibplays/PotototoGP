package defpack01;

public class StockableProduct extends Product implements Stockable{
	private int numberOfItemsStocked;
	int num;
	
	public StockableProduct(String name,int productId,double price,String genre,int yearPublished,double discount,int numberOfItemsStocked) {
		super(name,productId,price,genre,yearPublished,discount);
		this.numberOfItemsStocked=numberOfItemsStocked;
	}

	@Override
	public void addStock(int num) {
		numberOfItemsStocked+=num;
		System.out.println(numberOfItemsStocked);
		
	}

	@Override
	public void removeStock(int num) {
		numberOfItemsStocked-=num;
		System.out.println(numberOfItemsStocked);
		
	}

	@Override
	public void editStock(int num) {
		numberOfItemsStocked=num;
		System.out.println(numberOfItemsStocked);
		
	}

	@Override
	String getInfo() {
		
	    	String s = "Francis Ford Coppola The Godfather,BracU>Nsu,Francis Ford Coppola Gigachad Gerald,Francis Ford Coppola Heavy Hampter,Mason";
	    	String line = "Francis Ford Coppola";
	    	String p = "";
	    	
	    	//if(s.contains(line) ) {
	    		//String[] values = s.split(",");
	    		//for(String x : values) {
	    			//System.out.println(x);
	    		//}
	    	 String[] values = s.split(",");
	    	 for(int i=0;i<values.length;i++) { 
	    	        if (values[i].contains(line)) {
	    	        	p+=values[i];
	    	        	p+="\n";
	    	        	//System.out.println(x);
	    	            
	    	        }
	    	    
	    	    
	    	 }
	    	 p=p.replace(line, "");
	    	
	    	return p;
	    }
	public String toString() {
		return super.toString()+"\nnumberofItemsStocked:"+numberOfItemsStocked;
	}
	}


