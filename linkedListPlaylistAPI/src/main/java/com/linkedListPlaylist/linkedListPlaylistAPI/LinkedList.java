package com.linkedListPlaylist.linkedListPlaylistAPI;

public class LinkedList {

    Node head;

    static class Node {
        String song;
        Node next;

        //        Crear constructor
        Node(String s) {
            song = s;
            next = null;
        }
    }


// Method to add new node
    public static LinkedList add(LinkedList playlist, String song){
        Node newNode= new Node(song);
        newNode.next= null;

        if (playlist.head ==null){
            playlist.head = newNode;
        }
        else{
            Node last = playlist.head;
            while (last.next !=null){
                last = last.next;
            }
            last.next = newNode;
        }
        return playlist;
    }

    public static void printList(LinkedList playlist){
        Node currentNode = playlist.head;
        System.out.print("Playlist: ");

        while (currentNode != null){
            System.out.print(currentNode.song + ",");

            currentNode = currentNode.next;
        }
    }

    public static void playNow(LinkedList playlist){
        Node currentNode = playlist.head;
        System.out.print("\nNow playing: ");

        if (currentNode != null){
            System.out.print(currentNode.song + " ");
        }
    }

    public static void playNext(LinkedList playlist){
        Node currentNode = playlist.head;
        System.out.print("\nPlay next: ");

        if (currentNode != null){
            currentNode = currentNode.next;
            System.out.print(currentNode.song + " ");
        }
    }

    public static void playPrevious(LinkedList playlist){
        Node currentNode = playlist.head;
        System.out.print("\nPlay previous: ");

        if (currentNode != null){
            currentNode = currentNode.next;
            System.out.print(currentNode.song + " ");
        }
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list = add(list, "wonderwall");
        list = add(list, "heathens");
        list = add(list, "unknown to you");

        printList(list);
        playNow(list);
        playNext(list);
    }
}
