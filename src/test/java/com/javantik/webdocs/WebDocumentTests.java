package com.javantik.webdocs;

import org.junit.Test;
import static junit.framework.Assert.*;

public class WebDocumentTests {
    @Test
    public void testGetDocumentName() {
        WebDocument doc = new WebDocument();
        doc.setName("name");
        assertEquals("name", doc.getName());
    }

    @Test
    public void testGetDocumentId() {
        WebDocument doc = new WebDocument();
        doc.setId(123);
        assertEquals(123, doc.getId());
    }

    @Test
    public void testGetDocumentSections() {
        WebDocument doc = new WebDocument();
        doc.setSections(new Section[0]);
        assertEquals(0, doc.getSections().length);
    }
}
