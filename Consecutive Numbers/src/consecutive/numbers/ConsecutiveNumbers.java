package consecutive.numbers;

public class ConsecutiveNumbers {

    public static void main(String[] args) {

        /*
        Create a function that determines whether elements in an array can be re-arranged 
        to form a consecutive list of numbers where each number appears exactly once.
        
        Examples
        
        cons([5, 1, 4, 3, 2]) ➞ true
        // Can be re-arranged to form [1, 2, 3, 4, 5]
        
        cons([5, 1, 4, 3, 2, 8]) ➞ false

        cons([5, 6, 7, 8, 9, 9]) ➞ false
        // 9 appears twice
        
         */
        int[] array = {5, 1, 4, 3, 2};

        System.out.println(cons(array));

    }

    public static boolean cons(int[] array) {

        int i, j, aux;
        for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }
            }
        }

        boolean bn = false;

        for (int k = 0; k < (array.length - 1); k++) {

            if (array[k] == (array[k + 1] - 1)) {
                bn = true;

            } else {
                bn = false;
            }

        }

        if (bn == true) {
            return true;
        }
        return false;
    }

}
