public class AddressBook {

	public static void main(String[] args) {

		AddressBookData contact1 = new AddressBookData();
		AddressBookData contact2 = new AddressBookData();
		
		contact1.setFirstName("Billy");
		contact1.setMiddleName("James");
		contact1.setLastName("Dean");
		contact1.setHomeAddress("123 street");
		contact1.setBusinessPhone("180094jenny");
		contact1.setHomePhone("4031243234");
		contact1.setCellPhone("4033218484");
		contact1.setSkypeId("l337");
		contact1.setFacebookId("javanewb");
		contact1.setPersonalWebSite("www.java.org");

		contact2.setFirstName("Billy");
		contact2.setMiddleName("James");
		contact2.setLastName("Dean");
		contact2.setHomeAddress("123 street");
		contact2.setBusinessPhone("18007326632");
		contact2.setHomeAddress("4036457373");
		contact2.setCellPhone("4032314873");
		contact2.setSkypeId("new8");
		contact2.setFacebookId("learningisfun");
		contact2.setPersonalWebSite("www.google.ca");
		
		System.out.println(contact1.compareName(contact2));
		
		
		System.out.print(contact2.getPersonalWebSite());
	}
}
