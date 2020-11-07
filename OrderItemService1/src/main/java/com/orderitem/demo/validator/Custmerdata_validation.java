package com.orderitem.demo.validator;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.orderitem.demo.model.CustmoerData;
import com.orderitem.demo.model.OrderItem;
import com.orderitem.demo.repo.CustmerSaveDataRepo;
import com.orderitem.demo.repo.OrderItemRepo;



/**
 * @author imssbora
 */
@Component
public class Custmerdata_validation implements Validator {
	

	@Autowired
	private OrderItemRepo orderitemrepo;
	
	
	
	@Autowired
	private CustmerSaveDataRepo custmerrepo;
	

   @Override
   public boolean supports(Class<?> clazz) {
      return CustmoerData.class.equals(clazz);
   }

   @Override
	public void validate(Object obj, Errors err) {

	   CustmoerData otem = (CustmoerData) obj;

		Optional<CustmoerData> data = custmerrepo.findByCust_emailadress(otem.getCust_emailadress());

		if (data.isPresent()) {

			err.rejectValue("emailadress", "500", "" + otem.getCust_emailadress() + " already there avialble");

		}

		 

		// ValidationUtils.rejectIfEmpty(err, "name", "user.name.empty");
		// ValidationUtils.rejectIfEmpty(err, "email", "user.email.empty");
		// ValidationUtils.rejectIfEmpty(err, "phone", "user.phone.empty");

		 
   
   }

}