package co.com.sofka.domain.hospital.doctor.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.hospital.doctor.valor.IdDoctor;
import co.com.sofka.domain.hospital.doctor.valor.IdFuncion;
import co.com.sofka.domain.hospital.doctor.valor.TipoDeFuncion;

public class CrearFuncion extends Command {
    private final IdDoctor idDoctor;
    private final IdFuncion idFuncion;
    private final TipoDeFuncion tipoDeFuncion;

    public CrearFuncion(IdDoctor idDoctor, IdFuncion idFuncion, TipoDeFuncion tipoDeFuncion) {
        this.idDoctor = idDoctor;
        this.idFuncion = idFuncion;
        this.tipoDeFuncion = tipoDeFuncion;
    }

    public IdDoctor getIdDoctor() {
        return idDoctor;
    }

    public IdFuncion getIdFuncion() {
        return idFuncion;
    }

    public TipoDeFuncion getTipoDeFuncion() {
        return tipoDeFuncion;
    }
}
