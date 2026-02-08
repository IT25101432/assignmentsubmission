public class IT25101432q3 {
    //Main Method
    public static void main(String[] args) {
        EvenOddNumber obj = new EvenOddNumber();

        int number1 = 10;
        int number2 = 7;

        if (obj.findEvenOrOdd(number1)) {
            System.out.println(number1 + " is an even number.");
        } else {
            System.out.println(number1 + " is an odd number.");
        }

        if (obj.findEvenOrOdd(number2)) {
            System.out.println(number2 + " is an even number.");
        } else {
            System.out.println(number2 + " is an odd number.");
        }
    }
}

//EvenOddNumber Class
class EvenOddNumber {
    public boolean findEvenOrOdd(int i) {
        return i % 2 == 0;
    }
}
