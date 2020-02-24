package com.linkedListPlaylist.linkedListPlaylistAPI;
import org.springframework.web.bind.annotation.*;

import static com.linkedListPlaylist.linkedListPlaylistAPI.LinkedList.add;

public class LinkedList {

    Node head;

    static class Node {
        String song;
        Node next;

        Node(String s) {
            song = s;
            next = null;
        }
    }


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

    public static String printList(LinkedList playlist){
        Node currentNode = playlist.head;
        System.out.print("Playlist: ");

        while (currentNode != null){
            System.out.print(currentNode.song + ", ");

            currentNode = currentNode.next;
        }
        return playlist.toString();
    }

    public static String playNow(LinkedList playlist){
        Node currentNode = playlist.head;
        System.out.print("\nNow playing: ");

        if (currentNode != null){
            System.out.print(currentNode.song + " ");
            return currentNode.song;
        }
        return null;
    }

    public static String playNext(LinkedList playlist){
        Node currentNode = playlist.head;
        System.out.print("\nPlay next: ");
        if (currentNode != null){
            currentNode = currentNode.next;
            System.out.print(currentNode.song + " ");
            return currentNode.song;
        }
        return null;
    }

    public int size() {
        int size = 0;
        for(Node n = head; n.next != null; n = n.next)
            size++;
        return size;
        }

    public static String playPrevious(LinkedList playlist){
        Node currentNode = playlist.head;
        System.out.print("\nPlay previous: ");
        int i =-1;
        while (i != playlist.size()){
            currentNode = currentNode.next;
            i++;
            if (i+1 == playlist.size()){
                System.out.print(currentNode.song + " ");
                return currentNode.song;
            }
        }
        return null;
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

    @GetMapping("/playNext")
    @ResponseBody
    public String callMethodPlayNext(){
        return "Playing next, " + LinkedList.playNext(list);

    }

    @GetMapping("/playPrevious")
    @ResponseBody
    public String callMethodPlayPrevious(){
        return "Playing next, " + LinkedList.playPrevious(list);

    }
    @GetMapping("/playlist")
    @ResponseBody
    public String callMethodPrintList(){
        return "Playlist, " + LinkedList.printList(list);

    }

}
