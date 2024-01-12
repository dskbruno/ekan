package br.com.dskbruno.ekan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dskbruno.ekan.entity.Beneficiario;
import br.com.dskbruno.ekan.repository.BeneficiarioRepository;
import br.com.dskbruno.ekan.service.BeneficiarioService;

@Service
public class BeneficiarioServiceImpl implements BeneficiarioService{
	
	@Autowired
	private BeneficiarioRepository repository;

	@Override
	public Beneficiario create(Beneficiario beneficiario) {
		return repository.save(beneficiario);
	}

	@Override
	public void delete(long id) {
		repository.deleteById(id);		
	}

	@Override
	public List<Beneficiario> findAll() {
		return repository.findAll();
	}

	@Override
	public Beneficiario findById(long id) {
        var optional = repository.findById(id);
        if (optional.isEmpty()) {
            return null;
        }
        return optional.get();
	}

}
