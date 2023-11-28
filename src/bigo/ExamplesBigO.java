public class ExamplesBigO {
    //Space Complexity
    int sum(int n) { /*Ex. 1 */
        if(n <= 0) {
            return 0;
        }
        return n + sum(n-1);
    }
    // sum(4)
    //   ->  sum(3)
    //     ->    sum(2)
    //         ->    sum(1)
    //             ->    sum(0)

    int pairSumSequence(int n) { /*Ex. 2 */
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += pairSum(i, i + 1);
        }
        return a + b;
    }
    
    
    //Example 1
    //What is the  runtime of the below code?
    void foo(int[] array) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array [i];
        }
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        System.out.println(sum + ", " + product);
    }

    //Example 2
    //What is the  runtime of the below code?
    void printPairs(int [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[1] + ", " + array[j]);
            }
        }
    }

    //Example 3
    //What is the  runtime of the below code?
    void printUnorderedPairs (int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++ ) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }

    //Example 4
    //What is the  runtime of the below code?
    void printUnorderedPairs(int[] arrayA, int[] arrayB) {
        for(int i = 0; i < arrayA.length; i++) {
            for ( int j = 0; arrayB.length; j++) {
                if (arrayA[i] < arrayB[j]) {
                    System.out.println(arrayA[i] + "," + arrayB[j]);
                }
            }
            
        }
    }
}
