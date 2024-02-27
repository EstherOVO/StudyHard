package interface00.ex03;

public class Mage extends Character implements Attackable {

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attack(Character character) {
        System.out.println(("<" + name + ">님이 " + "<" + character.name + ">님을 공격합니다."));
    }
}
