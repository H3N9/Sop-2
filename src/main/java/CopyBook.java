

public class CopyBook {
	private Store store;
	
	public CopyBook() {
		store = Store.getStore();
	}
	
	
	public Book cloneBook(String name) {
		if(store.getBooks().containsKey(name)) {
			Book proBook = (Book)store.getBooks().get(name);
			return (Book) proBook.clone();
		}
		return null;
		
	}
	
	public Book cloneBook(Book book) {
		Book proBook = book;
		return (Book) proBook.clone();
	}
}
