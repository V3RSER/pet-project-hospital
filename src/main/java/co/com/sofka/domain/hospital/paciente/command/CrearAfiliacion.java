package co.com.sofka.domain.hospital.paciente.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.hospital.paciente.valor.CaracteristicasAfiliacion;
import co.com.sofka.domain.hospital.paciente.valor.IdAfiliacion;
import co.com.sofka.domain.hospital.paciente.valor.IdPaciente;

public class CrearAfiliacion extends Command {
    private final IdPaciente idPaciente;
    private final IdAfiliacion idAfiliacion;
    private final CaracteristicasAfiliacion caracteristicasAfiliacion;

    public CrearAfiliacion(IdPaciente idPaciente, IdAfiliacion idAfiliacion, CaracteristicasAfiliacion caracteristicasAfiliacion) {
        this.idPaciente = idPaciente;
        this.idAfiliacion = idAfiliacion;
        this.caracteristicasAfiliacion = caracteristicasAfiliacion;
    }

    public IdPaciente getIdPaciente() {
        return idPaciente;
    }

    public IdAfiliacion getIdAfiliacion() {
        return idAfiliacion;
    }

    public CaracteristicasAfiliacion getCaracteristicasAfiliacion() {
        return caracteristicasAfiliacion;
    }
}
