package com.queueRepartidores.queueRepartidores;


import org.springframework.web.bind.annotation.RestController;

public class LinkedList {
    Node head;

    static class Node {
        int numeroSS;
        String nombre;
        int diasTrabajados;
        Node next;

        Node(int numeroSS){
            numeroSS = numeroSS;
            nombre = nombre;
            diasTrabajados = diasTrabajados;

            next = null;
        }

    }

    public static LinkedList add(LinkedList list, int numeroSS, String nombre, int diasTrabajados){
        Node newNode= new Node(numeroSS);
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

    public static String printList(LinkedList list){
        Node currentNode = list.head;
        System.out.print("List: ");

        while (currentNode != null){
            System.out.print("[" + currentNode.numeroSS + ", " + currentNode.nombre +", "+ currentNode.diasTrabajados);

            currentNode = currentNode.next;
        }
        return list.toString();
    }

}

@RestController
class Play {

    LinkedList list = new LinkedList();

    @GetMapping("/add")
    @ResponseBody
    public String callMethod(@RequestParam String song){

        list = add(list,song);

        return "The song was added, " + song;

    }

    @GetMapping("/play")
    @ResponseBody
    public String callMethodPlay(){
        return "The song playing, " + LinkedList.playNow(list);

    }
