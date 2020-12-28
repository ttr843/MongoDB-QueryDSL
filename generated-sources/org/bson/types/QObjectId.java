package org.bson.types;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QObjectId is a Querydsl query type for ObjectId
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QObjectId extends BeanPath<ObjectId> {

    private static final long serialVersionUID = 1931139171L;

    public static final QObjectId objectId = new QObjectId("objectId");

    public final NumberPath<Integer> counter = createNumber("counter", Integer.class);

    public final DateTimePath<java.util.Date> date = createDateTime("date", java.util.Date.class);

    public final NumberPath<Integer> randomValue1 = createNumber("randomValue1", Integer.class);

    public final NumberPath<Short> randomValue2 = createNumber("randomValue2", Short.class);

    public final NumberPath<Integer> timestamp = createNumber("timestamp", Integer.class);

    public QObjectId(String variable) {
        super(ObjectId.class, forVariable(variable));
    }

    public QObjectId(Path<ObjectId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QObjectId(PathMetadata metadata) {
        super(ObjectId.class, metadata);
    }

}

