package interface00.ex03;

public class Healer extends Character implements Healable {

    public Healer(String name) {
        super(name);
    }

    @Override
    public void heal(Character character) {
        System.out.println("<" + name + ">님이 " + "<" + character.name + ">님을 치유합니다.");
    }
}
