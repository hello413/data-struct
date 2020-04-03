public class Loop {
    private int[] array = new int[100];
    //[head,tail)
    private int head = 0;
    private int tail = 0;
    private int size= 0;

    public void offer(int val){
        //元素满了,无法继续插入
        if (size==array.length){
            return;
        }
        array[tail]=val;
        tail++;
        if (tail>=array.length){
            tail=0;
        }
        size++;
    }
    public Integer poll(){
        if (array.length==0){
            return null;
        }
        Integer temp = array[head];
        head++;
        if (head>=array.length){
            head=0;
        }
        size--;
        return temp;
    }
    public Integer peek(){
        if (size == 0 ){
            return null;
        }
        return array[head];
    }
}
