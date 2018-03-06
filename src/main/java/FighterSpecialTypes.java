public enum FighterSpecialTypes {

    BERZERK(40),
    CLEAVE(30);


    private int special;

    FighterSpecialTypes(int special) {
        this.special = special;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }
}
