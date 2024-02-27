package interface00.ex03;

public class Main_Ex03 {
    public static void main(String[] args) {

/*
        문제 3. 게임 캐릭터 인터페이스 적용

        Attackable과 Healable 인터페이스를 정의합니다.
        Warrior, Mage, Healer 세 가지 캐릭터 클래스를 정의합니다.
        Warrior와 Mage는 Attackable 인터페이스를, Healer는 Healable 인터페이스를 구현합니다.
        모든 캐릭터는 name 속성을 가지며, 생성자를 통해 이름을 초기화할 수 있어야 합니다.
        각 캐릭터는 자신만의 고유한 행동을 가지고 있습니다. (attack, heal 등)
        마지막으로, 이들 캐릭터를 이용하여 간단한 전투 및 치유 시뮬레이션을 실행하는 메인 클래스를 작성합니다.

        메인 클래스
        ====
        public class GameSimulation {
            public static void main(String[] args) {
                Warrior warrior = new Warrior("전사");
                Mage mage = new Mage("마법사");
                Healer healer = new Healer("힐러");

                warrior.attack(mage); // 전사가 마법사를 공격
                mage.attack(warrior); // 마법사가 전사를 공격
                healer.heal(warrior); // 힐러가 전사를 치유
            }
        }

        출력 결과 :
        전사이(가) 마법사을(를) 공격합니다. 강한 공격!
        마법사은(는) 전사에게 마법 공격을 합니다. 불의 화살!
        힐러은(는) 전사을(를) 치유합니다. 치유의 빛!
*/

        Warrior warrior = new Warrior("전사");
        Mage mage = new Mage("마법사");
        Healer healer = new Healer("힐러");

        warrior.attack(mage); // 전사가 마법사를 공격
        mage.attack(warrior); // 마법사가 전사를 공격
        healer.heal(warrior); // 힐러가 전사를 치유
    }
}
