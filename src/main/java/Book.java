

public abstract class Book{
	protected String author;
	private String id;
	protected String title;
	private static int count=0;
	protected String type;
	
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.id = (++count)+"";
	}
	
	
	
	public abstract Book clone();
		/*
		Object clone = null;
	      
	      try {
	         clone = super.clone();
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      
	      return clone;
	      */




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getAuthor() {
		return author;
	}
	
	public String getId() {
		return this.id;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return this.title;
	}
	
	public String info() {
		return "id: "+this.id+"\ntype: "+this.type+"\ntitle: "+this.title+"\nauthor: "+this.author;
	}
	
	public abstract String getType();
	
}
