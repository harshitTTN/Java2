package Day2;

public class question6 {
    public static void main(String[] args) {
        try {

            int divideByZero = 5 / 0;
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
        catch (Exception e){
            e.printStackTrace();
        }

        finally {
            System.out.println("This is the finally block");
        }
    }
}
