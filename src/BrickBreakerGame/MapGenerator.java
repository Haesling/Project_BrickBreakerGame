package BrickBreakerGame;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.*;

public class MapGenerator {
    public int map[][];
    public int brickWIDTH;
    public int brickHEIGHT;

    public MapGenerator(int row, int col) {
        map = new int[row][col];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = 1;


            }
        }
        brickWIDTH = 540 / col;
        brickHEIGHT = 150 / row;

    }
    public void draw(Graphics2D g){
        for (int i = 0; i < map.length;i++){
            for (int j = 0; j < map[0].length;j++){
                if(map[i][j] > 0){
                    g.setColor(Color.WHITE);
                    g.fillRect(j * brickWIDTH + 80, i * brickHEIGHT + 50, brickWIDTH, brickHEIGHT);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.BLACK);
                    g.drawRect(j * brickWIDTH +80, i * brickHEIGHT + 50, brickWIDTH, brickHEIGHT);
                }
            }
        }

    }
    public void setBrickValue(int value, int row, int col){
        map[row][col] = value;
    }
}
