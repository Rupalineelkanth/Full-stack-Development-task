package managment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


import managment.repo.ContactRepository;
import managment.requestModel.ContactRequest;

@Service
public class ContactUsService {

	
	
	@Autowired
	public  ContactRepository contactUsRepo ;

	
	public void  AddcontactUs(ContactRequest contactUsModelRequest) throws Exception{
		
		ContactUsService contact = new ContactUsService();
		contact.setFullName(contactUsModelRequest.getFullName());
		contact.setEmail(contactUsModelRequest.getEmail());
		contact.setMobileName(contactUsModelRequest.getMobileName());
			ContactUs contactUs = contactUsRepo.save(contact);
		
		
		
	}
	
	
	public List<ContactRequest> findAllContact(Integer page, Integer size) throws Exception {
	    org.springframework.data.domain.Page<ContactRepository> contactPage = contactUsRepo.findAll(PageRequest.of(page, size));
	    List<ContactUsService> contactList = contactPage.getContent();

	    List<ContactRequest> contactResponseModel = new ArrayList<>();
	    for (ContactUsService contactUs : contactList) {
	        ContactRequest responseModel = new ContactUsModelResponse();
	        responseModel.setFullName(contactUs.getFullName());
	        responseModel.setEmail(contactUs.getEmail());
	        responseModel.setMobileName(contactUs.getMobileName());
	        responseModel.setSubject(contactUs.getSubject());
	        responseModel.setDescription(contactUs.getDescription());
	        contactResponseModel.add(responseModel);
	    }
	    return contactResponseModel;
	}
}
