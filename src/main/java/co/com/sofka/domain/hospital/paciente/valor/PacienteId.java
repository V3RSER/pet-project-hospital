package co.com.sofka.domain.hospital.paciente.valor;

import co.com.sofka.domain.generic.Identity;

public class PacienteId extends Identity {
    private PacienteId(String valor) {
        super(valor);
    }

    public PacienteId() {
    }

    public static PacienteId of(String valor) {
        return new PacienteId(valor);
    }
}
