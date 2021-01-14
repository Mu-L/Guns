package cn.stylefeng.guns.modular.api;

import cn.stylefeng.roses.kernel.resource.api.annotation.ApiResource;
import cn.stylefeng.roses.kernel.resource.api.annotation.GetResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

/**
 * API文档管理
 *
 * @author fengshuonan
 * @date 2021/1/14 21:05
 */
@Controller
@Slf4j
@ApiResource(name = "API文档管理")
public class ApiViewController {

    /**
     * 编辑应用界面
     *
     * @author fengshuonan
     * @date 2021/1/6 13:37
     */
    @GetResource(name = "API文档界面", path = "/view/api")
    public String apiIndex() {
        return "/modular/api/api.html";
    }

}