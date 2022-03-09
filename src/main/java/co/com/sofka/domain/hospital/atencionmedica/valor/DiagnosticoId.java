package co.com.sofka.domain.hospital.atencionmedica.valor;

import co.com.sofka.domain.generic.Identity;

public class DiagnosticoId extends Identity {
    private DiagnosticoId(String valor) {
        super(valor);
    }

    public DiagnosticoId() {
    }

    public static DiagnosticoId of(String valor) {
        return new DiagnosticoId(valor);
    }
}
