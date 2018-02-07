package kk.practise.执行顺序;

/**
 * @author kangkai on 2017/11/29.
 */
interface HasBatteries{}
interface WaterProof{}
interface Shoots{}

class Toy {
    Toy() {}
    Toy(int i) {}
}

class FancyToy extends Toy
        implements HasBatteries, WaterProof, Shoots {
    FancyToy() {
        super(1);
    }
}

public class RTTITest {

    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() +
                ", is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }

    /*public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("rtti.FancyToy"); // 必须是全限定名（包名+类名）
        } catch(ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);

        for(Class face : c.getInterfaces()) {
            printInfo(face);
        }

        Class up = c.getSuperclass();
        Object obj = null;
        try {
            // Requires default constructor.
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Can't Instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Can't access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }*/

}