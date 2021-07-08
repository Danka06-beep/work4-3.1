package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Программа справочник");
        Map<PhoneContacts,Contact > phoneMap = new HashMap<>();
        Map<Contact,String > contactMap = new HashMap<>();
        while (true){
            System.out.println("Введите название группы контактов ");
            String group = sc.nextLine();
            PhoneContacts pc = new PhoneContacts(group);

            System.out.println(" введите нет для продолжения или введите любую клавишу для добовления ещё одной группы");
            String input = sc.nextLine();
            if(input.equals("нет")){
                System.out.println("Создать контакт 'введите наименование и его номер'");
                String name = sc.nextLine();
                String phoneNumber = sc.nextLine();
                Contact cn = new Contact(name,phoneNumber);
                phoneMap.put(pc,cn);
                System.out.println("Введите 'нет' для продолжения");
                group = sc.nextLine();
                if(group.equals("нет")){
                    System.out.println("Укажите группы контакта через пробел");
                    String pl = sc.nextLine();
                    phoneMap.get(pl);

                    System.out.println("Группы в справочнике" + phoneMap + contactMap);
                }
            }


        }


    }

    }

/*Contact contact1 = new Contact("Влад","89645635");
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
        System.out.println(phoneContacts2 + contactMap2.toString());*/
