public abstract class Hero {

    private String name;
    private String classType;
    private int hpMax;
    private int mpMax;
    private int baseAttack;
    private WeaponTypes weapon;
    private int baseAc;
    private int xp;
    private int hit;


    public Hero(String name, String classType, int hpMax, int mpMax, int baseAttack, WeaponTypes weapon, int baseAc) {
        this.name = name;
        this.classType = classType;
        this.hpMax = hpMax;
        this.mpMax = mpMax;
        this.baseAttack = baseAttack;
        this.weapon = weapon;
        this.baseAc = baseAc;
        this.xp = 0;
        this.hit = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public int getHpMax() {
        return hpMax;
    }

    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    public int getMpMax() {
        return mpMax;
    }

    public void setMpMax(int mpMax) {
        this.mpMax = mpMax;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public WeaponTypes getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponTypes weapon) {
        this.weapon = weapon;
    }

    public int getBaseAc() {
        return baseAc;
    }

    public void setBaseAc(int baseAc) {
        this.baseAc = baseAc;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int attack(int slot, Enemy enemy) {
        this.hit = this.getBaseAttack() + (this.getWeapon().getDamage());
        enemy.setHp(enemy.getHp() - this.getHit());
        return this.getHit();
    }
}
