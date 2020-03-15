/**
 * @author Abhishek Singh
 * last update  12:30 AM 27/02/20
 **/
package Inheritence;
import java.util.*;
abstract class Book{
    protected String title;
    protected String author;
    Book(){}
    Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    abstract void display();
}
class MyBook extends Book
{
    int price;
    MyBook(String title, String author ,int price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display()
    {
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Price: "+this.price);
    }
}
public class Solution {

    public static void main(String[] args) {
        //Starts coding
        Book book=new MyBook("abc","author",200);
        book.display();

    }
}
