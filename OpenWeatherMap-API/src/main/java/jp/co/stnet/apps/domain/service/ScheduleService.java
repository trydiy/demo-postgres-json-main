package jp.co.stnet.apps.domain.service;

import jp.co.stnet.apps.domain.model.OpenWeatherMap;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService extends RouteBuilder {

    private static final Logger logger =
            LoggerFactory.getLogger(ScheduleService.class);

    @Autowired
    OpenWeatherMapService openWeatherMapService;

    @Autowired
    OWMClient owmClient;

    /**
     * Hourly weather information
     *
     * @throws Exception
     */
    @Override
    public void configure() throws Exception {
        from("quartz2://myGroup/openweathermap?cron=0+0+*+*+*+?+*")
                .transacted()
                .process((Exchange exchange) -> {
                    logger.info("##### Scheduler START");
                    OpenWeatherMap owm = owmClient.get();
                    openWeatherMapService.insert(owm);
                });
    }
}
