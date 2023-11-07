public class MyArray {
    static int even(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                sum++;
            }
        }
        return sum;
    }

    static int positiveOdd(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2 !=0 && array[i]>0){
                sum++;
            }
        }
        return sum;
    }

    static int[] reverse(int[] array){
        int x= array.length;
        int[] reverse=new int[x];
        for(int i=0;i<x;i++){
            reverse[i]=array[x-1-i];
        }
        return reverse;
    }
    
    static String compare(int[] array1, int[] array2) {
        int x1=array1.length;
        int x2=array2.length;
        if(x1!=x2){
            return "false";
        }
        for (int i = 0 ; i < x1; i++){
            if(array1[i] != array2[i]){
                return "false";
            }
        }
        return "true";
    }

    static int[] different(int[] array1, int[] array2) {
        
    }
}
