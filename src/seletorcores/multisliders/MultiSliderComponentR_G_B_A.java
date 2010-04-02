package seletorcores.multisliders;

import java.awt.Color;
import seletorcores.ColorSliderPanel;
import seletorcores.MultiSliderComponent;

/**
 *
 * @author rafael
 */
public class MultiSliderComponentR_G_B_A extends MultiSliderComponent {

    private final ColorSliderPanel sliderR;
    private final ColorSliderPanel sliderG;
    private final ColorSliderPanel sliderB;
    private final ColorSliderPanel sliderA;

    public MultiSliderComponentR_G_B_A() {
        super(4, "R + G + B + A");

        this.sliderR = new ColorSliderPanel("R");
        this.sliderG = new ColorSliderPanel("G");
        this.sliderB = new ColorSliderPanel("B");
        this.sliderA = new ColorSliderPanel("A");

        super.setSliderPanel(sliderR, 'R');
        super.setSliderPanel(sliderG, 'G');
        super.setSliderPanel(sliderB, 'B');
        super.setSliderPanel(sliderA, 'A');

        super.add(this.sliderR);
        super.add(this.sliderG);
        super.add(this.sliderB);
        super.add(this.sliderA);
    }

    public void colorChanged(Color color) {
        this.sliderR.setValor(color.getRed());
        this.sliderG.setValor(color.getGreen());
        this.sliderB.setValor(color.getBlue());
        this.sliderA.setValor(color.getAlpha());
    }
}
