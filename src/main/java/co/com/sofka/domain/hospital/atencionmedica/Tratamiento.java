package co.com.sofka.domain.hospital.atencionmedica;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.hospital.atencionmedica.valor.Procedimiento;
import co.com.sofka.domain.hospital.atencionmedica.valor.TratamientoId;

public class Tratamiento extends Entity<TratamientoId> {
    private final Procedimiento procedimiento;

    public Tratamiento(TratamientoId tratamientoId, Procedimiento procedimiento) {
        super(tratamientoId);
        this.procedimiento = procedimiento;
    }

    public Procedimiento procedimiento() {
        return procedimiento;
    }
}
