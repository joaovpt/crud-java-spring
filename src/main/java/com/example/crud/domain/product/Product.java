package com.example.crud.domain.product;

import com.example.crud.dtos.RequestProductDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "product")
@Entity(name = "product")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
    private Integer price_in_cents;

    private Boolean active;

    public Product(RequestProductDTO requestProductDTO){
        this.name = requestProductDTO.name();
        this.price_in_cents = requestProductDTO.price_in_cents();
        this.active = true;
    }

}

