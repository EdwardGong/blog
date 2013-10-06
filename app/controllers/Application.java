package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * The API available in the play.api package (such as play.api.mvc)
 * is reserved for Scala developers. As a Java developer, look at play.mvc.
 * @author Edward Gong
 *
 */
public class Application extends Controller {

	public static Result index() {
		System.out.println("Playing around!");
		return ok(index.render("Your new application is ready."));
	}

}
