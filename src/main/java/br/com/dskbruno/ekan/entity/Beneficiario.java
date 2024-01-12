package br.com.dskbruno.ekan.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Beneficiario extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBeneficiario;
	
	@Column
	private String nome;
	
	@Column
	private String telefone;
	
	@Column
	private String dataNascimento;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH}
		    )
		    @JoinColumn(name = "company_id")
	private List<Documento> documentos;



}
