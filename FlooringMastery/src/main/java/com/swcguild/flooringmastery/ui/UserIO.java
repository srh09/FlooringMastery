/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooringmastery.ui;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Reid
 */
public interface UserIO {
    void print(String msg);

	    double readDouble(String prompt) throws NumberFormatException;

	    double readDouble(String prompt, double min, double max) throws NumberFormatException;

	    float readFloat(String prompt) throws NumberFormatException;

	    float readFloat(String prompt, float min, float max) throws NumberFormatException;

	    int readInt(String prompt) throws NumberFormatException;

	    int readInt(String prompt, int min, int max) throws NumberFormatException;

	    long readLong(String prompt) throws NumberFormatException;

	    long readLong(String prompt, long min, long max) throws NumberFormatException;
            
            LocalDate readLocalDate(String prompt) throws DateTimeParseException;
            
            BigDecimal readBigDecimal(String prompt);

	    String readString(String prompt);
}
