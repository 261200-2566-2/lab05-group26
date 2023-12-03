public class Sword implements AttackEquipment{

    private int level;
    private int atk;

    Sword(int atk, int level){
        this.atk = atk;
        this.level = level;
    }

    Sword(int atk){
        this(atk, 1);
    }

    public void levelUp(Character c){
        level++;
        System.out.println("Sword Level Up ++ [Lvl. " + level + "]!!");
        setRunSpeed(c);
    }

    public void setRunSpeed(Character c) {
        c.runSpeed = c.max_runSpeed - (30+10*(level*0.1));
    }

    public double attackValue(){
        return atk*(1+0.1*level);
    }
    
}
