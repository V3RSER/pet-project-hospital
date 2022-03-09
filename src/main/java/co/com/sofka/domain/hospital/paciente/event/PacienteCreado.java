package co.com.sofka.domain.hospital.paciente.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.paciente.valor.Nombre;

public class PacienteCreado extends DomainEvent {
    private final Nombre nombre;

    public PacienteCreado(Nombre nombre){
        super("paciente.pacientecreado");
        this.nombre=nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

}
