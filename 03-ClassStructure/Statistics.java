public class Statistics {

   static int NumberOfItems(int a,int b){
    int sum = 0;
    for(int i = a;i <= b; i++){
        sum++;
    }
    return sum;
   }

   static int SumOfItems(int c,int d){
    int sum = 0;
    for(int i = c;i <= d; i++){
        sum = sum + i;
    }
    return sum;
   }

   static double MeanOfItems(int e, int f){
    double sum = SumOfItems(e, f);
    double num = NumberOfItems(e, f);
    double mean = sum/num;
    return mean;
   }




    public static void main(String[] args) {
        System.out.println(NumberOfItems(5, 10));

        System.out.println(SumOfItems(5, 10));

        System.out.println(MeanOfItems(5, 10));
        
    }

}
