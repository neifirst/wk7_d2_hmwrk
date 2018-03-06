public enum ClericSpellTypes {

    SMITE(20),
    CURELIGHTWOUNDS(-20);


    private int clericSpell;

    ClericSpellTypes(int clericSpell) {
        this.clericSpell = clericSpell;
    }

    public int getClericSpell() {
        return clericSpell;
    }

    public void setClericSpell(int clericSpell) {
        this.clericSpell = clericSpell;
    }
}
