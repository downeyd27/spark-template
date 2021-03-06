import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";


    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<>();
      model.put("template", "templates/index.vtl" );

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
