package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Autowired
    ProductDao productDao;

    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product pralka = new Product("pralka");
        Product odkurzacz = new Product("odkurzacz");

        Item item1 = new Item(new BigDecimal(2000), 2, new BigDecimal(200));
        Item item2 = new Item(new BigDecimal(300), 1, new BigDecimal(150));

        Invoice invoice = new Invoice("12A34B");

        pralka.getItems().add(item1);
        odkurzacz.getItems().add(item2);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item1.setProduct(pralka);
        item2.setProduct(odkurzacz);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        productDao.save(pralka);
        productDao.save(odkurzacz);
        itemDao.save(item1);
        itemDao.save(item2);

        int id = invoice.getId();
        int pralkaId = pralka.getId();
        int odkurzaczId = odkurzacz.getId();

        //Then
        Assert.assertNotEquals(0, id);
        Assert.assertNotEquals(0, pralkaId);
        Assert.assertNotEquals(0, odkurzaczId);
        Assert.assertEquals(2, itemDao.count());

        //CleanUp
        /*itemDao.deleteAll();
        invoiceDao.delete(id);
        productDao.deleteAll();*/
    }

}
