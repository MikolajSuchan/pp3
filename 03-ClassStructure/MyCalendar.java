public class MyCalendar {
    static int year = 2023;
    static int month = 4;
    static int day = 9;
    static int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
    static String months[]={"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct"};
    public static void main(String[] args){
        System.out.println("Date: "+myDate());
        System.out.println("Days from the beginning of year: "+myDays());
    }
    static String myDate(){
        return String.format("%04d-%02d-%02d",year,month,day);
    }

    static int myDays(){
        int sum=0;
        for(int i=0; i< month;i++){
            sum =sum+days[i];
        }
        return sum+day;
    }

    static String myMonth(){

        return " ";
    }
    }


