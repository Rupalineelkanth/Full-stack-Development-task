package managment.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RestController
@RequestMapping("/clients")
public class clientsController {

	
	
	
	
	 @Autowired
	 public ContactUsService  contactUsService ;
	 
	 @PostMapping(value = "/AddContact", consumes = "application/json", produces = "application/json")
	 public ResponseEntity<Map<String, Object>> AddContact(@RequestBody ContactUsModelRequest contactUsModelRequest) {     log.info("SAVING USER DATA WITH EMAIL: {}", contactUsModelRequest.getEmail());

	        try {
	        	contactUsService.AddcontactUs(contactUsModelRequest);
	            return ResponseEntity.ok(RestResponce.build()
	                    .data(contactUsModelRequest)
	                    .success(200)
	                    .message("Contact Created Successfully")
	                    .getResponse());
	        } catch (Exception e) {
	            log.error("Error during Contact {}", e.getMessage(), e);
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                    .body(RestResponce.build()
	                            .error(500)
	                            .message("Conatct failed: " + e.getMessage())
	                            .getResponse());
	        }
	  }
	 
	 
	
	 
	 	
	 
	 @PostMapping(value = "/findAllContact", produces = "application/json")
	 public ResponseEntity<Map<String, Object>> findAllContact(@RequestParam("page") Integer page,
	                                                           @RequestParam("size") Integer size) {
	     log.info("Fetching all contacts, page: {}, size: {}", page, size);
	     try {
	         List<ContactUsModelResponse> contactUsModelResponse = contactUsService.findAllContact(page, size);
	         return ResponseEntity.ok(RestResponce.build()
	                 .data(contactUsModelResponse)
	                 .success(200)
	                 .message("Fetched Contact List Successfully")
	                 .getResponse());
	     } catch (Exception e) {
	         log.error("Error during fetching contact list {}", e.getMessage(), e);
	         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                 .body(RestResponce.build()
	                         .error(500)
	                         .message("Get Contact failed: " + e.getMessage())
	                         .getResponse());
	     }
	 }

}

	
	
	
	
	}
	

