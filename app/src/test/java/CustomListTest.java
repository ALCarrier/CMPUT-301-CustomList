import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax","NS"));
        assertEquals(list.getCount(),listSize+1);
    }
    @Test
    public void testDeleteCity(){

        City city1 = new City("CC","JL");
        list.addCity(city1);
        int listSize = list.getCount();
        assertEquals(list.getCount(), listSize+1);
        list.deleteCity(city1);
        assertEquals(list.getCount(), listSize);
    }
}
