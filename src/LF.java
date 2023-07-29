public interface LF {
    int getUserID();
    default int getCat(){
        return 1;
    }
    static int getOwner(){
        return 0;
    }
}