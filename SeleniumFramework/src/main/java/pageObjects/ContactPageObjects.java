package pageObjects;

public interface ContactPageObjects {
   String createBtn = "//button[normalize-space()='Create']";
   String contactLabel = "//span[contains(@class,'selectable')]";
   String firstNameTextBox = "input[name='first_name']";
   String middleNameTextBox = "input[name='middle_name']";
   String lastNameTextBox = "input[name='last_name']";
   String sourceDropdown = "div[name='source'][role='listbox']";

}
