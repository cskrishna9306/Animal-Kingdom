import java.awt.*;

public class WhiteTiger extends Critter {
    int i =0;
    public WhiteTiger() {    }
    public Color getColor() {
        return Color.WHITE;
    }
    public String toString() {
        if (i!=1) {
            return "tgr";
        } else {
            return "TGR";
        }
    }
    public Action getMove(CritterInfo info) {
        if (info.frontThreat()) {
            i = 1;
            return Action.INFECT;
        } else if ((info.getFront()==Neighbor.WALL)||(info.getRight()==Neighbor.WALL)) {
            return Action.LEFT;
        } else if (info.getFront()==Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}
