public class TestNewsWatchers {
  public static void main(String[] args) {
    NewsReporter nr = new NewsReporter(); // This sets nr has a variable of class Newsreporter
    EverythingWatcher eWatcher = new EverythingWatcher(nr); // is a variable from class everything watcher
    SelectiveWatcher busWatcher = new SelectiveWatcher(nr, "business"); // this creates a class for slective watcher needs to know second input after nr to know what category
    SelectiveWatcher sciWatcher = new SelectiveWatcher(nr, "science");// Creates a class for selective watcher again need to know seconf input to know what category
  
    nr.setLatestNews("business", "Microsoft releases new MiOS - a new operating system for iPhones");
    nr.setLatestNews("other", "Classic FM signs exclusive contract with Beethoven"); // All of these classes are setting the latest news
    nr.setLatestNews("science", "New evidence Newton invented gravity after an apple fell on his head");
  }
}
