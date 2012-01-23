package org.rekdev.kwic.mod2;

/**
 * Methods to provide the means by which the KWIC system performs Circular
 * Shifting of lines.
 * 
 * Wildass guess as to the Interface for Modularization 2, Module 3, Circular
 * Shifter from http://sunnyday.mit.edu/16.355/parnas-criteria.html
 */
public interface CircularShifter {
    /**
     * Setup the CircularShifter
     * 
     * @param lines the collection of Lines for the CircularShifter to operate
     *            on.
     */
    void setup( String[] lines );

    /**
     * Get the Character at shiftIx:wordIx:charIx.
     * 
     * @param shiftIx - Shift index
     * @param wordIx - Word index
     * @param charIx - Character index
     * @return character at lineIx:wordIx:charIx.
     * @throws IllegalStateException if setup() has not yet been called.
     */
    char getChar( int shiftIx, int wordIx, int charIx );

}
