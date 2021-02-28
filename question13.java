package Day2;


class InvalidAge extends Exception{
    InvalidAge(String s){
        super(s);
    }
}
public class question13 {
    static void AGEcheck(int age) throws InvalidAge{

            if (age < 18) {
                throw new InvalidAge("cutom exception");
            }else{
                System.out.println("Valid");
            }
    }
    public static void main(String[] args) {
        try{
            AGEcheck(13);
        }catch(Exception e){
            System.out.println("Exception"+" "+ e.getMessage() );
        }

    }
}
