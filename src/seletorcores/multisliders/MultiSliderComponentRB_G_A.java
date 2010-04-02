package seletorcores.multisliders;

import java.awt.Color;
import seletorcores.ColorSliderPanel;
import seletorcores.MultiSliderComponent;

/**
 *
 * @author rafael
 */
public class MultiSliderComponentRB_G_A extends MultiSliderComponent {
    private final ColorSliderPanel sliderRB;
    private final ColorSliderPanel sliderG;
    private final ColorSliderPanel sliderA;

    public MultiSliderComponentRB_G_A() {
        super(3, "RB + G + A");

        this.sliderRB = new ColorSliderPanel("RB");
        this.sliderG = new ColorSliderPanel("G");
        this.sliderA = new ColorSliderPanel("A");

        super.setSliderPanel(this.sliderRB, 'R');
        super.setSliderPanel(this.sliderG, 'G');
        super.setSliderPanel(this.sliderRB, 'B');
        super.setSliderPanel(this.sliderA, 'A');

        super.add(this.sliderRB);
        super.add(this.sliderG);
        super.add(this.sliderA);

        super.setRows(3);
    }

    @Override
    public void colorChanged(Color color) {
        this.sliderRB.setValor((color.getRed() + color.getBlue()) / 2);
        this.sliderG.setValor(color.getGreen());
        this.sliderA.setValor(color.getAlpha());
    }



}
