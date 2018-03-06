public enum ThiefSpecialTypes {

    RIPOSTE(20),
    BACKSTAB(40);


    private int special;

    ThiefSpecialTypes(int special) {
        this.special = special;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }
}
