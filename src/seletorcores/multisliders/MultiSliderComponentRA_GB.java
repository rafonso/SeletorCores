package seletorcores.multisliders;

import java.awt.Color;
import seletorcores.ColorSliderPanel;
import seletorcores.MultiSliderComponent;

/**
 *
 * @author rafael
 */
public class MultiSliderComponentRA_GB extends MultiSliderComponent {
    private final ColorSliderPanel sliderRA;
    private final ColorSliderPanel sliderGB;

    public MultiSliderComponentRA_GB() {
        super(2, "RA + GB");

        this.sliderRA = new ColorSliderPanel("RA");
        this.sliderGB = new ColorSliderPanel("GB");

        super.setSliderPanel(this.sliderRA, 'R');
        super.setSliderPanel(this.sliderGB, 'G');
        super.setSliderPanel(this.sliderGB, 'B');
        super.setSliderPanel(this.sliderRA, 'A');

        super.add(this.sliderRA);
        super.add(this.sliderGB);
    }

    @Override
    public void colorChanged(Color color) {
        this.sliderRA.setValor((color.getRed() + color.getAlpha()) / 2);
        this.sliderGB.setValor((color.getGreen() + color.getBlue()) / 2);
    }

}
