package nscc.ca.Animation;

import java.awt.image.BufferedImage;

public class Textures {

    private BufferedImage blockSheetImg;
    private BufferedImage playerSheetImg;
    private BufferedImage playerJRImg;
    private BufferedImage playerJLImg;
    SpriteSheet blockSheet;
    SpriteSheet playerSheet;
    SpriteSheet playerJRSheet;
    SpriteSheet playerJLSheet;

    public BufferedImage[] block = new BufferedImage[9];
    public BufferedImage[] player = new BufferedImage[22];
    public BufferedImage[] playerJR = new BufferedImage[9];
    public BufferedImage[] playerJL = new BufferedImage[9];


    public Textures() {

        BufferedImageLoader loader = new BufferedImageLoader();
        try{
            blockSheetImg = loader.loadImage("/Terrain/TerrainOne.png");
            playerSheetImg = loader.loadImage("/Terrain/PlayerSheet.png");
            playerJRImg = loader.loadImage("/Terrain/JumpRight.png");
            playerJLImg = loader.loadImage("/Terrain/JumpLeft.png");

        } catch (Exception e) {
            e.printStackTrace();
        }

        blockSheet = new SpriteSheet(blockSheetImg);
        playerSheet = new SpriteSheet(playerSheetImg);
        playerJRSheet = new SpriteSheet(playerJRImg);
        playerJLSheet = new SpriteSheet(playerJLImg);

        getTextures();

    }


    private void getTextures() {
        block[0] = blockSheet.snatchImage(1, 1, 48, 48); //Top left corner.
        block[1] = blockSheet.snatchImage(2, 1, 48, 48); //Center top.
        block[2] = blockSheet.snatchImage(3, 1, 48, 48); //Top right corner.
        block[3] = blockSheet.snatchImage(1, 2, 48, 48); //Left side.
        block[4] = blockSheet.snatchImage(2, 2, 48, 48); //Center.
        block[5] = blockSheet.snatchImage(3, 2, 48, 48); //rightSide.
        block[6] = blockSheet.snatchImage(1, 3, 48, 48); //Bottom Left Corner.
        block[7] = blockSheet.snatchImage(2, 3, 48, 48); //Bottom Center.
        block[8] = blockSheet.snatchImage(3, 3, 48, 48); //Bottom right Corner.

        player[0] = playerSheet.snatchImage(1, 1, 96, 96); //Right Idle Player.
        player[21] = playerSheet.snatchImage(11, 2, 96, 96); //Left Idle Player.

        player[1] = playerSheet.snatchImage(2, 1, 96, 96); //Start run right.
        player[2] = playerSheet.snatchImage(3, 1, 96, 96);
        player[3] = playerSheet.snatchImage(4, 1, 96, 96);
        player[4] = playerSheet.snatchImage(5, 1, 96, 96);
        player[5] = playerSheet.snatchImage(6, 1, 96, 96);
        player[6] = playerSheet.snatchImage(7, 1, 96, 96);
        player[7] = playerSheet.snatchImage(8, 1, 96, 96);
        player[8] = playerSheet.snatchImage(9, 1, 96, 96);
        player[9] = playerSheet.snatchImage(10, 1, 96, 96);
        player[10] = playerSheet.snatchImage(11, 1, 96, 96); //End Run.

        player[11] = playerSheet.snatchImage(10, 2, 96, 96); //Start run left.
        player[12] = playerSheet.snatchImage(9, 2, 96, 96);
        player[13] = playerSheet.snatchImage(8, 2, 96, 96);
        player[14] = playerSheet.snatchImage(7, 2, 96, 96);
        player[15] = playerSheet.snatchImage(6, 2, 96, 96);
        player[16] = playerSheet.snatchImage(5, 2, 96, 96);
        player[17] = playerSheet.snatchImage(4, 2, 96, 96);
        player[18] = playerSheet.snatchImage(3, 2, 96, 96);
        player[19] = playerSheet.snatchImage(2, 2, 96, 96);
        player[20] = playerSheet.snatchImage(1, 2, 96, 96); //End Run.

        playerJR[0] = playerJRSheet.snatchImage(1, 1, 96, 96);
        playerJR[1] = playerJRSheet.snatchImage(2, 1, 96, 96);
        playerJR[2] = playerJRSheet.snatchImage(3, 1, 96, 96);
        playerJR[3] = playerJRSheet.snatchImage(4, 1, 96, 96);
        playerJR[4] = playerJRSheet.snatchImage(5, 1, 96, 96);
        playerJR[5] = playerJRSheet.snatchImage(6, 1, 96, 96);
        playerJR[6] = playerJRSheet.snatchImage(7, 1, 96, 96);
        playerJR[7] = playerJRSheet.snatchImage(8, 1, 96, 96);
        playerJR[8] = playerJRSheet.snatchImage(9, 1, 96, 96);

        playerJL[0] = playerJLSheet.snatchImage(1, 1, 96, 96);
        playerJL[1] = playerJLSheet.snatchImage(2, 1, 96, 96);
        playerJL[2] = playerJLSheet.snatchImage(3, 1, 96, 96);
        playerJL[3] = playerJLSheet.snatchImage(4, 1, 96, 96);
        playerJL[4] = playerJLSheet.snatchImage(5, 1, 96, 96);
        playerJL[5] = playerJLSheet.snatchImage(6, 1, 96, 96);
        playerJL[6] = playerJLSheet.snatchImage(7, 1, 96, 96);
        playerJL[7] = playerJLSheet.snatchImage(8, 1, 96, 96);
        playerJL[8] = playerJLSheet.snatchImage(9, 1, 96, 96);


    }
}
