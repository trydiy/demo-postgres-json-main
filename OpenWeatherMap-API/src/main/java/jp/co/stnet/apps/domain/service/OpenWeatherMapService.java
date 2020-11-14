package jp.co.stnet.apps.domain.service;

import jp.co.stnet.apps.domain.model.OpenWeatherMap;
import jp.co.stnet.apps.domain.repository.OpenWeatherMapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OpenWeatherMapService {

    @Autowired
    OpenWeatherMapRepository openWeatherMapRepository;

    /**
     * insert open weather map information record.
     *
     * @param owm OpenWeatherMap
     * @return insert count.
     */
    public int insert(OpenWeatherMap owm) {
        return openWeatherMapRepository.insert(owm);
    }

}
