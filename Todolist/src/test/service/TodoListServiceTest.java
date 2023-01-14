package test.service;
import Entity.Todolist;
import repository.TodolistRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListServiceImpl;
import service.TodoListService;
public class TodoListServiceTest {
    public static void main(String[] args) {
        testRemoveTodoList();
    }

    public static void testShowTodoList(){
        TodoListRepositoryImpl todolistRepository = new TodoListRepositoryImpl();
        todolistRepository.data[0] = new Todolist("Belajar Java Dasar");
        todolistRepository.data[1] = new Todolist("Belajar Java OOP");
        todolistRepository.data[2] = new Todolist("Belajar Java Standard Classes");

        TodoListService todoListService = new TodoListServiceImpl(todolistRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList(){
        TodolistRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standard Classes");

        todoListService.showTodoList();
    }

    public static void testRemoveTodoList(){
        TodolistRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standard Classes");

        todoListService.showTodoList();

        todoListService.removeTodoList(5);
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        todoListService.removeTodoList(1);
        todoListService.showTodoList();
    }

}