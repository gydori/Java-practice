public class PrimeTester implements Runnable {
    private Prime p;
    private long min;
    private long max;

    public PrimeTester(Prime p, long min, long max) {
        this.p = p;
        this.min = min;
        this.max = max;
    }

    public Prime getP() {
        return p;
    }

    public void setP(Prime p) {
        this.p = p;
    }

    public long getMin() {
        return min;
    }

    public void setMin(long min) {
        this.min = min;
    }

    public long getMax() {
        return max;
    }

    public void setMax(long max) {
        this.max = max;
    }

    public boolean hasDivider() {
        for (long i = min; i < max; i++) {
            if (p.getNum() % i == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void run() {
        if (hasDivider()) {
            p.setPrime(false);
        }
    }
}
