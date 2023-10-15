package com.example.users.controller;

import com.example.users.model.User;
import com.example.users.model.dto.UserDto;
import com.example.users.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/user")
@Tag(name = "Пользователи", description = "Управление пользователями")
public class UserController {
    private final UserService userService;

    /**
     * Создание нового user
     * @param user
     * @return
     */
    @PostMapping
    @Operation(summary = "Создание пользователя", description = "Позволяет создать пользователя")
    public User saveNewUser(@RequestBody(required = false)  UserDto user) {
        return userService.saveUser(user);
    }

    @PatchMapping("/{userId}")
    @Operation(summary = "Обновление пользователя", description = "Позволяет изменить данные пользователя")
    public User updateUser(@PathVariable long userId, @RequestBody User user) {
        return userService.updateUser(userId, user);
    }

    @GetMapping("/{userId}")
    @Operation(summary = "Получение пользователя по id", description = "Позволяет получить пользователя по id")
    public User getUser(@PathVariable long userId) {
        return userService.getUser(userId);
    }

    @DeleteMapping("/{userId}")
    @Operation(summary = "Удалить пользователя", description = "Позволяет удалить пользователя по id")
    public void deleteUser(@PathVariable long userId) {
        userService.deleteUser(userId);
    }
}
