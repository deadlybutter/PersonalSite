package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result mckeeSite(){
        return ok(mckee.render());
    }

    public static Result watlang(){
        return ok(watlang.render());
    }

    public static Result cards(){
        return ok(cards.render());
    }
  
}
