package org.sky.redis;

import javax.servlet.http.HttpServletRequest;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableRedisHttpSession
public class SessionController {
	@RequestMapping("/mySession")
	public String index(final Model model,final HttpServletRequest request){
		if(request.getSession().getAttribute("testSession") == null){
			System.out.println("session is null ");
			request.getSession().setAttribute("testSession", "year");
		}else{
			System.out.println("session is not null");
		}
		return "showSession";
	}
}
