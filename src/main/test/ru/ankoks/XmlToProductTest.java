package ru.ankoks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;

/**
 * User: ankoks
 * Date: 16.11.2018
 */
public class XmlToProductTest {
//    private Product product;
    @Test
    public void testXmlToObject() throws JAXBException, FileNotFoundException {
        File file = new File("product.xml");
//        JAXBContext jaxbContext = JAXBContext.newInstance(Product.class);
//        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//        product = (Product) unmarshaller.unmarshal(file);
//        System.out.println(product);
    }
}