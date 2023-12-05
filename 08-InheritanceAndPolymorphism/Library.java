import java.util.ArrayList;


public class Library {
    ArrayList<Book> library =new ArrayList<Book>();
    
    public void main(String[] args) {
        Book b1= new Book("Wesele","");
        Ebook e1=new Ebook("","","");
        Ebook e2=new Ebook("","","");
        Audiobook a1=new Audiobook(null, null, 0, 0);
        Audiobook a2=new Audiobook(null, null, 0, 0);

        library.add(b1);
        library.add(e1);
        library.add(e2);
        library.add(a1);
        library.add(a2);

        for(Book i:library){
            i.display();
        }




    }





}
