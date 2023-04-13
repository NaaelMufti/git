import java.lang.reflect.Array;
import java.util.ArrayList;

public class GameCharacter
{
    protected static int charCounter;
    private String name;
    private int health;
    private int attackPower;

    public GameCharacter()
    {

    }

    public GameCharacter(int charCounter)
    {
        this.charCounter = charCounter;
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

    public static int getCharCounter()
    {
        return charCounter;
    }

    @Override
    public String toString()
    {
        return "GameCharacter{" + "name='" + name + '\'' + ", health=" + health + ", attackPower=" + attackPower +
                ", charCounter=" + charCounter + '}';
    }
}
