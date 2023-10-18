public class Euro {
    public static void main(String[] args){
        float Buy= 4.5678f;
        float Sell= 4.2344f;
        float spread=Math.abs((Buy-Sell));
        System.out.printf("Spread: %,.4f",spread);
    }
}
