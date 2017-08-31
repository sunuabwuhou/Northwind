package org.northwind.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCity is a Querydsl query type for City
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCity extends EntityPathBase<City> {

    private static final long serialVersionUID = 1108920315L;

    public static final QCity city = new QCity("city");

    public final StringPath aini = createString("aini");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> qiumeng = createNumber("qiumeng", Integer.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public final StringPath xiaomin = createString("xiaomin");

    public QCity(String variable) {
        super(City.class, forVariable(variable));
    }

    public QCity(Path<? extends City> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCity(PathMetadata metadata) {
        super(City.class, metadata);
    }

}

