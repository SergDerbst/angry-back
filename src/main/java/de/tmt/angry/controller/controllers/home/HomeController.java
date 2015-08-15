package de.tmt.angry.controller.controllers.home;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.tmt.angry.controller.controllers.BaseController;
import de.tmt.angry.controller.model.home.HomeResponse;

@RestController
public class HomeController extends BaseController {

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ResponseEntity<HomeResponse> home(@RequestHeader(value="Authorization", required=false) final String authorization) {
		if (authorization == null || authorization.isEmpty()) {
			return new ResponseEntity<HomeResponse>(new HomeResponse(), HttpStatus.OK);
		} else {
			//TODO check if authorized and if so send happiness
			return null;
		}
	}
}
