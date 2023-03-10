package jp.co.stnet.apps.domain.repository;

import jp.co.stnet.apps.domain.model.OpenWeatherMap;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;

public interface OpenWeatherMapRepository {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.open_weather_map
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("zipcode") String zipcode, @Param("dtTime") LocalDateTime dtTime);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.open_weather_map
     *
     * @mbg.generated
     */
    int insert(OpenWeatherMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.open_weather_map
     *
     * @mbg.generated
     */
    int insertSelective(OpenWeatherMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.open_weather_map
     *
     * @mbg.generated
     */
    OpenWeatherMap selectByPrimaryKey(@Param("zipcode") String zipcode, @Param("dtTime") LocalDateTime dtTime);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.open_weather_map
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OpenWeatherMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.open_weather_map
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OpenWeatherMap record);
}
