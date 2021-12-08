package com.example.lab1;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class User {
    String login;
    String password;

    public User(String login,String password){
        this.login=login;
        this.password=password;
    }

    enum Subjects {
        Music,
        Programirovanie

    }
    Map<Subjects, List<Integer> > Dnevnik = new HashMap<Subjects, List<Integer>>(  );

    {
       Subjects[] spisok  = Subjects.values();
        for (Subjects tamp  :spisok) {
            Dnevnik.put(tamp,generatMark());
        }
    }

    private List<Integer> generatMark() {
        Random rand = new Random();
        List<Integer> result = new ArrayList<>();
         for ( int i = 0; i < 10 ; i++ ){
            result.add(rand.nextInt(99) );
        }
         return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                '}';
    }




}
