package ru.itis.javalab.querydsl.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 643826983L;

    public static final QUser user = new QUser("user");

    public final StringPath _id = createString("_id");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final StringPath country = createString("country");

    public final StringPath course = createString("course");

    public final StringPath firstname = createString("firstname");

    public final StringPath lastname = createString("lastname");

    public final NumberPath<Double> rate = createNumber("rate", Double.class);

    public final StringPath status = createString("status");

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

