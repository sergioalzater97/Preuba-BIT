package clases;

public class IntegerSetTest {

    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        set1.insertElement(1);
        set1.insertElement(3);
        set1.insertElement(5);

        set2.insertElement(3);
        set2.insertElement(5);
        set2.insertElement(7);

        IntegerSet unionSet = IntegerSet.union(set1, set2);
        IntegerSet intersectionSet = IntegerSet.intersection(set1, set2);

        System.out.println("Set 1: " + set1.toSetString());
        System.out.println("Set 2: " + set2.toSetString());
        System.out.println("Union: " + unionSet.toSetString());
        System.out.println("Intersection: " + intersectionSet.toSetString());

        System.out.println("Set 1 equals Set 2: " + set1.equalTo(set2));
        set2.deleteElement(7);
        System.out.println("Set 2 after deleting 7: " + set2.toSetString());
        System.out.println("Set 1 equals Set 2: " + set1.equalTo(set2));
    }
}
