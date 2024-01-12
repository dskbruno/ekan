package br.com.dskbruno.ekan.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import lombok.Data;

@Data
@MappedSuperclass
public class BaseEntity {
	
	@Column
	private String dataInclusao;
	
	@Column
	private String dataAtualizacao;
	
    @PrePersist
    public void onPrePersist() {
        this.setDataAtualizacao(LocalDateTime.now().toString());
        this.setDataInclusao(LocalDateTime.now().toString());
    }

    @PreUpdate
    public void onPreUpdate() {
    	setDataAtualizacao(LocalDateTime.now().toString());
    }

}
