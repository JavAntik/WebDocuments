package com.javantik.webdocs;

import org.junit.Test;
import static junit.framework.Assert.*;

public class SectionTests {

    @Test
    public void testGetSectionId() {
        Section section = new Section();
        section.setId(123);
        assertEquals(123, section.getId());
    }

    @Test
    public void testGetSectionTitle() {
        Section section = new Section();
        section.setTitle("title");
        assertEquals("title", section.getTitle());
    }


}
