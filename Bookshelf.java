import textio.TextIO;
import java.util.*; //This is so we can use ArrayList

public class Bookshelf{
	public static void main(String[] args){
		ArrayList<Book> list = new ArrayList<Book>();
		Book apple = new Book("Apple", 1993 );		//book1
		Book ape = new Book ("Ape", 1980);			//book2
		Book bad = new Book ("Bad", 2000);			//book3
		Book hello = new Book ("Hello", 2010);		//book4
		Book orange = new Book ("Orange", 2005);	//book5
		Book red = new Book ("Red", 2008);			//book6
		Book green = new Book ("Green", 2003);		//book7
		Book blue = new Book ("Blue", 1950);		//book8
		Book purple = new Book ("Purple", 2020);	//book9
		Book yellow = new Book ("Yellow", 2001);	//book10
		Book banana = new Book ("Banana", 2000);	//book11
		Book fruit = new Book ("Fruit", 2009);		//book12
		
		list.add(apple);
		list.add(ape);
		list.add(bad);	
		list.add(hello);
		list.add(orange);
		list.add(red);
		list.add(green);
		list.add(blue);
		list.add(purple);
		list.add(yellow);
		list.add(banana);
		list.add(fruit);		
		
		TextIO.putln("This is the output before any sorting.");
		for(int i = 0; i < list.size(); i++){
			TextIO.put(list.get(i).getTitle());	//Get the element from the list (bookshelf) and then get the title
			TextIO.put("\t" + list.get(i).getYearPublication() + "\n" );//get the year published
		}	
		
		TextIO.putln("\nThis is the output after it is sorted by title ascending alphabetically.");
		list.sort(Comparator.comparing(Book::getTitle) );	//This will sort list by the title
		for(int i = 0; i < list.size(); i++){
			TextIO.put(list.get(i).getTitle() );	//Get the element from the list (bookshelf) and then get the title
			TextIO.put("\t" + list.get(i).getYearPublication() + "\n" );//get the year published
		}
		
		TextIO.putln("\nThis is the output after it is sorted by year published ascending numerically.");
		list.sort(Comparator.comparing(Book::getYearPublication) );	//This will sort list by the title
		for(int i = 0; i < list.size(); i++){
			TextIO.put(list.get(i).getTitle() );	//Get the element from the list (bookshelf) and then get the title
			TextIO.put("\t" + list.get(i).getYearPublication() + "\n" );//get the year published
		}		
		
	}

}//end of Bookshelf class