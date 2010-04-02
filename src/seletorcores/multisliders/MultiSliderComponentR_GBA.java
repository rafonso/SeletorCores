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
public class MultiSliderComponentR_GBA extends MultiSliderComponent {

    private final ColorSliderPanel sliderR;
    private final ColorSliderPanel sliderGBA;

    public MultiSliderComponentR_GBA() {
        super(2, "R + GBA");

        this.sliderR = new ColorSliderPanel("R");
        this.sliderGBA = new ColorSliderPanel("GBA");

        super.setSliderPanel(this.sliderR, 'R');
        super.setSliderPanel(this.sliderGBA, 'G');
        super.setSliderPanel(this.sliderGBA, 'B');
        super.setSliderPanel(this.sliderGBA, 'A');

        super.add(this.sliderR);
        super.add(this.sliderGBA);
    }

    @Override
    public void colorChanged(Color color) {
        this.sliderR.setValor(color.getRed());
        this.sliderGBA.setValor((color.getGreen() + color.getBlue() + color.getAlpha()) / 3);
    }
}
