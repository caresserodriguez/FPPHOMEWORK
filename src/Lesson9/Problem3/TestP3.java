package Lesson9.Problem3;

public class TestP3 {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory("home.html");

        browser.visit("page1.html");
        browser.visit("page2.html");

        browser.back();
        browser.back();
        browser.back();

        browser.forward();
        browser.forward();
        browser.forward();

        browser.visit("page3.html");
    }
}
