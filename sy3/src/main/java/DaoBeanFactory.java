import dao.UserDao;

public class DaoBeanFactory {
    public UserDao CreateDaoBean(){
        return new UserDao();
    }
}