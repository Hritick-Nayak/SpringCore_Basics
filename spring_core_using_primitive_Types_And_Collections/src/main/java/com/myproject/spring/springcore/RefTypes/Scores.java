package com.myproject.spring.springcore.RefTypes;

public class Scores {

	private double maths, physics, chemistry;

	public double getMaths() {
		return maths;
	}

	public void setMaths(double maths) {
		this.maths = maths;
	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	public double getChemistry() {
		return chemistry;
	}

	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}

	public String toString() {
		return "Scores [maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + "]";
	}

}
