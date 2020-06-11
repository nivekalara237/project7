package com.oc.BookService.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mes-configs")
public class ApplicationPropertiesConfiguration {
    private int limiteDeLivres;

    public int getLimiteDeLivres() {
        return limiteDeLivres;
    }
    public void setLimiteDeLivres(int limiteDeLivres) {
        this.limiteDeLivres = limiteDeLivres;
    }
}
