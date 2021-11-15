public class isPerfectSquare_367 {
    public boolean isPerfectSquare(int num) {
        double temp = num;
        while (true) {
            temp = temp / 2;
            if (temp * temp <= num)
                break;
        }
        for (int i = (int) temp; i <= temp * 2; i++) {
            if (i * i == num)
                return true;
        }
        return false;
    }
}
