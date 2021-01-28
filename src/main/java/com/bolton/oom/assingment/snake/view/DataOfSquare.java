/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bolton.oom.assingment.snake.view;

import com.bolton.oom.assingment.snake.utils.SettingConstant;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author kalum
 */
public class DataOfSquare {
  ArrayList<Color> C = new ArrayList<Color>();
  int color;
  public SquarePanel square;

  public DataOfSquare(int col) {
      
    C.add(SettingConstant.SNAKE_COLOUR);
    C.add(SettingConstant.FOOD_COLOUR);
    C.add(SettingConstant.BACKGROUND_COLOR);
    color = col;
    square = new SquarePanel(C.get(color));
  }

  public void lightMeUp(int c) {
    square.ChangeColor(C.get(c));
  }
}
