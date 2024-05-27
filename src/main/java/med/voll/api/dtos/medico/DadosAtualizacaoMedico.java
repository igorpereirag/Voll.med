package med.voll.api.dtos.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.dtos.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
