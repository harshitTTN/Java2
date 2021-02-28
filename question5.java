package Day2;

public class question5 //implements Cloneable//
{
    String name;
    int age;
    public question5(String name,int age){
        this.name = name;
        this.age = age;
    }

    question5(question5 q){
        name = q.name;
        age = q.age;
    }
    public static void main(String[] args) throws CloneNotSupportedException  {
//        try {
            question5 q2 = new question5("Harshit", 20);
//            question5 q3 = (question5) q2.clone();
              question5 q3 = new question5(q2);
            System.out.println(q3.name);
//        }catch (CloneNotSupportedException e){

//        }

    }
}
