public class CinemaTicket {
    static String cinema_name = "Morning Star Cinema";

    String film_name;
    int row;
    int seat;
    double price;

    public CinemaTicket(String film_name, int row, int seat) {
        this.film_name = film_name;
        this.row = row;
        this.seat = seat;
        this.price = (row <= 2) ? 10.00 : 25.00;
    }

    public String displayTicket() {
        return "Cinema Name: " + cinema_name +"\nFilm Title: " + film_name +"\nRow: " + row + " Seat: " + seat +"\nPrice: PLN " + price;
    }

 public static void main(String[] args) {
    CinemaTicket t1 = new CinemaTicket("Gladiator",2,27);
    CinemaTicket t2 = new CinemaTicket("Gladiator",7,12);
    System.out.println(t1.displayTicket());
    System.out.println(t2.displayTicket());
 }
 
}