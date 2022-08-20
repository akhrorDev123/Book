package com.onevizion.book.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Size(max = 150)
    private String title;

    @Column(nullable = false)
    @Size(max = 150)
    private String author;

    @Size(max = 150)
    private String description;
}
