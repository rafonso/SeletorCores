package seletorcores.multisliders;

import java.awt.Color;
import seletorcores.ColorSliderPanel;
import seletorcores.MultiSliderComponent;

/**
 *
 * @author rafael
 */
public class MultiSliderComponentR_GB_A extends MultiSliderComponent {

    private final ColorSliderPanel sliderR;
    private final ColorSliderPanel sliderGB;
    private final ColorSliderPanel sliderA;

    public MultiSliderComponentR_GB_A() {
        super(3, "R + GB + A");

        this.sliderR = new ColorSliderPanel("R");
        this.sliderGB = new ColorSliderPanel("GB");
        this.sliderA = new ColorSliderPanel("A");

        super.setSliderPanel(this.sliderR, 'R');
        super.setSliderPanel(this.sliderGB, 'G');
        super.setSliderPanel(this.sliderGB, 'B');
        super.setSliderPanel(this.sliderA, 'A');

        super.add(this.sliderR);
        super.add(this.sliderGB);
        super.add(this.sliderA);
    }

    @Override
    public void colorChanged(Color color) {
        this.sliderR.setValor(color.getRed());
        this.sliderGB.setValor((color.getGreen() + color.getBlue()) / 2);
        this.sliderA.setValor(color.getAlpha());
    }
}
