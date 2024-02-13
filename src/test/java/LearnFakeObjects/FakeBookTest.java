package LearnFakeObjects;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.mockito.Mockito;

public class FakeBookTest {
	
	@Test
	public void test() {

		// BookRepository fakeRepo = new FakeBookRepository();
		BookService mockBookSer= Mockito.mock(BookService.class);
		// BookService bookSer = new BookService(fakeRepo);
		mockBookSer.addBook(new Book("234", "Learn Mockito From Scratch"));
		mockBookSer.addBook(new Book("12", "Learn Junit From Scratch"));
		mockBookSer.addBook(new Book("45", "Learn Mockito with Junit"));


		assertEquals(0, mockBookSer.noOfBook());

	}

}
