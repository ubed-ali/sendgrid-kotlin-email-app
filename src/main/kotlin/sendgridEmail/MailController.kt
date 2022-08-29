package sendgridEmail

import com.sendgrid.Request
import com.sendgrid.Response
import io.micronaut.email.AsyncEmailSender
import io.micronaut.email.BodyType
import io.micronaut.email.Email
import io.micronaut.http.*
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import kotlinx.coroutines.coroutineScope
import org.reactivestreams.Publisher
import org.slf4j.LoggerFactory
import reactor.core.publisher.Mono
import java.lang.Thread.sleep

@Controller("/mail")
class MailController(private val emailSender: AsyncEmailSender<Request, Response>) {

  @Post("/send/1")
  suspend fun sendEmail1(@Body("to") to: String): Publisher<HttpResponse<*>> = coroutineScope {
    sleep(7000) //pretend we are doing something useful here
    println("Sending e-mail...")
    println("POST /send/1 is working on '${Thread.currentThread().name}' thread")
    return@coroutineScope Mono.from(
      emailSender.sendAsync(
        Email.builder()
          .to(to)
          .subject("Sending e-mail from 1st POST method using '${Thread.currentThread().name}' thread")
          .body("Hello <em>${to},</em><br>" +
            "Thank you for subscribing to our <strong>weekly blogs.</strong>", BodyType.HTML)
      )
    ).map { rsp: Response ->
        if (rsp.statusCode >= 400)
          HttpResponse.unprocessableEntity()
        else
          HttpResponse.accepted<Any>()
    }
  }

  @Post("/send/2")
  suspend fun sendEmail2(@Body("to") to: String): Publisher<HttpResponse<*>> = coroutineScope {
    sleep(1000) //pretend we are doing something useful here too
    println("Sending e-mail...")
    println("POST /send/2 is working on '${Thread.currentThread().name}' thread")
    return@coroutineScope Mono.from(
      emailSender.sendAsync(
        Email.builder()
          .to(to)
          .subject("Sending e-mail from 2nd POST method using '${Thread.currentThread().name}' thread")
          .body("Hello <em>${to},</em><br>" +
            "Thank you for subscribing to our <strong>weekly blogs.</strong>", BodyType.HTML)
      )
    ).map{ rsp: Response ->
        if (rsp.statusCode >= 400)
          HttpResponse.unprocessableEntity()
        else
          HttpResponse.accepted<Any>()
      }
  }
}