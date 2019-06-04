package main;
import ds.*;
public class StockSpan {
    static class Stock {
        public Integer value;
        public Integer count = 1;
        public Stock(Integer value) {
            this.value =  value;
        }
    }
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        Integer data = stack.pop();
        int stocks[] = {100, 80, 60, 70, 60, 75, 85};
        // while (data != null) {
        //     System.out.println(data);
        //     data = stack.pop();
        // }
        Stack<Stock> stockStack = new Stack<Stock>();
        int result[] = new int[stocks.length];
        for (int i = 0; i < stocks.length; i++) {
            int stockValue = stocks[i];
            Stock stock = new Stock(stockValue);
            while (stockStack.poll() != null && stockStack.poll().value <= stockValue) {
                Stock curr = stockStack.pop();
                stock.count += curr.count;
            }
            result[i] = stock.count;
            stockStack.push(stock);
        }
        for (int res : result) {
            System.out.println(res);
        }
    }

}
