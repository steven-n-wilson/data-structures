package com.queueRepartidor.queueRepartidor;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void add() {
        LinkedList myList = new LinkedList();
        String data = "numeroSS" + " " + "nombre" + " " + "diasTrabajados";
        LinkedList.add(myList,data);

        String data2 = "numeroSS2" + " " + "nombre2" + " " + "diasTrabajados2";
        LinkedList.add(myList,data2);

        ArrayList<String> newList = LinkedList.printList(myList);

        ArrayList<String> listExpected = new ArrayList<>(Arrays.asList(data, data2));


        assertEquals(listExpected, newList);
    }

}