package jp.co.stnet.apps.domain.model;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@Data
public class OpenWeatherMap implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.open_weather_map
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.zipcode
     *
     * @mbg.generated
     */
    private String zipcode;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.dt_time
     *
     * @mbg.generated
     */
    private LocalDateTime dtTime;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.lon
     *
     * @mbg.generated
     */
    private Double lon;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.lat
     *
     * @mbg.generated
     */
    private Double lat;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.weather_id
     *
     * @mbg.generated
     */
    private Integer weatherId;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.weather_main
     *
     * @mbg.generated
     */
    private String weatherMain;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.description
     *
     * @mbg.generated
     */
    private String description;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.weather_icon
     *
     * @mbg.generated
     */
    private String weatherIcon;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.base
     *
     * @mbg.generated
     */
    private String base;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.temp
     *
     * @mbg.generated
     */
    private Double temp;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.feel_like
     *
     * @mbg.generated
     */
    private Double feelLike;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.temp_min
     *
     * @mbg.generated
     */
    private Double tempMin;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.temp_max
     *
     * @mbg.generated
     */
    private Double tempMax;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.pressure
     *
     * @mbg.generated
     */
    private Double pressure;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.humidity
     *
     * @mbg.generated
     */
    private Double humidity;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.visibility
     *
     * @mbg.generated
     */
    private Integer visibility;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.wind_speed
     *
     * @mbg.generated
     */
    private Double windSpeed;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.wind_direction
     *
     * @mbg.generated
     */
    private Double windDirection;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.wind_gust
     *
     * @mbg.generated
     */
    private Double windGust;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.cloud_all
     *
     * @mbg.generated
     */
    private Double cloudAll;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.type
     *
     * @mbg.generated
     */
    private Integer type;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.id
     *
     * @mbg.generated
     */
    private Integer id;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.county
     *
     * @mbg.generated
     */
    private String county;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.sunrise_time
     *
     * @mbg.generated
     */
    private LocalDateTime sunriseTime;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.sunset_time
     *
     * @mbg.generated
     */
    private LocalDateTime sunsetTime;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.timezone
     *
     * @mbg.generated
     */
    private Integer timezone;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.city_id
     *
     * @mbg.generated
     */
    private Integer cityId;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.location_name
     *
     * @mbg.generated
     */
    private String locationName;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.status_code
     *
     * @mbg.generated
     */
    private Integer statusCode;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_weather_map.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;
}
