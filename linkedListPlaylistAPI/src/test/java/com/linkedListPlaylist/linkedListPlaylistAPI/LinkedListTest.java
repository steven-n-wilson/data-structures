package com.linkedListPlaylist.linkedListPlaylistAPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void add() {
        LinkedList list = new LinkedList();
        list = LinkedList.add(list, "wonderwall");
        assertEquals("wonderwall", LinkedList.printList(list));
    }

    @Test
    void printList() {
        LinkedList list = new LinkedList();

        list = LinkedList.add(list, "wonderwall");
        list = LinkedList.add(list, "heathens");

        assertEquals("wonderwall, heathens",LinkedList.printList(list));

    }

    @Test
    void playNow() {
        LinkedList list = new LinkedList();

        list = LinkedList.add(list, "wonderwall");
        list = LinkedList.add(list, "heathens");

        assertEquals("wonderwall",LinkedList.playNow(list));
    }

    @Test
    void playNext() {
        LinkedList list = new LinkedList();

        list = LinkedList.add(list, "wonderwall");
        list = LinkedList.add(list, "heathens");

        assertEquals("heathens",LinkedList.playNow(list));
    }

    @Test
    void playPrevious() {
        LinkedList list = new LinkedList();

        list = LinkedList.add(list, "wonderwall");
        list = LinkedList.add(list, "heathens");

        assertEquals("heathens",LinkedList.playNow(list));
    }
}