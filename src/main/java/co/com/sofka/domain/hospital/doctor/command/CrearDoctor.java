package co.com.sofka.domain.hospital.doctor.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.hospital.doctor.valor.IdDoctor;
import co.com.sofka.domain.hospital.valor.Nombre;

public class CrearDoctor extends Command {
    private final IdDoctor idDoctor;
    private final Nombre nombre;

    public CrearDoctor(IdDoctor idDoctor, Nombre nombre) {
        this.idDoctor = idDoctor;
        this.nombre = nombre;
    }

    public IdDoctor getIdDoctor() {
        return idDoctor;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
