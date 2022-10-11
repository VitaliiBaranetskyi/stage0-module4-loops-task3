package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        StringBuilder fib = new StringBuilder("01");
        for(int i = 0; i < lastFibonacci - 2; i++){
            fib.append(Integer.parseInt(String.valueOf(fib.charAt(i))) + Integer.parseInt(String.valueOf(fib.charAt(i + 1))));
        }
        for(String s : fib.toString().split("")){
            System.out.println(s);
        }
    }
}
