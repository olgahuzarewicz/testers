package com.interview.app.model;

import com.opencsv.bean.CsvBindByName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Tester {

    @CsvBindByName(column = "testerId")
    int id;

    @CsvBindByName(column = "firstName")
    String firstName;

    @CsvBindByName(column = "lastName")
    String lastName;

    @CsvBindByName(column = "country")
    String country;

    @CsvBindByName(column = "lastLogin")
    String lastLogin;

    Set<Integer> deviceIds;
}
