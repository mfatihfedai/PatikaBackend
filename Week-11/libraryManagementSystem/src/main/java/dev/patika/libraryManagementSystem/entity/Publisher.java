package dev.patika.libraryManagementSystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "publishers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id", columnDefinition = "serial")
    private int id;

    @NotNull
    @Column(name = "publisher_name")
    private String name;

    @NotNull
    @Column(name = "publisher_establishment_year")
    private int establishmentYear;

    @NotNull
    @Column(name = "publisher_address")
    private String address;

    @OneToMany(mappedBy = "publisher")
    private List<Book> booksList;
}
