package com.ets.PackageEtudiant;

public class Etudiant {
	private String nomEtudiant;
	private byte ageEtudiant;

	public Etudiant() {

	}

	public Etudiant(String nom, byte age) {
		this.nomEtudiant = nom;
		this.ageEtudiant = age;
	}

	public String getNomEtudiant() {
		return this.nomEtudiant;
	}

	public byte getAgeEtudiant() {
		return this.ageEtudiant;
	}

	// les modificateurs

	public void setNomEtudiant(String nom) {
		this.nomEtudiant = nom;
	}

	public void setAgeEtudiant(byte age) {
		this.ageEtudiant = age;

	}

	public static Etudiant fabriquerUnEtudiant() {
		return new Etudiant();
	}

}
