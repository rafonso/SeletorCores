/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seletorcores.multisliders;

import java.awt.Color;
import seletorcores.ColorSliderPanel;
import seletorcores.MultiSliderComponent;

/**
 *
 * @author rafael
 */
public class MultiSliderComponentRGA_B extends MultiSliderComponent {
    private final ColorSliderPanel sliderRGA;
    private final ColorSliderPanel sliderB;

    public MultiSliderComponentRGA_B() {
        super(2, "RGA + B");

        this.sliderRGA = new ColorSliderPanel("RGA");
        this.sliderB = new ColorSliderPanel("B");

        super.setSliderPanel(this.sliderRGA, 'R');
        super.setSliderPanel(this.sliderRGA, 'G');
        super.setSliderPanel(this.sliderB, 'B');
        super.setSliderPanel(this.sliderRGA, 'A');

        super.add(this.sliderRGA);
        super.add(this.sliderB);
    }

    @Override
    public void colorChanged(Color color) {
        this.sliderRGA.setValor((color.getRed() + color.getGreen() + color.getAlpha()) / 3);
        this.sliderB.setValor(color.getBlue());
    }

}
