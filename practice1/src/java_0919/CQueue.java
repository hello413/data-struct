package java_0919;

import java.util.Scanner;

public class CQueue {
    private int front;//指向队首
    private int rear;//指向队尾
    private char[] elem;
    private int maxSize;//最大容量

    public CQueue(int maxSize) {
        this.front = 0;
        this.rear = 0;
        this.elem = new char[maxSize];
        this.maxSize = maxSize;
    }
    public boolean isEmpty(){
        return rear==front;
    }
    public boolean isFull(){
        return  (rear+1)%maxSize==front;
    }
    public void offer(char val){
        if(isFull()){
            Perr++;
            return;
        }
        elem[rear++]=val;
        rear=rear%maxSize;
    }
    public void poll(){
        if(isEmpty()){
            Derr++;
            return;
        }
        front=++front%maxSize;
    }
    public int peek(){
        if(isEmpty())return -1;
        return elem[front];
    }

    @Override
    public String toString() {
        String str="";
        for (int i:elem) {
            str=str+i;
        }
        return str;
    }

    static int Perr = 0;
    static int Derr = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        CQueue c= new CQueue(N);
        String str = in.next();
        while (!str.equals("END")){
            if (str.equals("P")){
                char num = in.next().charAt(0);
                c.offer(num);
            }else if (str.equals("D")){
                c.poll();
            }
            str = in.next();
        }

        System.out.println(Perr);
        System.out.println(Derr);
        if (!c.isFull())
            System.out.println("EMPTY");
        else
            System.out.println(c.toString());
    }
}
