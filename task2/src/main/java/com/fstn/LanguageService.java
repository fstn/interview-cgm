package com.fstn;

import java.util.List;

/**
 * The interface Language service.
 */
public interface LanguageService {
    /**
     * Returns a language by id which is the ISO 639-2 Bibliographic Alpha 3 code.
     *
     * @param id The id which is the ISO code.
     * @return The Language.
     */
    Language getLanguageById(String id);

    /**
     * Finds languages by a search string. This methods searches in the following properties
     * <ul>
     * <li>id (ISO 639-2 Bibliographic Alpha 3 code)</li>
     * <li>the name</li>
     * </ul>
     *
     * @param searchString the search string.
     * @return The list of languages.
     */
    List<Language> findLanguagesBySearchString(String searchString);
}
