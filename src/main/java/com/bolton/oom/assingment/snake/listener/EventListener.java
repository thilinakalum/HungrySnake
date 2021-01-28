/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bolton.oom.assingment.snake.listener;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import com.bolton.oom.assingment.snake.controller.SnakeController;

/**
 * @author kalum
 */
public class EventListener extends KeyAdapter {

  /**
   * Key press event
   *
   * @param event 39: Right 38: Top 37: Left 40: Bottom
   */
  public void keyPressed(KeyEvent event) {
    switch (event.getKeyCode()) {
      case 39:
        //if it's not the opposite direction
        if (SnakeController.directionSnake != 2) {
          SnakeController.directionSnake = 1;
        }
        break;
      case 38:
        if (SnakeController.directionSnake != 4) {
          SnakeController.directionSnake = 3;
        }
        break;
      case 37:
        if (SnakeController.directionSnake != 1) {
          SnakeController.directionSnake = 2;
        }
        break;
      case 40:
        if (SnakeController.directionSnake != 3) {
          SnakeController.directionSnake = 4;
        }
        break;
      default:
        break;
    }
  }
}
