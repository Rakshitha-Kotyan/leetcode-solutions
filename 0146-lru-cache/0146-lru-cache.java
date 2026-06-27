class Node{
    int val;
    int key;
    Node prev;
    Node next;
    Node(int key,int val){
        this.key=key;
        this.val=val;
    }
}
class LRUCache {
    Node head;
    Node tail;
    int cap;
    Map<Integer,Node> m;
    public void insert(Node n){
        n.next=head.next;
        n.prev=head;
        head.next.prev=n;
        head.next=n;
    }
    public void delete(Node n){
      
        n.prev.next=n.next;
        n.next.prev=n.prev;
    }

    public LRUCache(int capacity) {
        this.cap=capacity;
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
        m=new HashMap<>();
    }
    
    public int get(int key) {
        if (m.containsKey(key)){
            Node n=m.get(key);
            delete(n);
            insert(n);
            return n.val;
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        Node nn=new Node(key,value);
        if (m.containsKey(key)){
            delete(m.get(key));
            m.remove(key);
        }
        m.put(key,nn);
        insert(nn);
        if (m.size()>this.cap){
            Node ln=this.tail.prev;
            m.remove(ln.key);
            delete(ln);
        }
    }
}
