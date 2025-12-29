public class GameLogic {
    private final int TILE_SIZE = 30;
    private final int SCREEN_WIDTH = 600;
    private final int SCREEN_HEIGHT = 600;
    private final int TOTAL_TILES = (SCREEN_HEIGHT * SCREEN_WIDTH) / (TILE_SIZE * TILE_SIZE);

    public int[] x = new int[TOTAL_TILES];
    public int[] y = new int[TOTAL_TILES];
    private int snake_size;
    public int foodX;
    public int foodY;
    public boolean isMovingLeft = false;
    public boolean isMovingRight = true;
    public boolean isMovingUp = false;
    public boolean isMovingDown = false;
    public boolean isGameRunning = true;
}
