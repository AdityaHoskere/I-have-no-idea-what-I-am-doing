package com.example.aditya.test;

/**
 * Created by aditya on 5/27/2015.
 */
public class Note extends RealmObjects {
        Editable t;
        public Note(Editable x) {
            t = x;
        }
        public Editable getGetText () {
            return t;
        }
}
