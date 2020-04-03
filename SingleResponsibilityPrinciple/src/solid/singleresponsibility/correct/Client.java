package solid.singleresponsibility.correct;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {

	Book book =new Book();
	book.setTitle("The Lord of the Rings" );
	book.setVersion(1);
	
	List<Author> authors=new ArrayList<Author>();
	
	Author author1=new Author();
	author1.setName("J.R.R. Tolkien");
	author1.setGender(Gender.MALE);
	author1.setEmail("JTolkien@yahoo.com");
	authors.add(author1);
	
	Author author2=new Author();
	author2.setName("Jane Austen");
	author2.setGender(Gender.FEMALE);
	author2.setEmail("JAusten@yahoo.com");
	authors.add(author2);
	
	book.setAuthors(authors);
	
	System.out.println(book.getAuthors());
	
	}

}
