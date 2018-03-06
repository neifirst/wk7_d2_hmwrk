public class Enemy {

    private String classType;
    private int hpMax;
    private int hp;
    private int mpMax;
    private int mp;
    private int attack;
    private int ac;


    public Enemy(String classType, int hpMax, int mpMax, int attack, int ac) {
        this.classType = classType;
        this.hpMax = hpMax;
        this.hp = this.getHpMax();
        this.mpMax = mpMax;
        this.mp = this.getMpMax();
        this.attack = attack;
        this.ac = ac;
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

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}
