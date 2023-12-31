package org.example;

import java.util.ArrayList;

public interface ICRUD {
    public Object add();
    public void addWord();
    public void listAll();
    public ArrayList<Integer> listKey(String key);
    public void listAll(int level);
    public void updateItem();
    public void deleteItem();
    public void loadFile();
    public void saveFile();
    public void searchLevel();
    public void searchWord();
}
