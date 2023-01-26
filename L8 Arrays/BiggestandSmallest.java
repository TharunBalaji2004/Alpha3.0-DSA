import java.util.*;

public class BiggestandSmallest {
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,16};
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i=0;i<numbers.length;i++){
            if (largest < numbers[i])
                largest = numbers[i];
            if (smallest > numbers[i])
                smallest = numbers[i];
        }

        System.out.println("Smallest element: "+smallest);
        System.out.println("Largest element: "+largest);
    }
}

/*
OUTPUT:
Smallest element: 2
Largest element: 16
*/