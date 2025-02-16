package jx.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String greeting() {
        return "Hola mundo - Spanish";
    }
}
