package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class cart extends BaseAmazonClass{
	@FindBy(css="#ap_email")
	WebElement Email;
	@FindBy(css="#continue")
	WebElement Cbtn;
	@FindBy(css="#ap_password")
	WebElement Lpassword;
	@FindBy(css="#signInSubmit")
	WebElement Sbtn;
	@FindBy(css="#twotabsearchtextbox")
	WebElement Search;
	@FindBy(css="#nav-search-submit-button")
	WebElement s_btn;
	@FindBy(xpath="//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/h2[1]/a[1]/span[1]")
	WebElement link;
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement add_button;
	@FindBy(xpath="//a[contains(text(),'Go to cart')]")
	WebElement go_cart;
	@FindBy(css="body.a-aui_72554-c.a-aui_accordion_a11y_role_354025-c.a-aui_killswitch_csa_logger_372963-c.a-aui_launch_2021_ally_fixes_392482-c.a-aui_pci_risk_banner_210084-c.a-aui_preload_261698-c.a-aui_rel_noreferrer_noopener_309527-c.a-aui_template_weblab_cache_333406-c.a-aui_tnr_v2_180836-c.a-meter-animate:nth-child(2) div.a-container.sc-background-dark:nth-child(30) div.a-section.a-spacing-none:nth-child(4) div.a-fixed-right-flipped-grid:nth-child(4) div.a-fixed-right-grid-inner div.a-fixed-right-grid-col.sc-retail-cart-column-spacing.a-col-left:nth-child(3) div.a-cardui.sc-card-style.sc-list.sc-java-remote-feature.celwidget.sc-grid-view.sc-grid-full-width.sc-card-spacing-top-none:nth-child(1) div.a-cardui-body.a-scroller-none div.a-section.a-spacing-mini.sc-list-body.sc-java-remote-feature:nth-child(6) div.a-row.sc-list-item.sc-java-remote-feature:nth-child(3) div.sc-list-item-content div.a-row.a-grid-vertical-align.a-grid-top.sc-list-item-content-inner div.sc-item-content-group div.a-row.sc-action-links span.a-size-small.sc-action-delete:nth-child(3) span.a-declarative > input.a-color-link")
	WebElement delete;
	
	
	public cart() {
		PageFactory.initElements(driver, this);
	}
	public void typeemail(String email) {
		Email.sendKeys(email);
	}
	public void Cbtn() {
		Cbtn.click();
	}
	public void Lpassword(String password) {
		Lpassword.sendKeys(password);
	}
	public void Lbtn() {
		Sbtn.click();
	}
	public void sendsearch(String search) {
		Search.sendKeys(search);
	}
	public void S_btn() {
		s_btn.click();
	}
	public void link1() {
		link.click();
	}
	public void add_button() {
		add_button.click();
	}
	public void go_cart() {
		go_cart.click();
	}
	public void Delete() {
		delete.click();
	}

}
