public class NPC extends GameCharacter
{
    private boolean isEnemy;
    
    public NPC(boolean isEnemy)
    {
        this.isEnemy = isEnemy;
        GameCharacter.charCounter++;
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
        return super.toString() + " NPC{ is Enemy= " + isEnemy;
    }
}
