package Day2;

class A{
    public void start()
    {
        System.out.println("HI");
    }
}
public class question3 {

    public static void main(String[] args) {
        try {
            Class.forName("Harshit");
//
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}