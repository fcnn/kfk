package cc.gego.kfk

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired

@Controller
@RequestMapping("/")
class HomeController {
  @RequestMapping("")
  internal fun index() : String = "index"

  @RequestMapping("/test")
  internal fun test() : String = "index"
}
