import com.ll.exam.DispatcherServlet;
import com.ll.exam.Rq;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;

public class AppTest extends HttpServlet {
    @Test
    void Rq클래스_생성(){
        HttpServletRequest req = null;
        HttpServletResponse resp = null;
        Rq rq = new Rq(req, resp);
    }

    void URL가져오기(){
        DispatcherServlet dispatcherServlet = new DispatcherServlet();

    }
}
