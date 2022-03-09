package co.com.sofka.domain.hospital.doctor.valor;

import co.com.sofka.domain.generic.Identity;

public class IdEnfermero extends Identity {
    private IdEnfermero(String valor) {
        super(valor);
    }

    public IdEnfermero() {
    }

    public static IdEnfermero of(String valor) {
        return new IdEnfermero(valor);
    }
}
