package com.bartolay.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {

	private Object[][] data = new Object[][] {
		{1,"RBAS231", "Ryan Kristoffer Loyola Bartolay", "BPI"},
		{2, "EX1235", "Joenna Barata Bartolay", "ChinaBank"}
	};
	private List<Account> accounts = new ArrayList<>();
	
	public AccountRestController() {
		Arrays.asList(data).stream().forEach(e -> { 
			accounts.add(new Account(Integer.parseInt(e[0].toString()), e[1].toString(), e[2].toString(), e[3].toString()));
		});
	}
	
	@RequestMapping(value="/account", method=RequestMethod.GET)
	public List<Account> getAccountDetails() {
		return accounts;
	}
}
