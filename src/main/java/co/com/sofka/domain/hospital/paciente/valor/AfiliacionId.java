package co.com.sofka.domain.hospital.paciente.valor;

import co.com.sofka.domain.generic.Identity;

public class AfiliacionId extends Identity {
    private AfiliacionId(String valor) {
        super(valor);
    }

    public AfiliacionId() {
    }

    public static AfiliacionId of(String valor) {
        return new AfiliacionId(valor);
    }
}
