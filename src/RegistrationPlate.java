public class RegistrationPlate {
    private final String reqCode;
    private final String country;

    public RegistrationPlate(String reqCode, String country) {
        this.reqCode = reqCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return "RegistrationPlate{" +
                "reqCode='" + reqCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getReqCode() {
        return reqCode;
    }

    public String getCountry() {
        return country;
    }
    public boolean equals(Object object){
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        RegistrationPlate newPlate = (RegistrationPlate) object;

        if (!this.country.equals(newPlate.getCountry())) {
            return false;
        }
        if (this.reqCode == null || !this.reqCode.equals(newPlate.getReqCode())) {
            return false;

        }

        return true;
    }
    @Override
    public int hashCode() {
        if (this.reqCode == null) {
            return 7;
        }

        return this.country.hashCode() + this.reqCode.hashCode();
    }

}
