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
public class MultiSliderComponentRGBA extends MultiSliderComponent {

    private final ColorSliderPanel sliderRGBA;

    public MultiSliderComponentRGBA() {
        super(1, "RGBA");

        this.sliderRGBA = new ColorSliderPanel("RGBA");

        super.setSliderPanel(this.sliderRGBA, 'R');
        super.setSliderPanel(this.sliderRGBA, 'B');
        super.setSliderPanel(this.sliderRGBA, 'G');
        super.setSliderPanel(this.sliderRGBA, 'A');

        super.add(this.sliderRGBA);
    }

    @Override
    public void colorChanged(Color color) {
        this.sliderRGBA.setValor((color.getRed() + color.getGreen() + color.getBlue() + color.getAlpha()) / 4);
    }
}
