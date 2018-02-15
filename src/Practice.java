public class Practice {

    public static void main(String[] args) {

        int count = 6;                  //int value starts where the count begins
        do {
            System.out.println("Count is: " + count);
            count++;
        }
        while (count < 20);           //evaluating a boolean, while (true)

    }

}

/*
The while statement evaluates expression, which must return a boolean value.
If the expression evaluates to true, the while statement executes the statement(s)
in the while block. The while statement continues testing the expression and executing
its block until the expression evaluates to false.

do while;
The difference between do-while and while is that do-while evaluates its expression at
the bottom of the loop instead of the top. Therefore, the statements within the do block
are always executed at least once
*/
