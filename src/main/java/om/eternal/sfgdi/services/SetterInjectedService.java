package om.eternal.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedService implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello from Setter Injected Service";
    }
}
