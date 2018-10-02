package fr.hobbit.sharyserver.domain;


import fr.hobbit.sharyserver.emun.PostType;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Post extends AuditEntity {
    String title;

    User publisher;

    PostType type;

}
