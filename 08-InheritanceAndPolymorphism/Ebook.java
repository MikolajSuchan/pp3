public class Ebook extends Book {
    private String file_name;

    public Ebook(String title, String author, String file_name) {
        super(title, author);
        this.file_name = file_name;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }


    void display(){
        
        System.out.println("Title: "+getTitle()+" Author "+getAuthor()+" Ebook file name "+file_name);
    }
    
    
}
