public enum MageSpellTypes {

    MAGICMISSILE(20),
    BURNINGHANDS(20);


    private int mageSpell;

    MageSpellTypes(int mageSpell) {
        this.mageSpell = mageSpell;
    }

    public int getMageSpell() {
        return mageSpell;
    }

    public void setMageSpell(int mageSpell) {
        this.mageSpell = mageSpell;
    }
}
