package org.personalProject.demo.collectionEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx3 {

    static HashMap phoneBook = new HashMap();

    public static void main(String[] args) {

        addPhoneNo("친구","이자바","010-1111-1111");
        addPhoneNo("친구","김자바","010-2222-2222");
        addPhoneNo("친구","김자바","010-3333-3333");
        addPhoneNo("회사","김대리","010-4444-4444");
        addPhoneNo("회사","김대리","010-5555-5555");
        addPhoneNo("회사","박대리","010-6666-6666");
        addPhoneNo("회사","이과장","010-7777-7777");
        addPhoneNo("세탁","010-8888-8888");

        printList();


    }//main

    static void addPhoneNo(String groupName, String name, String tel){//그룹에 전화번호를 추가하는 메서드

        addGroup(groupName);
        HashMap group = (HashMap) phoneBook.get(groupName);
        group.put(tel,name);//이름이 중복될 수 있으니 전화번호를 key로 저장한다.


    }

    static void addGroup(String groupName){
        if(!phoneBook.containsKey(groupName)){
            phoneBook.put(groupName,new HashMap());
        }
    }

    static  void addPhoneNo(String name, String tel){
        addPhoneNo("기타",name,tel);
    }

    static void printList(){
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();

        }
    }
}
