package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Rol")
@Table(name = "Rol")
@Getter
@Setter
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "activo")
    private boolean activo;

    @Column(name = "descripcion")
    private String descripcion;

    @Override
    public String toString() {
        return "Rol{" +
                "id=" + id +
                ", activo=" + activo +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}