package co.com.sofka.domain.hospital.doctor.valor;

import co.com.sofka.domain.generic.Identity;

public class IdFuncion extends Identity {
    private IdFuncion(String valor) {
        super(valor);
    }

    public IdFuncion() {
    }

    public static IdFuncion of(String valor) {
        return new IdFuncion(valor);
    }
}
