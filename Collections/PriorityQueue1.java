import java.util.*;
class PriorityQueue1
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq= new PriorityQueue();
        pq.add(25);
        pq.add(43);
        pq.add(12);
        pq.add(48);
        pq.add(75);
        pq.add(86);
        //pq.add(null);
        pq.remove();
        //pq.poll();
        //lst.rear(90);
        //lst.front(5);
        //lst.pop();
        //lst.removeFirst();
        //lst.removeLast();
        /*System.out.println("Element value of index is "+lst.get(3));
        System.out.println("Array position is "+lst.indexOf(12));*/
        System.out.println(pq);
    }
}