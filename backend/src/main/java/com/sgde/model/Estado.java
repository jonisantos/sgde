package com.sgde.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Estado implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String nome;
}
