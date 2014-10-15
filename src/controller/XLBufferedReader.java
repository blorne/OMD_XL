package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

import util.XLException;

//TODO move to another package
public class XLBufferedReader extends BufferedReader {
    public XLBufferedReader(String name) throws FileNotFoundException {
        super(new FileReader(name));
    }


    public void load(Map<String, Slot> map, Model m) {
        try {
            while (ready()) {
                String string = readLine();
                int i = string.indexOf('=');
            	m.add(string.substring(0,i), string.substring(i+1));
            }	
        } catch (Exception e) {
            throw new XLException(e.getMessage());
        }
    }
}
