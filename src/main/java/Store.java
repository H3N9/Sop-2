

import java.util.Hashtable;

public class Store {
	public String name;
	private Hashtable<String, Book> books = new Hashtable<String, Book>();
	private static Store store;
	
	private Store(String name) {
		this.name = name;
		this.books = new Hashtable<String, Book>();
	}
	
	
	public Book cloneBook(String name) {
		if(books.containsKey(name)) {
			Book proBook = books.get(name);
			return (Book) proBook.clone();
		}
		return null;
		
	}
	
	public static Store getStore(String name) {
		if (store == null) {
			store = new Store(name);
		}
		return store;
	}
	public static Store getStore() {
		if (store == null) {
			store = new Store("youngNo");
		}
		return store;
	}
	
	public void setBook(Book book) {
		books.put(book.getId(), book);
	}
	
	public int size() {
		return books.size();
	}
	
	public Book getBook(String title){
		if(books.containsKey(title)) {
			Book book = books.get(title);
			books.remove(title);
			return book;
		}
		System.out.println("Have not a book.");
		return null;		
		
		
	}
	
	public Hashtable<String, Book> getBooks() {
		return books;
	}
	
	public String toString() {
		return books.toString();
	}
	
}
