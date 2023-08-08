package org.example;
interface Repairable{}
interface Heal{}
class Units{
    int hitPoint;
    final int MAX_HP;
    Units(int hp){
        MAX_HP = hp;
    }
}
class GroundUnits extends Units{
    GroundUnits(int hp){
        super(hp);
    }
}
class AirUnits extends Units{
    AirUnits(int hp){
        super(hp);
    }
}
class Tank extends GroundUnits implements Repairable{
    Tank(){
        super(150);
        hitPoint = MAX_HP;
    }
    public String toString(){
        return "Tank";
    }
}
class DropShip extends AirUnits implements Repairable{
    DropShip(){
        super(120);
        hitPoint = MAX_HP;
    }
    public String toString(){
        return "DropShip";
    }
}
class Marin extends GroundUnits implements Heal{
    Marin(){
        super(80);
        hitPoint = MAX_HP;
    }
    public String toString(){
        return "Marin";
    }
}
class SCV extends GroundUnits implements Repairable{
    SCV(){
        super(100);
        hitPoint = MAX_HP;
    }
    public String toString(){
        return "SCV";
    }
    public void repair(Repairable r){
        if(r instanceof Units){
            Units u = (Units) r;
            while(u.hitPoint != u.MAX_HP){
                u.hitPoint++;
            }
            System.out.println(u.toString()+"의 수리를 마쳤습니다.");
        }
    }
}
class Medic extends GroundUnits implements Heal{
    Medic(){
        super(105);
        hitPoint = MAX_HP;
    }
    public String toString(){
        return "Medic";
    }
    public void Heal(Heal h){
        if(h instanceof Units){
            Units u = (Units)h;
            while(u.hitPoint != u.MAX_HP){
                u.hitPoint++;
            }
            System.out.println(u.toString()+"의 치료를 끝냈습니다.");
        }
    }
}
public class RepairableTestEx_1 {
    public static void main(String[] args) {
        SCV scv = new SCV();
        Medic medic = new Medic();
        Marin marin = new Marin();
        Tank tank = new Tank();
        DropShip dropShip = new DropShip();

        scv.repair(scv);
        scv.repair(tank);
        scv.repair(dropShip);
        medic.Heal(marin);

    }
}
