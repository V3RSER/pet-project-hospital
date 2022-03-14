package co.com.sofka.domain.hospital.atencionmedica.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.List;
import java.util.Objects;

public class FormulaMedica implements ValueObject<FormulaMedica.Props> {
    private final String nivelUrgencia;
    private final List<Medicamento> medicamentos;

    public FormulaMedica(String nivelUrgencia, List<Medicamento> medicamentos) {
        this.nivelUrgencia = Objects.requireNonNull(nivelUrgencia, "El nivel de urgencia no debe ser nulo");
        this.medicamentos = Objects.requireNonNull(medicamentos, "los medicamentos no deben ser nulos");
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String nivelUrgencia() {
                return nivelUrgencia;
            }

            @Override
            public List<Medicamento> medicamentos() {
                return medicamentos;
            }
        };
    }

    public interface Props {
        String nivelUrgencia();

        List<Medicamento> medicamentos();
    }
}