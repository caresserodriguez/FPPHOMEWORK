package Lesson9.Problem3;

import java.util.Stack;

public class BrowserHistory {
    private Stack<String> back;
    private Stack<String> forward;
    private String currentURL;

    public BrowserHistory(String startURL){
        this.back = new Stack<>();
        this.forward = new Stack<>();
        this.currentURL = startURL;
    }

    public void visit (String url){
        if (currentURL != null){
            back.push(currentURL);
        }
        currentURL = url;
        forward.clear();
        System.out.println("Visited: " + currentURL);
    }

    public void back(){
        if (!back.isEmpty()){
            forward.push(currentURL);
            currentURL = back.pop();
            System.out.println("Back to: " + currentURL);
        } else {
            System.out.println("No history to go back to.");
        }
    }

    public void forward(){
        if (!forward.isEmpty()){
            back.push(currentURL);
            currentURL = forward.pop();
            System.out.println("Forward to: " + currentURL);
        } else {
            System.out.println("No forward history.");
        }
    }
}
