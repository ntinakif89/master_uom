package com.uom.jirareport.consumers.dto;

import lombok.Getter;

import java.io.Serializable;

/**
 * Created by fotarik on 03/03/2017.
 */
@Getter
public class BugsPerMonthDTO implements Serializable {

    private String name;
    private double[] data;

    private BugsPerMonthDTO(BugsPerMonthDTOBuilder builder) {
        this.name = builder.name;
        this.data = builder.data;
    }

    public static class BugsPerMonthDTOBuilder {
        private final String name;
        private final double[] data;

        public BugsPerMonthDTOBuilder(String name, double[] data) {
            this.name = name;
            this.data = data;
        }

        public BugsPerMonthDTO build() {
            return new BugsPerMonthDTO(this);
        }

    }
}
