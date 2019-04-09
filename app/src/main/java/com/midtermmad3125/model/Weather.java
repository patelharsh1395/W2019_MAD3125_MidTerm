package com.midtermmad3125.model;



import java.io.Serializable;

public class Weather implements Serializable {
        String main;
        String description;

        public String getMain() {
                return main;
        }

        public void setMain(String main) {
                this.main = main;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }
}
