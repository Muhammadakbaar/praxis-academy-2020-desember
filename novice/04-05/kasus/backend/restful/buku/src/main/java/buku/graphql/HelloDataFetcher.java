/* package buku.graphql;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

import javax.inject.Singleton;

@Singleton
public class HelloDataFetcher implements DataFetcher<String> {
    @Override
    public String get(DataFetchingEnvironment env) throws Exception {
        String name = env.getArgument("name");
        if (name == null || name.trim().length() == 0) {
            name= "World";
        }
        return String.format("Hello %s!", name);
    }
}
 */