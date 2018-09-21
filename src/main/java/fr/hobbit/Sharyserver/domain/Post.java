package fr.hobbit.Sharyserver.domain;


import fr.hobbit.Sharyserver.emun.PostType;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Post extends AuditEntity {
    String title;

    User publisher;

    PostType type;

}
