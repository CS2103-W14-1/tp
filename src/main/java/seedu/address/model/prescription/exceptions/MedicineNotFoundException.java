package seedu.address.model.prescription.exceptions;

public class MedicineNotFoundException extends RuntimeException {
    public MedicineNotFoundException() { super("Medicine name not found in prescription list");}
}
