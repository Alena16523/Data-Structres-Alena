public class BigOSingleLoop {
    public static void main(String[] args) {

        long numberOfOperations=0;
        int n=1000;// size of  Data
        int m=500;
        long startTime;
        long endTime;
        System.out.println("Input size n is = "+ n);

        // Task 1 Single Loop................... O(n)
        System.out.println("---------Task 1------------");

        startTime=System.currentTimeMillis();
        for (int i = 0; i < n ; i++) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Single Loop Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" milliseconds");

        numberOfOperations=0;


        // Task 2 Nested Loops...................n^2
        System.out.println("---------Task 2------------");

        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n ; i++) {
                numberOfOperations+=1;
            }
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Nested Loop Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");


        // Task 3 Three Nested Loops...................
        System.out.println("---------Task 3------------");

        numberOfOperations=0;
        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n ; i++) {
                for (int k = 0; k < n; k++) {
                    numberOfOperations+=1;
                }
            }
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Triple Nested Loop Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");


        // Task 4 N and M Nested Loops  O(n*m)...................
        System.out.println("---------Task 4------------");
        numberOfOperations=0;

        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m ; i++) {
                numberOfOperations+=1;
            }
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Nested Loop (n* m) Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");


        // Task 4.5 N and M Consecutive Loops O(n+m)...................
        System.out.println("---------Task 4.5------------");
        numberOfOperations=0;

        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            numberOfOperations+=1;
        }
        for (int i = 0; i < m ; i++) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Consecutive Loops O(n+m) Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");


        // Task 5 Logarithmic Complexity...................O(log(n))
        System.out.println("---------Task 5------------");

        numberOfOperations=0;
        startTime=System.currentTimeMillis();
        for (int i = 1; i < n ; i*=2) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();
        System.out.println( "Logarithmic Number of operations  : "+numberOfOperations + " in "+ (endTime-startTime) +" milliseconds");

    }
}


