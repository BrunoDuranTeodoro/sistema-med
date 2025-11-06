package com.medpro.medpro.model.dto;

import com.medpro.medpro.enums.DadosEndereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf ,DadosEndereco endereco) {
    
}
