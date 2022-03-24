package com.varuna.covidcasecount;

import java.util.List;

public class CovidData {
    public String state;
    public String statecode;
    public List<DistrictData> districtData;

    public class Delta {
        public int confirmed;
        public int deceased;
        public int recovered;
    }

    public class DistrictData {
        public String district;
        public String notes;
        public int active;
        public int confirmed;
        public int migratedother;
        public int deceased;
        public int recovered;
        public Delta delta;
    }
}