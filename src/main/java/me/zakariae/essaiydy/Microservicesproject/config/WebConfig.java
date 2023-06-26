package me.zakariae.essaiydy.Microservicesproject.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



/*
* The WebConfig class is annotated with @Configuration,
* indicating that it provides bean configurations for the application.
* It implements the WebMvcConfigurer interface, which allows customization of Spring MVC configuration.
* The configureContentNegotiation method is overridden to configure content negotiation.
* The default content type is set to MediaType.APPLICATION_JSON,
* which means if the client does not specify a specific media type, JSON will be used as the default format.
* Two media types are registered: "json" with MediaType.APPLICATION_JSON and "xml" with MediaType.APPLICATION_XML.
* This allows the client to specify either JSON or XML as the desired format.
*
*PS : By specifying the "Accept" header as "application/xml",
*      you are informing the server that you prefer to receive the response in XML format.
*       The server will then check if it can provide the response in the requested format and send it back accordingly.
* */
@Configuration
public class WebConfig  implements WebMvcConfigurer {


    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.defaultContentType(MediaType.APPLICATION_JSON)
                .mediaType("json",MediaType.APPLICATION_JSON)
                .mediaType("XML", MediaType.APPLICATION_XML);
    }
}
