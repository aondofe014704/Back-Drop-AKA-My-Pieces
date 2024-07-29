import NewPackageForNewAccount.GeoPoliticalZones;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoPoliticalZonesTest {
    @Test
    public void testgetGeoPolitical(){
        GeoPoliticalZones geoPoliticalZones = GeoPoliticalZones.getGeoPolitical("Benue");
        assertEquals(geoPoliticalZones, GeoPoliticalZones.NORTH_CENTRAL);
    }

}