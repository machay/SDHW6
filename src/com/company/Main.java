package com.company;
import java.util.Iterator;

class Demo {
    public static String songs[] = {"All I Want For Christmas Is You" , "Fantasy", "#Beautiful", "Always Be My Baby"};

    public static class SongIterator implements Iterator {
        public int index = 0;

        public boolean hasNext() {
            if (index < songs.length) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (this.hasNext()){
                return songs[index++];
            }
            return null;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Demo.SongIterator i = new Demo.SongIterator();
        while (i.hasNext() == true) {
            String song = (String)i.next();
            System.out.println("Song Title: " + song);
        }
    }
}