package prototype;

public class CountryCoordinate extends Coordinate {

    private Country country;

    public CountryCoordinate(final String hemisphere,
                             final String longitude,
                             final String latitude,
                             final Country country) {
        super(hemisphere, longitude, latitude);
        this.country = country;
    }
}
