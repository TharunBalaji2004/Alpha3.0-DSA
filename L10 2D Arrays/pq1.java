public class pq1 {
    public static void main(String[] args) {
        int[][] array = {{4,7,8},{8,8,7}};
        int num = 7;
        int count = 0;

        for(int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                if (array[i][j] == num)
                    count++;
            }
        }
        
        System.out.println(count);
    }
}

/*
OUTPUT:
2
*/