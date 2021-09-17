package pbo;

abstract class Character{
    private double healthPoint;
    private double attackDamage;
    private double defense;
    private int level;
    private boolean status;
    //seter getter
    public double getHealthPoint() {
        return healthPoint;
    }
    public void setHealthPoint(double healthPoint) {
        this.healthPoint = healthPoint;
    }
    public double getAttackDamage() {
        return attackDamage;
    }
    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }
    public double getDefense() {
        return defense;
    }
    public void setDefense(double defense) {
        this.defense = defense;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    //attack move
    public void attack(Character target){
        if(getHealthPoint()>0 && target.getHealthPoint()>0){
            spawnIntro();
            target.reviewDamage(getAttackDamage());
        }else if(getHealthPoint()==0){
            System.out.println("Can't Attack already Died!!");
            target.reviewDamage(0+target.getDefense());
        }else if(target.getHealthPoint()==0){
            System.out.println("Target Already Dead!!");
            target.reviewDamage(0);
        }
    }
    public void reviewDamage(double damage){
        if(getHealthPoint()>0){
            setHealthPoint(Math.max(0,getHealthPoint()-(damage-getDefense())));
        }else if(getHealthPoint()==0){
            setStatus(false);
        }
    }
    //status
    public void checkStatus(){
        System.out.println("Level : "+getLevel());
        System.out.println("HP  : "+getHealthPoint()+"\tDEF : "+getDefense());
        System.out.println("ATK : "+getAttackDamage()+"\tLife Status : "+isStatus());
    }
    abstract void spawnIntro();   
}

class Assassin extends Character implements CriticalDamage{
    Assassin (int level){
        super.setLevel(level);
    }
    double health = 2500, defense = 200, attack = 750,bonus;
     public void Status(){
        this.plusDamage();
        super.setHealthPoint(health+(getLevel()*80));
        super.setDefense(defense+(getLevel()*10));
        super.setAttackDamage(attack+(getLevel()*25)+bonus);
        super.setStatus(true);
        super.checkStatus();
    }
    @Override
    void spawnIntro() {
        System.out.println("I'm coming from the shadow!!");
    }   
    @Override
    public void plusDamage() {
        bonus= (attack+(getLevel()*25))*0.2;
    }
}
interface CriticalDamage{
    public void plusDamage();
}
class Tank extends Character{
    Tank (int level){
        super.setLevel(level);
    }
    double health =5000, defense = 400, attack = 400;
    public void Status(){
        super.setHealthPoint(health+(getLevel()*150));
        super.setDefense(defense+(getLevel()*15));
        super.setAttackDamage(attack+(getLevel()*10));
        super.setStatus(true);
        super.checkStatus();
    }
    @Override
    void spawnIntro() {
        System.out.println("Have a taste of my hammer!!");
    }    
}

class Warrior extends Character{
    Warrior (int level){
        super.setLevel(level);
    }
    double health =3000, defense = 250, attack = 800;
     public void Status(){
        super.setHealthPoint(health+(getLevel()*100));
        super.setDefense(defense+(getLevel()*10));
        super.setAttackDamage(attack+(getLevel()*15));
        super.setStatus(true);
        super.checkStatus();
    }
    @Override
    void spawnIntro() {
        System.out.println("I'll slash you to the pieces!!");
    }
    
}

public class Kegiatan2Modul4 {
    public static void main(String args[]) {
        int i=1;
        Tank p1 = new Tank(2);
        Assassin p2 = new Assassin(3);
        System.out.println("====Player 1====");
        p1.Status();
        System.out.println("====Player 2====");
        p2.Status();
        System.out.println("\n######Round Start######");
        while(true){
            if(p1.isStatus()==true && p2.isStatus()==true){
                System.out.println("\n===Turn "+i+"===");
                System.out.println("=-Player 1 Move-=");
                p1.attack(p2);
                System.out.println("Player 2 Remaining HP : "+p2.getHealthPoint());
                System.out.println("=-Player 2 Move-=");
                p2.attack(p1);
                System.out.println("Player 1 Remaining HP : "+p1.getHealthPoint());
                i++;
            }else if(p1.isStatus()==false){
                System.out.println("\nWinner : Player 2");
                System.exit(0);
            }else if(p2.isStatus()==false){
                System.out.println("\nWinner : Player 1");
                System.exit(0);
            }   
        }
    }
}
