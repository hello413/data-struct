package java15_0401;

import java.util.Stack;

class StockSpanner {
    Stack<Integer> prices, weights;

    public StockSpanner() {
        prices = new Stack();
        weights = new Stack();
    }

    public int next(int price) {
        int w = 1;
        while (!prices.isEmpty() && prices.peek() <= price) {
            prices.pop();
            w += weights.pop();
        }

        prices.push(price);
        weights.push(w);
        return w;
    }

    public static void main(String[] args) {
        StockSpanner stockSpanner =new StockSpanner();
        stockSpanner.next(100);
        stockSpanner.next(80);
        stockSpanner.next(60);
        stockSpanner.next(70);
        stockSpanner.next(60);
        stockSpanner.next(75);
        stockSpanner.next(85);
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */