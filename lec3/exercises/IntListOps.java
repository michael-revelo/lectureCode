/** Additional operations on an IntList.
 *  @author Josh Hug
 */

public class IntListOps {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        if (L == null)
            return null;

        return new IntList(L.head + x, incrList(L.tail, x));        
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        return L;
    }

    /** Same as incrList, no recursion allowed. The result will be
      * much uglier than incrList! */
    public static IntList incrListIterative(IntList L, int x) {
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.tail = new IntList(7, null);    
        L.tail.tail = new IntList(9, null);
        System.out.println(L);
        System.out.println(incrList(L, 3));
        System.out.println(dincrList(L, 3));

    }
} 