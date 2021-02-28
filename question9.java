package Day2;
abstract class Furniture {
   abstract public void stressTest();
    abstract void fireTest();
}

class MetalChair extends Furniture {

    MetalChair()
    {
        System.out.println("METAL CHAIR");
    }

    public void stressTest() {
        System.out.println("Metal Chair(STRESS TEST : RESISTENCE : HIGH");
    }

    public void fireTest() {
        System.out.println("Metal Chair(FIRE TEST : RESISTENCE : LOW");
    }
}

class MetalTable extends Furniture {

    MetalTable()
    {
        System.out.println("METAL TABLE");
    }

    public void stressTest() {

        System.out.println("Metal Table(STRESS TEST : RESISTENCE : HIGH");
    }

    public void fireTest() {
        System.out.println("Metal Table(FIRE TEST : RESISTENCE : HIGH");
    }
}

class WoodenTable extends Furniture {

    WoodenTable()
    {
        System.out.println("WOODEN TABLE");
    }

    public void stressTest() {
        System.out.println("Wooden Table(STRESS TEST : RESISTENCE : MEDIUM");
    }

    public void fireTest() {
        System.out.println("Wooden Table(FIRE TEST : RESISTENCE : LOW");
    }
}

class WoodenChair extends Furniture {

    WoodenChair()
    {
        System.out.println("WOODEN CHAIR");
    }

    public void stressTest() {
        System.out.println("Wooden Chair(STRESS TEST : RESISTENCE : MEDIUM");
    }

    public void fireTest() {
        System.out.println("Wooden Chair(FIRE TEST : RESISTENCE : HIGH");
    }
}

public class question9 {
    public static void main(String[] args)
    {
        MetalChair MChair = new MetalChair();
        MChair.stressTest();
        MChair.fireTest();
        MetalTable MTable = new MetalTable();
        MTable.stressTest();
        MTable.fireTest();
        WoodenChair WChair = new WoodenChair();
        WChair.stressTest();
        WChair.fireTest();
        WoodenTable WTable = new WoodenTable();
        WTable.stressTest();
        WTable.fireTest();;
    }
}
