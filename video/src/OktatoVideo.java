public final class OktatoVideo extends Video {
    public OktatoVideo(String title, RentTime rentTime) {
        super(title, rentTime, AgeLimit._0);
    }

    public boolean kikolcsonoz(int age, int time) throws HibasKolcsonzesException {
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
        if (isTimeOk == false) {
            throw new HibasKolcsonzesException();
        } else {
            if (this.isRented == true) {
                return false;
            } else {
                return true;
            }
        }
    }
}
