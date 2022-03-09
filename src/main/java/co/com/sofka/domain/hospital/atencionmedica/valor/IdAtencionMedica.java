package co.com.sofka.domain.hospital.atencionmedica.valor;

import co.com.sofka.domain.generic.Identity;

public class IdAtencionMedica extends Identity {
    private IdAtencionMedica(String valor) {
        super(valor);
    }

    public IdAtencionMedica() {
    }

    public static IdAtencionMedica of(String valor) {
        return new IdAtencionMedica(valor);
    }
}
