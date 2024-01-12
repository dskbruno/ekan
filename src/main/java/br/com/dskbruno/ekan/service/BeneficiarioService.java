package br.com.dskbruno.ekan.service;

import java.util.List;

import br.com.dskbruno.ekan.entity.Beneficiario;

public interface BeneficiarioService {

	Beneficiario create(Beneficiario beneficiario);
	void delete(long id);
	List<Beneficiario> findAll();
	Beneficiario findById(long id);

}
