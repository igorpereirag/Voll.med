package med.voll.api.dtos.medico;

import med.voll.api.enums.Especialidade;
import med.voll.api.model.Endereco;
import med.voll.api.model.Medico;

public record DadosDetalhamentomMedico(
    long id,
    String nome, 
    String email,
    String crm,
    String telefone,
    Especialidade especialidade,
    Endereco endereco

){

    public DadosDetalhamentomMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(),medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }


}
