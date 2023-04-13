import java.util.ArrayList;

public class Interaction
{
    private Player player;
    private ArrayList<NPC> npcs = new ArrayList<>();

    public Interaction()
    {

    }

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

    public void outcome(NPC npc)
    {
        if(npc.isEnemy()) // is an Enemy so fight
        {
            if(npc.getHealth() < player.getAttackPower()) // greater AP then health so win
            {

            }
        }
    }
}
