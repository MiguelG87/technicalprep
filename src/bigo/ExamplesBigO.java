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

    //Example 5
    //What is the  runtime of the below code?
    void printUnorderedPairs2(int[] arrayA, int[] arrayB) {
        for(int i = 0; i < arrayA.length; i++) {
            for ( int j = 0; arrayB.length; j++) {
                for (int k = 0; k < 1000; k++) {
                    System.out.println(arrayA[i] + "," + arrayB[j]);
                }
            }
            
        }
    }

    //Example 6
    //What is the  runtime of the below code?
    void reverse(int[] array) {
        for(int i = 0; i < array.length/2; i++) {
            int other = array.length - i - 1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
    }

    //Example 9
    //What is the  runtime of the below code?
    int sum(Node node) {
        if (node == null) {
            return 0;
        }
        return sum(node.left) + node.value + sum(node.right);
    }

    //Example 10
    //What is the time complexity of this function?
    boolean isPrime(int n) {
        for (int x = 2; x * x <= n; x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }

    //Example 11
    //What is the time complexity of this function?
    int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //Example 12
    void permutation(String str) {
        permutation(str, "");
    }
    void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }
    //Example 13
    // int fib(int n) {
    //     if (n <= 0) return 0;
    //     else if (n == 1) return 1;
    //     return fib(n - 1) + fib(n -2);
    // }

    //Example 14
    // void allFib(int n) {
    //     for (int i = 0; i <= n; i++) {
    //         System.out.println(i + ": " + fib(i));
    //     }
    // }
    // int fib(int n) {
    //     if (n <= 0) return 0;
    //     else if (n == 1) return 1;
    //     return fib(n - 1) + fib(n - 2);
    // }

    //Example 15
        void allFib(int n) {
            int[] memo = new int[n + 1];
            for (int i = 0; i < n; i++) {
                System.out.println(i + ": " + fib(i, memo));
            }
        }
        int fib(int n, int[] memo) {
            if (n <= 0) return 0;
            else if (n == 1) return 1;
            else if (memo[n] > 0) return memo[n];

            memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
            return memo[n];
        }

        int powersOf2(int n) {
            if (n < 1) {
                return 0;
            } else if (n == 1) {
                System.out.println(1);
                return 1;
            } else {
                int prev = powersOf2(n / 2);
                int curr = prev * 2;
                System.out.println(curr);
                return curr;
            }
        }


        //Extra Examples
        

        //Example VI.1
        int product(int a, int b) {
            int sum = 0;
            for (int i = 0; i < b; i++) {
                sum += a;
            }
            return sum;
        }

        //Example VI.2
        int power(int a, int b) {
            if (b < 0) {
                return 0; // error
            } else if (b == 0) {
                return 1;
            } else {
                return a * power(a, b - 1);
            }
        }

        //Example VI.3
        int mod(int a, int b) {
            if (b <= 0) {
                return -1;
            }
            int div = a / b;
            return a - div * b;
        }

        //Example VI.4
        int div(int a, int b) {
            int count = 0;
            int sum = b;
            while (sum <= a) {
                sum += b;
                count++;
            }
            return count;
        }

        //Example VI.4
        int sqrt(int n) {
            return sqrt_helper(n, 1, n);
        }

        int sqrt_helper(int n, int min, int max) {
            if (max < min) return -1; //no sqaure root
            int guess = (min + max) / 2;
            if (guess * guess == n) { //found it!
                return guess;
            } else if (guess * guess < n) {
                return sqrt_helper(n, guess + 1, max); //try higher
            } else { //too high
                return sqrt_helper(n, min, guess - 1); //try lower
            }
        }
}
