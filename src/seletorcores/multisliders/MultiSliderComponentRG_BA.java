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
public class MultiSliderComponentRG_BA extends MultiSliderComponent {

    private final ColorSliderPanel sliderRG;
    private final ColorSliderPanel sliderBA;

    public MultiSliderComponentRG_BA() {
        super(2, "RG + BA");

        this.sliderRG = new ColorSliderPanel("RG");
        this.sliderBA = new ColorSliderPanel("BA");

        super.setSliderPanel(this.sliderRG, 'R');
        super.setSliderPanel(this.sliderRG, 'G');
        super.setSliderPanel(this.sliderBA, 'B');
        super.setSliderPanel(this.sliderBA, 'A');

        super.add(this.sliderRG);
        super.add(this.sliderBA);
    }

    @Override
    public void colorChanged(Color color) {
        this.sliderRG.setValor((color.getRed() + color.getGreen()) / 2);
        this.sliderBA.setValor((color.getBlue() + color.getAlpha()) / 2);
    }
}
