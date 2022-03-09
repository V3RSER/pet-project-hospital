package co.com.sofka.domain.hospital.paciente.valor;

import co.com.sofka.domain.generic.Identity;

public class IdCita extends Identity {
    private IdCita(String valor) {
        super(valor);
    }

    public IdCita() {
    }

    public static IdCita of(String valor) {
        return new IdCita(valor);
    }
}
