public class Arrays{
    static boolean arr(int[] arr1,int[] arr2){
        int counter1=0;
        int counter2=0;
        for(int i: arr1){
            if(i>=10 && i<=99){
                counter1+=1;
            }
        }
        for(int r: arr2){
            if(r>=10 && r<=99){
                counter2+=1;
            }
        }
        if(counter1==counter2){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        int[] arr1={1,22,23};
        int[] arr2={3,22,99};
        
        System.out.println(arr(arr1,arr2));
    }
    
