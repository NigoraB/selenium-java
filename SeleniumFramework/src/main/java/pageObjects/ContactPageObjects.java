package pageObjects;

public interface ContactPageObjects {
   String createBtn_xPath = "//button[normalize-space()='Create']";
   String contactLabel_xPath = "//span[contains(@class,'selectable')]";
   String firstNameTextBox_xPath = "input[name='first_name']";
   String middleNameTextBox_xPath = "input[name='middle_name']";
   String lastNameTextBox_xPath = "input[name='last_name']";
   String sourceDropdown_xPath = "div[name='source'][role='listbox']";

}
