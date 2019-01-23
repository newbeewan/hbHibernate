package com.ib.data.tableparclassconcrete;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "COACH_CONCRET")
public class Coach extends Personne {
	
	private String team;
	
	public String getTeam() {
		return team;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
}
