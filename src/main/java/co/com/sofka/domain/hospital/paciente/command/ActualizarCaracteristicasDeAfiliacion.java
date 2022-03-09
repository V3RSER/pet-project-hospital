package co.com.sofka.domain.hospital.paciente.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.hospital.paciente.valor.CaracteristicasAfiliacion;
import co.com.sofka.domain.hospital.paciente.valor.IdPaciente;

public class ActualizarCaracteristicasDeAfiliacion extends Command {
    private final IdPaciente idPaciente;
    private final CaracteristicasAfiliacion caracteristicasAfiliacion;

    public ActualizarCaracteristicasDeAfiliacion(IdPaciente idPaciente, CaracteristicasAfiliacion caracteristicasAfiliacion) {
        this.idPaciente = idPaciente;
        this.caracteristicasAfiliacion = caracteristicasAfiliacion;
    }

    public IdPaciente getIdPaciente() {
        return idPaciente;
    }

    public CaracteristicasAfiliacion getCaracteristicasAfiliacion() {
        return caracteristicasAfiliacion;
    }
}
