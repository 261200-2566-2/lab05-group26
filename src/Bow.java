public class Bow implements BowI{
    
    private int level;
    private int atk;
    private int arrow;

    Bow(int atk, int level){
        this.atk = atk;
        this.level = level;
        this.arrow = 50;
    }

    Bow(int atk){
        this(atk, 1);
    }

    public void levelUp(Character c){
        level++;
        System.out.println("Bow Level Up ++ [Lvl. " + level + "]!!");
        setRunSpeed(c);
    }

    public void setRunSpeed(Character c) {
        c.runSpeed = c.max_runSpeed - (25+10*(level*0.1));
    }

    public void reloadArrows(){
        arrow += 5;
        System.out.println("Arrow reloaded !! [ +5 arrows ]");
    }

    public double attackValue(){
        if(arrow <= 0) {
            System.out.println("Out of arrows. Please reload arrows.");
            return 0;
        }
        return atk*(1+0.09*level);
    }
}
