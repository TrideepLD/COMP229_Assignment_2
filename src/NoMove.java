import java.util.*;

public class NoMove implements MoveStrategy {

    @Override
    public Cell chooseNextLoc(List<Cell> possibleLocs) {
        int i = 0;
        return possibleLocs.get(i);
    }

    @Override
    public String toString(){
        return "NEIN NEIN NEIN";
    }

}