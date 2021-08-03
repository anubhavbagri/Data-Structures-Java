public class DynamicArrayUse {
    // 1. constructor
    // 2. add (adds to the end)
    // 3. size
    // 4. set
    // 5. get
    // 6. remove last
    // 7. isEmpty
    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();

        for (int i = 0; i < 100; i++) {
            d.add(i + 10);
        }

        System.out.println(d.size());

        d.set(4, 10); // sets 10 at index 4
        System.out.println(d.get(3)); // get the value at index 3
        System.out.println(d.get(4));

        while (!d.isEmpty()) {
            System.out.println(d.removeLast());
            System.out.println("size = " + d.size());
        }

    }
}
