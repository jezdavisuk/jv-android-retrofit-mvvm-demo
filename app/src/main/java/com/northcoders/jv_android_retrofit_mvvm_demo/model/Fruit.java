package com.northcoders.jv_android_retrofit_mvvm_demo.model;

public class Fruit {
    private String name;
    private Long id;
    private String family;
    private String order;
    private String genus;
    private NutritionProfile nutritions;

    public Fruit() {

    }

    public Fruit(String name, Long id, String family, String order, String genus, NutritionProfile nutritions) {
        this.name = name;
        this.id = id;
        this.family = family;
        this.order = order;
        this.genus = genus;
        this.nutritions = nutritions;
    }

    private class NutritionProfile {
        int calories;
        double fat;
        double sugar;
        double carbohydrates;
        double protein;

        public NutritionProfile() {

        }

        public NutritionProfile(int calories, double fat, double sugar, double carbohydrates, double protein) {
            this.calories = calories;
            this.fat = fat;
            this.sugar = sugar;
            this.carbohydrates = carbohydrates;
            this.protein = protein;
        }
    }



}
