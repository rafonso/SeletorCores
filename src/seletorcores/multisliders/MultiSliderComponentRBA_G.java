package seletorcores.multisliders;

import java.awt.Color;
import seletorcores.ColorSliderPanel;
import seletorcores.MultiSliderComponent;

/**
 *
 * @author rafael
 */
public class MultiSliderComponentRBA_G extends MultiSliderComponent {
    private final ColorSliderPanel sliderRBA;
    private final ColorSliderPanel sliderG;

    public MultiSliderComponentRBA_G() {
        super(2, "RBA + G");
        this.sliderRBA = new ColorSliderPanel("RBA");
        this.sliderG = new ColorSliderPanel("G");

        super.setSliderPanel(this.sliderRBA, 'R');
        super.setSliderPanel(this.sliderG, 'G');
        super.setSliderPanel(this.sliderRBA, 'B');
        super.setSliderPanel(this.sliderRBA, 'A');

        super.add(this.sliderRBA);
        super.add(this.sliderG);
    }

    @Override
    public void colorChanged(Color color) {
        this.sliderRBA.setValor((color.getRed() + color.getBlue() + color.getAlpha()) / 3);
        this.sliderG.setValor(color.getGreen());
    }

}
