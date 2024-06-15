package first.MVC.web.frontcontroller.v3;

import first.MVC.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);
}
