package LearnFakeObjects;

public class Book {
	
		private String bookId;
		private String bookTitle;
		
		
		public Book(String bookId, String bookTitle) {
			
			this.bookId = bookId;
			this.bookTitle = bookTitle;
		}
		
		public String getBookId() {
			return bookId;
		}
		public void setBookId(String bookId) {
			this.bookId = bookId;
		}
		public String getBookTitle() {
			return bookTitle;
		}
		public void setBookTitle(String bookTitle) {
			this.bookTitle = bookTitle;
		}
		
}
