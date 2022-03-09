package co.com.sofka.domain.hospital.atencionmedica.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.List;
import java.util.Objects;

public class Procedimiento implements ValueObject<List<Paso>> {
    private final List<Paso> pasos;

    public Procedimiento(List<Paso> pasos) {
        this.pasos = Objects.requireNonNull(pasos);
    }

    @Override
    public List<Paso> value() {
        return pasos;
    }
}
