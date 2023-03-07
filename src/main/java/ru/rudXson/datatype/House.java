package ru.rudXson.datatype;
/**

 A class to represent a house.
 */
public class House {
    private String name; // The name of the house.
    private Integer year; // The year the house was built.
    private int numberOfLifts; // The number of lifts in the house.

    /**

     Creates a new House object.
     @param name The name of the house.
     @param year The year the house was built.
     @param numberOfLifts The number of lifts in the house.
     */
    public House(String name, Integer year, int numberOfLifts) {
        this.name = name;
        this.year = year;
        this.numberOfLifts = numberOfLifts;
    }

    /**
     Returns the name of the house.
     @return The name of the house.
     */
    public String getName() {
        return name;
    }
    /**

     Sets the name of the house.
     @param name The name of the house.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**

     Returns the year the house was built.
     @return The year the house was built.
     */
    public Integer getYear() {
        return year;
    }
    /**

     Sets the year the house was built.
     @param year The year the house was built.
     @throws IllegalArgumentException If the year is null or less than or equal to 0.
     */
    public void setYear(Integer year) {
        if (year == null || year <= 0) {
            throw new IllegalArgumentException("Year should be greater than 0");
        }
        this.year = year;
    }
    /**

     Returns the number of lifts in the house.
     @return The number of lifts in the house.
     */
    public int getNumberOfLifts() {
        return numberOfLifts;
    }
    /**

     Sets the number of lifts in the house.
     @param numberOfLifts The number of lifts in the house.
     @throws IllegalArgumentException If the number of lifts is less than or equal to 0.
     */
    public void setNumberOfLifts(int numberOfLifts) {
        if (numberOfLifts <= 0) {
            throw new IllegalArgumentException("Number of lifts should be greater than 0");
        }
        this.numberOfLifts = numberOfLifts;
    }
}