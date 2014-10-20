package gui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import javax.swing.SwingConstants;

import controller.Model;

import java.util.*;

public class SlotLabels extends GridPanel implements Observer {
    private List<SlotLabel> labelList;
  

    public SlotLabels(int rows, int cols, CurrentSlotIndicator currentSlot, Model model) {
        super(rows + 1, cols);
        labelList = new ArrayList<SlotLabel>(rows * cols);
        for (char ch = 'A'; ch < 'A' + cols; ch++) {
            add(new ColoredLabel(Character.toString(ch), Color.LIGHT_GRAY,
                    SwingConstants.CENTER));
        }
        for (int row = 1; row <= rows; row++) {
            for (char ch = 'A'; ch < 'A' + cols; ch++) {
                SlotLabel label = new SlotLabel(String.valueOf(ch) + row, currentSlot, model);
                add(label);
                labelList.add(label);
            }
        }
    }

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
