package co.com.sofka.domain.hospital.paciente.valor;

import co.com.sofka.domain.generic.Identity;

public class IdPaciente extends Identity {
    private IdPaciente(String valor) {
        super(valor);
    }

    public IdPaciente() {
    }

    public static IdPaciente of(String valor) {
        return new IdPaciente(valor);
    }
}
