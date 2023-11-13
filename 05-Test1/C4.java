public class C4 {
    public static int even(int[] array){
        int count=0;
        for(int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int positiveOdd(int[] array){
        int count=0;
        for(int num:array){
            if(num>0 && num%2==0){
                count++;
            }
        }
        return count;
    }
}
