public class Prime {
    private long num;
    private boolean isPrime;

    public Prime(long num) {
        this.num = num;
        this.isPrime = true;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean prime) {
        isPrime = prime;
    }
}
