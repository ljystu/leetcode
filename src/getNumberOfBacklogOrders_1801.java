import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;

class Order {
    private int number;
    private int price;

    Order(int price, int number) {
        this.price = price;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class getNumberOfBacklogOrders_1801 {
    public int getNumberOfBacklogOrders(int[][] orders) {
        PriorityQueue<Order> buyOrders = new PriorityQueue<>((a, b) -> b.getPrice() - a.getPrice());
        PriorityQueue<Order> sellOrders = new PriorityQueue<>((a, b) -> a.getPrice() - b.getPrice());
        for (int[] order : orders) {
            if (order[2] == 0) {

                while (sellOrders.size() != 0 && sellOrders.peek().getPrice() <= order[0]&& order[1]>0)
                    if (sellOrders.peek().getNumber() - order[1] < 0){
                        order[1]-=sellOrders.peek().getNumber();
                        sellOrders.poll();
                    }
                    else{
                        sellOrders.peek().setNumber(sellOrders.peek().getNumber() - order[1]);
                        order[1]=0;}
                if(order[1]>0)
                    buyOrders.offer(new Order(order[0], order[1]));

            } else {

                while(buyOrders.size() != 0 && buyOrders.peek().getPrice() >= order[0]&& order[1]>0){
                    if(buyOrders.peek().getNumber() - order[1]<0){
                        order[1]-=buyOrders.peek().getNumber();
                        buyOrders.poll();
                    }
                    else {
                        buyOrders.peek().setNumber(buyOrders.peek().getNumber() - order[1]);
                        order[1]=0;
                    }
                }
                if(order[1]>0)
                    sellOrders.offer(new Order(order[0], order[1]));
            }
        }
        long res=0;
        for(Order order:buyOrders)
            res+=order.getNumber();
        for(Order order:sellOrders)
            res+=order.getNumber();
        return (int) (res % 1000000007);
    }
}
