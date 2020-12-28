package ru.itis.javalab.querydsl.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPost is a Querydsl query type for Post
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPost extends EntityPathBase<Post> {

    private static final long serialVersionUID = 643674620L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPost post = new QPost("post");

    public final StringPath _id = createString("_id");

    public final StringPath date = createString("date");

    public final StringPath description = createString("description");

    public final BooleanPath expired = createBoolean("expired");

    public final NumberPath<Integer> grade = createNumber("grade", Integer.class);

    public final ListPath<String, StringPath> keywords = this.<String, StringPath>createList("keywords", String.class, StringPath.class, PathInits.DIRECT2);

    public final StringPath title = createString("title");

    public final org.bson.types.QObjectId user;

    public QPost(String variable) {
        this(Post.class, forVariable(variable), INITS);
    }

    public QPost(Path<? extends Post> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPost(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPost(PathMetadata metadata, PathInits inits) {
        this(Post.class, metadata, inits);
    }

    public QPost(Class<? extends Post> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new org.bson.types.QObjectId(forProperty("user")) : null;
    }

}

