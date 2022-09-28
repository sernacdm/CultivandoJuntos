package com.co.cultivemosjuntos.app.percistence.models.Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "TCJ_TIPO_PLANTA")
@ToString
public class TypePlantEntity implements Serializable {
    @Serial
    private  static final long serialVersionUID = 1L;

    @Id
    @Getter
    @Setter
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name = "nombre_tipo")
    private String typeName;
}
