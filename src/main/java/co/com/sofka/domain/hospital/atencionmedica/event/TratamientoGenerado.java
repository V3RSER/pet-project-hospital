package co.com.sofka.domain.hospital.atencionmedica.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.atencionmedica.valor.IdTratamiento;
import co.com.sofka.domain.hospital.atencionmedica.valor.Procedimiento;

public class TratamientoGenerado extends DomainEvent {
    private final IdTratamiento idTratamiento;
    private final Procedimiento procedimiento;

    public TratamientoGenerado(IdTratamiento idTratamiento, Procedimiento procedimiento) {
        super("atencionmedica.tratamientogenerado");
        this.idTratamiento = idTratamiento;
        this.procedimiento = procedimiento;
    }

    public IdTratamiento getIdTratamiento() {
        return idTratamiento;
    }

    public Procedimiento getProcedimiento() {
        return procedimiento;
    }
}
