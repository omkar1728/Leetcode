class BrowserHistory {
    Page homePage;
    Page curr;

    public BrowserHistory(String homepage) {
        curr = new Page(homepage);
        //curr = homePage;
    }
    
    public void visit(String url) {
        Page temp = new Page(url);
        curr.next = temp;
        temp.prev = curr;
        curr = temp;
    }
    
    public String back(int steps) {
        while(steps > 0 && curr.prev != null){
            curr = curr.prev;
            steps--;
        }
        return curr.val;
    }
    
    public String forward(int steps) {
        while(steps > 0 && curr.next != null){
            curr = curr.next;
            steps--;
        }
        return curr.val;
        
    }
}
class Page{
    String val;
    Page next;
    Page prev;
    public Page(String homePage){
        val = homePage;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */