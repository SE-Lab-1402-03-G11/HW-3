package test.classes;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.Test;

import main.classes.*;

public class LibraryTest {

	@Test
	public void testSearchStudents_return_null() throws Exception{
		Student student1 = new Student("John Doe", 1);
		Student student2 = new Student("Mahdi Q", 2);
		Library libray = new Library();
		libray.addStudent(student1);
		libray.addStudent(student2);

		ArrayList<Object> key_name = new ArrayList<Object>();
		key_name.add("John Do");

		ArrayList<Object> key_id = new ArrayList<Object>();
		key_id.add(3);

		ArrayList<Student> students = libray.searchStudents(SearchByType.NAME, key_name);
		assertEquals(null, students);

		students = libray.searchStudents(SearchByType.ID, key_id);
		assertEquals(null, students);
	}
	
	@Test
	public void testSearchStudents_search_by_name() throws Exception{
		Student student1 = new Student("John Doe", 1);
		Student student2 = new Student("Mahdi Q", 2);
		Library libray = new Library();
		libray.addStudent(student1);
		libray.addStudent(student2);

		ArrayList<Object> key_name = new ArrayList<Object>();
		key_name.add("John Doe");

		ArrayList<Student> students = libray.searchStudents(SearchByType.NAME, key_name);
		assertEquals(1, students.size());
		assertEquals(student1, students.get(0));

		key_name.add("Mahdi Q");
		students = libray.searchStudents(SearchByType.NAME, key_name);
		assertEquals(2, students.size());

		key_name.add("Ali");
		students = libray.searchStudents(SearchByType.NAME, key_name);
		assertEquals(2, students.size());
	}

	@Test
	public void testSearchStudents_search_by_id() throws Exception{
		Student student1 = new Student("John Doe", 1);
		Student student2 = new Student("Mahdi Q", 2);
		Library libray = new Library();
		libray.addStudent(student1);
		libray.addStudent(student2);

		ArrayList<Object> key_id = new ArrayList<Object>();
		key_id.add(1);

		ArrayList<Student> students = libray.searchStudents(SearchByType.ID, key_id);
		assertEquals(1, students.size());
		assertEquals(student1, students.get(0));

		key_id.add(2);
		students = libray.searchStudents(SearchByType.ID, key_id);
		assertEquals(2, students.size());

		key_id.add(3);
		students = libray.searchStudents(SearchByType.ID, key_id);
		assertEquals(2, students.size());
	}

	@Test
	public void testSearchStudents_handle_name_duplicates() throws Exception{
		Student student1 = new Student("John Doe", 1);
		Student student2 = new Student("John Doe", 2);
		Library libray = new Library();
		libray.addStudent(student1);
		libray.addStudent(student2);

		ArrayList<Object> key_name = new ArrayList<Object>();
		key_name.add("John Doe");

		ArrayList<Student> students = libray.searchStudents(SearchByType.NAME, key_name);
		assertEquals(2, students.size());
	}

	@Test
	public void testSearchStudents_hanle_id_duplicate() throws Exception{
		Student student1 = new Student("John Doe", 1);
		Student student2 = new Student("Mahdi Q", 1);
		Library libray = new Library();
		libray.addStudent(student1);
		libray.addStudent(student2);

		ArrayList<Object> key_id = new ArrayList<Object>();
		key_id.add(1);

		ArrayList<Student> students = libray.searchStudents(SearchByType.ID, key_id);
		assertEquals(2, students.size());
	}

	@Test
	public void testSearchBooks_return_null1() {
		Library libray = new Library();
        libray.addBook(new Book("Harry Potter: The Philosopher's Stone", "J.K. Rowling", 1));
        libray.addBook(new Book("Harry Potter: The Chamber of Secrets", "J.K. Rowling", 2));
        libray.addBook(new Book("Harry Potter: The Prisoner of Azkaban", "J.K. Rowling", 3));
        libray.addBook(new Book("Harry Potter: The Goblet of Fire", "J.K. Rowling", 4));
        libray.addBook(new Book("Harry Potter: The Order of the Phoenix", "J.K. Rowling", 5));
        libray.addBook(new Book("Harry Potter: The Half-Blood Prince", "J.K. Rowling", 6));
        libray.addBook(new Book("Harry Potter: The Deathly Hallows", "J.K. Rowling", 7));

		ArrayList<Object> key_title = new ArrayList<Object>();
		key_title.add("Harry Potter");
		ArrayList<Object> key_author = new ArrayList<Object>();
		key_author.add("J.K.");
		ArrayList<Object> key_id = new ArrayList<Object>();
		key_id.add(0);

		ArrayList<Book> books = libray.searchBooks(SearchByType.TITLE, key_title);
		assertEquals(null, books);

		books = libray.searchBooks(SearchByType.AUTHOR, key_author);
		assertEquals(null, books);

		books = libray.searchBooks(SearchByType.ID, key_id);
		assertEquals(null, books);
	}

