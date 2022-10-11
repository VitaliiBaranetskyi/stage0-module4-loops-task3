package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        t = Math.abs(t);
        String number = String.valueOf(t);
        int sum = 0;
        for (int i = 0; i < number.length(); i++){
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        System.out.println(sum);
    }
}
