public class PS_Player {
    protected int gamerLvl;
    protected String gamerTag;

    public PS_Player(int gLvl, String gTag){
        this.gamerLvl = gLvl;
        this.gamerTag = gTag;
    }

    public String toString(){ return String.format("Gamer: %s\nTrophy Level: %d", gamerTag, gamerLvl);}
}
