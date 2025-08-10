package basics;
import java.util.Arrays;
public class DuplicateElements {
    public static void main(String[] args) {
        int arr[] = {5, 7, 12, 11, 10, 9, 7, 12, 7, 1, 1};
        int dist[] = new int[arr.length];
        Arrays.sort(arr);
        int ind = 0;
        System.out.println("Sorted array: " + Arrays.toString(arr));
        if(arr[0] == arr[1]) {
            dist[ind++] = arr[0];
        }
        for(int i = 1; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1] && arr[i] != arr[i - 1]) {
                dist[ind++] = arr[i];
            }
        }        
        System.out.print("Duplicate elements: ");
        for(int i = 0; i < ind; i++) {
            System.out.print(dist[i] + " ");
        }
    }
}

