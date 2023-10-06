public class Monster {
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private int money;

    public Monster(int hp,int attack,int defense, int speed, int money){
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.money = money;
    }
    public Monster(){
        hp = 10;
        attack = 1;
        defense = 1;
        speed = 1;
        money = 25;

    }

}
