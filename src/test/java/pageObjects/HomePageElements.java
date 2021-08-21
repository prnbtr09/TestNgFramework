package pageObjects;

public interface HomePageElements {
	
	String HOMEPAGEICON="(//span[text()='HOME'])[1]";
	
	String RADIOBUTTONID="bmwradio";
	
	String CARRADIOBUTTONSLIST="//label//*[@name='cars' and @type='radio']";
	
	String OPENWINDOWXPATH="//button[@id='openwindow']";
	
	String OPENTABXPATH="//*[text()='Open Tab']";
	
	String WEBTABLECOLUMNS="//table[@id='product']/tbody/tr[%s]/th";
	String WEBTABLEFIXROWS="//table[@id='product']/tbody/tr[position()!=1]";
	String WEBTABLEFIXCOLUMNS="//table[@id='product']/tbody/tr[1]/th";
	String WEBTABLEROWS="//table[@id='product']/tbody/tr[%s]";
	
	String cellValues="//table[@id='product']/tbody/tr[%s]/td[%s]";
	
	String MOUSEHOVERELEMENT="//button[@id='mousehover']";
	
	
}
