import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,8};
        int[] finalArray = filterEvenIndexOddValue(array);
        for(int i=0;i<finalArray.length;i++){
            System.out.print(finalArray[i]+" ");
        }

    }
    public static int[] filterEvenIndexOddValue(int[] array) {
        ArrayList<Integer> help = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                if(array[i]%2!=0){
                    help.add(array[i]);
                }
            }
        }
        int [] finalArray  = new int[help.size()];
        for (int i = 0; i < help.size(); i++) {
            finalArray[i] = help.get(i);
        }
        return finalArray;
    }
}