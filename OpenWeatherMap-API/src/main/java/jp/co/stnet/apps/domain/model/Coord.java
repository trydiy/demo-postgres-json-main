package jp.co.stnet.apps.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Coord implements Serializable {

    @JsonProperty("lon")
    private double lon;

    @JsonProperty("lat")
    private double lat;

}
