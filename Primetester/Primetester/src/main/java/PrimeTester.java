import exceptions.OuchIFoundThirtySevenAndHenceMustDieException;

import static org.apache.commons.math3.primes.Primes.isPrime;

public class PrimeTester implements Runnable {

    NumberUnderTest numberUnderTest;
    int highestNumberToTest;

    public PrimeTester(NumberUnderTest numberUnderTest, int highestNumberToTest) {
        this.numberUnderTest = numberUnderTest;
        this.highestNumberToTest = highestNumberToTest;
    }

    public void startTesting() throws OuchIFoundThirtySevenAndHenceMustDieException {

        while (true) {

            var number = numberUnderTest.getNumber();

            if(number == 37) {
                throw new OuchIFoundThirtySevenAndHenceMustDieException();
            }

            if (number > highestNumberToTest){
                break;
            }

//            boolean isPrime = Primes.isPrime(number);

            if (isPrime(number)) {
                System.out.println(Thread.currentThread().getId() + " found a prime number: " + number);
            }
        }
    }

    @Override
    public void run() {
        try {
            startTesting();
        } catch (OuchIFoundThirtySevenAndHenceMustDieException e) {
            System.out.println(Thread.currentThread().getId() + " found Thirty Seven and must die.");
        }
    }
}