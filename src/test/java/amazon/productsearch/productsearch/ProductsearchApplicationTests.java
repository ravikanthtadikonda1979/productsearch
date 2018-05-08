package amazon.productsearch.productsearch;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductsearchApplicationTests {

    ProductController productController = new ProductController();

    @Test
    public void getTopSellingBrowseProducts() throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        String date = OffsetDateTime.now().format(dtf);
        System.out.println(date);
    }

}
