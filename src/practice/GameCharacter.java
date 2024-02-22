package practice;

public class GameCharacter {

/*
    GameCharacter

    attack() : 콘솔에 "name attacks!" 메시지를 출력하는 메서드
    takeDamage(int damage): 캐릭터가 받은 데미지를 health에서 차감하는 메서드

    메인 메서드에서 두 캐릭터를 생성하고 공격을 받고 피해 받는 것을 주고받아보세요.
*/

    private String characterName;
    private int level;
    private int health;

    public GameCharacter(String characterName, int level, int health) {
        this.characterName = characterName;
        this.level = level;
        this.health = health;
    }

    public void attack() {
        System.out.println(characterName + "의 공격! (Lv." + level + ")");
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (damage < 0) {
            System.out.println("잘못된 입력입니다.");
        }
        if (health > 0) {
            System.out.println("상대방의 공격으로 " + characterName + "의 에너지가 " + damage + "만큼 차감되었습니다. 남은 에너지는 " + health + "입니다.");
        } else if (health == 0) {
            System.out.println(characterName + "님의 패배로 경기를 종료합니다.");
        }
    }
}
