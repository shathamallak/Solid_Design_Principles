package solid.singleresponsibility.wrong;


public class Client {
	
	
	public static void main(String[] args) {
	Book book =new Book();
	book.setTitle("The Lord of the Rings" );
	book.setVersion(1);
	
	
	book.setAuthor1Name("J.R.R. Tolkien");
	book.setAuthor1Gender(Gender.MALE);
	book.setAuthor1Email("JTolkien@yahoo.com");
	
	
	book.setAuthor2Name("Jane Austen");
	book.setAuthor2Gender(Gender.FEMALE);
	book.setAuthor2Email("JAusten@yahoo.com");
	
	
	
	
	
	}

}
