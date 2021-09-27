
public class TableUsersProxy implements UsersInformationTable {

    private static TableUsersProxy instance;


    private TableUsersProxy() {}

    public static TableUsersProxy getInstance(){
        if (instance == null){
            instance = new TableUsersProxy();

        }
        return instance;
    }

    private UsersInformationTable usersInformationTable = new TableUsers();
    private String[] tableUsersCache = usersInformationTable.getUsersInformation();


    @Override
    public String[] getUsersInformation() {
        return tableUsersCache;
    }




}
