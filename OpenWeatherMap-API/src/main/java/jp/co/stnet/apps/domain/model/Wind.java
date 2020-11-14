package jp.co.stnet.apps.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Wind implements Serializable {

    @JsonProperty("speed")
    private double speed;

    @JsonProperty("deg")
    private double deg;

    @JsonProperty("gust")
    private double gust;
}
