package co.com.sofka.domain.hospital.doctor;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.hospital.doctor.valor.IdEnfermero;
import co.com.sofka.domain.hospital.doctor.valor.Nombre;

import java.util.Objects;

public class Enfermero extends Entity {
    private Nombre nombre;

    public Enfermero(IdEnfermero entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
    }

    public void actualizarNombre(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }
}
