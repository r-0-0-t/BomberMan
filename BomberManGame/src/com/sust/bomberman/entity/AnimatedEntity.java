package com.sust.bomberman.entity;

public class AnimatedEntity extends Entity {

	protected int animate = 0;
	protected final int MAX_ANIMATE = 7500; //save the animation status and dont let this get too big
	
	protected void animate() {
		if(animate < MAX_ANIMATE) animate++; else animate = 0; //reset animation
	}

}
