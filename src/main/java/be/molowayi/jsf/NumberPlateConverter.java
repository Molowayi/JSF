package be.molowayi.jsf;

import be.molowayi.jsf.NumberPlate;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import java.util.concurrent.CompletionException;
import java.util.regex.Pattern;

/**
 * Created by JLVH on 31-05-19.
 */
@FacesConverter(value = "be.molowayi.be.NumberPlateConverter")
public class NumberPlateConverter implements Converter {

    private static Pattern pattern = Pattern.compile("^[0-9]-^[0-9]{3}-^[0-9]{3}$");

    @Override
    public Object getAsObject(FacesContext context, UIComponent component,
                              String value) {
        UIInput input = (UIInput) component ;
        NumberPlate numberPlate = new NumberPlate();
        if (value == null || value .length() == 0){
            return numberPlate;
        }
        if (!pattern.matcher(value).matches()){
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion error", "Invalid number plate");
            throw new ConverterException(message);
        }

        String[] parts = value.split("-");
        numberPlate.setCode(Integer.parseInt(parts[0]));
        numberPlate.setNumber(Integer.parseInt(parts[1]));
        numberPlate.setControl(Integer.parseInt(parts[2]));
        return numberPlate;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null) return "0-000-000";
        NumberPlate number = (NumberPlate) value;

        return String.format("%01d-%03d-%03d", number.getCode(), number.getNumber(), number.getCode());
    }
}
