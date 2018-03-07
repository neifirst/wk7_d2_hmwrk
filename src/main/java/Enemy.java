public abstract class Enemy {

    private String classType;
    private int hpMax;
    private int hp;
    private int attack;
    private int treasure;
    private int expWorth;
    private int hit;


    public Enemy(String classType, int hpMax, int attack, int treasure, int expWorth) {
        this.classType = classType;
        this.hpMax = hpMax;
        this.hp = this.getHpMax();
        this.attack = attack;
        this.treasure = treasure;
        this.expWorth = expWorth;
        this.hit = 0;
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

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getTreasure() {
        return treasure;
    }

    public int getExpWorth() {
        return expWorth;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int attack(Hero hero) {
        this.hit = this.getAttack();
        hero.setHp(hero.getHp() - this.getHit());
        return this.getHit();
    }

    public String die() {
        return this.getClassType() + " is dead!";
    }
}
