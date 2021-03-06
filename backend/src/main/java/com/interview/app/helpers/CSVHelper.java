package com.interview.app.helpers;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class CSVHelper {

    private CSVHelper() {
        throw new IllegalStateException("Utility class");
    }

    public static List getFromFileCSV(InputStream inputStream, Class clazz) {
        return new CsvToBeanBuilder(new BufferedReader(new InputStreamReader(inputStream)))
                .withType(clazz)
                .withFilter(strings -> {
                    for (String one : strings) {
                        if (one != null && one.length() > 0) {
                            return true;
                        }
                    }
                    return false;
                }).build().parse();
    }
}
