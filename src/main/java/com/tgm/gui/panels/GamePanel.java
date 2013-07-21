/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tgm.gui.panels;

import com.tgm.gui.components.Image;
import com.tgm.gui.components.Label;
import com.tgm.gui.components.Label;
import com.tgm.gui.components.Panel;
import java.awt.Font;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

/**
 *
 * @author christopher
 */
public class GamePanel extends Panel {

    private String gameBackground = "/images/game.png";
    private String gameSelectBackground = "/images/gameSelect.png";
    private boolean selected = false;
    private Image gameImage;
    private Image gameBackgroundImage;
    private Image gameSelectBackgroundImage;
    private String gamePath;
    private String gameName;
    private Label titleLabel;
    private float ratio = 1.20f;

    public GamePanel(String id, String gameName, String gamePath, float x, float y, float width, float height) {
        super(id, x, y, width, height);
        this.gameName = gameName;
        this.gamePath = gamePath;
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        initGamePanel(gc);
        super.init(gc);
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {
        super.update(gc, i);
        gameBackgroundImage.setVisible(!selected);
        gameSelectBackgroundImage.setVisible(selected);
    }

    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException {
        super.render(gc, g);
    }

    private void initGamePanel(GameContainer gc) {
        //float gh = this.getHeight() / ratio;
        gameBackgroundImage = (Image) add(new Image("gameBackground", gameBackground, 0, 0, this.getWidth(), this.getHeight()));
        gameSelectBackgroundImage = (Image) add(new Image("gameSelectBackground", gameSelectBackground, 0, 0, this.getWidth(), this.getHeight()));
        
        float iWidth = this.getWidth() / 1.15f;
        float iHeight = this.getHeight() / 1.15f;
        
        float marginW = (this.getWidth() - iWidth) / 2f;
        float marginH = (this.getHeight() - iHeight) / 2f;
        
        
        
        gameImage = (Image) add(new Image("gameImage", gamePath, marginW, marginH, iWidth, iHeight));
        //titleLabel = (Label)add(new Label("gameTitleLabel", gameName, 0, gh, this.width, this.getHeight() - gh, Label.CENTER, "Arial", Font.BOLD, (int)(this.width / 8.35f), new Color(78,0,110), false));
    }

    /**
     * @return the selected
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    /**
     * @return the gameName
     */
    public String getGameName() {
        return gameName;
    }
}
