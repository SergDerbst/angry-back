package de.tmt.angry.controller.model.home;

import de.tmt.angry.controller.model.ConvenientPojo;

public class HomeResponse extends ConvenientPojo {

	private final String about = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
	private final String welcome = "A German and European view on geopolitics, history, economics, philosophy, and sovereignty.";

	public String getWelcome() {
		return this.welcome;
	}

	public String getAbout() {
		return this.about;
	}
}
