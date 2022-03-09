package co.com.sofka.domain.hospital.doctor.valor;

import co.com.sofka.domain.generic.Identity;

public class IdDoctor extends Identity {
    private IdDoctor(String valor) {
        super(valor);
    }

    public IdDoctor() {
    }

    public static IdDoctor of(String valor) {
        return new IdDoctor(valor);
    }
}
