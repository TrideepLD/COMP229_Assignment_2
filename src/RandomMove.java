import java.util.*;

public class RandomMove implements MoveStrategy {

    @Override
    public Cell chooseNextLoc(List<Cell> possibleLocs) {
        int i = (new Random()).nextInt(possibleLocs.size());
        return possibleLocs.get(i);
    }

    @Override
    public String toString(){
        return "random movement strategy";
    }

}