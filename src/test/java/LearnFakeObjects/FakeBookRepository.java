package LearnFakeObjects;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepository implements BookRepository{
	Map<String,Book> bookData=new HashMap<String,Book>();	
	public void save(Book book) {		
		bookData.put(book.getBookId(), book);
	}
	public Collection<Book> bookCount() {		
		return bookData.values();
	}
}