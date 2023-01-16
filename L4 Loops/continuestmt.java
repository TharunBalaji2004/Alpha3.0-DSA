public class continuestmt {
    public static void main(String[] args) {
        int counter = 0;

        while (counter <= 10){
            if (counter == 5){
                counter++;
                continue;
            }
            System.out.println(counter);
            counter++;
        }
    }
}

/*
continue statement:
- When executed, it starts next iteration and skips the remaining statements in body
*/