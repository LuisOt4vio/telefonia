package bcc.ifsuldeminas.PrimeiroApp.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//definindo a classe como um rest controller
//rest - segue o padrão rest
@RestController
@RequestMapping("/hello")
public class HelloController {
    //todo método publico de um controlador,
    //trata um tipo de requisicao
    // "/hello" indica a URI da requisicao que sera
    //tratada. Get é pq se trata de uma requisicao GET
    @GetMapping("/hello")
    public String hello(){
        return "Hello, world!";
    }

    @GetMapping("/ola/{nome}")
    public String ola(@PathVariable String nome){
        return "Olá, "+nome+"!";
    }

    @GetMapping("/age/{age}")
    public String age(@PathVariable String age){
        return age;
    }

    @GetMapping("/calendar")
    public String calendar(){
        GregorianCalendar data = new GregorianCalendar();
        data.set(Calendar.DAY_OF_MONTH, 25);
        data.set(Calendar.MONTH, 9);
        data.roll(Calendar.DAY_OF_YEAR, 150);
        return data.toString();
    }
}
