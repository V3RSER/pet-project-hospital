package co.com.sofka.domain.hospital.atencionmedica.valor;

import co.com.sofka.domain.generic.Identity;

public class IdTratamiento extends Identity {
    private IdTratamiento(String valor) {
        super(valor);
    }

    public IdTratamiento() {
    }

    public static IdTratamiento of(String valor) {
        return new IdTratamiento(valor);
    }
}
