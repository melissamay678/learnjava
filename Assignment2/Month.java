
/**
 * Enumeration class Mo - represents valid month abbreviations of the year
 * 
 */
public enum Month {
    JAN("January"),
    FEB("Febuary"),
    MAR("March"),
    APR("April"),
    MAY("May"),
    JUN("June"),
    JUL("July"),
    AUG("August"),
    SEP("September"),
    OCT("October"),
    NOV("November"),
    DEC("December");
    
    String month;
    
    private Month(String month) {
        this.month = month;
    }
    
    public String getMonth() {
        return month;
    }
}
