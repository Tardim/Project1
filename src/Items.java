public class Items {
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private int money;


    public int strongSword(){
        return attack + 5;
    }
    public int weakSword(){
        return attack +1;
    }
    public int sharpSword(){
        return attack + 3;
    }
    public int leatherBoots(){
        return speed + 1;
    }
    public int quickBoots(){
        return speed + 3;
    }
    public int lightningBoots(){
        return speed + 5;
    }
    public int woodenHelm(){
        return defense + 1;
    }
    public int ironHelm(){
        return defense + 3;
    }
    public int ironPlateMail(){
        return defense + 5;
    }
}
