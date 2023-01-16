public class breakstmt {
    public static void main(String[] args) {
        int counter = 0;

        while (counter <= 10){
            if (counter == 5)
                break;
            System.out.println(counter);
            counter++;
        }
    }
}

/*
break statement
- When it gets executed, the loop gets terminated
*/