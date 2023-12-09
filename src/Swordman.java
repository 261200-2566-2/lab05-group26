public class Swordman extends Character implements SwordsmanI {
    
    protected Sword sword;
    protected boolean sword_equip;

    Swordman(String name, int level) {
        super(name, level);
        status();
    }
    
    public void attack(Character c){
        double val = damage + (sword_equip ? sword.attackValue() : 0);;
        c.receiveDamage(val);
        System.out.println("---------------------------------------------------");
        System.out.println(this.name + " attack " + c.name);
        System.out.println(this.name + " +atk : " + val);
        System.out.println(c.name + " -def : " + c.characterDefense());
        if (val <= c.characterDefense())
            System.out.println("total atk : 0");
        else
            System.out.println("total atk : " + (val - c.characterDefense()));
        System.out.println(c.name + "HP : "+ c.hp);
        System.out.println("---------------------------------------------------");
    };

    public void setSword(){
        sword = new Sword(70);
        sword_equip = true;
        sword.setRunSpeed(this);
        System.out.println("---------------------------------------------------");
        System.out.println("Hero : " + this.name);
        System.out.println("Equip a Sword ....");
        System.out.println("Sword Damage : " + sword.attackValue());
        System.out.println("---------------------------------------------------");
    };

    public void clearSword(){
        sword_equip = false;
        System.out.println("---------------------------------------------------");
        System.out.println("Hero : " + this.name);
        System.out.println("Now Not Have Sword");
        System.out.println("---------------------------------------------------");
    };

    public void swordLevelUp(){
        sword.levelUp(this);
        System.out.println("---------------------------------------------------");
        System.out.println("Hero : " + this.name);
        System.out.println("Sword LevelUp .....");
        System.out.println("Sword Damage : " + sword.attackValue());
        System.out.println("---------------------------------------------------");
    };

    public void status(){
        System.out.println("---------------------------------------------------");
        System.out.println("Status :");
        System.out.println("Name : " + this.name);
        System.out.println("Career : SwordMan" );
        System.out.println("Level : " + this.level);
        System.out.println("HP : " + this.hp);
        System.out.println("Mana : "+ this.mana);
        System.out.println("Damage : " + (this.damage + (this.sword_equip ? this.sword.attackValue() : 0)));
        System.out.println("RunSpeed : "+this.runSpeed);
        if(this.sword_equip)
            System.out.println("Sword : Have Sword") ;
        else
            System.out.println("Sword : Not Have Sword");
        if(this.armor_equip)
            System.out.println("Armor : Have Armor") ;
        else
            System.out.println("Armor : Not Have Armor");
        System.out.println("---------------------------------------------------");
    };
}
