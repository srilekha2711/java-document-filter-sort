
import java.util.*;
public class Main1
{   public static Books[] sortBooksByPrice(Books[] books){
    Arrays.sort(books, new Comparator<Books>(){
        @Override
        public int compare(Books b1,Books b2){
            return Double.compare(b1.getPrice(),b2.getPrice());
        }});
        return books;
    
    }
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Books[] books=new Books[4];
        for (int i=0; i<4;i++){
            books[i]=new Books(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
        }
        System.out.println("Sorted");
        sortBooksByPrice(books);
        for (Books b:books){
            System.out.println(b.getId()+" "+ b.getTitle()+" "+ b.getAuthor()+" "+b.getPrice());
        }
	}
}
class Books
{
    private int id;
    private String title;
    private String author;
    private double price;
    Books(int id, String title, String author,double price){
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
    }
    
    //getters
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    
    //setters
    public void setId(int id){
        this.id=id;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPrice(double price){
        this.price=price;
    }
}