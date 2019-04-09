package com.midtermmad3125.model;

//"weather": [
//        {
//        "id": 500,
//        "main": "Rain",
//        "description": "light rain",
//        "icon": "10d"
//        }
//        ],


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
