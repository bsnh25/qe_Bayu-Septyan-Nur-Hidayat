package Case2;

import java.util.HashMap;

public class munculSekali {
    static int main(int[] arr, int n, int target) {
        HashMap<Integer,Integer> str = new HashMap<>();
        int idx = 0;
        for (int i=0; i<n;i++){
            if (str.containsKey(target-arr[i])){
                idx += str.get(target-arr[i]);
                for (int j=1;j<str.get(target-arr[i]);j++)
                    System.out.println("("+(target-arr[i]+","+arr[i]+")"));
            }
            str.put(arr[i], str.getOrDefault(arr[i],0)+1);
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4,6};
        int target = 6;
        System.out.println(main(input,input.length,target));
        System.out.println();
    }
}
