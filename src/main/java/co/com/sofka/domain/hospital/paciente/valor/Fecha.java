package co.com.sofka.domain.hospital.paciente.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDateTime;
import java.util.Objects;

public class Fecha implements ValueObject<LocalDateTime> {
    private final LocalDateTime value;

    public Fecha(LocalDateTime value) {
        this.value = Objects.requireNonNull(value);
    }

    public Fecha() {
        this(LocalDateTime.now());
    }

    @Override
    public LocalDateTime value() {
        return value;
    }
}