public interface CharacterI {
    double characterDefense();
    void receiveDamage(double damage);
    void levelUp();
    void status();
    void setArmor();
    void clearArmor();
    void armorLevelUp();
    void setBoots();
    void clearBoots();
    void bootsLevelUp();
}

interface SwordsmanI extends CharacterI{
    void attack(Character c);
    void setSword();
    void clearSword();
    void swordLevelUp();
}

interface ArcherI extends CharacterI{
    void attack(Character c);
    void setBow();
    void clearBow();
    void BowLevelUp();
}