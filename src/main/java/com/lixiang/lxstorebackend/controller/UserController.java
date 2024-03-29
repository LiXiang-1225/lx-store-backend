package com.lixiang.lxstorebackend.controller;

import com.lixiang.lxstorebackend.common.Result;
import com.lixiang.lxstorebackend.entity.UserEntity;
import com.lixiang.lxstorebackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//RestController的作用相当于Controller加ResponseBody共同作用的结果，但采用RestController请求方式一般会采用Restful风格的形式。
//
//        Controller的作用：声明该类是Controller层的Bean，将该类声明进入Spring容器中进行管理
//
//        ResponseBody的作用：表明该类的所有方法的返回值都直接进行提交而不经过视图解析器，且返回值的数据自动封装为json的数据格式
//
//        RestController的作用：包含上面两个的作用，且支持Restful风格的数据提交方式
//@Controller
@RestController
@CrossOrigin
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    //    @Autowired
    //    UserRepository userRepository;
    //    @PostConstruct
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Result getAllUsers() {
        List<UserEntity> userEntityList = userService.getAllUsers();
        return Result.ok().data("items", userEntityList).message("用户列表");
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Result createUser(@RequestBody UserEntity user) {
        try {
            userService.addUser(user);
            return Result.ok();
        } catch (Exception e) {
            return Result.error().message("用户注册失败");
        }
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public Result deleteUser(@RequestParam Integer uid) {
        userService.deleteUser(uid);
        return Result.ok();
    }

    @PutMapping("/{uid}")
    @ResponseStatus(HttpStatus.OK)
    public Result updateUserInfo(@PathVariable Integer uid ,@RequestBody UserEntity user) {
        userService.updateUserInfo(uid,user);
        return Result.ok();
    }
}
