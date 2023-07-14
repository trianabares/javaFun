public class FizzBuzz{
    public String fizzBuzz(int num) {
        if (num % 5 == 0 && num % 3 == 0){
            return "FizzBuzz";
        } else if (num % 5 == 0){
            return "Buzz";
        } else if (num % 3 == 0){
            return "Fizz";
        } else if (num % 2 == 0){
            return "2";
        } 
        return String.valueOf(num);
    }
}