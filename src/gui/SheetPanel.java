package gui;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.WEST;
import controller.Model;

public class SheetPanel extends BorderPanel {
    public SheetPanel(int rows, int columns, CurrentSlotIndicator currentSlot, Model model) {
        add(WEST, new RowLabels(rows));
        add(CENTER, new SlotLabels(rows, columns, currentSlot, model));
    }
}