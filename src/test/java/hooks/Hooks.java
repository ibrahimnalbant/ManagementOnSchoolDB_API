package hooks;

import io.cucumber.java.Before;

import static base_urls.ManagementOnSchoolsBaseUrl.setUp;

public class Hooks {

    @Before("@US01Api")//import io.cucumber.java.Before; --> Sadece @US01Api tagi olan testler öncesi çalışır.
    public void before(){
        setUp();
    }

}
