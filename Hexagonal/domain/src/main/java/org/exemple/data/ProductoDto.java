package org.exemple.data;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class ProductoDto {

    private Integer id;

    private Integer cantidad;

    private String descripcion;

    private String imagen;

    private String nombre;

    private Double precio;



}