public class Stringxd {
    private String sentance;

    public void display(){
       System.out.println(getSentance().length());
       System.out.println(getSentance().substring(0,9));
       String lastfour =getSentance().substring(getSentance().length()-4);
       if(lastfour=="day!"){
        System.out.println("True");
       }
    }

    public String getSentance() {
        return sentance;
    }

    public void setSentance(String sentance) {
        this.sentance = sentance;

    }
    

}
