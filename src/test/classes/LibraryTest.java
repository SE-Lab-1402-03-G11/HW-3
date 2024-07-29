package test.classes;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import main.classes.*;

public class LibraryTest { 

	@Test
	public void testStudentShouldNotHaveTheBookAfterReturningIt() {
		Library library = new Library();

		Book book1 = new Book("Book-1", "Author-1", 10);
		library.addBook(book1);

		Student student1 = new Student("Alice", 10);
		library.addStudent(student1);

		library.lendBook(book1, student1);
		library.returnBook(book1, student1);

		assertFalse(student1.hasBook(book1));
	}

	@Test
	public void testStudentShouldRegisterBeforeLendingABook() {
		Library library = new Library();

		Book book1 = new Book("Book-1", "Author-1", 10);
		library.addBook(book1);

		Student student1 = new Student("Alice", 10);

		assertFalse(library.lendBook(book1, student1));
	}
} 
