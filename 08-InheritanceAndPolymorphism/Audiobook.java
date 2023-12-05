public class Audiobook extends Book{
    private int min;
    private int sec;

    

    public Audiobook(String title, String author, int min, int sec) {
        super(title, author);
        this.min = min;
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    void display(){
        System.out.println("Title "+getTitle()+" Author "+getAuthor()+" Audiobook minutes: "+min+" Audiobook seconds:"+sec);
    }
    

    
}
