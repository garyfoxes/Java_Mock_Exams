package regularexpressionscustomannotations;

import java.util.List;

/**
 * Created by gfox on 20/05/2016.
 */
public class ValidationFailedException extends Exception {

    private String rawMessage;
    private List<InvalidField> invalidFields;

    public ValidationFailedException(String message, List<InvalidField> invalidFields) {
        super(message);
        this.invalidFields = invalidFields;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(this.getClass().getSimpleName()).append(": ").append(this.getMessage()).append("\n");

        if (invalidFields != null && !invalidFields.isEmpty()) {
            builder.append("Invalid fields:\n");
            for (InvalidField invalidField : invalidFields) {
                builder.append(invalidField.getField()).append(" : ").append(invalidField.getMessage()).append("\n");
            }
        }
        return builder.toString();
    }
}
