

public class CopyBook {
	private Store store;
	
	public CopyBook() {
		store = Store.getStore();
	}
	
	
	public Book cloneBook(String id) {
		if(store.getBooks().containsKey(id)) {
			Book proBook = (Book)store.getBooks().get(id);
			return (Book) proBook.clone();
		}
		return null;
		
	}
	
	public Book cloneBook(Book book) {
		Book proBook = book;
		return (Book) proBook.clone();
	}
}
