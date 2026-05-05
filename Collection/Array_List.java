import java.util.*;

public class Array_List {
    public static void main(String[] args) {

        // Create ArrayList and add 5 integers
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Initial List: " + list);

        // add(E e)
        list.add(60);
        System.out.println("After add(): " + list);

        // addAll(Collection c)
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(70);
        list2.add(80);
        list.addAll(list2);
        System.out.println("After addAll(): " + list);

        // remove(Object o)
        // list.remove(20);
        list.remove(Integer.valueOf(20));
        System.out.println("After remove(): " + list);

        // removeAll(Collection c)
        list.removeAll(list2);
        System.out.println("After removeAll(): " + list);

        // retainAll(Collection c)
        ArrayList<Integer> retainList = new ArrayList<>();
        retainList.add(10);
        retainList.add(30);
        list.retainAll(retainList);
        System.out.println("After retainAll(): " + list);

        // contains(Object o)
        System.out.println("Contains 10? " + list.contains(10));

        // containsAll(Collection c)
        System.out.println("ContainsAll retainList? " + list.containsAll(retainList));

        // size()
        System.out.println("Size: " + list.size());

        // isEmpty()
        System.out.println("Is Empty? " + list.isEmpty());

        // iterator()
        System.out.print("Iterator: ");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // toArray()
        Object[] arr = list.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        // clear()
        list.clear();
        System.out.println("After clear(): " + list);

        // isEmpty() after clear
        System.out.println("Is Empty now? " + list.isEmpty());
    }
}