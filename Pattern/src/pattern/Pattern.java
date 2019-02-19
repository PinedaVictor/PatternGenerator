/*
 * Programmer: Victor Pineda
 */
package pattern;
import Tools.ArrayGenerator;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
public class Pattern {
    
    protected ArrayGenerator n = new ArrayGenerator();
    private int minRange, maxRange, size;    
    private int pathCount;
    private int[] xDim = n.generateIntArray(getSize(), getMinRange(), getMaxRange());
    private int[] yDim = n.generateIntArray(getSize(), getMinRange(), getMaxRange());
    
    //Getter Methods
    public int getMinRange(){
        return minRange;
    }
    public void setMinRange(int newMinRange){
        minRange = newMinRange;
    }    
    public int getMaxRange(){
        return maxRange;
    }
    public int getPathCount(){
        return pathCount;
    }
    
    //Setter Methods
    public void setMaxRange(int newMaxRange){
        maxRange = newMaxRange;
    }    
    public int getSize(){
        return size;
    }
    public void setSize(int newSize){
        size = newSize;
    }       
    public void setPathCount(int newPathCount){
        pathCount = newPathCount;
    }
    
    
    public MoveTo[] generateLocation(int numberOfSpots){
        numberOfSpots = this.getSize();
        MoveTo[] moves = new MoveTo[numberOfSpots];
        int[] xD = n.generateIntArray(numberOfSpots, getMinRange(), getMaxRange());
        int[] yD = n.generateIntArray(numberOfSpots, getMinRange(), getMaxRange());
        
        for(int index = 0; index < numberOfSpots; index++){
            moves[index] = new MoveTo(xD[index], yD[index]);
        }
        return moves;        
    }
    
        public LineTo[] getLinePattern(int pathCount) {
        pathCount = this.getPathCount();
        LineTo[] linePath = new LineTo[pathCount];
        for (int index = 0; index < pathCount; index++) {
            linePath[index] = new LineTo(xDim[index], yDim[index]);
        }
        return linePath;
    }
}
