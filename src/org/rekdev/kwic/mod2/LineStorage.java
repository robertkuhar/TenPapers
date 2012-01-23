package org.rekdev.kwic.mod2;

/**
 * Methods to provide the means by which the KWIC system stores and manipulates
 * its input lines.
 * 
 * Wildass guess as to the Interface for Modularization 2, Module 1, Line
 * Storage from http://sunnyday.mit.edu/16.355/parnas-criteria.html
 */
public interface LineStorage {
    /**
     * Get the Character at lineIx:wordIx:charIx.
     * 
     * @param lineIx - Line index
     * @param wordIx - Word index
     * @param charIx - Character index
     * @return character at lineIx:wordIx:charIx.
     */
    char getChar( int lineIx, int wordIx, int charIx );

    /**
     * Set Character c into lineIx:wordIx:charIx.
     * 
     * @param lineIx - Line index
     * @param wordIx - Word index
     * @param charIx - Character index
     * @param c
     */
    void setChar( int lineIx, int wordIx, int charIx, char c );

    /**
     * Number of Words in the Line at lineIx.
     * 
     * @param lineIx - Line index
     * @return number of words in the Line at lineIx
     */
    int words( int lineIx );

    /**
     * Number of Lines.
     * 
     * @return the number of stored Lines
     */
    int lines();

    /**
     * Number of Characters for the Word at lineIx:wordIx.
     * 
     * @param lineIx - Line index
     * @param wordIx - Word index
     * @return the number of Characters in the Word at lineIx:wordIx
     */
    int characters( int lineIx, int wordIx );

    /**
     * Delete Line at lineIx.
     * 
     * @param lineIx - Line index
     */
    void deleteLine( int lineIx );

    /**
     * Delete Word at lineIx:wordIx.
     * 
     * @param lineIx - Line index
     * @param wordIx - Word index
     */
    void deleteWord( int lineIx, int wordIx );
}
