package Human;

public class ArrayListImplementation {

    int [ ] array;
  private   int size;

  public ArrayListImplementation( int capacity) {
      this.array = new int[capacity];
      size = 0;
  }

    public void add(int element){
        if (array.length == size ){
            grow();
        }
        array[size] = element;
        size++;
    }

    private void grow() {
      int newSize = array.length * 2;
      int [] neewArray =new int[newSize];
      for (int i = 0; i < array.length; i++){
          neewArray[i] = array[i];
      }
        array = neewArray;
    }

    public int size(){
        return size;
    }

    public void  print(){

        String arrayList = "[";

        for ( int i = 0; i < size; i++){
            arrayList += array[i];
            if ( i != size -1){
                arrayList += ",";
            }
        }
      arrayList += "]";

        System.out.println(arrayList);

    }

    public void remove ( int index){

      for ( int i = index; i < size; i++){
          array [i]= array [i+1];
      }
       array [size -1]=0;
      size--;
    }

    public void add(int index, int value){
      if ( array.length == size){
          grow();
      }
           for ( int i= size-1 ;i >= index; i--){
               array[i] = array [i-1];
               size++;
        }
    }

}
