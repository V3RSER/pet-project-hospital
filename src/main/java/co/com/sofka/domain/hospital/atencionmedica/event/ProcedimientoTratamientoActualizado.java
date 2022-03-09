package co.com.sofka.domain.hospital.atencionmedica.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.atencionmedica.valor.Procedimiento;

public class ProcedimientoTratamientoActualizado extends DomainEvent {
    private final Procedimiento procedimiento;

    public  ProcedimientoTratamientoActualizado(Procedimiento procedimiento){
        super("atencionmedica.procedimientotratamientoatualizado");
        this.procedimiento=procedimiento;
    }

    public Procedimiento getProcedimiento() {
        return procedimiento;
    }
}
