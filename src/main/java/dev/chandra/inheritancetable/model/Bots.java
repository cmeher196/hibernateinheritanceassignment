package dev.chandra.inheritancetable.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
public class Bots extends Players{
    int ranks;
}
