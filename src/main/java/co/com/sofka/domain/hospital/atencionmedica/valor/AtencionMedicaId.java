package co.com.sofka.domain.hospital.atencionmedica.valor;

import co.com.sofka.domain.generic.Identity;

public class AtencionMedicaId extends Identity {
    private AtencionMedicaId(String valor) {
        super(valor);
    }

    public AtencionMedicaId() {
    }

    public static AtencionMedicaId of(String valor) {
        return new AtencionMedicaId(valor);
    }
}
