package med.voll.api.dtos.Consultas;

import jakarta.validation.constraints.NotNull;
import med.voll.api.enums.MotivoCancelamento;

public record DadosCancelamentoConsulta(
        @NotNull
        Long idConsulta,

        @NotNull
        MotivoCancelamento motivo) {
}
