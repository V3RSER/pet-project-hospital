package co.com.sofka.domain.hospital.atencionmedica;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.hospital.atencionmedica.valor.IdTratamiento;
import co.com.sofka.domain.hospital.atencionmedica.valor.Procedimiento;

import java.util.Objects;

public class Tratamiento extends Entity<IdTratamiento> {
    private Procedimiento procedimiento;

    public Tratamiento(IdTratamiento idTratamiento, Procedimiento procedimiento) {
        super(idTratamiento);
        this.procedimiento = procedimiento;
    }

    public void actualizarProcedimiento(Procedimiento procedimiento) {
        this.procedimiento = Objects.requireNonNull(procedimiento, "El procedimiento no debe ser nulo");
    }

    public Procedimiento procedimiento() {
        return procedimiento;
    }
}
