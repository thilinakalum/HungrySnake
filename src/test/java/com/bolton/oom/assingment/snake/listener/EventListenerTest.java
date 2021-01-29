package com.bolton.oom.assingment.snake.listener;

import java.awt.event.KeyEvent;

import org.junit.Test;
import org.mockito.Mock;

/**
 * @author Thilina Kalum
 * @since 1/29/2021
 */
public class EventListenerTest {

  EventListener eventListener = new EventListener();
  @Mock KeyEvent keyEvent;

  @Test
  public void testKeyPressed() throws Exception {
    keyEvent.setKeyCode(39);
    eventListener.keyPressed(keyEvent);
  }
}