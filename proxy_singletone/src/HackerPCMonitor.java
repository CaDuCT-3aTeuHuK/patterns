public class HackerPCMonitor {
    private UsersInformationTable usersInformationTable = TableUsersProxy.getInstance();

    public void printHackBD(){
        String[] tableBD = usersInformationTable.getUsersInformation();
        String[] tmpArr;
        System.out.println("Логин\tПароль");
        for (int i = 0; i < tableBD.length; i++) {
            tmpArr = tableBD[i].split(";");
            System.out.printf("%s\t%s\n",tmpArr[0],tmpArr[1]);
        }
    }
}
