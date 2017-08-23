import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.context.ApplicationContext
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import pl.com.ergosoft.auth.JwtAuthApplication
import spock.lang.Specification

@SpringBootTest(classes = JwtAuthApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AuthenticationControllerSpecTest extends Specification {

    @Autowired
    private ApplicationContext ctx

    protected final static String ENDPOINT_URL = "/"

    protected ResponseEntity<String> response

    @Autowired
    protected TestRestTemplate restTemplate

    def "main url responses with 200 OK"() {
        given:
        when:
            response = restTemplate.getForEntity(ENDPOINT_URL, String.class)
        then:
            response.getStatusCode() == HttpStatus.OK
            print response
    }
}
