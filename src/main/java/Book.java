

public abstract class Book implements Cloneable{
	private String author;
	private String title;
	protected String type;
	
	
	public Book(String name, String author) {
		this.title = name;
		this.author = author;
	}
	
	
	
	public Object clone() {
		Object clone = null;
	      
	      try {
	         clone = super.clone();
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      
	      return clone;
	  }




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getAuthor() {
		return author;
	}




	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return this.title;
	}
	
	public abstract String getType();
	
}
