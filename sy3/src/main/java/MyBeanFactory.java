import dao.UserDao;

public class MyBeanFactory {
    public static UserDao BeancreateDaoBean(){
        return new UserDao();
    }
}
