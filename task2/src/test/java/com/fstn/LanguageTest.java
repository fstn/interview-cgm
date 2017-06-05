package com.fstn;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * The type Language test.
 */
public class LanguageTest {

    /**
     * The Service.
     */
    LanguageService service;

    /**
     * Tests the 'getLanguageById' method.
     */
    @Test(expected = NoResultsException.class)
    public void getLanguageById_NonExistingLanguage() {
        // Get
        Language result1 = service.getLanguageById("ita");
        // Validate
        Assert.assertNull("Should not get a language because ita doesn't exists",result1);
    }

    /**
     * Tests the 'getLanguageById' method.
     */
    @Test(expected = NoResultsException.class)
    public void getLanguageById_NullLanguage() {
        // Get
        Language result1 = service.getLanguageById(null);
        // Validate
        Assert.assertNull("Language found but doesn't exist",result1);
    }

    /**
     * Tests the 'getLanguageById' method.
     */
    @Test
    public void getLanguageById_ExistingLanguage() {
        // Get
        Language result1 = service.getLanguageById("aar");
        // Validate
        Assert.assertNotNull("Afar Not found",result1);
        Assert.assertEquals("Bad language found","Afar",result1.getName());
    }

     /**
     * Tests the 'findLanguagesBySearchString' method.
     */
    @Test
    public void findLanguagesBySearchString_NonExistingLanguage() {
        // Get
        List<Language> languagesFound = service.findLanguagesBySearchString("Italian");
        // Validate
        Assert.assertNull("Language found but doesn't exist",languagesFound);
    }

    /**
     * Tests the 'findLanguagesBySearchString' method.
     */
    @Test
    public void findLanguagesBySearchString_ExistingLanguage() {
        // Get
        List<Language> languagesFound = service.findLanguagesBySearchString("Javanese");
        // Validate
        Assert.assertNotNull(languagesFound);
        Assert.assertEquals("Language not found using property name",1,languagesFound);
        Language javanese = languagesFound.get(0);
        Assert.assertEquals("Bad Language found using property name","Javanese",javanese.getName());
    }

    /**
     * Tests the 'findLanguagesBySearchString' method.
     */
    @Test
    public void findLanguagesBySearchString_NullLanguage() {
        // Get
        List<Language> languagesFound = service.findLanguagesBySearchString(null);
        // Validate
        Assert.assertNull("doesn't exist",languagesFound);
    }
}
