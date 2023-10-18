public class Height {
    public static void main(String[] args){
    int height=174;
    double heightIn = (height/2.54);
    double feet = (heightIn / 12);
    double inches = (heightIn % 12);
    System.out.println("I am "+height+"cm tall, i.e. "+feet+" feet and "+inches+" inches");
}
}