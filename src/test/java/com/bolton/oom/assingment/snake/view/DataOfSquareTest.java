package com.bolton.oom.assingment.snake.view;

import java.awt.Color;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

/**
 * @author Thilina Kalum
 * @since 1/29/2021
 */
public class DataOfSquareTest {

  @Mock
  ArrayList<Color> C;
  @Mock
  SquarePanel square;
  @InjectMocks
  DataOfSquare dataOfSquare;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testLightMeUp() throws Exception {
    dataOfSquare.lightMeUp(0);
  }
}
