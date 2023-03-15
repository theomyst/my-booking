package com.theomyst.mybooking.domain;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@MappedSuperclass
public class BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idGenerator")
    @Column(updatable = false)
    private Long id;

}
