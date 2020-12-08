/* package buku;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.core.io.ResourceResolver;
import javax.inject.Singleton;
import java.io.BufferedReader;
import java.io.InputStreamReader;

@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {
    public GraphQLEndpoint() {
        super (SchemaParser.newParser()
            .file("schema.graphqls")
            .build()
            .makeExecutableSchema());
    }
}
 */