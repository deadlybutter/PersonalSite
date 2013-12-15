package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render());
    }

    public static Result computers(){
        return ok(computer.render());
    }

    public static Result gamescoding(){
        return ok(games.render());
    }

    public static Result web(){
        return ok(web.render());
    }

    public static Result watlang(){
        return ok(watlang.render());
    }

    public static Result robot(){
        return ok(robotics.render());
    }

    public static Result electronics(){
        return ok(electronics.render());
    }

    public static Result ld28(){
        return ok(ld28.render());
    }

}
