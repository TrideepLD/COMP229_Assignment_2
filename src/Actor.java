import java.awt.*;
import java.util.ArrayList;

public abstract class Actor {
    Color colour;
    Cell loc;
    ArrayList<Polygon> display;
    MoveStrategy strat;
    float redness;
    int turns;
    int moves;
    int range;

    public void paint(Graphics g){
        for(Polygon p: display){
            g.setColor(new Color(redness, 0f, 1f-redness));
            g.fillPolygon(p);
            g.setColor(Color.GRAY);
            g.drawPolygon(p);
        }
    }

    public abstract void setPoly();

    public boolean isTeamRed(){
        return redness >= 0.5;
    }

    public void setLocation(Cell loc){
        this.loc = loc;
        this.strat = new RandomMove();
        if (this.loc.movementCost() == 10000) {
            return;
        }
        setPoly();
        
    }

    public void makeRedder(float amt){
        redness = redness + amt;
        if(redness > 1.0f){
            redness = 1.0f;
        }
    }
}