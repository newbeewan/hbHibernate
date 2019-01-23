package com.ib.data.discriminant;

import javax.persistence.Entity;

@Entity
public class Coach extends Personne {
	
	private String team;
	
	public String getTeam() {
		return team;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
}
