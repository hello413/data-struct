package java_0918;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Node implements Comparable<Node>{
    Character val;
    Character next;

    public Node(Character val, Character next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public int compareTo(Node node) {
        return this.val.compareTo(node.val);
    }
}

public class Main1 {
    public static String removeOneConnection(List<Node> list){
        List<Character> li = new ArrayList<>();
        while (list.size()>0){
            Node node = list.remove(0);
            li.add(node.val);
            Character next = node.next;
            if (li.contains(next))
                return "N";
        }
        return "Y";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n==0){
            System.out.println("N");
        }
        in.nextLine();

        List<Node> list = new ArrayList<>();
        while (n-->0){
            String line = in.nextLine();
            Node node = new Node(line.charAt(0),line.charAt(3));
            list.add(node);
        }
        Collections.sort(list);
        System.out.println(removeOneConnection(list));
    }
}
