package functions;

public class Array {
    private int [] items;
    private int count;
    public Array  (int length){
        items = new int[length];
    }

    public void printItems(){
        for(int i=0; i<count; i++){
            System.out.println(items[i]);
        }
    }

    public void insert(int item) {
        //to add a new value to an array, we need to test if the array is fulled

        //test if the array is full
        if(items[count] == items.length) {
            //resize the array by creating an array with bigger size than the previous
            int[] newItems = new int[count * 2];
            int i;
            //copied the value of the previous array to the new array
            for (i = 0; i < count; i++) {
                //affecting the value at each position of the previous array to it's corresponding position in the new array
                newItems[i] = items[i];
                //replaced the previous array by the new array
                items = newItems;
            }

            //adding new item in the array
            items[i] = item;
        }
    }

    public void remove(int index) throws IllegalAccessException {
        //to remove an item, we first need to check if the index of the item is not out of range
        if(index<0 ||  index>=count)
            throw new IllegalAccessException();
        //then if the index is not out of range, we need to shift the content after the index to where the index is and so on with each data
        for(int i=index; i<count; i++)
            items[i] = items[i+1];
        count--;
    }

    //searching the index of an item
    public int indexOf(int item){
        //to find the index of an item, we need to go through each item of
        // the list and compare the index of each element with the index of the item we are looking for
        for(int i=0; i<count; i++)
            if(items[i] == item)
                return item;
        return -1;
    }
}
