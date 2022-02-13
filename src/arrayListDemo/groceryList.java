package arrayListDemo;
// array list demo

import java.util.ArrayList;

public class groceryList {
    private ArrayList<String> myArr = new ArrayList<String>();

    public void addGroceryItem(String item){
        myArr.add(item);
    }

    public void removeGroceryItem(int position){
        myArr.remove(position);
    }

    public void printItems(){
        for(int i=0;i<myArr.size();i++){
            System.out.println(myArr.get(i));
        }
    }

    public void modifyItem(int position, String newItem){
        myArr.set(position,newItem);
    }

}
