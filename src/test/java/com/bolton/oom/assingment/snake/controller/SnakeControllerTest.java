package com.bolton.oom.assingment.snake.controller;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.bolton.oom.assingment.snake.model.Tuple;
import com.bolton.oom.assingment.snake.view.DataOfSquare;

import static org.mockito.Mockito.*;

/**
 * @author Thilina Kalum
 * @since 1/29/2021
 */
public class SnakeControllerTest {

  @Mock ArrayList<ArrayList<DataOfSquare>> Squares;
  @Mock Tuple headSnakePos;
  @Mock Tuple foodPosition;
  @InjectMocks SnakeController snakeController;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testRun() throws Exception {
    when(headSnakePos.getX()).thenReturn(0);
    when(headSnakePos.getY()).thenReturn(0);
    when(foodPosition.getX()).thenReturn(0);
    when(foodPosition.getY()).thenReturn(0);

    snakeController.run();
  }
}