
package universitysystem_asgmt1;

/**
 *
 * @author Stevanella Marco
 * id: 101307949
 * ASGMT 1 - COMP 2130
 * Professor Hesam Akbari
 * Notes: I have decided to use an array of 10 as I would like to first deepen my knowledge on ArrayList before using them. Thank you for spending time on this and marking it.
 */

public class Address {
    
    private String streetInfo;
    private String city;
    private String postalCode;
    private String province;
    private String country;
    
    // CONSTRUCTORS

    public Address(String streetInfo, String city, String postalCode, String province, String country) {
        this.streetInfo = streetInfo;
        this.city = city;
        this.postalCode = postalCode;
        this.province = province;
        this.country = country;
    }
    
    // ACCESSORS &  MUTATORS

    public String getStreetInfo() {
        return streetInfo;
    }

    public void setStreetInfo(String streetInfo) {
        this.streetInfo = streetInfo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }
   
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    // INSTANCE METHODS

    @Override
    public String toString() {
        return ("\r\nStreet: " + this.getStreetInfo() + "\r\nCity: " + this.getCity() + "\r\nPostal Code: " + this.getPostalCode() + "\r\nProvince: " + this.getProvince() + "\r\nCountry: " + this.getCountry() );
    }
    
    
    
    
    
            
    
}
