
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    // 5
    Library library = new Library();
    ArrayList<Book> childrensBooks = library.getChildrensBooks();

    // 6 - 7
    String authorToFind = "L. Frank Baum";
    for (Book book : childrensBooks)
    {
      if (book.getAuthor().equals(authorToFind))
      {
        System.out.println(authorToFind + "'s book: " + book.getTitle());
      }
    }

    System.out.println();

    // 8 - 10
    String bookToFind = "Sky Island";
    double minimumRating = 0.0;
    for (Book book : childrensBooks)
    {
      if (book.getTitle().equals(bookToFind))
      {
        minimumRating = book.getRating();
      }
    }

    System.out.println("Rating of " + bookToFind + ": " + minimumRating);
    
    System.out.println();

    // 11
    for (Book book : childrensBooks)
    {
      if (book.getRating() >= minimumRating)
      {
        System.out.println(book.getTitle());
      }
    }

    System.out.println();

    // 12 - Changed #6 - 7
    for (int i = 0; i < childrensBooks.size(); i++)
    {
      if (childrensBooks.get(i).getAuthor().equals(authorToFind))
      {
        System.out.println(authorToFind + "'s book: " + childrensBooks.get(i).getTitle());
      }
    }
  }
}