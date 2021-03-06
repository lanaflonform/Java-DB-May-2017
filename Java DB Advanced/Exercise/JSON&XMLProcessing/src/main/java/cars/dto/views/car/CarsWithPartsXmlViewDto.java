package cars.dto.views.car;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Hristo Skipernov on 03/08/2017.
 */

@XmlRootElement(name = "cars")
@XmlAccessorType(XmlAccessType.FIELD)
public class CarsWithPartsXmlViewDto {

    @XmlElement(name = "car")
    private List<CarWithPartsXmlViewDto> carWithPartsViewDtos;

    public CarsWithPartsXmlViewDto() {
    }

    public List<CarWithPartsXmlViewDto> getCarWithPartsViewDtos() {
        return this.carWithPartsViewDtos;
    }

    public void setCarWithPartsViewDtos(List<CarWithPartsXmlViewDto> carWithPartsViewDtos) {
        this.carWithPartsViewDtos = carWithPartsViewDtos;
    }
}
