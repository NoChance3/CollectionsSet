package practice;

import java.util.*;
import java.util.TreeSet;
import java.util.List;

public class EmailList {

    TreeSet<String> treeSet;
    String regex = "[A-Za-z0-9]{1,}+@([A-Za-z0-9]{1,}+[\\.]{0,1}[A-Za-z0-9]{1,})";
    public EmailList(){
        this.treeSet = new TreeSet<>();
    }
    public boolean add(String email) {
        if (email.matches(regex)){
            email = email.toLowerCase();
            if (!treeSet.contains(email)){
                treeSet.add(email);
                return true;
            }
        }
        return false;
    }

        public List<String> getSortedEmails () {
            List<String> tempList = new ArrayList<String>(treeSet);
            return tempList;}
    }

