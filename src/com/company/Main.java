package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {


            Contact contact1 = new Contact("Влад","89645635");
        Contact contact2 = new Contact("Катя","89636345");
        Contact contact3 = new Contact("Валя","896734223");

        PhoneContacts phoneContacts1 = new PhoneContacts("Семья");
        PhoneContacts phoneContacts2 = new PhoneContacts("Друзья");

        Map<PhoneContacts, Map<Contact, Integer>> phoneContactsMap1 = new HashMap<>();
        Map<Contact, Integer> contactMap1 = new HashMap<>();

contactMap1.put(contact1,1);
        contactMap1.put(contact2,2);

        Map<Contact, Integer> contactMap2 = new HashMap<>();

        contactMap2.put(contact3,3);

        phoneContactsMap1.put(phoneContacts1, contactMap1);
        phoneContactsMap1.put(phoneContacts2, contactMap2);


        System.out.println(phoneContacts1 + contactMap1.toString());
        System.out.println(phoneContacts2 + contactMap2.toString());

    }

    }

