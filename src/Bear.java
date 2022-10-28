import java.awt.*;

public class Bear extends Critter {
    boolean polar;
    int i =0;
    public Bear(boolean polar) {
        this.polar = polar;
    }
    public Color getColor() {
        if (polar) {
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }
    }
    public String toString() {
        if(i%2==0) {
            return "/";
        } else {
            return "\\";
        }
    }
    public Action getMove(CritterInfo info) {
        i++;
        if (info.frontThreat()) {
            return Action.INFECT;
        } else if (info.getFront()==Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.LEFT;
        }
    }
}
