package jp.co.stnet.apps.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Clouds implements Serializable {

    @JsonProperty("all")
    private double all;

}
