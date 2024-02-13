package LearnFakeObjects;

import java.util.Collection;

public interface BookRepository {
	
	void save(Book book);
	
	Collection<Book>bookCount();
	
	

}