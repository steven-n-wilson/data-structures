package com.queueRepartidor.queueRepartidor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class LinkedList {
    Node head;

    static class Node {
        String data;
        Node next;

        Node(String d){
            data = d;
            next = null;
        }

    }

    public static LinkedList add(LinkedList list, String data){
        Node newNode= new Node(data);

        newNode.next= null;

        if (list.head ==null){
            list.head = newNode;
        }
        else{
            Node last = list.head;
            while (last.next !=null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }


    public static ArrayList<String> addArrayList(ArrayList<String> list, String item) {
        list.add(item);
        return list;
    }

    public static ArrayList<String> printList(LinkedList list){
        Node currentNode = list.head;
//        System.out.print("List: ");
        ArrayList<String> arrayList = new ArrayList<String>();
        while (currentNode != null){

            arrayList.add(currentNode.data);
            currentNode = currentNode.next;

        }
        return arrayList;
    }

}

@RestController
class Play {

    LinkedList myList = new LinkedList();

    @GetMapping("/add")
    @ResponseBody
    public String callMethod(@RequestParam String numeroSS, @RequestParam String nombre, @RequestParam String diasTrabajados){
        String data = numeroSS + " " + nombre + " " + diasTrabajados;
        myList.add(myList, data);
        return "The elements where added " + data;

    }

    @GetMapping("/print")
    @ResponseBody
    public String callMethodPrint(){
        return "The List: " + LinkedList.printList(myList);

    }
}

