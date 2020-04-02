package org.garpesa.services.organization.repository;



import org.garpesa.services.organization.model.Organization;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@ApplicationScoped
public class OrganizationRepository {

	private Set<Organization> organizations = new HashSet<>();

	public OrganizationRepository() {
		add(new Organization("Test1", "Address1"));
		add(new Organization("Test2", "Address2"));
	}

	public Organization add(Organization organization) {
		organization.setId((long) (organizations.size()+1));
		organizations.add(organization);
		return organization;
	}
	
	public Organization findById(Long id) {
		Optional<Organization> organization = organizations.stream().filter(a -> a.getId().equals(id)).findFirst();
		if (organization.isPresent())
			return organization.get();
		else
			return null;
	}

	public Set<Organization> findAll() {
		return organizations;
	}
	
}
