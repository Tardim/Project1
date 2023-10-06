public class Hero {
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private int money;

    public Hero(int hp,int attack,int defense, int speed, int money){
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.money = money;
    }
    public Hero(){
        hp = 25;
        attack = 5;
        defense = 5;
        speed = 5;
        money = 50;
    }
    public int getHp(){
        return hp;
    }
    public int getAttack(){

        return attack;
    }
    public int getDefense(){
        return defense;
    }
    public int getSpeed(){
        return speed;
    }
    public int getMoney(){

        return money;
    }
    public void setHp(int inputHp){
        hp = inputHp;
    }
    public void setAttack(int inputAttack){
        attack = inputAttack;
    }
    public void setDefense(int inputDefense){
        defense = inputDefense;
    }
    public void setSpeed(int inputSpeed){
        speed = inputSpeed;
    }
    public void setMoney(int inputMoney){
        money = inputMoney;
    }
}
