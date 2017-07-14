package com.company.start.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a>
 * 2017/04/20 14:01
 */
@Api(value = "t01",tags = "tst01")
@RestController
@RequestMapping("/api/test")
public class TestController {


    @ApiOperation(value = "puttest",notes = "puttestaa")
    @PutMapping(value = "/puttest")
    @ApiImplicitParam(value = "code",name = "code",dataType = "string",paramType = "query")
    public String puttest(String code){
        return code;
//        return new RestMessage(code);
    }
//    ApiResourceController

//    Swagger2Controller
}
