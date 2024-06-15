package med.voll.api.controller;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.enums.Especialidade;
import med.voll.api.model.Endereco;

public class DadosDetalhamentoMedico {

    public DadosDetalhamentoMedico(Object object, @NotBlank(message = "Nome é obrigatório") String nome,
            @NotBlank(message = "Email é obrigatório") @Email(message = "Formato do email é inválido") String email,
            @NotBlank(message = "CRM é obrigatório") @Pattern(regexp = "\\d{4,6}", message = "Formato do CRM é inválido") String crm,
            @NotBlank(message = "Telefone é obrigatório") String telefone,
            @NotNull(message = "Especialidade é obrigatória") Especialidade especialidade, Endereco endereco) {
        //TODO Auto-generated constructor stub
    }

}
