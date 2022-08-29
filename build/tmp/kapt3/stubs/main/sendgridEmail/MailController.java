package sendgridEmail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ%\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"LsendgridEmail/MailController;", "", "emailSender", "Lio/micronaut/email/AsyncEmailSender;", "Lcom/sendgrid/Request;", "Lcom/sendgrid/Response;", "(Lio/micronaut/email/AsyncEmailSender;)V", "sendEmail1", "Lorg/reactivestreams/Publisher;", "Lio/micronaut/http/HttpResponse;", "to", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEmail2", "email-app"})
@io.micronaut.http.annotation.Controller(value = "/mail")
public final class MailController {
    private final io.micronaut.email.AsyncEmailSender<com.sendgrid.Request, com.sendgrid.Response> emailSender = null;
    
    public MailController(@org.jetbrains.annotations.NotNull()
    io.micronaut.email.AsyncEmailSender<com.sendgrid.Request, com.sendgrid.Response> emailSender) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Post(value = "/send/1")
    public final java.lang.Object sendEmail1(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body(value = "to")
    java.lang.String to, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.reactivestreams.Publisher<io.micronaut.http.HttpResponse<?>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Post(value = "/send/2")
    public final java.lang.Object sendEmail2(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body(value = "to")
    java.lang.String to, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.reactivestreams.Publisher<io.micronaut.http.HttpResponse<?>>> continuation) {
        return null;
    }
}