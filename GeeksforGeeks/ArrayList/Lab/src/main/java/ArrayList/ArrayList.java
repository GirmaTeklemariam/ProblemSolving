package ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayList<T> {

    private int count;
    private T[] items;

    public ArrayList() {
        items = (T[]) new Object[5];
        count = 0;
    }

    public void add(T item){
        if(count >= items.length)
            growArray(items);
        items[count] = item;
        count++;
    }

    public void ascendingOrder(){
        for(int row=0; row<count; row++){
            for(int col=row+1; col<count; col++){
                if(items[row].toString().charAt(0) < items[col].toString().charAt(0)){
                    continue;
                }
                else{
                    T item = items[col];
                    items[col] = items[row];
                    items[row] = item;
                }
            }
        }
    }

    public void descendingOrder(){
        for(int row=0; row<count; row++){
            for(int col=row+1; col<count; col++){
                if(items[row].toString().charAt(0) > items[col].toString().charAt(0)){
                    continue;
                }
                else{
                    T item = items[col];
                    items[col] = items[row];
                    items[row] = item;
                }
            }
        }
    }

    public void reverses(){
        for(int startIndex=0, endIndex=count-1; startIndex<count/2; startIndex++, endIndex--){
            T item = items[startIndex];
            items[startIndex] = items[endIndex];
            items[endIndex] = item;
        }
    }

    public void printSize(){
        System.out.println("The size of array is...");
        System.out.println(items.length);
    }

    public void printSizeItems(){
        System.out.println("Count the array of items...");
        System.out.println(count);
    }

    public void subList(int fromIndex, int toIndex) throws ArrayIndexOutOfBoundsException{
        T[] subItems = (T[]) new Object[(toIndex-fromIndex) + 1];
        if(toIndex >= count || fromIndex < 0)
            throw new ArrayIndexOutOfBoundsException("One of the index is invalid");
        for(int index1=fromIndex, index2=0; index1<toIndex+1; index1++, index2++)
            subItems[index2] = items[index1];
        print(subItems);
    }

    private void growArray(T[] items){
        T[] copyItems;
        copyItems = Arrays.copyOf(items, items.length * 2);
        this.items = copyItems;
    }

    @Override
    public String toString() {
        return  Arrays.toString(items);
    }

    public void print(){
        if(count == 0)
            System.out.println("The array is null");
        else{
            System.out.print("{");
            for(int index=0; index<count; index++){
                System.out.print(items[index]);
                if(index != count-1)
                    System.out.print(" ");
                else
                    System.out.print("}");
            }
        }
        System.out.println();
    }

    private void print(T[] subItems){
            System.out.print("{");
            for(int index=0; index<subItems.length; index++){
                System.out.print(subItems[index]);
                if(index != subItems.length-1)
                    System.out.print(" ");
                else
                    System.out.print("}");
            }
        System.out.println();
    }
}
