package co.com.sofka.domain.hospital.paciente.valor;

import co.com.sofka.domain.generic.Identity;

public class IdAfiliacion extends Identity {
    private IdAfiliacion(String valor) {
        super(valor);
    }

    public IdAfiliacion() {
    }

    public static IdAfiliacion of(String valor) {
        return new IdAfiliacion(valor);
    }
}
