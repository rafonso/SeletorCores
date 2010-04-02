package seletorcores.multisliders;

import java.awt.Color;
import seletorcores.ColorSliderPanel;
import seletorcores.MultiSliderComponent;

/**
 *
 * @author rafael
 */
public class MultiSliderComponentRGB_A extends MultiSliderComponent {

    private final ColorSliderPanel sliderRGB;
    private final ColorSliderPanel sliderA;

    public MultiSliderComponentRGB_A() {
        super(2, "RGB + A");

        this.sliderRGB = new ColorSliderPanel("RGB");
        this.sliderA = new ColorSliderPanel("A");

        super.setSliderPanel(sliderRGB, 'R');
        super.setSliderPanel(sliderRGB, 'G');
        super.setSliderPanel(sliderRGB, 'B');
        super.setSliderPanel(sliderA, 'A');

        super.add(this.sliderRGB);
        super.add(this.sliderA);
    }

    @Override
    public void colorChanged(Color color) {
        this.sliderRGB.setValor((color.getRed() + color.getGreen() + color.getBlue()) / 3);
        this.sliderA.setValor(color.getAlpha());
    }
}
