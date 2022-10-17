package veronica.se;

public class arrayDemo {
    public static void main(String[] args) {
        // initializing arrays
        String [] stringArray = new String[3];
        int [] numbers = new int [] {2,4,6,8};
        char[] letters = {'J', 'A', 'V', 'A'};

        // To execute ex1: call ex1 method in the main method; after writing it outside.

        ex1();
        ex2();
        ex3();

    } //main bracer


    //define method, outside the main method; i.e. inside the class App. THEN, call it in the main method.

    public static void ex1 (){
        String [] names = new String[3]; //[null, null, null]
        System.out.println(names.length); // to print the size of array.
        System.out.println("-------------------------------------------");

        names[0] = "Frederik"; // [Fredrick , null, null]
        names[2] = "Jonas"; // [Fredrick , null, Jonas]

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

    }

    public static void ex2 () {
        int[] numbers = {5,2,3,4,7};
        // to print
        int size = numbers.length;
        printArray(numbers);
        /*
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);

        } */

        // replace number
        System.out.println("----------------------------");
        numbers [1] = 4;
        /*
        numbers [6] = 10; */ //throws an exception, because the index doesn't exist.
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);




            // 2D ARRAY


        }

        //we have written the for-print code twice, how can we improve the code?
        //we can define a printArray method


    }

    public static void printArray (int [] numbers) {
        int size = numbers.length;
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);

            //now, we can use printArray instead of the block of codes

        }
    }

    public static void ex3 () {
        String[][] board = new String[3][3];
        board[0][0] = "X";
        board[0][1] = "O";
        board[0][2] = "X";

        board[1][0] = "O";
        board[1][1] = "O";
        board[1][2] = "X";

        board[2][0] = "X";
        board[2][1] = "X";
        board[2][2] = "O";

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "\t"); //note print and not println
            }
            System.out.println("\n");
        }


    }






}
