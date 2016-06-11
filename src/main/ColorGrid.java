package main;

import java.awt.*;

/**
 * Created by flyer_000 on 9/15/2015.
 */
public class ColorGrid {

    private final int numCellsX;
    private final int numCellsY;
    private final Color[][] grid;

    public ColorGrid(final int numCellsWide, final int numCellsHigh)
    {
        this.numCellsX = numCellsWide;
        this.numCellsY = numCellsHigh;

        this.grid = new Color[numCellsHigh][numCellsWide];

    }
}
