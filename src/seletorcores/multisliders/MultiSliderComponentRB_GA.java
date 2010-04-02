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
public class MultiSliderComponentRB_GA extends MultiSliderComponent {
    private final ColorSliderPanel sliderRB;
    private final ColorSliderPanel sliderGA;

    public MultiSliderComponentRB_GA() {
        super(2, "RB + GA");

        this.sliderRB = new ColorSliderPanel("RB");
        this.sliderGA = new ColorSliderPanel("GA");

        super.setSliderPanel(this.sliderRB, 'R');
        super.setSliderPanel(this.sliderGA, 'G');
        super.setSliderPanel(this.sliderRB, 'B');
        super.setSliderPanel(this.sliderGA, 'A');

        super.add(this.sliderRB);
        super.add(this.sliderGA);
    }

    @Override
    public void colorChanged(Color color) {
        this.sliderRB.setValor((color.getRed() + color.getBlue()) / 2);
        this.sliderGA.setValor((color.getGreen() + color.getAlpha()) / 2);
    }

}
