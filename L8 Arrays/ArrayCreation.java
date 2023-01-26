public class ArrayCreation {
    public static void main(String[] args) {
        // Type 1
        int intarr[] = new int[10];
        System.out.println(intarr[1]);  // On initialization, by default as 0

        char chrarr[] = new char[10];
        System.out.println(chrarr[1]);   // On initialization, by default as empty space

        String strarr[] = new String[10];
        System.out.println(strarr[1]);  // On initialization, by default as null

        // Type 2
        String fruits[] = {"apple","mango","orange"};
        System.out.println(fruits[1]);
    }
}

/*
ARRAYS - CREATION

1) <datatype> <name>[] = new <datatype>[<size>]
    (Eg) int array[] = new int[10];

2) <datatype> <name>[] = {<elements>}
    (Eg) int array[] = {1,2,3};

*/
