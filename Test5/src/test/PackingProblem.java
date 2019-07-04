package test;

import java.util.Scanner;

public class PackingProblem {
    public static void main(String[] args) {
        final int MAX_WEIGHT = 10;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of objects:");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the weights of the objects:");
        for (int i = 0;i < size;i++)
            array[i] = input.nextInt();
        SingleLinkedList[] contains = new SingleLinkedList[size];
        for (int i = 0;i < size;i++) {
            contains[i] = new SingleLinkedList();
        }

        for (int i = 0;i < size;i++) {
            int j = 0;
            while (true) {
                if (contains[j].sum() + array[i] <= 10) {
                    contains[j].addHead(array[i]);
                    break;
                }
                else
                    j++;
            }
        }

        for (int i = 0;i < size;i++) {
            if (contains[i].getSize() > 0) {
                System.out.print("Container " + (i + 1) + " contains objects with weight ");
                contains[i].display();
            }
        }
    }
}

class SingleLinkedList {
    private int size;
    private Node head;

    public SingleLinkedList(){
        size = 0;
        head = null;
    }

    private class Node{
        private Object data;
        private Node next;

        public Node(Object data){
            this.data = data;
        }
    }

    public int getSize() {
        return size;
    }

    public Object addHead(Object obj){
        Node newHead = new Node(obj);
        if(size == 0){
            head = newHead;
        }else{
            newHead.next = head;
            head = newHead;
        }
        size++;
        return obj;
    }

    public void display(){
        if(size >0){
            Node node = head;
            int tempSize = size;
            if(tempSize == 1){
                System.out.println(node.data);
                return;
            }
            while(tempSize>0){
                System.out.print(node.data+" ");
                node = node.next;
                tempSize--;
            }
            System.out.println();
        }
    }

    public int sum() {
        int sum = 0;
        if (size > 0) {
            Node node = head;
            int tempSize = size;
            if (tempSize == 1) {
                return (int) node.data;
            }
            while (tempSize > 0) {
                sum += (int) node.data;
                node = node.next;
                tempSize--;
            }
        }
        return sum;
    }

}
