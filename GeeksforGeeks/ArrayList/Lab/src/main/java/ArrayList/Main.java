package ArrayList;

public class Main {
    public static void main(String[] args) {
        var stringArrayList = new ArrayList<String>();
        stringArrayList.add("Girma");
        stringArrayList.add("Moges");
        stringArrayList.add("Tsehaye");
        stringArrayList.add("Feruz");
        stringArrayList.add("Messay");
        stringArrayList.add("Baya");
        stringArrayList.add("Abiy");
        stringArrayList.add("Cherent");
        stringArrayList.add("Abeba");
        stringArrayList.add("Asrat");
        stringArrayList.add("Testing");

//        System.out.println(stringArrayList.toString());
        System.out.println("Array list items...");
        stringArrayList.print();

        // Reverses order
        System.out.println("Reverses order...");
        stringArrayList.reverses();
        stringArrayList.print();

        // Ascending order
        System.out.println("Ascending order...");
        stringArrayList.ascendingOrder();
        stringArrayList.print();

        // Descending order
        System.out.println("Descending order...");
        stringArrayList.descendingOrder();
        stringArrayList.print();

        // Print size
        stringArrayList.printSize();

        // Count items
        stringArrayList.printSizeItems();
    }
}
