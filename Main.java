package com.qualizeal_50applications;
 
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Elements50[] applications = new Elements50[3]; 
 
        applications[0] = new Elements50(
        		"https://github.com/login",
        		"karribhavyareddy6@gmail.com", // Replace with your GitHub username
        		"Bhavya@8453", // Replace with your GitHub password
        		"//*[@id=\"login_field\"]", // XPath for username field
        		"//*[@id=\"password\"]", // XPath for password field
            "//*[@id=\"login\"]/div[4]/form/div/input[13]", // XPath for login button
          "/html/body/div[1]/div[1]/header/div/div[2]/div[3]/deferred-side-panel/include-fragment/react-partial-anchor/button/span/span/img", // XPath for profile button
            "//*[@id=\":r12:--label\"]", // XPath for logout button
          null
        );
        
        applications[1] = new Elements50(
        		"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0",
        		"karribhavyareddy6@gmail.com", // Replace with your Amazon username
        		"Bhavya@8453", // Replace with your Amazon password
        		"//*[@id=\"ap_email\"]", // XPath for username field
        		"//*[@id=\"ap_password\"]", // XPath for password field
            "//*[@id=\"signInSubmit\"]", // XPath for login button
          "//*[@id=\"nav-link-accountList-nav-line-1\"]", // XPath for profile button
            "/html/body", // XPath for logout button
          "//*[@id=\"continue\"]" //xpath for continue button         
        );
        
        applications[2] = new Elements50(
        		"https://auth.geeksforgeeks.org/",
        		"karribhavyareddy6@gmail.com", // Replace with your Geeksforgeeks username
        		"Bhavya@8453", // Replace with your Geeksforgeeks password
        		"//*[@id=\"luser\"]", // XPath for username field
        		"//*[@id=\"password\"]", // XPath for password field
            "//*[@id=\"Login\"]/button", // XPath for login button
          "/html/body", // XPath for profile button
            "//*[@id=\"topMainHeader\"]/div/div/div[1]/ul/a[8]/span", // XPath for logout button
          null
        );
         
        for (Elements50 app : applications) {
            app.login();
            Thread.sleep(2000);
            app.logout();
            Thread.sleep(2000);
            app.close();
        }
    }
}
 