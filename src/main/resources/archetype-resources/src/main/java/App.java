package $package;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.CqlSessionBuilder;
import com.datastax.oss.driver.api.core.metadata.Metadata;
import com.datastax.oss.driver.api.core.metadata.Node;
import com.datastax.oss.driver.api.core.metadata.schema.KeyspaceMetadata;
import com.datastax.oss.driver.api.core.metadata.schema.TableMetadata;

public class App
{
    public static void main( String[] args )
    {
        try (CqlSession session = new CqlSessionBuilder().build()) {

            Metadata metadata = session.getMetadata();
            System.out.printf("Connected session: %s%n", session.getName());

            for (Node node : metadata.getNodes().values()) {
                System.out.printf(
                        "Datatacenter: %s; Host: %s; Rack: %s%n",
                        node.getDatacenter(), node.getEndPoint(), node.getRack());
            }

            for (KeyspaceMetadata keyspace : metadata.getKeyspaces().values()) {
                for (TableMetadata table : keyspace.getTables().values()) {
                    System.out.printf("Keyspace: %s; Table: %s%n", keyspace.getName(), table.getName());
                }
            }
        }
    }
}
