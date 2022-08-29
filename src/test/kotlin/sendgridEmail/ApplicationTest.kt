package sendgridEmail

import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.kotest.core.spec.style.StringSpec

@MicronautTest
class ApplicationTest(private val application: EmbeddedApplication<*>): StringSpec({

  "Testing the server is running" {
    assert(application.isRunning)
  }
})
