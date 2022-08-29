package sendgridEmail

import io.micronaut.runtime.Micronaut.build
import java.lang.Thread.sleep

fun main(args: Array<String>) {
			 println("Entering into '${Thread.currentThread().name}' thread.")
				build()
					.args(*args)
					.packages("com.sendgridEmail")
					.start()
		sleep(10000) //pretend we are doing something useful here
		println("Exiting from '${Thread.currentThread().name}' thread.")
}