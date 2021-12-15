class CircularQueue_622 {
    int front = 0;//队首指针
    int rear = 0;//队尾指针
    int size;
    int data[];//顺序队列;//顺序队列

    //构造器
    public CircularQueue_622(int size) {
        this.size = size;
        data = new int[size + 1];
    }

    /**
     * 从队首获取元素。如果队列为空，返回 -1
     */
    int Front() {
        if (isEmpty()) {
            return -1;
        }
        int temp = (front + 1) % data.length;
        return data[temp];
    }

    /**
     * 获取队尾元素。如果队列为空，返回 -1
     */
    int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return data[rear];
    }

    /**
     * 向循环队列插入一个元素。如果成功插入则返回真
     */
    boolean enQueue(int val) {
        //判断队列是否已满
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % data.length;
        data[rear] = val;
        return true;
    }

    /**
     * 从循环队列中删除一个元素。如果成功删除则返回真
     */
    boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % data.length;
        return true;
    }

    /**
     * 检查循环队列是否为空
     */
    boolean isEmpty() {
        if (rear == front) {
            return true;
        }
        return false;
    }

    /**
     * 判断循环队列是否已满
     */
    boolean isFull() {
        if ((rear + 1) % data.length == front) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        CircularQueue_622 circularQueue622 = new CircularQueue_622(3); // 设置长度为 3
        System.out.println(circularQueue622.enQueue(1)); // 返回 true
        System.out.println(circularQueue622.enQueue(2)); // 返回 true
        System.out.println(circularQueue622.enQueue(3)); // 返回 true
        System.out.println(circularQueue622.enQueue(4)); // 返回 false，队列已满
        System.out.println(circularQueue622.Rear()); // 返回 3
        System.out.println(circularQueue622.isFull()); // 返回 true
        System.out.println(circularQueue622.deQueue()); // 返回 true
        System.out.println(circularQueue622.enQueue(4));// 返回 true
        System.out.println(circularQueue622.Rear()); // 返回 4


    }
}
