package fr.pantheonsorbonne.ufr27.miage.camel.processor;

import fr.pantheonsorbonne.ufr27.miage.camel.model.Perimeter;
import fr.pantheonsorbonne.ufr27.miage.camel.model.Triangle;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public  class EquilateralTrianglePerimeterComputerProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        var triangle = exchange.getMessage().getBody(Triangle.class);
        double perimeter = Triangle.distance(triangle.getPoint()[0], triangle.getPoint()[1]) * 3;
        exchange.getMessage().setBody(new Perimeter(perimeter));
    }
}
