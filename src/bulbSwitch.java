public class bulbSwitch {
    //超时
//    public int bulbSwitch(int n) {
//        int count = 0;
//        if (n == 0)
//            return 0;
//        if (n == 1)
//            return 1;
//        if (n >= 2) {
//            for (int i = 1; i <= Math.sqrt(n); i++) {
//                if (getFactors(i) == 1)
//                    count++;
//            }
//        }
//        return count;
//    }
//    //输入一个数，输出这个数的所有因子，并返回因子的个数
//
//    int getFactors(int n) {
//        int count = 0;
//
//        if (n == 0)
//            return count;
//        else if (n == 1)
//            return 1;
//        else {
//            for (int i = 2; i <= Math.sqrt(n); i++) {
//                if (n % i == 0) {
//                    if (n == i * i)
//                        count++;
//                    else
//                        count += 2;
//                }
//            }
//            return (count+2) % 2;
//        }
//    }

    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n+0.5);
    }

    public static void main(String[] args) {
        bulbSwitch bulbSwitch = new bulbSwitch();
        
        System.out.println(bulbSwitch.bulbSwitch(7));
    }
}