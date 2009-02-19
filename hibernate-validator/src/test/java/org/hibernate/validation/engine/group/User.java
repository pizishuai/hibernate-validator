package org.hibernate.validation.engine.group;

import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;

/**
 * @author Emmanuel Bernard
 * @author Hardy Ferentschik
 */
public class User {
	@NotNull
	private String firstname;

	@NotNull(groups = Default.class)
	private String lastname;

	@NotNull(groups = { Billable.class, BuyInOneClick.class })
	private CreditCard defaultCreditCard;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public CreditCard getDefaultCreditCard() {
		return defaultCreditCard;
	}

	public void setDefaultCreditCard(CreditCard defaultCreditCard) {
		this.defaultCreditCard = defaultCreditCard;
	}
}