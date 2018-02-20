package fr.formation.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import fr.formation.bean.Eleve;

public class EleveDaoJdbc implements EleveDao {

	private Connection seConnecter() throws Exception {
		InitialContext jndi = null;
		DataSource ds = null;
		// ----> Obtenir une référence sur le contexte initial JNDI
		try {
			jndi = new InitialContext();
		} catch (NamingException e) {
			throw new Exception("Erreur d'accès au contexte initial JNDI");
		}
		// ----> recherche de la source de données
		try {
			ds = (DataSource) jndi.lookup("java:comp/env/jdbc/ds1");
		} catch (NamingException e) {
			throw new Exception("Objet introuvable dans l'arbre JNDI:" + e.getMessage());
		}
		// ----> obtenir une connexion
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			throw new Exception("Impossible d'obtenir une connexion:" + e.getMessage());
		}
	}

	@Override
	public Eleve findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Eleve> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Eleve obj) {

	}

	@Override
	public void update(Eleve obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Eleve obj) {
		// TODO Auto-generated method stub

	}

}
