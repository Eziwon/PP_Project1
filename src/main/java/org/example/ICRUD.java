package org.example;

import java.util.ArrayList;

public interface ICRUD {
    public Object add();
    public void addWord();
    public int update(Object obj);
    public int delete(Object obj);
    public void selectOne(int id);
    public void listAll();
    public ArrayList<Integer> listKey(String key);
    public void updateItem();
    public void deleteItem();
}
