package co.com.sofka.domain.hospital.doctor.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.hospital.doctor.valor.IdDoctor;
import co.com.sofka.domain.hospital.doctor.valor.TipoDeFuncion;

public class ActualizarTipoDeFuncion extends Command {
    private final IdDoctor idDoctor;
    private final TipoDeFuncion tipoDeFuncion;

    public ActualizarTipoDeFuncion(IdDoctor idDoctor, TipoDeFuncion tipoDeFuncion) {
        this.idDoctor = idDoctor;
        this.tipoDeFuncion = tipoDeFuncion;
    }

    public IdDoctor getIdDoctor() {
        return idDoctor;
    }

    public TipoDeFuncion getTipoDeFuncion() {
        return tipoDeFuncion;
    }
}
