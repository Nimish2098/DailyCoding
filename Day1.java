
import java.lang.runtime.TemplateRuntime;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    Node(int data,Node next,Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
public class Day1 {
    //Array to DLL
    private static Node arrayToll(int arr[]){
        Node head = new Node(arr[0]);
        Node back = head;
        for(int i=1;i<arr.length;i++){    
        Node temp = new Node(arr[i]);
        temp.prev = head;
        back.next = temp;
        back = temp;
        }
        return head;
    }

    //Delete head node
    private static Node deleteHead(Node head){
        if(head==null|| head.next) return null;
        Node temp = head;
        temp = temp.next;
        temp.prev = null;

        return temp;
       
    }
    //Delete tail node
    private static Node deleteTail(Node head){
        if(head == null) return null;

        Node temp = head;
        while(temp.next == null){
            temp = temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {
    
        int[] arr = {1,2,3,4,5};
        Node head = arrayToll(arr);
        //Node temp = deleteHead(head);
        while(head.next!=null){
            head = head.next;
        }
        System.out.println(head.data);
    }
}
