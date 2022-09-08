package com.ets.PackageEtudiant;

public class MonMain {
	public static void main(String[] args) {

		// creer un étudiant

		Etudiant unEtudiant = Etudiant.fabriquerUnEtudiant();
		unEtudiant.setAgeEtudiant((byte) 45);
		unEtudiant.setNomEtudiant("Sohdjeukeu");

		System.out.println(unEtudiant.getAgeEtudiant());
		System.out.println(unEtudiant.getNomEtudiant());

	}

}
