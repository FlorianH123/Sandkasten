package webservice.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaygroundService {
    private final MapperTest mapperTest;

    @Autowired
    public PlaygroundService(MapperTest mapperTest) {
        this.mapperTest = mapperTest;
    }

    public void test() {
        Entity e = new Entity();
        e.setA("A");

        Dto dto = mapperTest.entityToDto(e);
        System.out.println(dto);
    }
}
