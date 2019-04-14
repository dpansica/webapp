package it.solutionsexmachina.webapp.actionbeans;

import it.solutionsexmachina.genericdao.jpa.*;
import it.solutionsexmachina.webapp.entities.Contact;
import it.solutionsexmachina.webcontroller.actionbean.GenericActionBean;
import it.solutionsexmachina.webcontroller.annotation.ServiceMethod;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named("ContactManager")
public class ContactManager extends GenericActionBean
{
	@Inject
	@GenericDAO
	@DAOClass(Contact.class)
	@DBMSUnit(DBMSPersistenceUnit.DBMS1)
	private JpaGenericDAO daoContact;

	@ServiceMethod("getOrSave")
	public String getOrSaveContact(Contact dto)
	{
		List result = daoContact.findByExample(dto);

		if(result.size()==0){
			daoContact.save(dto);
		}

		return dto.getId();
	}

}
