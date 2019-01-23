package com.ib.data.soustable;

import javax.persistence.Entity;

@Entity
public class Player extends Personne {
	
	private int score;
	
	private int poids;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	
}
