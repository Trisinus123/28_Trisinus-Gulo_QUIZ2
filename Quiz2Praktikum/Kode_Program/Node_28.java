

public class Node_28{
    Node_28 prev, next;
    Pembeli buyer;
    Pesanan order;


    Node_28(Node_28 prev, Pembeli buyer, Pesanan order, Node_28 next) {
        this.prev = prev;
        this.buyer = buyer;
        this.order = order;
        this.next = next;
    }
}
