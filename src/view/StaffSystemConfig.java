package view;

import handler.InputHandler;

public class StaffSystemConfig extends MainView {
    private StaffMovieDetailsView staffMovieDetailsView;
    private StaffConfigSettingsView staffConfigSettingsView;
    private DatabaseView databaseView;

    public void printMenu() {
        System.out.println("====================================");
        System.out.println("Staff Module");
        MainView.printBoilerPlate("""
                Select a function to be executed.
                01. Configure movie details
                02. Configure system settings
                03. Configure Database
                04. List Top 5
                05. Logout
                """);
        System.out.println("====================================");
    }

    public void appContent() {
        int choice = -1;

        do {
            this.printMenu();
            choice = InputHandler.intHandler();

            switch (choice) {
                case 1:
                    this.staffMovieDetailsView = new StaffMovieDetailsView();
                    this.staffMovieDetailsView.appContent();
                    break;

                case 2:
                    this.staffConfigSettingsView = new StaffConfigSettingsView();
                    this.staffConfigSettingsView.appContent();
                    break;

                case 3:
                    this.databaseView = new DatabaseView();
                    this.databaseView.appContent();
                    break;

                case 4:
                    System.out.println("Logging out of MOBLIMA (STAFF)....");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 4);
    }
}
