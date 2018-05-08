package amazon.productsearch.productsearch;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchResponse;

@RestController
public class ProductController {
    private final String searchIndex = "SearchIndex";

    private final String Operation = "Operation";

    private final String service = "Service";

    private final String timestamp = "Timestamp";

    private final String signature = "Signature";

    private final String awsAccessKeyId = "AWSAccessKeyId";

    private final String associateTag = "AssociateTag";

    private final String keyWords = "Keywords";

    private final String sort = "Sort";

    @PostMapping(path = "products")
    public ModelAndView getTopSellingBrowseProducts(@ModelAttribute("form") Form form)
            throws IOException, URISyntaxException, NoSuchAlgorithmException, InvalidKeyException, JAXBException {

        Map<String, String> map = new HashMap<>();
        if (form.getKeyWords() != null) {
            map.put(keyWords, form.getKeyWords());
        }
        if (form.getSearchIndex() != null) {
            map.put(searchIndex, form.getSearchIndex());
        }
        map.put(sort, form.getSort());
        map.put(Operation, form.getOperation());
        map.put(service, "AWSECommerceService");
        DateTimeFormatter dtf = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        String date = OffsetDateTime.now().format(dtf);
        map.put(timestamp, date);
        map.put("Version", "2013-08-01");
        map.put(associateTag, "kirantadikond-21");

        SignedRequestsHelper signedRequestsHelper = new SignedRequestsHelper();
        String surl = signedRequestsHelper.sign(map);
        URLConnection yc = new URL(surl).openConnection();
        JAXBContext jContext = JAXBContext.newInstance(ItemSearchResponse.class);
        Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
        System.out.println(surl + " tests");
        ItemSearchResponse response = (ItemSearchResponse) unmarshallerObj.unmarshal(new InputStreamReader(
                yc.getInputStream()));
        System.out.println("after getting connection...");
        System.out.println(response.getItems().size());
        System.out.println(response.getItems().get(0).getItem().size());
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("items", response.getItems().get(0).getItem());
        System.out.println("Sales Rank...." + response.getItems().get(0).getItem().get(0).toString());
        return modelAndView;
    }

    @GetMapping(path = "form")
    public ModelAndView uploadForm() {
        ModelAndView modelAndView = new ModelAndView("viewPage");
        modelAndView.addObject("form", new Form());
        return modelAndView;
    }

}
