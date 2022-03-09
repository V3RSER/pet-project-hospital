package co.com.sofka.domain.hospital.atencionmedica.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Urgencia implements ValueObject<Urgencia.Props> {
    private final String nivelUrgencia;
    private final String descripcion;

    public Urgencia(String nivelUrgencia, String descripcion) {
        this.nivelUrgencia = Objects.requireNonNull(nivelUrgencia);
        this.descripcion = Objects.requireNonNull(descripcion);

        if (this.nivelUrgencia.isBlank()) {
            throw new IllegalArgumentException("El nivel de urgencia no puede estar vacío");
        }

        if (this.descripcion.isBlank()) {
            throw new IllegalArgumentException("La descripcion no puede estar vacía");
        }
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String nivelUrgencia() {
                return nivelUrgencia;
            }

            @Override
            public String descripcion() {
                return descripcion;
            }
        };
    }

    public interface Props {
        String nivelUrgencia();

        String descripcion();
    }
}
