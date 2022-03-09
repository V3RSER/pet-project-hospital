package co.com.sofka.domain.hospital.paciente.valor;

import co.com.sofka.domain.generic.Identity;

public class CitaId extends Identity {
    private CitaId(String valor) {
        super(valor);
    }

    public CitaId() {
    }

    public static CitaId of(String valor) {
        return new CitaId(valor);
    }
}
