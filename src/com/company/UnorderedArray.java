package com.company;

public class UnorderedArray {
    int[] m_array;
    int maxSize;
    int numElements;

    public UnorderedArray(int size){
        numElements = 0;
        maxSize = size;
        m_array = new int[maxSize];
    }

    public void addLast(int key){
        if(numElements < maxSize){
            m_array[numElements++] = key;
        }
    }

    public void removeLast(){
        numElements--;
    }

    public void efficientRemove(int index){
        int lastIndex = numElements-1;
        if(index < lastIndex && index > -1){
            m_array[index] = m_array[lastIndex];
            numElements--;
        }
    }

    public void removeByIndex(int key){
        if(key > -1 && key < numElements){
            for(int i = key; i < numElements-1; i++){
                m_array[i] = m_array[i+1];
            }
            numElements--;
        }
    }

    public int linearSearch(int key){
        for (int i = 0; i < numElements; i++){
            if (m_array[i] == key)
                return i;
        }

        return -1;
    }

    public StringBuilder listItems(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numElements; i++){
            s.append(m_array[i]).append("\n");
        }
        return s;
    }

    public void insertionSort(){
        for(int x =1; x < numElements; x++){ //get the starting point
            int temp = m_array[x]; //take the item out
            int pos = x-1;
            while(pos >= 0 && m_array[pos] > temp){
                m_array[pos+1] = m_array[pos]; //shift item up
                pos--;
            }
            m_array[pos+1] = temp; //insert item at the empty spot
        }
    }

    public void selectionSort(){
        for (int i = 0; i < numElements-1; i++){
            int sm = i;
            for (int j = i+1; j < numElements; j++){
                if (m_array[j] < m_array[sm])
                    sm = j;
            }
            int temp = m_array[i];
            m_array[i] = m_array[sm];
            m_array[sm] = temp;
        }
    }

    public int binarySearch(int key){
        int lo = 0, hi = numElements-1, mid;
        while(lo <= hi){
            mid = (lo + hi) / 2; //find the midpoint
            if(m_array[mid] == key){
                return mid;
            }
            if(m_array[mid] < key){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }

        return -1;
    }
}
