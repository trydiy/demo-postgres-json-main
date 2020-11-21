package jp.co.stnet.apps.web.home;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
@Getter
@Setter
public class HomeForm implements Serializable {
    // login user
    private String userName;
}
