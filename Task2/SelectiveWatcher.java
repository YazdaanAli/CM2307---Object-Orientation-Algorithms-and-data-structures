public class SelectiveWatcher extends NewsWatcher {

  private String categoryWatched;

  public SelectiveWatcher(NewsReporter aNewsReporter, String aCategoryToWatch) {
    theNewsReporter = aNewsReporter;
    categoryWatched = aCategoryToWatch;
    theNewsReporter.attach(this);
  }

  public void update() {
  // Modify this so that it only prints out the update text if the update is an alert for the category being watched
    String updatealert = theNewsReporter.getUpdateCategory();
    if(categoryWatched ==  updatealert){
      System.out.println("The news watcher watching for everything " + categoryWatched );
      System.out.println("has received a new alert: ");
      System.out.println(theNewsReporter.getUpdateText());
      System.out.println(" ");
    }
  }
}
