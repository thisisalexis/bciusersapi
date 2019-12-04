package cl.thisisalexis.bciuserapi.api.model;

import io.swagger.models.auth.In;

import java.math.BigInteger;

/**
 * A representation of an  Phone entity
 *
 * @author Alexis Bravo
 */
public class Phone {

    private BigInteger number;
    private Integer cityCode;
    private Integer countryCode;

    public BigInteger getNumber() {
        return number;
    }

    public void setNumber(BigInteger number) {
        this.number = number;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Integer countryCode) {
        this.countryCode = countryCode;
    }

}
