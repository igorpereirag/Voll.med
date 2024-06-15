package med.voll.api.Service.validacoes.agendamento;

import org.springframework.stereotype.Component;

import med.voll.api.Service.ValidadorAgendamentoDeConsulta;
import med.voll.api.dtos.Consultas.DadosAgendamentoConsulta;
import med.voll.api.infra.exception.ValidacaoException;

import java.time.Duration;
import java.time.LocalDateTime;

@Component("ValidadorHorarioAntecedenciaAgendamento")
public class ValidadorHorarioAntecedencia implements ValidadorAgendamentoDeConsulta {

    @Override
    public void validar(DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();
        var agora = LocalDateTime.now();
        var diferencaEmMinutos = Duration.between(agora, dataConsulta).toMinutes();

        if (diferencaEmMinutos < 30) {
            throw new ValidacaoException("Consulta deve ser agendada com antecedência mínima de 30 minutos");
        }

    }
}
