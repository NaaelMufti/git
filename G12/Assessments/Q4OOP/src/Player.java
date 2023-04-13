public class Player extends GameCharacter
{
    private int xp;


    public Player(int xp)
    {
        this.xp = xp;
        GameCharacter.charCounter++;
    }

    public int getXp()
    {
        return xp;
    }

    public void setXp(int xp)
    {
        this.xp = xp;
    }

    public void addXP()
    {
        xp = xp+1;
    }

    @Override
    public String toString()
    {
        return super.toString() + " Player{ xp = " + xp;
    }
}
