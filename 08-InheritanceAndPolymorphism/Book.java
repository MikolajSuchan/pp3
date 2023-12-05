public class Book {
    private String title;
    private String author;
    private String publisher;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.publisher=publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    
    void display() {
        System.out.println("Book title:" + title + " author:" + author+" publisher: "+publisher);
    }



}