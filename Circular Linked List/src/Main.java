public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insert(1);
        list.insert(2);
        list.insert(4);
        list.insert(7);
        list.display();
        list.delete(4);
        list.display();
    }
}