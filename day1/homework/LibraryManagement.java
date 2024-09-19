package day1.homework;

public class LibraryManagement {
		public static void main(String[] args) {
			Library l = new Library();
			String title = l.addBook("The Kite Runner");
			System.out.println("Book title:" +title);
			l.issueBook();
			
		
	}

}
