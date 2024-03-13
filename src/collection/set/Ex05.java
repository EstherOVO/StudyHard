package collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Ex05 {

/*
      연습문제 5. 고유 캐릭터 목록 관리 시스템

      요구사항 :
      Character 클래스 정의
      - 필드 : 캐릭터 ID(String id), 캐릭터 이름(String name)
      - 생성자 : 캐릭터 ID와 이름을 매개변수로 받아 초기화
      - hashCode()와 equals() 메서드 : 캐릭터 ID를 기준으로 오버라이드
      - Main 함수에서 캐릭터 목록 관리

      예시 입력 및 출력

      입력 : 캐릭터 정보(캐릭터 ID와 이름)
      ===
      캐릭터1: 캐릭터 ID "char001", 이름 "Dragon Warrior"
      캐릭터2: 캐릭터 ID "char002", 이름 "Elf Archer"
      캐릭터3: 캐릭터 ID "char001", 이름 "Mystic Mage" (캐릭터 ID가 캐릭터1과 동일)

      출력 : HashSet에 저장된 캐릭터 정보 출력
      ===
      "캐릭터 정보: ID char001, 이름 Dragon Warrior"
      "캐릭터 정보: ID char002, 이름 Elf Archer"
*/

    public static class Character {

        String id;
        String name;

        public Character(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "◇ 캐릭터 아이디 : " + id + " | ◇ 캐릭터명 : " + name;
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;

            if (obj == null || getClass() != obj.getClass()) return false;

            Character character = (Character) obj;
            return Objects.equals(id, character.id);
        }

        public int hashCode() {
            return Objects.hashCode(id);
        }
    }
    public static void main(String[] args) {

        Set<Character> characters = new HashSet<>();

        Character character1 = new Character("char001", "Dragon Warrior");
        Character character2 = new Character("char002", "Elf Archer");
        Character character3 = new Character("char001", "Mystic Mage");

        characters.add(character1);
        characters.add(character2);
        characters.add(character3);

        for (Character character : characters) {
            System.out.println(character);
        }
    }
}
