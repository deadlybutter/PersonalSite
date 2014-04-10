package controllers;

import play.mvc.*;
import views.html.*;

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

    public static Result dadCard(){
        return ok(card.render());
    }

}
