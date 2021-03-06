package com.sust.bomberman.level.tile;

import com.sust.bomberman.graphics.Screen;
import com.sust.bomberman.graphics.Sprite;

public class FlowerTile extends Tile {

	public FlowerTile(Sprite sprite) {
		super(sprite);
	}
	
	@Override
	public void render(int x,int y,Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}
}
