public class Time {
    public static void main(String[] args){
        int hours=14;
        int minutes=27;
        String time=hours+":"+minutes;
        int minutesm=((int)hours*60+minutes);
        int secondsm=((int)hours*3600)+((int)minutes*60);
        System.out.printf("Your time is: %s,minutes from midnight: %,d,seconds from midnight: %,d",time,minutesm,secondsm);
    }
}
