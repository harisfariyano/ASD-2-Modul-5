package Modul5;
public class SinglyLinkedListApp{
    public static void main(String[] ar)
    {
        SinglylinkedList lk = new SinglylinkedList();
        lk.insertAwal(100);
        lk.display();
        lk.insertAkhir(200);
        lk.display();
        lk.insertAtPos(50, 1);
        lk.display();
        lk.insertAtPos(80, 2);
        lk.display();
        lk.deleteAtPos(1);
        lk.display();
    }
}
