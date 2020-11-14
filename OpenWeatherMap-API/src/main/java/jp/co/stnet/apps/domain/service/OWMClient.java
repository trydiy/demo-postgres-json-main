package jp.co.stnet.apps.domain.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import jp.co.stnet.apps.domain.model.*;
import org.apache.commons.codec.DecoderException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
public class OWMClient {

    private static final Logger logger =
            LoggerFactory.getLogger(OWMClient.class);

    @Value("${endpoint.url}")
    private String endpointUrl;
    @Value("${appid}")
    private String appid;
    @Value("${zip}")
    private String zip;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * @throws DecoderException
     * @see https://openweathermap.org/current
     */
    public OpenWeatherMap get() throws JsonProcessingException {

        String owmUrl = endpointUrl + "&appid=" + appid + "&zip=" + zip;
        ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        String jsonString = restTemplate.<String>getForObject(owmUrl, String.class);
        logger.info("##### json {}", jsonString);

        OWMResponse response = mapper.readValue(jsonString, OWMResponse.class);

        // pk set
        OpenWeatherMap owm = new OpenWeatherMap();
        owm.setZipcode(zip);

        Coord coord = response.getCoord();
        // City geo location, longitude
        owm.setLon(coord.getLon());
        // City geo location, latitude
        owm.setLat(coord.getLat());

        List<Weather> weathers = response.getWeather();
        Weather weather = weathers.get(0);

        // Weather condition id
        owm.setWeatherId(weather.getId());

        // Group of weather parameters (Rain, Snow, Extreme etc.)
        owm.setWeatherMain(weather.getMain());

        // Weather condition within the group.
        // You can get the output in your language.
        owm.setDescription(weather.getDescription());

        // Weather icon id
        owm.setWeatherIcon(weather.getIcon());

        // base (Internal parameter)
        owm.setBase(response.getBase());

        Main main = response.getMain();
        // Temperature.
        // Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
        owm.setTemp(main.getTemp());

        // Temperature.
        // This temperature parameter accounts for the human perception of weather.
        // Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
        owm.setFeelLike(main.getFeels_like());

        // Minimum temperature at the moment.
        // This is minimal currently observed temperature
        // (within large megalopolises and urban areas).
        // Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
        owm.setTempMin(main.getTemp_min());

        // Maximum temperature at the moment.
        // This is maximal currently observed temperature
        // (within large megalopolises and urban areas).
        // Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
        owm.setTempMax(main.getTemp_max());

        // Atmospheric pressure
        // (on the sea level, if there is no sea_level or grnd_level data), hPa
        owm.setPressure(main.getPressure());

        // Humidity, %
        owm.setHumidity(main.getHumidity());

        // Visibility, meter
        owm.setVisibility(response.getVisibility());

        Wind wind = response.getWind();
        // Wind speed.
        // Unit Default: meter/sec,
        // Metric: meter/sec, Imperial: miles/hour.
        owm.setWindSpeed(wind.getSpeed());
        // Wind direction, degrees (meteorological)
        owm.setWindDirection(wind.getDeg());
        // Wind Gust
        owm.setWindGust(wind.getGust());

        Clouds clouds = response.getClouds();
        // Cloudiness, %
        owm.setCloudAll(clouds.getAll());

        // Time of data calculation (primary key)
        long dt = response.getDt();
        owm.setDtTime(getLocalDateTime(dt));

        Sys sys = response.getSys();
        // type (Internal parameter)
        owm.setType(sys.getType());

        // id (Internal parameter)
        owm.setId(sys.getId());

        // country
        owm.setCounty(sys.getCountry());

        // sunrise time
        long sunrise = sys.getSunrise();
        owm.setSunriseTime(getLocalDateTime(sunrise));

        // sunset time
        long sunset = sys.getSunset();
        owm.setSunsetTime(getLocalDateTime(sunset));

        // timezone
        owm.setTimezone(response.getTimezone());

        // city id
        owm.setCityId(response.getId());

        // location name
        owm.setLocationName(response.getName());

        // status
        owm.setStatusCode(response.getCod());

        // create time
        owm.setCreateTime(LocalDateTime.now());

        logger.info("##### {}", owm);
        return owm;
    }

    /**
     * @param unixTime
     * @return LocalDateTime
     */
    private LocalDateTime getLocalDateTime(long unixTime) {
        Date date = new Date(unixTime * 1000);
        Instant instant = date.toInstant();
        return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }
}
