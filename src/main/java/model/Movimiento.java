package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity(name = "Movimiento")
@Table(name = "Movimiento")
@Getter
@Setter
public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "monto")
    private double monto;

    @ManyToOne
    @JoinColumn(name = "cuenta_id")
    private Cuenta cuenta;

    @Override
    public String toString() {
        return "Movimiento{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", monto=" + monto +
                '}';
    }
}