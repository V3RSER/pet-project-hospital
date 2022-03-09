package co.com.sofka.domain.hospital.atencionmedica;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.hospital.atencionmedica.valor.IdTratamiento;
import co.com.sofka.domain.hospital.atencionmedica.valor.Procedimiento;

public class Tratamiento extends Entity<IdTratamiento> {
    private final Procedimiento procedimiento;

    public Tratamiento(IdTratamiento idTratamiento, Procedimiento procedimiento) {
        super(idTratamiento);
        this.procedimiento = procedimiento;
    }

    public Procedimiento procedimiento() {
        return procedimiento;
    }
}
