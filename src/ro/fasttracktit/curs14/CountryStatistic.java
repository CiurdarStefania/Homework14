package ro.fasttracktit.curs14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CountryStatistic {
    private final List<Country> countries;

    public CountryStatistic(List<Country> countries) {

        this.countries = new ArrayList<>(countries == null ? new ArrayList<>() : countries);
    }
         public  void makeAdvanced(String name, String technology){

         }

   /* public long getPopulation(String countryName) {
        for (Country country : countries) {
            if (country.getPopulation() ) {
                countries.add(country);
            }
        }
    }*/

    public Country getCountryCapital(String countryName) {
        for (Country country : countries) {
            if (country.getCapital().contains(countryName)) {
                countries.add(country);
            }
        }
        return (Country) countries;
    }


    public Country getCountriesStartingWithLetter(String letter) {
        for (Country country : countries) {
            if (country.getName().contains(letter)) {
                countries.add(country);
            }
        }
        return (Country) countries;
    }

    public List<Country> getAllCountries() {
        List<Country> result = new ArrayList<>();
        for (Country country : countries) {
            result.addAll((Collection<? extends Country>) country);
        }
        return result;
    }

    public List<Country> findByName(String partialName) {
        List<Country> result = new ArrayList<>();
        for (Country country : countries) {
            if (country.getName().contains(partialName)) {
                result.add(country);
            }
        }
        return result;
    }
}
