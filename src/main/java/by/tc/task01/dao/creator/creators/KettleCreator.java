package main.java.by.tc.task01.dao.creator.creators;

import main.java.by.tc.task01.dao.creator.ApplianceCreator;
import main.java.by.tc.task01.entity.Appliance;
import main.java.by.tc.task01.entity.Kettle;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Represents creator of a kettle appliance
 */
public class KettleCreator implements ApplianceCreator {
    private static final String POWER_CONSUMPTION = "powerConsumption";
    private static final String HEIGHT = "Height";
    private static final String WIDTH = "Width";
    private static final String CORD_LENGTH = "cordLength";

    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance create(NodeList nodes) {
        Kettle Kettle = new Kettle();

        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String text = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()) {
                    case POWER_CONSUMPTION -> Kettle.powerConsumption = Integer.parseInt(text);
                    case HEIGHT -> Kettle.Height = Integer.parseInt(text);
                    case WIDTH -> Kettle.Width = Integer.parseInt(text);
                    case CORD_LENGTH -> Kettle.cordLength = Integer.parseInt(text);
                    default -> throw new IllegalArgumentException("No such appliance exists");
                }
            }
        }
        return Kettle;
    }
}
