package com.company;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    private ArrayList<String> myList;

    public static void main(String[] args) {
	    ArrayList animalArr = new ArrayList(Arrays.asList("cat","dog","mouse","frog","dog"));

	    WordList animals = new WordList(animalArr);
	    System.out.println(animals.numWordsOfLength(4));
        System.out.println(animals.numWordsOfLength(3));
        System.out.println(animals.numWordsOfLength(2));

        animals.removeWordsOfLength(4);
        System.out.println(animals);
        animals.removeWordsOfLength(3);
        System.out.println(animals);
        animals.removeWordsOfLength(2);
        System.out.println(animals);
    }
    public int numWordsOfLength(int len){
        int count =0;
        for(String words : myList){
            if(words.length()==len){
                count++;
            }
        }
        return count;
    }
    public void removeWordsOfLength(int len){
        for(int i = myList.size()-1; i >= 0; i--){
            if(myList.get(i).length()==len){
                myList.remove(i);
            }
        }
    }
}
