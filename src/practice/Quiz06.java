package practice;

public class Quiz06 {
    public static void main(String[] args) {

        GameCharacter gameCharacter = new GameCharacter("귤", 10, 100);
        GameCharacter gameCharacter1 = new GameCharacter("오렌지", 15, 150);

        gameCharacter.attack();
        gameCharacter1.takeDamage(30);
        gameCharacter1.attack();
        gameCharacter.takeDamage(50);
        gameCharacter.attack();
        gameCharacter1.takeDamage(50);
        gameCharacter1.attack();
        gameCharacter.takeDamage(50);
    }
}
