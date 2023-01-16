public class pq1 {
    public static void main(String[] args) {
        int x = 2, y = 5;

        int exp1 = (x * y / x);  
        int exp2 = (x * (y / x));

        System.out.println(exp1);
        System.out.println(exp2);
    }
}

/*
    Expression inside brackets are evaluated first

    Output: 5 4
*/

