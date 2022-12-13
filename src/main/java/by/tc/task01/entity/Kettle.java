package main.java.by.tc.task01.entity;

import main.java.by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Represents the Kettle appliance
 */
public class Kettle extends Appliance{
	public int powerConsumption;
	public int Height;
	public int Width;
	public int cordLength;

	@Override
	public String toString() {
		return String.format("Kettle : POWER_CONSUMPTION=%d, Height=%d, Width=%s, CORD_LENGTH=%d",
				powerConsumption, Height, Width, cordLength);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean matches(String key, Object value) {
		return switch (SearchCriteria.Kettle.valueOf(key)){
			case POWER_CONSUMPTION -> powerConsumption == (Integer) value;
			case HEIGHT -> Height ==  (Integer) value;
			case WIDTH -> Width == (Integer) value;
			case CORD_LENGTH -> cordLength == (Integer) value;
		};
	}
}
