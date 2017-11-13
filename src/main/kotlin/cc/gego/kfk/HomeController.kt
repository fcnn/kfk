package cc.gego.kfk

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired

@Controller
@RequestMapping(value = "/")
class HomeController {
  @RequestMapping(value = "")
  internal fun index() : String {
    return "index"
  }

  @RequestMapping(value = "/test")
  internal fun test() : String {
    return "index"
  }
}
