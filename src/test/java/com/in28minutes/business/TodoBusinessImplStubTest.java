package com.in28minutes.business;

import static org.junit.Assert.assertEquals;

import com.in28minutes.data.api.TodoServiceStub;
import java.util.List;
import org.junit.Test;
import com.in28minutes.data.api.TodoService;

public class TodoBusinessImplStubTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAStub() {
        TodoService todoService = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
        List<String> todos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2, todos.size());
    }

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAStub2() {
        TodoService todoService = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
        List<String> todos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Dummy1");
        assertEquals(0, todos.size());
    }

}
