package controllers;

import models.FrontPageText;
import play.*;
import play.mvc.*;

import views.html.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render());
    }

    public static Result contact(){
        return ok(contact.render());
    }

    public static Result watlang(){
        return ok(watlang.render());
    }

    public static Result ld28(){
        return ok(ld28.render());
    }

}
