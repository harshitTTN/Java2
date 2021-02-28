package Day2;
class B{
    public void start()
    {
        System.out.println("hi");
    }

    public void stop() {
    }
}
public class question3b {

    public static void main(String[] args)
    {
        try{
            B a = new B();
            a.stop();
        }

        catch(NoClassDefFoundError er){
            er.printStackTrace();
        }
    }

}