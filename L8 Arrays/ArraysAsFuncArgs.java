public class ArraysAsFuncArgs {
    public static void update(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i] += 1;    // Increment each value by 1
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};

        update(marks);      // Memory reference of marks array is passed
                        
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
    }
}

/*
OUTPUT: 98 99 100

PASS BY REFERENCE

1) Changes made in called function are reflected in caller/main function
2) Original reference of the variable is passed, so changes are directly made
*/