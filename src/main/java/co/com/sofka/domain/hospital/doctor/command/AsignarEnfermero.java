package co.com.sofka.domain.hospital.doctor.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.hospital.doctor.valor.IdDoctor;
import co.com.sofka.domain.hospital.doctor.valor.IdEnfermero;
import co.com.sofka.domain.hospital.paciente.valor.Nombre;

public class AsignarEnfermero extends Command {
    private final IdDoctor idDoctor;
    private final IdEnfermero entityId;
    private final Nombre nombre;

    public AsignarEnfermero(IdDoctor idDoctor, IdEnfermero entityId, Nombre nombre) {
        this.idDoctor = idDoctor;
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public IdDoctor getIdDoctor() {
        return idDoctor;
    }

    public IdEnfermero getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
