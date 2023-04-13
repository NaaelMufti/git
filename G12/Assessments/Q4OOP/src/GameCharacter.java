import java.lang.reflect.Array;
import java.util.ArrayList;

public class GameCharacter
{
    private String name;
    private int health;
    private int attackPower;
    private int charCounter;

    public GameCharacter()
    {

    }

    public GameCharacter(String name, int health, int attackPower, int charCounter)
    {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.charCounter = charCounter;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getCharCounter() {
        return charCounter;
    }

    public void setCharCounter(int charCounter) {
        this.charCounter = charCounter;
    }
}
