import java.util.ArrayList;

public class Interaction
{
    private Player player;
    private ArrayList<NPC> npcs = new ArrayList<>();


    public Interaction(Player player, ArrayList<NPC> npcs)
    {
        this.player = player;
        this.npcs = npcs;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<NPC> getNpcs() {
        return npcs;
    }

    public void setNpcs(ArrayList<NPC> npcs) {
        this.npcs = npcs;
    }

    public int size()
    {
        return npcs.size();
    }

    public void outcome(NPC npc)
    {
        if(npc.isEnemy()) // is an Enemy so fight
        {
            if(npc.getHealth() < player.getAttackPower()) // greater AP then health so win
            {
                player.addXP();
            }
        }
    }

    @Override
    public String toString()
    {
        return "Interaction{" + "player=" + player + ", npcs=" + npcs + '}';
    }
}
