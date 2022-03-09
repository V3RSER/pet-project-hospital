package co.com.sofka.domain.hospital.atencionmedica.valor;

import co.com.sofka.domain.generic.Identity;

public class IdDiagnostico extends Identity {
    private IdDiagnostico(String valor) {
        super(valor);
    }

    public IdDiagnostico() {
    }

    public static IdDiagnostico of(String valor) {
        return new IdDiagnostico(valor);
    }
}
