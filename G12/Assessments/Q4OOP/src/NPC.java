public class NPC extends GameCharacter
{
    private boolean isEnemy;

    public NPC()
    {

    }
    public NPC(boolean isEnemy)
    {
        this.isEnemy = isEnemy;
    }

    public boolean isEnemy()
    {
        return isEnemy;
    }

    public void setEnemy(boolean enemy)
    {
        isEnemy = enemy;
    }

    @Override
    public String toString()
    {
        return "NPC{" + "isEnemy=" + isEnemy + '}';
    }
}
