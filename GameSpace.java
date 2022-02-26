public class GameSpace {

    private int x;
    private int y;
    private boolean spaceUsed;
    private char markSpace;

    public GameSpace(){

        spaceUsed = false;

    }


    // getters and setters

    public void setSpaceUsed(boolean spaceUsed) {
        this.spaceUsed = spaceUsed;
    }

    public void setMarkSpace(char markSpace) {
        this.markSpace = markSpace;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public boolean getSpaceUsed(){
        return spaceUsed;
    }

    public char getMarkSpace() {
        return markSpace;
    }
    
}
