package com.in28minutes.business;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ListTest {

    @Test
    public void testMockListSizeMethod() {

        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(2, listMock.size());
        assertEquals(2, listMock.size());
        assertEquals(2, listMock.size());

    }

    @Test
    public void testMockListSizeMethod_ReturnMultipleValues() {

        List listMock = mock(List.class);
        //Argument Matcher
        when(listMock.get(anyInt())).thenReturn("in28Minutes");
        assertEquals("in28Minutes", listMock.get(0));
        assertEquals("in28Minutes", listMock.get(1));

    }

    @Test(expected = RuntimeException.class)
    public void testMockListSizeMethod_throwAnException() {

        List listMock = mock(List.class);
        //Argument Matcher
        when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something"));
        listMock.get(0);
    }

}