	@Test
	public void testSearchBooks_search_by_title() {
		Library libray = new Library();
		Student student = new Student("John Doe", 1);
		libray.addStudent(student);
		Book book1 = new Book("Harry Potter: The Philosopher's Stone", "J.K. Rowling", 1);
        libray.addBook(book1);

		ArrayList<Object> key = new ArrayList<Object>();
		key.add("Harry Potter: The Philosopher's Stone");
		ArrayList<Book> books = libray.searchBooks(SearchByType.TITLE, key);
		assertEquals(1, books.size());
		assertEquals(book1, books.get(0));


		Book book2 =  new Book("Harry Potter: The Chamber of Secrets", "J.K. Rowling", 2);
        libray.addBook(book2);
		key.add("Harry Potter: The Chamber of Secrets");
		books = libray.searchBooks(SearchByType.TITLE, key);
		assertEquals(2, books.size());
	

		libray.lendBook(book1, student);
		books = libray.searchBooks(SearchByType.TITLE, key);
		assertEquals(1, books.size());
		assertEquals(book2, books.get(0));	
	}

	@Test
	public void testSearchBooks_search_by_author() {
		Library libray = new Library();
		Student student = new Student("John Doe", 1);
		libray.addStudent(student);
		Book book1 = new Book("Harry Potter: The Philosopher's Stone", "J.K. Rowling", 1);
        libray.addBook(book1);

		ArrayList<Object> key = new ArrayList<Object>();
		key.add("J.K. Rowling");
		ArrayList<Book> books = libray.searchBooks(SearchByType.AUTHOR, key);
		assertEquals(1, books.size());
		assertEquals(book1, books.get(0));


		Book book2 =  new Book("Lord of the Rings: The Fellowship of the Ring", "J.R.R. Tolkien", 2);
        libray.addBook(book2);
		key.add("J.R.R. Tolkien");
		books = libray.searchBooks(SearchByType.AUTHOR, key);
		assertEquals(2, books.size());
	

		libray.lendBook(book1, student);
		books = libray.searchBooks(SearchByType.AUTHOR, key);
		assertEquals(1, books.size());
		assertEquals(book2, books.get(0));	
	}

	@Test
	public void testSearchBooks_search_by_id() {
		Library libray = new Library();
		Student student = new Student("John Doe", 1);
		libray.addStudent(student);
		Book book1 = new Book("Harry Potter: The Philosopher's Stone", "J.K. Rowling", 1);
        libray.addBook(book1);

		ArrayList<Object> key = new ArrayList<Object>();
		key.add(1);
		ArrayList<Book> books = libray.searchBooks(SearchByType.ID, key);
		assertEquals(1, books.size());
		assertEquals(book1, books.get(0));


		Book book2 =  new Book("Lord of the Rings: The Fellowship of the Ring", "J.R.R. Tolkien", 2);
        libray.addBook(book2);
		key.add(2);
		books = libray.searchBooks(SearchByType.ID, key);
		assertEquals(2, books.size());
	

		libray.lendBook(book1, student);
		books = libray.searchBooks(SearchByType.ID, key);
		assertEquals(1, books.size());
		assertEquals(book2, books.get(0));	
	}

	@Test
	public void testSearchBooks_handle_title_duplicate() {
		Library libray = new Library();
		Student student = new Student("John Doe", 1);
		libray.addStudent(student);
		Book book1 = new Book("Harry Potter: The Philosopher's Stone", "J.K. Rowling", 1);
        libray.addBook(book1);

		ArrayList<Object> key = new ArrayList<Object>();
		key.add("Harry Potter: The Philosopher's Stone");


		Book book2 =  new Book("Harry Potter: The Philosopher's Stone", "J.K. Rowling", 2);
        libray.addBook(book2);
		ArrayList<Book> books = libray.searchBooks(SearchByType.TITLE, key);
		assertEquals(2, books.size());
	

		libray.lendBook(book1, student);
		books = libray.searchBooks(SearchByType.TITLE, key);
		assertEquals(1, books.size());
		assertEquals(book2, books.get(0));	
	}

	@Test
	public void testSearchBooks_handle_duplicate_author() {
		Library libray = new Library();
		Student student = new Student("John Doe", 1);
		libray.addStudent(student);
		Book book1 = new Book("Harry Potter: The Philosopher's Stone", "J.K. Rowling", 1);
        libray.addBook(book1);

		ArrayList<Object> key = new ArrayList<Object>();
		key.add("J.K. Rowling");


		Book book2 =  new Book("Lord of the Rings: The Fellowship of the Ring", "J.K. Rowling", 2);
        libray.addBook(book2);
		ArrayList<Book> books = libray.searchBooks(SearchByType.AUTHOR, key);
		assertEquals(2, books.size());
	

		libray.lendBook(book1, student);
		books = libray.searchBooks(SearchByType.AUTHOR, key);
		assertEquals(1, books.size());
		assertEquals(book2, books.get(0));
	}

	@Test
	public void testSearchBooks_handle_duplicate_id() {
		Library libray = new Library();
		Student student = new Student("John Doe", 1);
		libray.addStudent(student);
		Book book1 = new Book("Harry Potter: The Philosopher's Stone", "J.K. Rowling", 1);
        libray.addBook(book1);

		ArrayList<Object> key = new ArrayList<Object>();
		key.add(1);


		Book book2 =  new Book("Lord of the Rings: The Fellowship of the Ring", "J.R.R. Tolkien", 1);
		libray.addBook(book2);
		ArrayList<Book> books = libray.searchBooks(SearchByType.ID, key);
		assertEquals(2, books.size());
	

		libray.lendBook(book1, student);
		books = libray.searchBooks(SearchByType.ID, key);
		assertEquals(1, books.size());
		assertEquals(book2, books.get(0));	
	}
}