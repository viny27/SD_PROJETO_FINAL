
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "comprarIngressoTeatro", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comprarIngressoTeatro", namespace = "http://ws/", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3"
})
public class ComprarIngressoTeatro {

    @XmlElement(name = "arg0", namespace = "")
    private short arg0;
    @XmlElement(name = "arg1", namespace = "")
    private short arg1;
    @XmlElement(name = "arg2", namespace = "")
    private short arg2;
    @XmlElement(name = "arg3", namespace = "")
    private int arg3;

    /**
     * 
     * @return
     *     returns short
     */
    public short getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(short arg0) {
        this.arg0 = arg0;
    }

    /**
     * 
     * @return
     *     returns short
     */
    public short getArg1() {
        return this.arg1;
    }

    /**
     * 
     * @param arg1
     *     the value for the arg1 property
     */
    public void setArg1(short arg1) {
        this.arg1 = arg1;
    }

    /**
     * 
     * @return
     *     returns short
     */
    public short getArg2() {
        return this.arg2;
    }

    /**
     * 
     * @param arg2
     *     the value for the arg2 property
     */
    public void setArg2(short arg2) {
        this.arg2 = arg2;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getArg3() {
        return this.arg3;
    }

    /**
     * 
     * @param arg3
     *     the value for the arg3 property
     */
    public void setArg3(int arg3) {
        this.arg3 = arg3;
    }

}
