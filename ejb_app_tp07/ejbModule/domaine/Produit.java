package domaine;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Produit
 *
 */
@Entity

public class Produit implements Serializable {

	   
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	@Column (length=50)
	private String designation;
	private double prix;
	private int quantite;
	
	@Temporal(TemporalType.DATE)
	private java.util.Date dateAchat;
	private static final long serialVersionUID = 1L;

	public java.util.Date getDateAchat() {
	return dateAchat;
	}
	public void setDateAchat(java.util.Date dateAchat) {
	this.dateAchat = dateAchat; }
	public Produit() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}   
	public double getPrix() {
		return this.prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}   
	public int getQuantite() {
		return this.quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
   
}
