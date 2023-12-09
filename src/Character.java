public class Character implements CharacterI{
    protected String name;
    protected int level;
    protected double hp;
    protected double max_hp;
    protected double mana;
    protected double max_mana;
    protected double runSpeed;
    protected double max_runSpeed;
    protected double damage;
    protected boolean armor_equip;
    protected boolean boots_equip;
    protected Armor armor;
    protected Boots boots;

    public Character(String name, int level){
        this.name = name;
        this.level = level;
        this.max_hp = this.hp = 100*10*level;
        this.max_mana = this.mana = 50+2*level;
        this.max_runSpeed = this.runSpeed = 100;
        this.damage = 15; // Punch damage initialization
        System.out.println("Create Hero Name : " + name);
    }

    public double characterDefense(){
        return (armor_equip ? armor.defenseValue() : 0) + (boots_equip ? boots.defenseValue() : 0);
    }

    public void receiveDamage(double damage){
        if((characterDefense() - damage) >= 0)
            this.hp = hp + 0;
        else
            this.hp = hp + characterDefense() - damage;
    };

    public void levelUp(){
        this.level++;
        this.max_hp = this.hp = 100*10*level;
        this.max_mana = this.mana = 50+2*level;
        System.out.println(name + "Level Up +++ !!! [Lvl." + level + "]");
    };


    public void setArmor(){
        armor = new Armor(120);
        armor.setRunSpeed(this);
        armor_equip = true;
        System.out.println("---------------------------------------------------");
        System.out.println("Hero : " + this.name);
        System.out.println("Equip a Armor ....");
        System.out.println("Armor Defense : " + armor.defenseValue());
        System.out.println("---------------------------------------------------");
    };

    public void clearArmor(){
        armor_equip = false;
        System.out.println("---------------------------------------------------");
        System.out.println("Equip a Shield ....");
        System.out.println("Shield Defense : " + armor.defenseValue());
        System.out.println("---------------------------------------------------");
    };

    public void armorLevelUp(){
        armor.levelUp(this);
        System.out.println("---------------------------------------------------");
        System.out.println("Hero : " + this.name);
        System.out.println("Shield LevelUp .....");
        System.out.println("Shield Defense : " + armor.defenseValue());
        System.out.println("---------------------------------------------------");
    };

    public void setBoots(){
        boots = new Boots(40);
        boots.setRunSpeed(this);
        boots_equip = true;
    };

    public void clearBoots(){
        boots_equip = false;
    };
    
    public void bootsLevelUp(){
        boots.levelUp(this);
    };
}