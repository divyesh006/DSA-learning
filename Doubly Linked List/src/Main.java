public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(9);
        list.insertLast(100);
        list.insert(5,55);
        list.insert(100,200);
        list.display();
    }
}