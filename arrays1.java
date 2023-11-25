package com.bhavana;

public  class arrays1 {

       private int[] items;
        private int count;
        public arrays1(int length){
        items= new int [length];
    }

    public void insert(int item){
            //if array is full resize
        if(items.length==count){
            //create new array(twice size)

            int[]newItems=new int[count*2];
            //copy all items to new array
            for(int i=0;i<count;i++){
                newItems[i]=items[i];
            }
            //set "items to new array
            items=newItems;
        }

        //add new item at end of array
        items[count++]=item;
    }

    //public

    public void print(){
            for (int i=0;i<count;i++)
                System.out.println(items[i]);
}
}
