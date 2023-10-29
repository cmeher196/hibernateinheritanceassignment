package dev.chandra.inheritancetable.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import javax.annotation.processing.Generated;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Players {
    @Id
    Long id;
    String name;
    String age;
}
