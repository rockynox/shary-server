package fr.hobbit.sharyserver.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Uzer")
@Data
public class User extends AuditEntity{
    String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
}
