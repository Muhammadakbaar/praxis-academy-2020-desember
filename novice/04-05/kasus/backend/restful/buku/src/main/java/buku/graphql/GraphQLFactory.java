/* package buku.graphql;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import graphql.schema.idl.TypeRuntimeWiring;
import io.micronaut.context.BeanContext;
import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.core.io.ResourceResolver;
import io.micronaut.inject.qualifiers.Qualifiers;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.hibernate.mapping.Collection;
import org.mariadb.jdbc.internal.logging.Logger;
import org.mariadb.jdbc.internal.logging.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Factory
public class GraphQLFactory {

    public static final Logger logger = LoggerFactory.getLogger(GraphQLFactory.class);

    @Inject protected BeanContext beanContext;

    @Bean @Singleton public GraphQL graphQL() {
        GraphQLSchemaGenerator schemaGenerator = new GraphQLSchemaGenerator(); // 1

        Collection graphQLServices = beanContext.getBeansOfType(Object.class, Qualifiers.byStereotype(GraphQLService.class)); // 2

        if (graphQLServices.isEmpty()) { // 3
            logger.debug("No GraphQL services found, returning empty schema");
            return new Builder(GraphQLSchema.newSchema().build())
                .build();
        } else { // 4
            for (Object graphQLService: graphQLServices) {
                Class graphQLServiceClass = graphQLService.getClass();
                if (graphQLServiceClass.getSimpleName().contains("$Intercepted"))
                    graphQLServiceClass = graphQLServiceClass.getSuperclass(); // 5

                logger.debug("Registering GraphQL service: {}", graphQLServiceClass.getSimpleName());
                schemaGenerator.withOperationsFromSingleton(graphQLService, graphQLServiceClass); // 6
            }
        }

        return new GraphQL.Builder(schemaGenerator.generate()).build(); // 7
    }

} */