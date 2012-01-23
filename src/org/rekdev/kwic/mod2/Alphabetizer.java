package org.rekdev.kwic.mod2;

/**
 * Methods to provide the means by which the KWIC system performs
 * Alphabetization of lines.
 * 
 * Wildass guess as to the Interface for Modularization 2, Module 4,
 * Alphabetizer from http://sunnyday.mit.edu/16.355/parnas-criteria.html
 */
public interface Alphabetizer {
    /**
     * Sets up the Alphabetizer with a CircluarShifter.
     * 
     * @param cs - CircularShifter on which the Alphabetizer will operate.
     */
    void alpha( CircularShifter cs );

    /**
     * Returns an index into the CircularShifter for the ith alphabetic ordering
     * specified by the iTh input parameter.
     * 
     * @param iTh - index of alphabetical ordering
     * @return the index of the CircularShift
     */
    int ith( int iTh );

}
