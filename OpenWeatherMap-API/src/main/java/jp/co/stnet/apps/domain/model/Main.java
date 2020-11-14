package jp.co.stnet.apps.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Main implements Serializable {

    @JsonProperty("temp")
    private double temp;

    @JsonProperty("feels_like")
    private double feels_like;

    @JsonProperty("temp_min")
    private double temp_min;

    @JsonProperty("temp_max")
    private double temp_max;

    @JsonProperty("pressure")
    private double pressure;

    @JsonProperty("humidity")
    private double humidity;

}
