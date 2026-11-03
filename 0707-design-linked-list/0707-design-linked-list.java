class MyLinkedList {
    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
        this.val = val;
     // this.next = null;
        }
    }
    ListNode head;
    int size;

    public MyLinkedList() {
        head = null;
    
    }
    public int get(int index) {  
        if(index < 0 || index >= size){
            return -1;
        }
        ListNode temp = head;
        for(int i = 0; i < index ; i++){
            temp = temp.next;
        } 
        return temp.val;
    }
    
    public void addAtHead(int val) {
        ListNode h = new ListNode(val);
        h.next = head;
        head = h; 
        size++;
        
    }
    
    public void addAtTail(int val) {
        ListNode z = new ListNode(val);
        if(head == null){
            head = z;
            size++;
            return;
        }
        ListNode temp = head;
        while(temp.next != null ){
            temp = temp.next;
        }
        temp.next = z;
        size++;
        }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size){
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        ListNode temp = head;
        for(int i = 0 ; i < index-1 ; i++){
            temp = temp.next;
        }  
        ListNode node = new ListNode(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size){
            return;
        }
        if(index == 0){
            head = head.next;
        }else{
        ListNode temp = head;
        for(int i = 0 ; i <index-1 ; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    
    size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */