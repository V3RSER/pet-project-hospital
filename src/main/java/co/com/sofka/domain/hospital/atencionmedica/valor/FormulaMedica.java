package co.com.sofka.domain.hospital.atencionmedica.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.List;
import java.util.Objects;

public class FormulaMedica implements ValueObject<FormulaMedica.Props> {
    private final String nivelUrgencia;
    private final List<Medicamento> medicamentos;

    public FormulaMedica(String tipoAfiliacion, String cobertura, List<Medicamento> medicamentos) {
        this.nivelUrgencia = Objects.requireNonNull(tipoAfiliacion);
        this.medicamentos = Objects.requireNonNull(medicamentos);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String tipoAfiliacion() {
                return nivelUrgencia;
            }

            @Override
            public List<Medicamento> medicamentos() {
                return medicamentos;
            }
        };
    }

    public interface Props {
        String tipoAfiliacion();

        List<Medicamento> medicamentos();
    }
}
