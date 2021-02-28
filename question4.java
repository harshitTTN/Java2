package Day2;

public class question4 {
    private static question4  q4;
    static{
        q4 = new question4 ();
    }
    private question4 (){

    }
    public static question4 getInstance(){
        return q4;
    }
    public void testMe(){
        System.out.println("Hi");
    }
    public static void main(String a[]){
        question4 q = getInstance();
        q.testMe();
    }
}
