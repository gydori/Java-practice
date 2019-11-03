public class Video implements Kolcsonozheto {
    protected String title;
    protected boolean isRented;
    protected RentTime rentTime;
    protected AgeLimit ageLimit;

    public Video(String title, RentTime rentTime, AgeLimit ageLimit) {
        this.title = title;
        this.isRented = true;
        this.rentTime = rentTime;
        this.ageLimit = ageLimit;
    }

    public boolean kikolcsonoz(int age, int time) throws HibasKolcsonzesException {
        boolean isAgeOk = false;
        switch (this.ageLimit) {
            case _0:
                isAgeOk = true;
                break;
            case _12:
                isAgeOk = age >= 12 ? true : false;
                break;
            case _16:
                isAgeOk = age >= 16 ? true : false;
                break;
            case _18:
                isAgeOk = age >= 18 ? true : false;
                break;
        }
        boolean isTimeOk = false;
        switch (this.rentTime) {
            case EGYNAPOS:
                isTimeOk = time <= 1 ? true : false;
                break;
            case KÉTNAPOS:
                isTimeOk = time <= 2 ? true : false;
                break;
            case KORLÁTLAN:
                isTimeOk = true;
                break;
        }
        if (isAgeOk == false || isTimeOk == false) {
            throw new HibasKolcsonzesException();
        } else {
            if (this.isRented == true) {
                return false;
            } else {
                return true;
            }
        }
    }

    public void visszahoz() {
        this.isRented = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public RentTime getRentTime() {
        return rentTime;
    }

    public void setRentTime(RentTime rentTime) {
        this.rentTime = rentTime;
    }

    public AgeLimit getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(AgeLimit ageLimit) {
        this.ageLimit = ageLimit;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", isRented=" + isRented +
                ", rentTime=" + rentTime +
                ", ageLimit=" + ageLimit +
                '}';
    }

    protected enum RentTime {
        EGYNAPOS,
        KÉTNAPOS,
        KORLÁTLAN;
    }

    protected enum AgeLimit {
        _0,
        _12,
        _16,
        _18;
    }
}
