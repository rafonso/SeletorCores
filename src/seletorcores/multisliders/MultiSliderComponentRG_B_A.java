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
public class MultiSliderComponentRG_B_A extends MultiSliderComponent {

    private final ColorSliderPanel sliderRG;
    private final ColorSliderPanel sliderB;
    private final ColorSliderPanel sliderA;

    public MultiSliderComponentRG_B_A() {
        super(3, "RG + B + A");

        this.sliderRG = new ColorSliderPanel("RG");
        this.sliderB = new ColorSliderPanel("B");
        this.sliderA = new ColorSliderPanel("A");

        super.setSliderPanel(this.sliderRG, 'R');
        super.setSliderPanel(this.sliderRG, 'G');
        super.setSliderPanel(this.sliderB, 'B');
        super.setSliderPanel(this.sliderA, 'A');

        super.add(this.sliderRG);
        super.add(this.sliderB);
        super.add(this.sliderA);
    }

    @Override
    public void colorChanged(Color color) {
        this.sliderRG.setValor((color.getRed() + color.getGreen()) / 2);
        this.sliderB.setValor(color.getBlue());
        this.sliderA.setValor(color.getAlpha());
    }
}
