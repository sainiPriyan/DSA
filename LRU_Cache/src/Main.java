import java.util.HashMap;

public class Main {

}

class LRUCache {
    HashMap<Integer,Node> hash;
    int cap, count;
    Node head , tail;
    LRUCache(int cap) {
        this.cap = cap;
        hash = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
        head.prev = null;
        tail.next = null;
        count = 0;
    }

    public void deleteNode(Node node){
        node.prev.next = node.next;
        if(node.next != null)
            node.next.prev = node.prev;
    }

    public void addToHead(Node node){
        node.next = head.next;
        if (node.next != null)
         node.next.prev = node;
        head.prev = head;
        head.next = node;
    }

    public  int get(int key) {
        if(hash.get(key)!= null){
            Node node = hash.get(key);
            int result = node.value;
            deleteNode(node);
            addToHead(node);

            return result;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(hash.get(key) != null){
            Node node = hash.get(key);
            node.value = value;
            deleteNode(node);
            addToHead(node);
        }
        else{
            Node node = new Node(key,value);
            hash.put(key,node);
            if(count<cap){
                count++;
                addToHead(node);
            }
            else {
                hash.remove(tail.prev.key);
                deleteNode(tail.prev);
                addToHead(node);
            }

        }
    }
}
class Node{
    int value,key;
    Node next;
    Node prev;
    public Node(int key,int value){
        this.value = value;
        this.key = key;
        next = null;
        prev = null;
    }
}
