package com.javantik.webdocs;

import org.junit.Test;
import static junit.framework.Assert.*;

public class WebDocumentTest {
    @Test
    public void testGetDocumentName() {
        WebDocument doc = new WebDocument();
        doc.setName("name");
        assertEquals("name", doc.getName());
    }

}
