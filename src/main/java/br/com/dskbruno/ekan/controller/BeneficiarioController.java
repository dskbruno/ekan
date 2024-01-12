package br.com.dskbruno.ekan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dskbruno.ekan.entity.Beneficiario;
import br.com.dskbruno.ekan.service.BeneficiarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


@RestController
@RequestMapping("/api/v1/beneficiarios")
public class BeneficiarioController {

	@Autowired
	private BeneficiarioService service;

	@Operation(summary = "Busca todos beneficiarios")
	@ApiResponses(value = { 
			@ApiResponse(responseCode = "200", description = "Busca concluida", 
					content = { @Content(mediaType = "application/json", 
					schema = @Schema(implementation = Beneficiario.class)) })
	})
	@GetMapping
	public ResponseEntity<List<Beneficiario>> findAll() {
		return new ResponseEntity(service.findAll(), HttpStatus.OK);
	}

	@GetMapping(path = { "/{id}" })
	public ResponseEntity<Beneficiario> findById(@PathVariable("id")Long id) {
		return new ResponseEntity(service.findById(id), HttpStatus.OK);
	}

	@PostMapping("/register")
	public ResponseEntity<Beneficiario> create(@RequestBody Beneficiario request) {
		return new ResponseEntity(service.create(request), HttpStatus.OK);
	}

	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") int id) {
		service.delete(id);
	}

}
