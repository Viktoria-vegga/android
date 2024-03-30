package com.example.mitrofanovaviktoria.domain;

import com.example.mitrofanovaviktoria.data.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UsersSorterShuffler {
    static public ArrayList<User> SortUsers(ArrayList<User> users) {
        Comparator<User> idComparator = Comparator.comparingInt(user -> user.id);

        ArrayList<User> res = new ArrayList<>(users);
        res.sort(idComparator);
        return res;
    }

    static public ArrayList<User> ShuffleUsers(ArrayList<User> users) {
        ArrayList<User> res = new ArrayList<>(users);
        Collections.shuffle(res);
        return res;
    }
}
